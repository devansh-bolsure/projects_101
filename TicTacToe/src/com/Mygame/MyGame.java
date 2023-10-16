package com.Mygame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyGame extends JFrame implements ActionListener
{
	JLabel heading,clockLabel;
	Font font=new Font("",Font.BOLD,40);
	JPanel mainPanel;
	JButton[] btns=new JButton[9];
	
	
	
	///game instance variable///
	
	int gamechances[]= {2,2,2,2,2,2,2,2,2,};
	int activePlayer=0;
	
	
	int wps[][]= {
			{0,1,2},
			{3,4,5},
			{6,7,8},
			{0,3,6},
			{1,4,7},
			{2,5,8},
			{0,4,8},
			{2,4,6}

	};
	
	int winner=2;
	
	boolean gameover=false;
	
	MyGame()
	{
		System.out.println("creating instance of game");
		setTitle("My Tic Tac Toe game..");
		setSize(650,650);
		ImageIcon icon=new ImageIcon("src/img/tic.png");
		setIconImage(icon.getImage());
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		setVisible(true);
		
		
	}
	
	private void createGUI()
	{
		this.getContentPane().setBackground(Color.decode("#2196f3"));
		
		this.setLayout(new BorderLayout());
		
		//North heading//...
		
		heading=new JLabel("Tic Tac Toe");
		heading.setIcon(new ImageIcon("src/img/tic.png"));
		heading.setFont(font);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setHorizontalTextPosition(SwingConstants.CENTER);
		heading.setVerticalTextPosition(SwingConstants.BOTTOM);
		this.add(heading,BorderLayout.NORTH);
		
		
		//creating object of jlabel for clock//
		
		clockLabel=new JLabel("clock");
		clockLabel.setForeground(Color.white);
		clockLabel.setFont(font);
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(clockLabel,BorderLayout.SOUTH);
		
		Thread t=new Thread()
		{
			public void run()
			{
				try
				{
					while(true)
					{
						String dateTime=new Date().toLocaleString();
						clockLabel.setText(dateTime);
						
						Thread.sleep(1000);
					}
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		
		t.start();
		
		
		//////// Panel Section////
		
		mainPanel=new JPanel();
		
		mainPanel.setLayout(new GridLayout(3,3));
		
		for(int i=1; i<=9; i++)
		{
			JButton btn= new JButton();
//			btn.setIcon(new ImageIcon("src/img/zero.png"));
			btn.setBackground(Color.decode("#90caf9"));
			btn.setFont(font);
			mainPanel.add(btn);
			btns[i-1] = btn;
			btn.addActionListener(this);
			btn.setName(String.valueOf(i-1));
		}
		this.add(mainPanel,BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton currentButton=(JButton)e.getSource();
		
		String nameStr=currentButton.getName();
//		System.out.println(nameStr);
		
		
		int name=Integer.parseInt(nameStr.trim());
		
		
		if(gameover==true)
		{
			JOptionPane.showMessageDialog(this, "Game Over...");
			return;
		}
		
		
		
		
		
		
		if(gamechances[name]==2)
		{
			if(activePlayer==1)
			{
				currentButton.setIcon(new ImageIcon("src/img/number1-2.png"));
				gamechances[name]=activePlayer;
				activePlayer=0;
			
			}else
			{
				currentButton.setIcon(new ImageIcon("src/img/zero.png"));
				gamechances[name]=activePlayer;
				activePlayer=1;
			}
			
			//find the winner//
			
			for(int []temp:wps)
			{
				if((gamechances[temp[0]]==gamechances[temp[1]])&&(gamechances[temp[1]]==gamechances[temp[2]])&&gamechances[temp[2]]!=2)
				{
					winner=gamechances[temp[0]];
					
					gameover=true;
					
					JOptionPane.showMessageDialog(null,"Player "+winner+" has won the game");
					int i = JOptionPane.showConfirmDialog(this, "do you want to play more");
					if(i==0)
					{
						this.setVisible(false);
						new MyGame();
					}else if(i==1)
					{
						System.exit(34);
						
					}else 
					{
						
					}
					System.out.println(i);
					break;
				}
				
			}
			
			
//			//draw logic//
			
			int c=0;
			
			for(int x:gamechances)
			{
				if(x==2)
				{
					c++;
					break;
				}
			}
			
			
			if(c==0&&gameover==false) {
				
				JOptionPane.showMessageDialog(null, "Its a draw...");
				
				int i=JOptionPane.showConfirmDialog(this, "Play more?");
				if(i==0)
				{
					this.setVisible(false);
					new MyGame();
				}else if(i==1)
				{
					System.exit(1213);
				}else 
				{
					
				}
				
				gameover=true;
			}
			
		
		}else
		{
			JOptionPane.showMessageDialog(this,"Position Already Occupied..." );
		}
		
		
	}	
	

}
