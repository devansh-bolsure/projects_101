package z_MyForm;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame
{

	private JLabel heading;
	Font font = new Font("",Font.BOLD,30);
	
	
	private JPanel mainPanel;
	private JLabel nameLabel,passwordLabel;
	private JTextField nameTextField;
	private JPasswordField passwordField;
	private JButton  button1,button2;
	
	
	
	// constructor
	 
	public MyWindow()
	{
		super.setTitle("My FIrst Form...");
		super.setSize(500,500);
		super.setLocation(100,100);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.createGUI();
		
		setVisible(true);
		System.out.println("This Is A Constructor...");
		
	}
	
	public void createGUI()
	{
		//this method creates our GUI
		
		this.setLayout(new BorderLayout());
		
		heading=new JLabel("My First Form..."); 
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(heading,BorderLayout.NORTH);
		
		////////// working with jpanel....
		
		mainPanel=new JPanel();
		/// setting layout of main panel...
		mainPanel.setLayout(new GridLayout(3,2));
		
		nameLabel=new JLabel("Enter Name:");
		nameLabel.setFont(font);
		
		passwordLabel=new JLabel("Enter Password:");
		
		passwordLabel.setFont(font);
		
		nameTextField=new JTextField();
		nameTextField.setFont(font);
		
		passwordField= new JPasswordField() ;
		passwordField.setFont(font);
		
		button1=new JButton("Submit");
		button1.setFont(font);
		
		button2=new JButton("Reset");
		button2.setFont(font);

		mainPanel.add(nameLabel);
		
		mainPanel.add(nameTextField);
		
		mainPanel.add(passwordLabel);
		
		mainPanel.add(passwordField);
		
		mainPanel.add(button1);
		
		mainPanel.add(button2);
		
		this.add(mainPanel,BorderLayout.CENTER);
		
	}
}
