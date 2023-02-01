package Employee_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.sql.*;

public class RemoveEmployees extends JFrame implements ActionListener{
	
	
	Choice cempid;
	JButton delete,back;
	
	
	RemoveEmployees()
	{
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		JLabel lblempid= new JLabel("Employee Id");
		lblempid.setBounds(50,50,100,30);
		add(lblempid);
		
		cempid= new Choice();
		cempid.setBounds(200,50,150,40);
		add(cempid);
		
		try
		{
			
			Conn c =new Conn();
			String query= "select * from employee";
			ResultSet rs=c.s.executeQuery(query);
			
			while(rs.next())
			{
				cempid.add(rs.getString("Empid"));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel lblname= new JLabel("Name");
		lblname.setBounds(50,100,100,30);
		add(lblname);
		
		final JLabel lblname1= new JLabel();
		lblname1.setBounds(200,100,100,30);
		add(lblname1);
		
		JLabel lblphone= new JLabel("Phone");
		lblphone.setBounds(50,150,100,30);
		add(lblphone);
		
		final JLabel lblphone1= new JLabel();
		lblphone1.setBounds(200,150,100,30);
		add(lblphone1);
		

		JLabel lblemail= new JLabel("Email");
		lblemail.setBounds(50,200,100,30);
		add(lblemail);
		
		final JLabel lblemail1= new JLabel();
		lblemail1.setBounds(200,200,100,30);
		add(lblemail1);
		
		try
		{
			
			Conn c =new Conn();
			String query= "select * from employee where Empid= '"+cempid.getSelectedItem()+"'";
			ResultSet rs=c.s.executeQuery(query);
			
			while(rs.next())
			{
				lblname1.setText(rs.getString("name"));
				lblphone1.setText(rs.getString("phone"));
				lblemail1.setText(rs.getString("email"));

				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		cempid.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent ie)
					{
						try
						{
							
							Conn c =new Conn();
							String query= "select * from employee where Empid= '"+cempid.getSelectedItem()+"'";
							ResultSet rs=c.s.executeQuery(query);
							
							while(rs.next())
							{
								lblname1.setText(rs.getString("name"));
								lblphone1.setText(rs.getString("phone"));
								lblemail1.setText(rs.getString("email"));

								
							}
							
						}catch(Exception e)
						{
							e.printStackTrace();
						}

						
						
					}
			
				});
		
		delete=new JButton("Delete");
		delete.setBounds(80,300,100,30);
		delete.setBackground(Color.black);
		delete.setForeground(Color.white);
		delete.addActionListener(this);
		add(delete);
		
		back=new JButton("Back");
		back.setBounds(250,300,100,30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
		Image i2= i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(350,0,600,400);
		add(image);
		
		setSize(1000,600);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== delete)
		{
			try
			{
				Conn c= new Conn();
				String query="delete from Employee where Empid= '"+cempid.getSelectedItem()+"'";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Employee Information Deleted Succesfully");
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
		new RemoveEmployees();
		
		
	}
}
