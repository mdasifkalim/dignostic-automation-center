import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
public class createuser extends Frame implements ActionListener
{
	/*JLabel lcreate=new JLabel("CreateUser");
	JLabel lusername=new JLabel("New User");
	JLabel lpassword=new JLabel("Password");*/
	JTextField tusername=new JTextField();
	//JLabel lusertype=new JLabel("Usertype");
	JTextField tusertype=new JTextField();
    JPasswordField tpassword=new JPasswordField();
	JButton bsave=  new JButton("Save");
	JButton bnew=  new JButton("New");
	JButton bcancel=  new JButton("Cancel");
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/createuser.png "));
	public createuser()
{
		setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("create User");
		limg1.setBounds(0,0,getWidth(),getHeight());
	  //  lcreate.setBounds(300,40,250,60);
		//lusername.setBounds(40,130,150,50);
		tusername.setBounds(250,130,150,40);
		//lusertype.setBounds(40,300,150,50);
		tusertype.setBounds(250,300,150,40);
		//lpassword.setBounds(40,210,200,50);
		tpassword.setBounds(250,210,150,40);
				/*Font f1=new Font("Monotype corsiva",Font.BOLD,40);	
			//	lcreate.setFont(f1);
					Font f2=new Font("Monotype corsiva",Font.BOLD ,25);	
			lusername.setFont(f2);
			lpassword.setFont(f2);
			lusertype.setFont(f2);*/
					bsave.setBounds(50,380,150,50);
					bnew.setBounds(550,380,150,50);
					bcancel.setBounds(300,380,150,50);
					tpassword.setEchoChar('*');
					Font f3=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f3);
			bsave.setFont(f3);
			bcancel.setFont(f3);
			Color c3=new Color(204,238,255);
			  tusername.setBackground(c3);
			 tusertype.setBackground(c3);
			  tpassword.setBackground(c3);
			  Color c2=new Color(43,159,255);
				bnew.setBackground(c2);
				bsave.setBackground(c2);
				bcancel.setBackground(c2);
					bnew.setForeground(new Color(255,255,255));
					bsave.setForeground(new Color(255,255,255));
					bcancel.setForeground(new Color(255,255,255));
add(bsave);
add(bnew);
add(bcancel);
//add(lcreate);
add(tusername);
//add(lusername);
add(tusertype);
//add(lusertype);
//add(lpassword);
add(tpassword);
add(limg1);
	 bsave.addActionListener(this);
	  bnew.addActionListener(this);
	 bcancel.addActionListener(this);
	 repaint();
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bnew)
	{
		tusername.setText("");
		tpassword.setText("");
		tusertype.setText("");
	}
      if(e.getSource()==bsave)
      {
			try
			{
				Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
    			  Statement st=con.createStatement();
			   if(tusertype.getText().equals("admin"))
			   { 
	        	   JOptionPane.showMessageDialog(null,"userType invalid");
		           this.dispose();
		     }
			else
			 {
			  String str="insert into login(usr,password,usertype)values(?,?,?)";
			   PreparedStatement ps=con.prepareStatement(str);
				  ps.setString(1,tusername.getText());
				  ps.setString(2,tpassword.getText());
				  ps.setString(3,tusertype.getText());
			   ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
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
public static void main(String argv[]) throws IOException
{
	createuser obj=new createuser();
	
}
}