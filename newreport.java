import java.awt.*;
import java.util.*;
import java.util.Date;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
import java.text.*;
import java.text.SimpleDateFormat;
public class newreport extends Frame implements ActionListener,FocusListener
{
	String strcode="";
	String strname="";
	String straddress="";
	String strgender="";

	String strdob="";
	String strdate="";
	String strcont="";
	String strage="";
	String strtid="";
String 	strtname="";
	String strtdesc="";
	String strtvalm1="";
	String strtvalm2="";
	String strtvalm3="";
	String strtvalm4="";
	String strtvalm5="";
	String strtvalf1="";
    String strtvalf2="";
	String strtvalf3="";
	String strtvalf4="";
	String strtvalf5="";
	String strtcost="";
	
	String testval1="";
	String testval2="";
	String testval3="";
	String testval4="";
	JLabel lpcode =new JLabel("Patient code");
  JLabel ltest =new JLabel("Test Id");
  JTextField tpcode=new JTextField("");
  JTextField ttest=new JTextField("");
   JButton bnew =new JButton("New");
  JButton breport =new JButton("Report");
   JButton bsave =new JButton("save");
  JButton bcancel =new JButton("Cancel");
  PrintWriter pw;
  public newreport()
 {
	setLayout(null);
	setVisible(true);
	setSize(900,600);
		setTitle("Test Report");
	    lpcode.setBounds(20,40,100,40);
		ltest.setBounds(20,100,100,40);
		Font f1=new Font("Monotype Corsiva",Font.BOLD,18);	
			lpcode.setFont(f1);
			ltest.setFont(f1);
			  tpcode.setBounds(150,40,90,30);
			  ttest.setBounds(150,100,90,30);
	 bnew.setBounds(20,340,100,40);
	 bsave.setBounds(260,340,100,40);
	 breport.setBounds(140,340,100,40);
	 bcancel.setBounds(380,340,100,40);
	 Color c2=new Color(200,150,100);
		bnew.setBackground(c2);
		bsave.setBackground(c2);
		breport.setBackground(c2);
		bcancel.setBackground(c2);
	Font f2=new Font("Monotype Corsiva",Font.BOLD,18);	
			bnew.setFont(f2);
		    breport.setFont(f2);
			bcancel.setFont(f2);
			bsave.setFont(f2);
add(lpcode);
add(tpcode);
add(ltest);
add(ttest);
add(bnew);
add(breport);
add(bcancel);
add(bsave);
	 bnew.addActionListener(this);
	 bsave.addActionListener(this);
	 breport.addActionListener(this);
	 bcancel.addActionListener(this);
	 repaint();
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==bnew)
	  {
		 
					tpcode.setText("");
					ttest.setText("");
		  
	  }
    if(e.getSource()==breport)
	  {
	try
			{
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  pw=new PrintWriter("report.txt");
			  pw.println("\t\t\t\t\t\t..........TEST REPORT..........");
			  pw.println("\n");
		      String s1="select * from patienttbl where pcode='"+tpcode.getText()+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(s1);
			  while(res.next())
					{
					    strcode=res.getString(1);
						strname=res.getString(2);
						straddress=res.getString(3);
						strgender=res.getString(4);
						strdob=res.getString(5);
						strdate=res.getString(6);
						strcont=res.getString(7);
						strage=res.getString(8);						
					}
		      String s2="select * from testtbl where tid='"+ttest.getText()+"'";
			  Statement st1= con.createStatement();
			  ResultSet res1 = st.executeQuery(s2);
				while(res1.next())
				{
				    strtid=res1.getString(1);
					strtname=res1.getString(2);
					strtdesc=res1.getString(3);
					strtvalm1=res1.getString(4);
					strtvalm2=res1.getString(5);
					strtvalm3=res1.getString(6);
					strtvalm4=res1.getString(7);
					strtvalm5=res1.getString(8);
					strtvalf1=res1.getString(9);
                    strtvalf2=res1.getString(10);
				    strtvalf3=res1.getString(11);
					strtvalf4=res1.getString(12);
					strtvalf5=res1.getString(13);
					strtcost=res1.getString(14);
					
				}
				 String s4="select * from testcon where pcode='"+tpcode.getText()+"'";
			  Statement st4 = con.createStatement();
			  ResultSet res4 = st4.executeQuery(s4);
			  while(res4.next())
					{
						testval1=res4.getString(8);
						testval2=res4.getString(9);
						testval3=res4.getString(10);
						testval4=res4.getString(11);
											
					}
				pw.print("package Id :   "+strcode);
				pw.println("\t \t\t\t\t\t\t\t\t\t\tDate :   "+strdate );
				pw.print("patient Name :  "+strname);
				pw.print("\tPatient Address :  "+straddress);
				pw.print("\tsex :  "+strgender);
				pw.print("\t   Age :  "+strage );				
				pw.print("\t   D.O.B :  "+strdob);
				pw.println("\t Mobile no :  "+strcont );	
				pw.println("\n");
				pw.println("Test Id :  "+strtid);
				pw.print("Test Name  :   "+strtname);
				pw.println("\tTest Desciption  :   "+strtdesc);
				pw.println("________________________________________________________________________________________________________________________________________________________________");
				pw.println("\t\t\t\ttest value \t\t\t\tnormal value");
				pw.println("________________________________________________________________________________________________________________________________________________________________");
				if(strgender.equals("Male"))
				{
				pw.println("\t\t\t\t"+testval1 +"\t\t\t\t\t "+strtvalm1);
				pw.println("\t\t\t\t"+testval2 +"\t\t\t\t\t  "+strtvalm2);
				pw.println("\t\t\t\t"+testval3 +"\t\t\t\t\t  "+strtvalm3);
				pw.println("\t\t\t\t"+testval4 +"\t\t\t\t\t  "+strtvalm4);
				pw.println("\t\t\t\t\t\t\t\t\t  "+strtvalm5);
	          			
				}
				else
				{		
				pw.println("\t\t\t\t"+testval1 +"\t\t\t\t\t  "+strtvalf1);
				pw.println("\t\t\t\t"+testval2 +"\t\t\t\t\t  "+strtvalf2);
				pw.println("\t\t\t\t"+testval3 +"\t\t\t\t\t  "+strtvalf3);
				pw.println("\t\t\t\t"+testval4 +"\t\t\t\t\t  "+strtvalf4);
				pw.println("\t\t\t\t \t\t\t\t\t  "+strtvalf5);	
                pw.println("\t\t\t\t    "+testval1);
				pw.println("\t\t\t\t     "+testval2);
				pw.println("\t\t\t\t     "+testval3);
				pw.println("\t\t\t\t     "+testval4);							
				}
				pw.println("Test Cost   :  "+strtcost);
				pw.close();
				ProcessBuilder pb =new ProcessBuilder("notepad.exe","report.txt");
				pb.start();
			}
		  catch(Exception ey)
		  {
			  System.out.println(ey);
		  }		  
	  }
	  	if(e.getSource()==bsave)
	{
		 try
		  {
			 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  Statement st4=con.createStatement();
			  String str4="insert into testreport(pcode,tid)values(?,?)";
			  PreparedStatement ps4=con.prepareStatement(str4);
			   ps4.setString(1,tpcode.getText());
			   ps4.setString(2,ttest.getText());
			   ps4.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
		  }
		  catch(Exception a)
		  {
			  System.out.println(a);
		  }
	}
    if(e.getSource()==bcancel)
	  { 
		  this.dispose();
	  }
  
  }
  	public void focusLost(FocusEvent fe)
	{
	}
public void focusGained(FocusEvent fe)
	{}

public static void main(String argv[])throws IOException
		{
			newreport obj=new newreport();
		}
}

  
 