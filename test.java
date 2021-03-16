import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
public class test extends Frame implements ActionListener 
{
	JLabel lid =new JLabel(" Test Id");
	JLabel lname =new JLabel(" Test name");
	JLabel ldate =new JLabel(" Test date");
	JLabel lmale =new JLabel("Male");
	JLabel lfemale =new JLabel("Female");
	JLabel lcost =new JLabel("Test Cost");
	JLabel lremark =new JLabel(" Remarks");
		JTextField tid=new JTextField("");
		JTextField tname=new JTextField("");
		JTextField tcost=new JTextField("");
		JTextField tdate=new JTextField("");
		JTextField titem1=new JTextField("");
		JTextField titem2=new JTextField("");
		JTextField titem3=new JTextField("");
		JTextField titem4=new JTextField("");
		JTextField titem5=new JTextField("");
		JTextField titem6=new JTextField("");
		JTextField titem7=new JTextField("");
		JTextField titem8=new JTextField("");
		JTextField titem9=new JTextField("");
		JTextField titem10=new JTextField("");
		JTextField tremark=new JTextField("");
		JButton bnew =new JButton("New");
		JButton bsave =new JButton("Save");
		JButton bedit=new JButton("Edit");
		JButton bsearch=new JButton("Search");
		JButton bcancel =new JButton("Cancel");
		JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/TEST.png "));
public test()
{
   setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("Test");
		limg1.setBounds(0,0,getWidth(),getHeight());
	lid.setBounds(20,40,100,40);	
	lname.setBounds(20,90,100,40);	
	ldate.setBounds(20,140,100,40);	
    lmale.setBounds(190,190,390,40);
	lfemale.setBounds(440,190,390,40);
	lcost.setBounds(20,490,100,40);
	lremark.setBounds(20,540,100,40);	
		tid.setBounds(140,40,100,40);
		tname.setBounds(140,90,100,40);
		tdate.setBounds(140,140,100,40);
		titem1.setBounds(190,240,100,40);
		titem2.setBounds(190,290,100,40);
		titem3.setBounds(190,340,100,40);
		titem4.setBounds(190,390,100,40);
		titem5.setBounds(440,440,100,40);
		titem6.setBounds(440,240,100,40);
		titem7.setBounds(440,290,100,40);
		titem8.setBounds(440,340,100,40);
		titem9.setBounds(440,390,100,40);
		titem10.setBounds(190,440,100,40);
		tcost.setBounds(150,490,100,40);
		tremark.setBounds(150,540,100,40);
			bnew.setBounds(40,600,100,40);
			bsave.setBounds(160,600,100,40);
			bedit.setBounds(280,600,100,40);
			bsearch.setBounds(400,600,100,40);
			bcancel.setBounds(520,600,100,40);
				Color c2=new Color(43,159,255);
				bnew.setBackground(c2);
				bsave.setBackground(c2);
				bsearch.setBackground(c2);
				bedit.setBackground(c2);
				bcancel.setBackground(c2);
					bnew.setForeground(new Color(255,255,255));
					bedit.setForeground(new Color(255,255,255));
					bsave.setForeground(new Color(255,255,255));
					bsearch.setForeground(new Color(255,255,255));
					bcancel.setForeground(new Color(255,255,255));
		Font f2=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f2);
			bsave.setFont(f2);
			bsearch.setFont(f2);
			bedit.setFont(f2);
			bcancel.setFont(f2);
			Color c3=new Color(204,238,255);
				tid.setBackground(c3);
				tname.setBackground(c3);
				tdate.setBackground(c3);
				titem1.setBackground(c3);
				titem2.setBackground(c3);
				titem3.setBackground(c3);
				titem4.setBackground(c3);
				titem5.setBackground(c3);
				titem6.setBackground(c3);
				titem7.setBackground(c3);
				titem8.setBackground(c3);
				
				titem9.setBackground(c3);
				titem10.setBackground(c3);
				tcost.setBackground(c3);
				tremark.setBackground(c3);
				Font f1=new Font("Copperplate Gothic Light",Font.BOLD,14);	
					lid.setFont(f1);	
					lname.setFont(f1);
					ldate.setFont(f1);
					lmale.setFont(f1);
					lfemale.setFont(f1);
					lcost.setFont(f1);
					lremark.setFont(f1);
/*add(lid);
add(lname);
add(ldate);
add(lmale);
add(lfemale);
add(lcost);
add(lremark);*/
add(tid);
add(tname);
add(tdate);
add(titem1);
add(titem2);
add(titem3);
add(titem4);
add(titem5);
add(titem6);
add(titem7);
add(titem8);
add(titem9);
add(titem10);
add(tcost);
add(tremark);
add(bnew);
add(bedit);
add(bsave);
add(bsearch);
add(bcancel);
add(limg1);
bnew.addActionListener(this);
bsave.addActionListener(this);
bedit.addActionListener(this);
bsearch.addActionListener(this);
bcancel.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bnew)
	{
		try
		  {	  int ctr=1; 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from testtbl";
			  Statement st= con.createStatement();
			  ResultSet res = st.executeQuery(str);
				while(res.next())
				{
					ctr++;
				}
					tid.setText("t00"+ctr);
					tname.setText("");
					tcost.setText("");
					tdate.setText("");
				
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
	if(e.getSource()==bsave)
	{		  try
		  {
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  Statement st=con.createStatement();
			  String str="insert into testtbl(tid,tname,tdate,titem1,titem2,titem3,titem4,titem5,titem6,titem7,titem8,titem9,titem10,tcost,tremark)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,tid.getText());
			  ps.setString(2,tname.getText());
			  ps.setString(3,tdate.getText());
			   ps.setString(4,titem1.getText());
			   ps.setString(5,titem2.getText());
			   ps.setString(6,titem3.getText());
			   ps.setString(7,titem4.getText());
			   ps.setString(8,titem5.getText());
			   ps.setString(9,titem6.getText());
			   ps.setString(10,titem7.getText());
			   ps.setString(11,titem8.getText());
			   ps.setString(12,titem9.getText());
			   ps.setString(13,titem10.getText());
			   ps.setString(14,tcost.getText());
			   ps.setString(15,tremark.getText());
			  ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
		  }
		  catch(Exception a)
		  {
			  System.out.println(a);
		  }
		  }
	if(e.getSource()==bsearch)
	{
		
		  try{
		  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from testtbl where tid='"+tid.getText()+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(str);
			  while(res.next())
			  {	
				  tname.setText(res.getString(2));
				  tdate.setText(res.getString(3));
				  titem1.setText(res.getString(4));
				  titem2.setText(res.getString(5));
				  titem3.setText(res.getString(6));
				  titem4.setText(res.getString(7));
				  titem5.setText(res.getString(8));
				  titem6.setText(res.getString(9));
				  titem7.setText(res.getString(10));
				  titem8.setText(res.getString(11));
				  titem9.setText(res.getString(12));
				  titem10.setText(res.getString(13));
				  tcost.setText(res.getString(14));
				  tremark.setText(res.getString(15));
				  
			  }
		  }
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
	}
	if(e.getSource()==bedit)
	{
		 try
		 {	   
		      Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");      
				 String str="update testtbl set tname='"+tname.getText()+"',tdesc='"+tdate.getText()+"',titem1='"+titem1.getText()+"',titem2='"+titem2.getText()+"',titem3='"+titem3.getText()+"',titem4='"+titem4.getText()+"',titem5='"+titem5.getText()+"',titem6='"+titem6.getText()+"',titem7='"+titem7.getText()+"',titem8='"+titem8.getText()+"',titem9='"+titem9.getText()+"',titem10='"+titem10.getText()+"',tcost='"+tcost.getText()+"',tremark='"+tremark.getText()+"' where tid='"+tid.getText()+"'";
			 Statement st = con.createStatement();
			  st.executeUpdate(str);
			  JOptionPane.showMessageDialog(null,"Record Updated");
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
  
	
	
}public static void main(String argv[])throws IOException
		{
			test obj=new test();
		}
}	