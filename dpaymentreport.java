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
public class dpaymentreport extends Frame implements ActionListener
{
	String strtestname[]=new String[50];
	String strpcode[]=new String[50];
	String strtdate[]=new String[50];
	String strpname[]=new String[50];
	String strtotalamount[]=new String[50];
	String strreciptno[]=new String[50];
	JLabel ldate =new JLabel("Date");
    JTextField tdate=new JTextField("");
   JButton bok =new JButton("OK");
    PrintWriter pw;
	int c1=0;
	int c6=0;
	int c2=0;
	int c3=0;
	int c4=0;
	int c5=0;
  public dpaymentreport()
 {
	setLayout(null);
	setVisible(true);
	setSize(400,300);
		setTitle(" Daily Payment Report");
	    ldate.setBounds(40,80,100,40);
		tdate.setBounds(160,80,100,40);
		Font f1=new Font("Monotype Corsiva",Font.BOLD,20);	
			ldate.setFont(f1);
			tdate.setFont(f1);
			
	 bok.setBounds(100,210,100,40);
	 Color c2=new Color(200,150,100);
		bok.setBackground(c2);
add(ldate);
add(tdate);
add(bok);
     bok.addActionListener(this);
	  repaint();
  }
  public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==bok)
	  {
	try		  
			{
Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  pw=new PrintWriter("Daily payment report.txt");
			  pw.println("\t\t\t\t..........Blue Origin Dignostic center..........");
			  pw.println("\t\t\t\t   ..........Daily Payment Report..........");
			  pw.println("\n");
			  pw.println("\n");
		      String s2="select * from patienttbl where pdoe='"+tdate.getText()+"'";
			  Statement st1= con.createStatement();
			  ResultSet res1 = st1.executeQuery(s2);
				while(res1.next())
				{
				    strpcode[c3]=res1.getString(1);c3++;
					strpname[c4]=res1.getString(2);c4++;				
				}
				String s3="select * from paymenttbl where receiptdate='"+tdate.getText()+"'";
			  Statement st2= con.createStatement();
			  ResultSet res2 = st2.executeQuery(s3);
				while(res2.next())
				{
					strtdate[c1]=res2.getString(2);c1++;				
					strtestname[c2]=res2.getString(4);c2++;
				    strreciptno[c5]=res2.getString(1);c5++;
					strtotalamount[c6]=res2.getString(3);c6++;				
				}
				pw.print("date :   "+tdate.getText());
				pw.println("\n");
				pw.println("_____________________________________________________________________________________________________________________________________________");
				pw.print("\tReciept No");
				pw.print("\tTest Name");
				pw.print("\t\tPatient Code");
				pw.print("\tPatient Name");
				pw.print("\tTotal Amount");
				pw.println("\n");
				pw.println("_____________________________________________________________________________________________________________________________________________");
				for(int i=0;i<c2;i++)
				{
					for(int j=0;j<21-c5;j++)
						{
							pw.print(" ");
						}
				pw.print(""+strreciptno[i]);
				for(int j=0;j<17-c2;j++)
						{
							pw.print(" ");
						}
				pw.print("\t"+strtestname[i]);
				for(int j=0;j<17-c3;j++)
						{
							pw.print(" ");
						}
				pw.print("\t"+strpcode[i]);
				for(int j=0;j<17-c4;j++)
						{
							pw.print(" ");
						}
				pw.print("\t"+strpname[i]);
				for(int j=0;j<17-c6;j++)
						{
							pw.print(" ");
						}
				pw.print("\t"+strtotalamount[i]);
				pw.println("\n");
				}
				pw.close();
				ProcessBuilder pb =new ProcessBuilder("notepad.exe","Daily payment report.txt");
				pb.start();
			}
		  catch(Exception ey)
		  {
			  System.out.println(ey);
		  }		  
	  }
    
	
 }
  
public static void main(String argv[])throws IOException
		{
			dpaymentreport obj=new dpaymentreport();
		}
}

  
 