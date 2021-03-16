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
public class patientprofile extends Frame implements ActionListener,FocusListener
{
  JLabel lpcode =new JLabel("Patient code");
  JLabel lpname =new JLabel("Patient name");
  JLabel lpaddress =new JLabel("Patient address");
  JLabel lpgender =new JLabel("Sex");
  JLabel lpdob =new JLabel("DOB");
   JLabel lpage =new JLabel("AGE");
  JLabel lpdate =new JLabel("Date");
  JLabel lpmobile =new JLabel("Patient mobile"); 
  JButton bnew =new JButton("New");
  JButton bsave =new JButton("Save");
  JButton bsearch =new JButton("Search");
  JButton bedit =new JButton("Edit");
  JButton bcancel =new JButton("Cancel");
  JTextField txtpcode=new JTextField("");
  JTextField txtpname=new JTextField("");
  JTextField txtpaddress=new JTextField("");
  JTextField txtpdob=new JTextField("");
  JTextField tpage=new JTextField("");
  JTextField txtpdate=new JTextField("");
  JTextField txtpmobile=new JTextField("");
  JComboBox cmpday=new JComboBox();
  JComboBox cmpmonth=new JComboBox();
  JComboBox cmpyear=new JComboBox();
  JComboBox cmbday=new JComboBox();
  JComboBox cmbmonth=new JComboBox();
  JComboBox cmbyear=new JComboBox();
  JRadioButton rbtmale=new JRadioButton("Male");
	JRadioButton rbtfemale=new JRadioButton("Female");
	ButtonGroup bg=new ButtonGroup();
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/patientprofile.png "));
 public patientprofile()
 {
	setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("Patient Profile");
		limg1.setBounds(0,0,getWidth(),getHeight());
	   lpcode.setBounds(20,40,100,40);
		lpname.setBounds(20,100,100,40);
		lpaddress.setBounds(20,160,120,40);
		lpgender.setBounds(20,220,100,40);
		lpdob.setBounds(20,280,100,40);
		lpage.setBounds(280,160,100,40);
		lpdate.setBounds(280,40,100,40);
		lpmobile.setBounds(280,100,120,40);
Font f1=new Font("Copperplate Gothic Light",Font.BOLD,12);	
			lpcode.setFont(f1);
			lpname.setFont(f1);
			lpaddress.setFont(f1);
			lpgender.setFont(f1);
			lpdob.setFont(f1);
			lpage.setFont(f1);
			lpdate.setFont(f1);
			lpmobile.setFont(f1);
			  txtpcode.setBounds(150,40,90,30);
			  txtpname.setBounds(150,100,90,30);
			  txtpaddress.setBounds(150,160,90,30);
			rbtmale.setBounds(150,220,90,30);
			rbtfemale.setBounds(250,220,90,30);
			txtpdob.setBounds(150,280,90,30);
				txtpdob.setBounds(430,160,90,30);
			cmbday.setBounds(150,280,90,30);
			cmbmonth.setBounds(250,280,90,30);
			cmbyear.setBounds(350,280,90,30);
			txtpdate.setBounds(430,40,90,30);
			cmpday.setBounds(430,40,90,30);
			cmpmonth.setBounds(530,40,90,30);
			cmpyear.setBounds(630,40,90,30);
			txtpmobile.setBounds(430,100,90,30);
			tpage.setBounds(430,160,90,30);	
			 bnew.setBounds(20,340,100,40);
	 bsave.setBounds(140,340,100,40);
	 bsearch.setBounds(260,340,100,40);
	 bedit.setBounds(380,340,100,40);
	 bcancel.setBounds(500,340,100,40);
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
		
	 for(int i=0;i<=31;i++)
	 {
		 if(i==0)
			{
				cmbday.addItem("Select");
			}
			else
			{
				cmbday.addItem(""+i);
			}
	 }
	 for(int i=0;i<=12;i++)
	 {
		 if(i==0)
		 {
			 cmbmonth.addItem("select");
		 }
		 else
		 {
			 cmbmonth.addItem(""+i);
		 }
	 }
		 for(int i=1969;i<=2020;i++)
			if(i==1969)
			{
				cmbyear.addItem("select");
		     }
		else
		{
			cmbyear.addItem(""+i);
		}
		for(int i=0;i<=31;i++)
		{
			if(i==0)
			{
				cmpday.addItem("Select");
			}
			else
			{
				cmpday.addItem(""+i);
			}
		}
	  for(int i=0;i<=12;i++)
	  {
		  if(i==0)
			{
				cmpmonth.addItem("Select");
			}
			else
			{
				cmpmonth.addItem(""+i);
			}
 }
	  for(int i=1999;i<=2019;i++)
	  {
		  if(i==1999)
			{
				cmpyear.addItem("Select");
			}
			else
			{
				cmpyear.addItem(""+i);
			}
	  }
	  	Font f2=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f2);
			bsave.setFont(f2);
			bsearch.setFont(f2);
			bedit.setFont(f2);
			bcancel.setFont(f2);
					bnew.setForeground(new Color(255,255,255));
					bedit.setForeground(new Color(255,255,255));
					bsave.setForeground(new Color(255,255,255));
					bsearch.setForeground(new Color(255,255,255));
					bcancel.setForeground(new Color(255,255,255));
				Color c3=new Color(204,238,255);
					txtpcode.setBackground(c3);
					txtpname.setBackground(c3);
					txtpaddress.setBackground(c3);
					txtpdob.setBackground(c3);
					txtpdob.setBackground(c3);
					txtpdate.setBackground(c3);
					txtpmobile.setBackground(c3);
					tpage.setBackground(c3);
						cmbday.setBackground(c3);
						cmbmonth.setBackground(c3);
						cmbyear.setBackground(c3);
							cmpday.setBackground(c3);
							cmpmonth.setBackground(c3);
							cmpyear.setBackground(c3);
								rbtmale.setBackground(c3);
								rbtfemale.setBackground(c3);
					bg.add(rbtmale);
					bg.add(rbtfemale);
add(rbtmale);
add(rbtfemale);
add(cmbday);
add(cmbmonth);
add(cmbyear);
add(cmpday);
add(cmpmonth);
add(cmpyear);
//add(lpcode);
add(txtpcode);
//add(lpname);
add(txtpname);
//add(lpaddress);
add(txtpaddress);
//add(lpgender);
add(lpdob);
//add(lpage);
add(tpage);
add(txtpdob);
//add(lpdate);
add(txtpdate);
//add(lpmobile);
add(txtpmobile);
add(bnew);
add(bsave);
add(bsearch);
add(bedit);
add(bcancel);
add(limg1);
	 bnew.addActionListener(this);
	 bsave.addActionListener(this);
	 bsearch.addActionListener(this);
	 bedit.addActionListener(this);
	 bcancel.addActionListener(this);
	 tpage.addFocusListener(this);
	 repaint();
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==bnew)
	  {
		  try
		  {
			  int ctr=1; 
			 Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from patienttbl";
			  Statement st= con.createStatement();
			  ResultSet res = st.executeQuery(str);
				while(res.next())
				{
					ctr++;
				}
					txtpcode.setText("p00"+ctr);
					txtpname.setText("");
					txtpaddress.setText("");
					txtpmobile.setText("");
					tpage.setText("");
					cmbday.setSelectedIndex(0);
					bg.clearSelection();
					cmbmonth.setSelectedIndex(0);
					bg.clearSelection();
					cmbyear.setSelectedIndex(0);
					bg.clearSelection();
					cmpday.setSelectedIndex(0);
					bg.clearSelection();
					cmpmonth.setSelectedIndex(0);
					bg.clearSelection();
					cmpyear.setSelectedIndex(0);
					bg.clearSelection();
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
	  }
    if(e.getSource()==bsave)
	  {
		  try
		  {
			 Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  Statement st=con.createStatement();
			  String str="insert into patienttbl(pcode,pname,paddress,pgender,pdob,pdoe,pcont,page)values(?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,txtpcode.getText());
			  ps.setString(2,txtpname.getText());
			  ps.setString(3,txtpaddress.getText());
			 int a,b,diff;
			  String gen,tdob,tdoe;
			  if(rbtmale.isSelected())
				  gen="Male";
			  else
				  gen="Female";
			  ps.setString(4,gen);
			  tdob=""+(cmbday.getSelectedItem()+"/"+cmbmonth.getSelectedItem()+"/"+cmbyear.getSelectedItem());
			   ps.setString(5,tdob);
			  tdoe=""+(cmpday.getSelectedItem()+"/"+cmpmonth.getSelectedItem()+"/"+cmpyear.getSelectedItem());
			  ps.setString(6,tdoe);
			  ps.setString(7,txtpmobile.getText());
			  ps.setString(8,tpage.getText());
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
			  String str="select * from patienttbl where pcode='"+txtpcode.getText()+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(str);
			  while(res.next())
			  {	
				  txtpname.setText(res.getString(2));
				  txtpaddress.setText(res.getString(3));
				  txtpmobile.setText(res.getString(7));
				  tpage.setText(res.getString(8));
				  if(res.getString(4).equals("Male"))
				  {
					  rbtmale.setSelected(true);
				  } 
				  else
				  {
					rbtfemale.setSelected(true);
				  }
				  String tdob[]=res.getString(5).toString().split("/");
				  cmbday.setSelectedItem(tdob[0]);
				  cmbmonth.setSelectedItem(tdob[1]);
				  cmbyear.setSelectedItem(tdob[2]);
				   String tdoe[]=res.getString(6).toString().split("/");
				  cmpday.setSelectedItem(tdoe[0]);
				  cmpmonth.setSelectedItem(tdoe[1]);
				  cmpyear.setSelectedItem(tdoe[2]);
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
			  String gen="";
			  if(rbtfemale.isSelected())
				  gen="Female";
			  else
				  gen="Male";
			  String str="update patienttbl set pgender='"+gen+"',pdob='"+cmbday.getSelectedItem()+"/"+cmbmonth.getSelectedItem()+"/"+cmbyear.getSelectedItem()+"',pdoe='"+cmpday.getSelectedItem()+"/"+cmpmonth.getSelectedItem()+"/"+cmpyear.getSelectedItem()+"',pname='"+txtpname.getText()+"',paddress='"+txtpaddress.getText()+"',pcont='"+txtpmobile.getText()+"',page='"+tpage.getText()+"' where pcode='"+txtpcode.getText()+"'";
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
  
  }
  	public void focusLost(FocusEvent fe)
	{
	}
public void focusGained(FocusEvent fe)
	{
		
		if(fe.getComponent()==tpage)
		{
			SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy"); 
			try
			{
			  String sd1=cmpday.getSelectedItem()+"/"+cmpmonth.getSelectedItem()+"/"+cmpyear.getSelectedItem();
			  String sd2=cmbday.getSelectedItem()+"/"+cmbmonth.getSelectedItem()+"/"+cmbyear.getSelectedItem();
			  Date d1=format.parse(sd1);
			  Date d2=format.parse(sd2);
			  long d=((d1.getTime()-d2.getTime())/(1000*60*60*24))/365;
			  tpage.setText(""+d);
		  }
				catch(Exception f)
		{
			System.out.println(f);
		}
				
	
	}
}
public static void main(String argv[])throws IOException
		{
			patientprofile obj=new patientprofile();
		}
}

  
 