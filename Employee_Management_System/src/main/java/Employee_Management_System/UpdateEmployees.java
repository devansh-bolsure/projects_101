package Employee_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.sql.*;


public class UpdateEmployees extends JFrame implements ActionListener{
	
	
		
	
	JTextField tfeducation,tfname1,tfsalary,tfaddress,tfphone,tfemail,tfadhar,tfdesignation;
	JLabel lblempid,lblempId;
	JButton back,add;
	String Empid;
	
	
	UpdateEmployees(String Empid)
	{
		this.Empid=Empid;
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading =new JLabel("Update Employee Detail");
		heading.setBounds(320,30,500,50);
		heading.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(heading);
		
		JLabel lblname=new JLabel("Name");
		lblname.setBounds(50,150,150,30);
		lblname.setFont(new Font("serif",Font.PLAIN,20));
		add(lblname);
		
		JLabel lblname2=new JLabel();
		lblname2.setBounds(200,150,150,30);
		add(lblname2);
		
		JLabel lblname1=new JLabel("Father's Name");
		lblname1.setBounds(400,150,150,30);
		lblname1.setFont(new Font("serif",Font.PLAIN,20));
		add(lblname1);
		
		tfname1=new JTextField();
		tfname1.setBounds(650,150,150,30);
		add(tfname1);

		JLabel lbldob=new JLabel("Date Of Birth");
		lbldob.setBounds(50,200,150,30);
		lbldob.setFont(new Font("serif",Font.PLAIN,20));
		add(lbldob);
		
		JLabel lbldcdob= new JLabel();
		lbldcdob.setBounds(200,200,150,30);
		add(lbldcdob);
		
		JLabel lblsalary=new JLabel("Salary");
		lblsalary.setBounds(400,200,150,30);
		lblsalary.setFont(new Font("serif",Font.PLAIN,20));
		add(lblsalary);
		
		tfsalary=new JTextField();
		tfsalary.setBounds(650,200,150,30);
		add(tfsalary);
		

		JLabel lbladdress=new JLabel("Address");
		lbladdress.setBounds(50,250,150,30);
		lbladdress.setFont(new Font("serif",Font.PLAIN,20));
		add(lbladdress);
		
		tfaddress=new JTextField();
		tfaddress.setBounds(200,250,150,30);
		add(tfaddress);
		
		JLabel lblphone=new JLabel("Phone No.");
		lblphone.setBounds(400,250,150,30);
		lblphone.setFont(new Font("serif",Font.PLAIN,20));
		add(lblphone);
		
		tfphone=new JTextField();
		tfphone.setBounds(650,250,150,30);
		add(tfphone);
		

		JLabel lblemail=new JLabel("Email");
		lblemail.setBounds(50,300,150,30);
		lblemail.setFont(new Font("serif",Font.PLAIN,20));
		add(lblemail);
		
		tfemail=new JTextField();
		tfemail.setBounds(200,300,150,30);
		add(tfemail);
		
		JLabel lbleducation=new JLabel("Highest Education");
		lbleducation.setBounds(400,300,150,30);
		lbleducation.setFont(new Font("serif",Font.PLAIN,20));
		add(lbleducation);
		
		tfeducation= new JTextField();
		tfeducation.setBackground(Color.white);
		add(tfeducation);
		
		JLabel lbldesignation=new JLabel("Designation");
		lbldesignation.setBounds(50,350,150,30);
		lbldesignation.setFont(new Font("serif",Font.PLAIN,20));
		add(lbldesignation);
		
		tfdesignation=new JTextField();
		tfdesignation.setBounds(200,350,150,30);
		add(tfdesignation);
		
		JLabel lbladhar=new JLabel("Adhar No.");
		lbladhar.setBounds(400,350,150,30);
		lbladhar.setFont(new Font("serif",Font.PLAIN,20));
		add(lbladhar);
		
		JLabel lbladhar1=new JLabel();
		lbladhar1.setBounds(650,350,150,30);
		add(lbladhar1);
		
		lblempid=new JLabel("Employee ID");
		lblempid.setBounds(50,400,150,30);
		lblempid.setFont(new Font("serif",Font.PLAIN,20));
		add(lblempid);
		
		lblempId=new JLabel();
		lblempId.setBounds(200,400,150,30);
		lblempId.setFont(new Font("serif",Font.PLAIN,20));
		add(lblempId);
		
		try
		{
			Conn c=new Conn();
			String query="select * from employee where Empid= '"+Empid+"'";
			ResultSet rs=c.s.executeQuery(query);
			
			while(rs.next())
			{
				lblname2.setText(rs.getString("name"));
				tfname1.setText(rs.getString("employeefname"));
				lbldcdob.setText(rs.getString("dob"));
				tfsalary.setText(rs.getString("salary"));
				tfaddress.setText(rs.getString("address"));
				tfphone.setText(rs.getString("phone"));
				tfemail.setText(rs.getString("email"));
				tfeducation.setText(rs.getString("education"));
				tfdesignation.setText(rs.getString("designation"));
				lbladhar1.setText(rs.getString("adhar"));
				lblempId.setText(rs.getString("Empid"));
				

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		add= new JButton("Update Details");
		add.setBounds(250,550,150,40);
		add.addActionListener( this);
		add.setBackground(Color.black);
		add.setForeground(Color.white);
		add(add);
		

		back= new JButton("Back");
		back.setBounds(450,550,150,40);
		back.addActionListener(this);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		add(back);
		
		
		
		
		
		setSize(900,700);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add)
		{

			String fname= tfname1.getText();
			String salary= tfsalary.getText();
			String address= tfaddress.getText();
			String phone= tfphone.getText();
			String email= tfemail.getText();
			String education= tfeducation.getText();
			String designation= tfdesignation.getText();
			
			
			try
			{
				
				Conn conn =new Conn();
//				System.out.println("ok2");
				String query="update employee set employeefname='"+fname+"',salary= '"+salary+"',address= '"+address+"',phone= '"+phone+"',email= '"+email+"',education= '"+education+"',designation= '"+designation+"'where Empid= '"+Empid+"'";                              
//				System.out.println("ok3");
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details added succesfully");
				setVisible(false);
				new Home();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}else
		{
			setVisible(false);
			new Home();
		}
	}
	
	public static void main(String[] args) 
	{
		
		
		new UpdateEmployees("");
	}

}

