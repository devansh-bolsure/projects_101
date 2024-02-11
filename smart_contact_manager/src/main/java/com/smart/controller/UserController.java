package com.smart.controller;

import java.io.EOFException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.multipart.MultipartFile;

import com.smart.dao.ContactRepository;
import com.smart.dao.UserRepository;
import com.smart.entities.Contact;
import com.smart.entities.User;
import com.smart.helper.Messages;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ContactRepository contactRepository;

	// Method For Adding Common Data
	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		String username = principal.getName();
		System.out.println("USERNAME " + username);

		User user = userRepository.getUserByUserName(username);
		model.addAttribute("user", user);

		System.out.println("USER " + user);
	}

	// Dashboard Home

	@GetMapping("/index")
	public String dashboard(Model model) {
		model.addAttribute("title", "Dashboard");

		return "normal/userDashboard";
	}

	// open add form handler
	@GetMapping("/add-contact")
	public String openAddContactForm(Model model) {
		model.addAttribute("title", "Add Contact");
		model.addAttribute("contact", new Contact());
		return "normal/add_contact_form";
	}

	// processing add contact form

	@PostMapping("/process-contact")
	public String processContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult,
			@RequestParam("image") MultipartFile file, Principal principal, HttpSession session) {
		try {
			String name = principal.getName();
			User user = this.userRepository.getUserByUserName(name);

			// processing the uploading file

			if (file.isEmpty()) {
				// if file is empty then try our messege
				System.out.println("File is Empty");
				contact.setImage("contact.png");

			} else {
				// upload the file to folder and update name of contact
				contact.setImage(file.getOriginalFilename());
				File saveFile = new ClassPathResource("static/images").getFile();

				Path path = Paths.get(saveFile.getAbsolutePath() + File.separator + file.getOriginalFilename());
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

				System.out.println("Image is uploaded");
			}

			user.getContact().add(contact);

			contact.setUser(user);

			this.userRepository.save(user);

			System.out.println(contact);

			System.out.println("Contact is Added to Database");

			// success messege
			session.setAttribute("message", new Messages("Your contact is added!! Add more..", "alert-success"));

		} catch (Exception e) {
			System.out.println("ERROR " + e.getMessage());
			e.printStackTrace();

			// error message
			session.setAttribute("message", new Messages("Something went wrong !! Try again", "alert-danger"));

		}

		return "normal/add_contact_form";

	}

	// show contact handler
	// per page = 5[n]
	// curremt page = 0[page]
	@GetMapping("/show-contacts/{page}")
	public String showContacts(@Valid Model m, @PathVariable("page") Integer page, Principal principal) {

		// to show contact list
		try {
			m.addAttribute("title", "view User Contacts");

			String name = principal.getName();
			User user = this.userRepository.getUserByUserName(name);

			// currentPage page
			// contact per page-5
			Pageable pageable = PageRequest.of(page, 5);

			Page<Contact> contacts = this.contactRepository.findContactByUser(user.getId(), pageable);
			m.addAttribute("contacts", contacts);
			m.addAttribute("currentPage", page);
			m.addAttribute("totalPages", contacts.getTotalPages());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "normal/show_contacts";
	}

	// show contact handler
	@GetMapping("/{cid}/contact")
	public String showContactDetil(@PathVariable("cid") Integer cid, Model model, Principal principal) {
		System.out.println("CID " + cid);

		try {
			Optional<Contact> contactOptional = this.contactRepository.findById(cid);
			Contact contact = contactOptional.get();
			// check for the correct user..
			String name = principal.getName();
			User user = this.userRepository.getUserByUserName(name);

			if (user.getId() == contact.getUser().getId()) {
				model.addAttribute("title", contact.getName());
				model.addAttribute("contact", contact);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "normal/contact_detail";
	}

	// delete contact handler
	@GetMapping("/delete/{cid}")
	@Transactional
	public String deleteContact(@PathVariable("cid") Integer cid, Model model, 
			             HttpSession session,Principal principl) 
	{
		try {
			Optional<Contact> optionalContact = this.contactRepository.findById(cid);
			Contact contact = optionalContact.get();

			// check for right user
			System.out.println("contact " + contact.getCid());

			User user = this.userRepository.getUserByUserName(principl.getName());
			
			user.getContact().remove(contact);
			
			this.userRepository.save(user);

			System.out.println("DELETED");
			session.setAttribute("message", new Messages("contact deleted succesfully", "success"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/user/show-contacts/0";
	}

	// open update form handler
	@PostMapping("update-contact/{cid}")
	public String updateContact(@PathVariable("cid") Integer cid, Model model) {
		try {
			model.addAttribute("title", "Update Contact");
			Contact contact = this.contactRepository.findById(cid).get();
			model.addAttribute("contact", contact);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "normal/update_contact";
	}

	// update contact handler
	@PostMapping("/process-update")
	public String processUpdateHandler(@ModelAttribute("contact") @Valid Contact contact,
			@RequestParam("profileImage") MultipartFile file, Model model, HttpSession session, Principal principal,
			BindingResult result) {
		try {

			// old image
			Contact oldContactDetail = this.contactRepository.findById(contact.getCid()).get();

			// new image
			if (!file.isEmpty()) {
			

				// delete old photo
				File deleteFile = new ClassPathResource("static/images").getFile();
				File file1=new File(deleteFile,oldContactDetail.getImage());
				file1.delete();

				// update new photo

				File saveFile = new ClassPathResource("static/images").getFile();

				Path path = Paths.get(saveFile.getAbsolutePath() + File.separator + file.getOriginalFilename());
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
					
				contact.setImage(file.getOriginalFilename());
				
			} else {
				contact.setImage(oldContactDetail.getImage());
			}

			User user = this.userRepository.getUserByUserName(principal.getName());

			contact.setUser(user);

			this.contactRepository.save(contact);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		System.out.println("Contact Name " + contact.getName());
//		System.out.println("Contact ID " + contact.getCid());
		return "redirect:/user/"+contact.getCid()+"/contact";
	}
	
	//profile handler
	
	@GetMapping("/profile")
	public String profileHandler(Model model)
	{
		model.addAttribute("title","Profile Page");
		return "normal/profile";
	}
	
	
	//open settings handler
	@GetMapping("/settings")
	public String openSettings()
	{
		return "normal/settings";
	}
	
	//change password handler
	
	@PostMapping("change-password")
	public String changePassword(@RequestParam("oldPassword") String oldPassword,
			@RequestParam("newPassword") String newPassword,Principal principal,
			HttpSession session)
	{
		try
		{
			System.out.println("oldPassword "+oldPassword);
			System.out.println("newPassword "+newPassword);
			
			User currentuser = userRepository.getUserByUserName(principal.getName());
			
			System.out.println(currentuser.getPassword());
			
			if(this.bCryptPasswordEncoder.matches(oldPassword, currentuser.getPassword()))
			{
				//changepassword
				currentuser.setPassword(this.bCryptPasswordEncoder.encode(newPassword));
				this.userRepository.save(currentuser);
				
				session.setAttribute("message", new Messages("Your Password is Succesfully Changed","alert-success"));
			}else
			{
				//error
				session.setAttribute("message", new Messages("Please Enter Correct Old Password !!","alert-danger"));

				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		
		return "redirect:/user/index";
	}

	

}
