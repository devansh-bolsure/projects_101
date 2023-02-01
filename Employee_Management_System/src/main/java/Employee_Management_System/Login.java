package Employee_Management_System;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	
	JTextField tfusername,tfpassword; 
	
	Login()
	{
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel lblusername= new JLabel("Username");	
		lblusername.setBounds(40,20,100,30);
		add(lblusername);
		
		tfusername= new JTextField();
		tfusername.setBounds(150,20,150,30);
		add(tfusername);
		

		JLabel lblpassword= new JLabel("password");	
		lblpassword.setBounds(40,75,100,30);
		add(lblpassword);
		
		tfpassword= new JTextField();
		tfpassword.setBounds(150,75,150,30);
		add(tfpassword);
		
		JButton clickhere= new JButton("Login");
		clickhere.setBounds(150,140,150,30);
		clickhere.setBackground(Color.black);
		clickhere.setForeground(Color.white);
		clickhere.addActionListener(this);
		add(clickhere);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/second.jpg"));
		Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(350,0,200,200);
		add(image);
				
		
		
		setSize(600,300);
		setLocation(450,200);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		try 
		{
			
			String username=tfusername.getText();
			String password=tfpassword.getText();
			
			Conn c=new Conn();
			String query="select * from login where username= '"+username+"'and password ='"+password+"'";
			ResultSet rs= c.s.executeQuery(query);
			if(rs.next()) 
			{
				setVisible(false);
				//next class
				new Home();
				
			}else
			{
				
				JOptionPane.showMessageDialog(null, "invalid username or password ");
				setVisible(false);
			}
			System.out.println("execution complete");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Login();
	}
	
	

}
