import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
public class changepassword extends Frame implements ActionListener
{
	int c=0;
	JLabel llogin=new JLabel("Login");
	JLabel luser=new JLabel("User Name");
	JLabel lpassword=new JLabel("new Password");
	JTextField tuser=new JTextField();
	JPasswordField tpassword=new JPasswordField();
	JButton blogin=  new JButton("password change");
	JButton bcancel=  new JButton("Cancel");
public changepassword()
{
		setLayout(null);
	setVisible(true);
	setSize(600,600);
	setTitle("Login Page");
	        
		llogin.setBounds(100,40,150,60);
		luser.setBounds(40,130,150,50);
		tuser.setBounds(250,130,150,40);
		lpassword.setBounds(40,210,200,50);
		tpassword.setBounds(250,210,150,40);
				Font f1=new Font("Monotype corsiva",Font.BOLD,30);	
				llogin.setFont(f1);
					Font f2=new Font("Monotype corsiva",Font.BOLD ,30);	

			luser.setFont(f2);
			lpassword.setFont(f2);
					blogin.setBounds(50,330,220,50);
					bcancel.setBounds(330,330,220,50);
					Font f3=new Font("Georgia",Font.BOLD,19);	
					blogin.setFont(f3);
					bcancel.setFont(f3);
					tpassword.setEchoChar('*');
									
add(blogin);
add(bcancel);
add(llogin);
add(tuser);
add(luser);
add(lpassword);
add(tpassword);
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
		      Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			   String str="update logintbl set password ='"+tpassword.getText()+"' where username='"+tuser.getText()+"'";
			  Statement st = con.createStatement();
			  st.executeUpdate(str);
			  JOptionPane.showMessageDialog(null,"Password Changed");
		 }
		 catch(Exception s)
		 {
			 System.out.println(s);
		 }
			
		}
	if(e.getSource()==bcancel)
	{
		this.dispose();
	}
	}

public static void main(String argv[])throws IOException
{
	changepassword obj=new changepassword();
}	
	
	
}
