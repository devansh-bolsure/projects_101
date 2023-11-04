package springmvc.model;

import javax.persistence.*;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String useremail;
	private String username;
	private String userpassword;
	
	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String useremail, String username, String userpassword) {
		super();
		this.useremail = useremail;
		this.username = username;
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "User [useremail=" + useremail + ", username=" + username + ", userpassword=" + userpassword + "]";
	}

	

	
	
}
