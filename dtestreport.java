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
public class dtestreport extends Frame implements ActionListener
{
	//String strtdate[]=new String[50];
	String strtestname[]=new String[50];
	String strpcode[]=new String[50];
	String strpname[]=new String[50];
	JLabel ldate =new JLabel("Date");
    JTextField tdate=new JTextField("");
   JButton bok =new JButton("OK");
    PrintWriter pw;
	int c1=0;
	int c2=0;
	int c3=0;
	int c4=0;
  public dtestreport()
 {
	setLayout(null);
	setVisible(true);
	setSize(400,300);
		setTitle(" Daily Test Report");
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
			  pw=new PrintWriter("Daily Test Report.txt");
			  pw.println("\t\t..........BLUE ORIGIN DIGNOSTIC CENTER..........");
			  pw.println("\t\t  ..........DAILY TEST REPORT..........");
			  pw.println("\n");
			  pw.println("\n");
		      String s1="select * from testtbl  where tdate='"+tdate.getText()+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(s1);
			  while(res.next())
					{
					   strtestname[c1]=res.getString(2);
						c1++;
					}
		      String s2="select * from patienttbl where pdoe='"+tdate.getText()+"'";
			  Statement st1= con.createStatement();
			  ResultSet res1 = st.executeQuery(s2);
				while(res1.next())
				{
				    strpcode[c2]=res1.getString(1);
					c2++;
					strpname[c3]=res1.getString(2);
					c3++;
				}
				pw.print("date :   "+tdate.getText());
				pw.println("\n");
				pw.println("_____________________________________________________________________________________________________________________________________________");
				pw.print("\tTest Name\t\tPatient Code\tPatient Name");
				//pw.print("\t\tPatient Code");
				//pw.print("\tPatient Name");
				pw.println("\n");
				pw.println("_____________________________________________________________________________________________________________________________________________");
				for(int i=0;i<c1;i++)
				{
						for(int j=0;j<17-c1;j++)
						{
							pw.print(" ");
						}
							pw.print("  "+strtestname[i]);
								for(int k=0;k<17-c2;k++)
								{
									pw.print(" ");
								}
							     	pw.print("\t"+strpcode[i]);
										for(int l=0;l<17-c3;l++)
										{
											pw.print(" ");
										}
								     		pw.print("\t"+strpname[i]);
				pw.println("\n");
				}			
				pw.close();
				ProcessBuilder pb =new ProcessBuilder("notepad.exe","Daily Test report.txt");
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
			dtestreport obj=new dtestreport();
		}
}

  
 