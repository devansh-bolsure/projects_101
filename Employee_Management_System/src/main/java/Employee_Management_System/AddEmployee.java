package Employee_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;


public class AddEmployee extends JFrame implements ActionListener{
	
	
	Random ran= new Random();
	int number= ran.nextInt(999999);	
	
	JTextField tfname,tfname1,tfsalary,tfaddress,tfphone,tfemail,tfadhar,tfdesignation;
	JDateChooser dcdob;
	JComboBox  cbeducation;
	JLabel lblempid,lblempId;
	JButton back,add;
	
	
	AddEmployee()
	{
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading =new JLabel("Add Employee Detail");
		heading.setBounds(320,30,500,50);
		heading.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(heading);
		
		JLabel lblname=new JLabel("Name");
		lblname.setBounds(50,150,150,30);
		lblname.setFont(new Font("serif",Font.PLAIN,20));
		add(lblname);
		
		tfname=new JTextField();
		tfname.setBounds(200,150,150,30);
		add(tfname);
		
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
		
		dcdob= new JDateChooser();
		dcdob.setBounds(200,200,150,30);
		add(dcdob);
		
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
		
		String courses[]= {"AI-ML","Python","Java","Statistics","Datascience","Data Analyst","Engineering"};
		cbeducation=new JComboBox(courses);
		cbeducation.setBounds(650,300,150,30);
		cbeducation.setBackground(Color.white);
		add(cbeducation);
		
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
		
		tfadhar=new JTextField();
		tfadhar.setBounds(650,350,150,30);
		add(tfadhar);
		
		lblempid=new JLabel("Employee ID");
		lblempid.setBounds(50,400,150,30);
		lblempid.setFont(new Font("serif",Font.PLAIN,20));
		add(lblempid);
		
		lblempId=new JLabel(""+number);
		lblempId.setBounds(200,400,150,30);
		lblempId.setFont(new Font("serif",Font.PLAIN,20));
		add(lblempId);
		

		add= new JButton("Add Details");
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
			String name= tfname.getText();
			String fname= tfname1.getText();
			String dob= ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
			String salary= tfsalary.getText();
			String address= tfaddress.getText();
			String phone= tfphone.getText();
			String email= tfemail.getText();
			String education= (String) cbeducation.getSelectedItem();
			String designation= tfdesignation.getText();
			String adhar= tfadhar.getText();
			String empid=lblempId.getText();
			
			try
			{
				
				Conn conn =new Conn();
				String query="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+adhar+"' ,'"+empid+"')";                              
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
		
		
		new AddEmployee();
	}

}
