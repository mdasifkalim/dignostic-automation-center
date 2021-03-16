import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
public class loginpage extends Frame implements ActionListener
{
	int c=0;
	JTextField tuser=new JTextField();
	JPasswordField tpassword=new JPasswordField();
	JButton blogin=  new JButton("");
	JButton bcancel=  new JButton("");
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/LOGIN.png"));
public loginpage()
{
		setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("Login Page");
	     
			limg1.setBounds(0,0,getWidth(),getHeight());
			/*tuser.setBorder(null);
			tuser.setBackground(new Color(130,208,185));*/
		
		tuser.setBounds(634,260,450,30);
		  tuser.setBorder(null);
			tuser.setBorder(null);
	        tuser.setOpaque(false);
		tpassword.setBounds(634,360,450,30);
		  tpassword.setBorder(null);
			tpassword.setBorder(null);
	        tpassword.setOpaque(false);
			 tuser.setFont(new Font("calibri",Font.BOLD,15));
       tpassword.setFont(new Font("calibri",Font.BOLD,15));
	   tuser.setForeground(new Color(255,255,255));	
       tpassword.setForeground(new Color(255,255,255));
		  
		  blogin.setOpaque(false);
		  blogin.setContentAreaFilled(false);
		// blogin.setBorderPainted(false);
		  bcancel.setOpaque(false);
		  bcancel.setContentAreaFilled(false);
		//  bcancel.setBorderPainted(false);  
		  			blogin.setBounds(581,435,202,45);
					bcancel.setBounds(836,434,202,45);
					Font f3=new Font("Georgia",Font.BOLD,25);	
					blogin.setFont(f3);
					bcancel.setFont(f3);
					tpassword.setEchoChar('*');
									
add(blogin);
add(bcancel);
add(tuser);
add(tpassword);
add(limg1);
	 blogin.addActionListener(this);
	 bcancel.addActionListener(this);
	 repaint();
}
public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==blogin)
		{
			try
			{
				int flg=0;
				  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
				  String str="select * from login where usr='"+tuser.getText()+"' AND password='"+tpassword.getText()+"'";
				  Statement st= con.createStatement();
				  ResultSet res = st.executeQuery(str);
		          while(res.next())
			      {	  
		              flg=1;
			      }
			      if(flg==1)
			      {
				  	if(tuser.getText().equals("admin")&&tpassword.getText().equals("123456789"))
				    {
					   setVisible(false);
					   
					   JOptionPane.showMessageDialog(null,"Welcome Admin");
					   menuadmin obj=new menuadmin();
				   }
				   else
				   {
					   setVisible(false);
					   menuuser obj=new menuuser();
				   }
		          }
			      else
			      {
					 int c=0;
					 JOptionPane.showMessageDialog(null,"Password Incorrect");
					c++; 
				  }
				 
			  }
			catch(Exception ex)
			{
				System.out.print(ex);
			}
			
		}
	if(e.getSource()==bcancel)
	{
		this.dispose();
	}
	}

public static void main(String argv[])throws IOException
{
	loginpage obj=new loginpage();
}	
	
	
}
