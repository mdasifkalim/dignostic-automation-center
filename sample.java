import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 public class login extends JFrame implements ActionListener
 {
          int ctr=0,flg=0;	 
		  
     JButton blogin=new JButton("");
    JButton bcancel=new JButton("");
  
	     JLabel uname=new JLabel("Username");
	     JLabel pass=new JLabel("Password");
	
       JTextField txt_uname=new JTextField();
		JPasswordField txt_pass=new JPasswordField();			 
 JLabel limg=new JLabel(new ImageIcon("C:/Users/ROCKY/project/loginnew.png"));
	
	public login()
	    {
     blogin.setBounds(130,472,170,70);
	 bcancel.setBounds(355,472,170,70); 	
     
	 uname.setBounds(300,50,130,30);
	  pass.setBounds(300,100,130,30);
	      blogin.setOpaque(false);
		  blogin.setContentAreaFilled(false);
		  blogin.setBorderPainted(false);
		  bcancel.setOpaque(false);
		  bcancel.setContentAreaFilled(false);
		  bcancel.setBorderPainted(false);   
		   
		    txt_uname.setBorder(null);
			txt_pass.setBorder(null);
	        txt_uname.setOpaque(false);
		  //txt_uname.setBackground(new Color(255,255,255));  
          txt_pass.setOpaque(false);		  
		  txt_pass.setBackground(new Color(255,255,255)); 
       txt_uname.setFont(new Font("calibri",Font.BOLD,25));
       txt_pass.setFont(new Font("calibri",Font.BOLD,25));
	   txt_uname.setForeground(new Color(255,255,255));	
       txt_pass.setForeground(new Color(255,255,255));

		/*txt_uname.setOpaque(false);
		  txt_uname.setContentAreaFilled(false);
		\  txt_uname.setBorderPainted(false);
		  
		  txt_pass.setOpaque(false);
		  txt_pass.setContentAreaFilled(false);
		  txt_pass.setBorderPainted(false);*/
		  
		  txt_uname.setBounds(328,265,340,48);
	      txt_pass.setBounds(330,355,340,48);
			
		     add(blogin);  
			 add(bcancel);
		/*	 add(uname);
			 add(pass); */
			 add(txt_uname);
             add(txt_pass);			 
			 add(limg);
			 
			 //limg.setBounds(0,0,this.getWidth(),this.getHeight());
		   //setEchochar('*');	
	        	setLayout(null);
                setTitle("LOGIN");
                setSize(1366,768);
                setVisible(true);
		limg.setBounds(0,0,this.getWidth(),this.getHeight());
	      blogin.addActionListener(this);
          bcancel.addActionListener(this);

		  }	
	 public void actionPerformed(ActionEvent e)
       { 
	      if(e.getSource()==blogin)
	         {
              try
		      {
            Connection con=DriverManager.getConnection("jdbc:odbc:carservice");
            Statement st=con.createStatement();
		
       String str="select * From login where username='"+txt_uname.getText()+"' AND password='"+txt_pass.getText()+"'";			
     		 ResultSet res=st.executeQuery(str);
			/* while(res.next())
			{
                    flg=1;
			}					
		       if(flg==1)
			   {  
			     JOptionPane.showMessageDialog(null,"Login successful");
			     this.dispose();
			     carservice obj=new carservice();
				 flg=1;
			   }*/
		        
		if (res.next())
		{
				JOptionPane.showMessageDialog(null,"Login successful");
				this.dispose();
				 carservice obj=new carservice();
				 ctr=0;
		}	else 
		{
			JOptionPane.showMessageDialog(null,"Login unsuccessful");
				ctr++;
		}
		
		   if(ctr>=3)
		   {
			   JOptionPane.showMessageDialog(null,"You entered wrong password");
			   this.dispose();
		   }
		
		
	/*	  {  
		  ctr++;
		        
				JOptionPane.showMessageDialog(null,"Login Unsuccessful");
				txt_uname.setText("");
                txt_pass.setText("");		
 			    if(ctr>=3)
			    {
				 this.dispose();
				} }*/
	           
			  }
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	  }
	  if(e.getSource()==bcancel)
	 {
		 this.dispose();
	 }
	   }
	   
   public static void main(String args[])
   {
	   login obj=new login();
   }	   
  
 }