import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;	
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class testcon extends Frame implements ActionListener,FocusListener,ItemListener
{    int flag=0;
      JLabel lpcode =new JLabel("Patient code");
	  JLabel ltecode =new JLabel("Testcon Id");
	  JLabel lpacode =new JLabel("Packagecon Id");
      JLabel lpname =new JLabel(" name");
	  JLabel ltname =new JLabel(" Test name");
	  JLabel lpage =new JLabel("Age");
      JLabel lpgender =new JLabel("Gender");
      JLabel lpphno =new JLabel("Mobile No"); 
      JLabel lpaddress =new JLabel("Address"); 
	  JLabel lnormal =new JLabel("Normal Value"); 
	  JLabel lpackname =new JLabel("Package Id"); 
	  JLabel ltestid =new JLabel("Test Id"); 
	  JLabel ltcost =new JLabel("Test Cost");
      JLabel lpcost =new JLabel("PackageCost"); 	  
        JButton brefresh =new JButton("Refresh");
        JButton bupdate =new JButton("Update");
        JButton bcancel =new JButton("Cancel");
		  JRadioButton rbttest=new JRadioButton("Test");
			  JRadioButton rbtpackage=new JRadioButton("Package");
			ButtonGroup bg=new ButtonGroup();
			JTextField tpcode=new JTextField("");
			JTextField ttcost=new JTextField("");
			JTextField tpcost=new JTextField("");
			JTextField tpackname=new JTextField("");
		    JTextField tpname=new JTextField("");
			JTextField ttecode=new JTextField("");
			JTextField tpacode=new JTextField("");
			JTextField tpage=new JTextField("");
			JTextField tpphno=new JTextField("");
		    JTextField tpaddress=new JTextField("");
			    JTextField ttestid=new JTextField("");
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
		JComboBox cmbitem1 = new JComboBox();
		JComboBox cmbitem2 = new JComboBox();
		JComboBox cmbitem3 = new JComboBox();
		JComboBox cmbitem4 = new JComboBox();
		JComboBox cmbitem5 = new JComboBox();
		JComboBox cmbitem6 = new JComboBox();
		JComboBox cmbitem7 = new JComboBox();
		JComboBox cmbitem8 = new JComboBox();
		JComboBox cmbitem9 = new JComboBox();
		JComboBox cmbitem10 = new JComboBox();			
			  JRadioButton rbtmale=new JRadioButton("Male");
			  JRadioButton rbtfemale=new JRadioButton("Female");
		JComboBox tnamecmb = new JComboBox();
		ButtonGroup bg1=new ButtonGroup();
		String col[]={"Test Name"};
			String  testname;
			Object  data[][] = {{testname}};
		DefaultTableModel model = new DefaultTableModel(col,0);
			JTable tbl= new JTable(data,col);
	JScrollPane scrl=new JScrollPane(tbl);
	String tp="";
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/testcon.png "));
 public testcon()//constructor
 {
	 setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("PACKAGE");
	setResizable(false); 	 	  	
		limg1.setBounds(0,0,getWidth(),getHeight());
         scrl.setVisible(false);				
         titem1.setVisible(false);
		titem2.setVisible(false);
		titem3.setVisible(false);
		titem4.setVisible(false);
		titem5.setVisible(false);
		titem6.setVisible(false);
		titem7.setVisible(false);
		titem8.setVisible(false);
		titem9.setVisible(false);
		titem10.setVisible(false);
		tpackname.setVisible(false);		
		lpackname.setVisible(false);		
		ttestid.setVisible(false);		
		ltestid.setVisible(false);		
		cmbitem1.setVisible(false);
		cmbitem2.setVisible(false);
		cmbitem3.setVisible(false);
		cmbitem4.setVisible(false);
		cmbitem5.setVisible(false);
		cmbitem6.setVisible(false);
		cmbitem7.setVisible(false);
		cmbitem8.setVisible(false);
		cmbitem9.setVisible(false);
		cmbitem10.setVisible(false);
		ltcost.setVisible(false);	
		lpcost.setVisible(false);	
		ttcost.setVisible(false);	
		tpcost.setVisible(false);
			ltecode.setVisible(false);		
			lpacode.setVisible(false);		
			ttecode.setVisible(false);		
			tpacode.setVisible(false);		
			    tnamecmb.setVisible(false);
				ltname.setVisible(false);
				lnormal.setVisible(false);
				
	        rbttest.setBounds(40,60,90,30);
			rbtpackage.setBounds(150,60,90,30);
		lpcode.setBounds(40,110,100,40);
		ltecode.setBounds(260,60,100,40);
		lpacode.setBounds(260,60,100,40);
		lpackname.setBounds(280,110,104,40);
		lpname.setBounds(40,160,100,40);
		lpage.setBounds(160,160,120,40);
		lpphno.setBounds(280,160,100,40);
		lpaddress.setBounds(400,160,100,40);
		ltname.setBounds(40,300,100,40);
		lnormal.setBounds(490,300,180,40);
		ltestid.setBounds(280,110,180,40);
		ltcost.setBounds(290,250,100,40);
		lpcost.setBounds(290,250,150,40);
				Font f1=new Font("Copperplate Gothic Light",Font.BOLD,12);	
		lpname.setFont(f1);
		lpcode.setFont(f1);
		lpage.setFont(f1);
		lpphno.setFont(f1);
		lpackname.setFont(f1);
		lpaddress.setFont(f1);
		ltestid.setFont(f1);
		ltname.setFont(f1);
		lnormal.setFont(f1);
		lpgender.setFont(f1);
		ltcost.setFont(f1);
		lpcost.setFont(f1);
		lpacode.setFont(f1);
		lpgender.setBounds(20,250,100,40);
			  tpcode.setBounds(160,110,100,30);
			  ttcost.setBounds(400,250,100,30);
			  tpcost.setBounds(400,250,100,30);
			   ttecode.setBounds(380,60,90,30);
			   tpacode.setBounds(380,60,90,30);
			  tpackname.setBounds(400,110,100,30);
			  tpname.setBounds(40,200,90,30);
			  tpage.setBounds(160,200,90,30);
			  tpphno.setBounds(280,200,90,30);
			  tpaddress.setBounds(400,200,90,30);
			  ttestid.setBounds(400,110,100,40);
			  rbtmale.setBounds(80,250,90,30);
			  rbtfemale.setBounds(180,250,90,30);
		titem1.setBounds(350,340,100,40);
		titem2.setBounds(350,390,100,40);
		titem3.setBounds(350,440,100,40);
		titem4.setBounds(350,490,100,40);
		titem5.setBounds(350,540,100,40);
		titem6.setBounds(490,340,100,40);
		titem7.setBounds(490,390,100,40);
		titem8.setBounds(490,440,100,40);
		titem9.setBounds(490,490,100,40);
		titem10.setBounds(490,540,100,40);
		titem10.setBounds(490,540,100,40);
		tnamecmb.setBounds(160,300,140,30);
		cmbitem1.setBounds(280,300,100,20);
		cmbitem2.setBounds(280,330,100,20);
		cmbitem3.setBounds(280,360,100,20);
		cmbitem4.setBounds(280,390,100,20);
		cmbitem5.setBounds(280,420,100,20);
		cmbitem6.setBounds(280,450,100,20);
		cmbitem7.setBounds(280,480,100,20);
		cmbitem8.setBounds(280,510,100,20);
		cmbitem9.setBounds(280,540,100,20);
		cmbitem10.setBounds(280,570,100,20);			
	 brefresh.setBounds(20,620,100,40);
	 bupdate.setBounds(140,620,100,40);
	 bcancel.setBounds(260,620,100,40);
	  scrl.setBounds(40,300,150,300);
	 tbl.setModel(model);
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem1.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem1.addItem("yes");
			}
			else
			{
				cmbitem1.addItem("no");
			}
	 }
		 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem2.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem2.addItem("yes");
			}
			else
			{
				cmbitem2.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem3.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem3.addItem("yes");
			}
			else
			{
				cmbitem3.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem4.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem4.addItem("yes");
			}
			else
			{
				cmbitem4.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem5.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem5.addItem("yes");
			}
			else
			{
				cmbitem5.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem6.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem6.addItem("yes");
			}
			else
			{
				cmbitem6.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem7.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem7.addItem("yes");
			}
			else
			{
				cmbitem7.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem8.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem8.addItem("yes");
			}
			else
			{
				cmbitem8.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem9.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem9.addItem("yes");
			}
			else
			{
				cmbitem9.addItem("no");
			}
	 }
	 for(int i=0;i<3;i++)
	 {
		 if(i==0)
			{
				cmbitem10.addItem("Select");
			}
			else if(i==1)
			{
				cmbitem10.addItem("yes");
			}
			else
			{
				cmbitem10.addItem("no");
			}
	 }
	  Font f2=new Font("Copperplate Gothic Light",Font.BOLD,12);	
			ltecode.setFont(f2);
			lpacode.setFont(f2);
			brefresh.setFont(f2);
			bupdate.setFont(f2);
			
			bcancel.setFont(f2);
			 Color c2=new Color(43,159,255);
				brefresh.setBackground(c2);
				bupdate.setBackground(c2);
				
				bcancel.setBackground(c2);
					brefresh.setForeground(new Color(255,255,255));
					bupdate.setForeground(new Color(255,255,255));
					
					bcancel.setForeground(new Color(255,255,255));
							Color c3=new Color(204,238,255);
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
							titem10.setBackground(c3);
							tnamecmb.setBackground(c3);
							tpcode.setBackground(c3);
							ttcost.setBackground(c3);
							tpcost.setBackground(c3);
							ttecode.setBackground(c3);
							tpacode.setBackground(c3);
							tpackname.setBackground(c3);
							tpname.setBackground(c3);
							tpage.setBackground(c3);
							tpphno.setBackground(c3);
							tpaddress.setBackground(c3);
							ttestid.setBackground(c3);
							rbtmale.setBackground(c3);
							rbtfemale.setBackground(c3);
							rbttest.setBackground(c3);
							rbtpackage.setBackground(c3);
							
bg1.add(rbtmale);
bg1.add(rbtfemale);
bg.add(rbttest);
bg.add(rbtpackage);
add(rbtmale);
add(rbtfemale);
add(rbttest);
add(rbtpackage);
add(lpcode);
add(tpcode);
add(ltcost);
add(ttcost);
add(lpcost);
add(tpcost);
add(ltecode);
add(ttecode);
add(lpacode);
add(tpacode);
add(lpackname);
add(tpackname);
add(scrl);
add(lpname);
add(ltname);
add(tpname);
add(ltestid);
add(ttestid);
add(lpage);
add(tpage);
add(lpphno);
add(lpgender);
add(tpphno);
add(lpaddress);
add(tpaddress);
add(brefresh);
add(bupdate);
add(bcancel);
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
add(lnormal);
add(tnamecmb);
add(cmbitem1);
add(cmbitem2);
add(cmbitem3);
add(cmbitem4);
add(cmbitem5);
add(cmbitem6);
add(cmbitem7);
add(cmbitem8);
add(cmbitem9);
add(cmbitem10);
add(limg1);
rbttest.addActionListener(this);
rbtpackage.addActionListener(this);
	 brefresh.addActionListener(this);
	 bupdate.addActionListener(this);
	
	 bcancel.addActionListener(this);
	 tpcode.addFocusListener(this);
	 tpackname.addFocusListener(this);
	 ttestid.addFocusListener(this);
	 tnamecmb.addItemListener(this);
	  repaint();
  }
  public void actionPerformed(ActionEvent e)
  {
	
	if(e.getSource()==rbttest)
	{
		if(rbttest.isSelected())
			{
	     tp="test";
		titem1.setVisible(true);
		titem2.setVisible(true);
		titem3.setVisible(true);
		titem4.setVisible(true);
		titem5.setVisible(true);
		titem6.setVisible(true);
		titem7.setVisible(true);
		titem8.setVisible(true);
		titem9.setVisible(true);
		titem10.setVisible(true);
		tpackname.setVisible(false);		
		lpackname.setVisible(false);		
		ttestid.setVisible(true);		
		ltestid.setVisible(true);	
				ltname.setVisible(true);
				tnamecmb.setVisible(true);
				lnormal.setVisible(true);
				scrl.setVisible(false);
		cmbitem1.setVisible(false);
		cmbitem2.setVisible(false);
		cmbitem3.setVisible(false);
		cmbitem4.setVisible(false);
		cmbitem5.setVisible(false);
		cmbitem6.setVisible(false);
		cmbitem7.setVisible(false);
		cmbitem8.setVisible(false);
		cmbitem9.setVisible(false);
		cmbitem10.setVisible(false);
				ltcost.setVisible(true);	
				lpcost.setVisible(false);	
				ttcost.setVisible(true);	
				tpcost.setVisible(false);	
			ltecode.setVisible(true);		
			lpacode.setVisible(false);		
			ttecode.setVisible(true);		
			tpacode.setVisible(false);		
			}
	}
	if(e.getSource()==rbtpackage)
	{
	  if(rbtpackage.isSelected())
			{
				tp="package";
				scrl.setVisible(true);
				cmbitem1.setVisible(true);
		cmbitem2.setVisible(true);
		cmbitem3.setVisible(true);
		cmbitem4.setVisible(true);
		cmbitem5.setVisible(true);
		cmbitem6.setVisible(true);
		cmbitem7.setVisible(true);
		cmbitem8.setVisible(true);
		cmbitem9.setVisible(true);
		cmbitem10.setVisible(true);
		tpackname.setVisible(true);		
		lpackname.setVisible(true);		
		ttestid.setVisible(false);		
		ltestid.setVisible(false);	
			titem1.setVisible(false);
			titem2.setVisible(false);
			titem3.setVisible(false);
			titem4.setVisible(false);
			titem5.setVisible(false);
			titem6.setVisible(false);
			titem7.setVisible(false);
			titem8.setVisible(false);
			titem9.setVisible(false);
			titem10.setVisible(false);			
	tnamecmb.setVisible(false);
		ltcost.setVisible(false);	
		lpcost.setVisible(true);	
		ttcost.setVisible(false);	
		tpcost.setVisible(true);	
			ltecode.setVisible(false);		
			lpacode.setVisible(true);		
			ttecode.setVisible(false);		
			tpacode.setVisible(true);		
				ltname.setVisible(false);
				lnormal.setVisible(false);
			}
	}
			 if(e.getSource()==brefresh)
	  {
    try
		  {
			if(rbttest.isSelected())
			{			
      		int ctr1=1; 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from testcon";
			  Statement st= con.createStatement();
			  ResultSet res = st.executeQuery(str);
				while(res.next())
				{
					ctr1++;
				}
					ttecode.setText("tc00"+ctr1);
  	titem1.setText("");
	titem2.setText("");
	titem3.setText("");
	titem4.setText("");
	titem5.setText("");
	titem6.setText("");
	titem7.setText("");
	titem8.setText("");
	titem9.setText("");
	titem10.setText("");
	tpcode.setText("");
	tpname.setText("");
	tpage.setText("");
	tpphno.setText("");
	tpaddress.setText("");
	ttcost.setText("");	
	tpcost.setText("");	
		model.setRowCount(0);
		cmbitem1.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem2.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem3.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem4.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem5.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem6.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem7.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem8.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem9.setSelectedIndex(0);
		bg.clearSelection();
	cmbitem10.setSelectedIndex(0);
		bg.clearSelection();		
	  }
	if(rbtpackage.isSelected())
			{			
      		int ctr2=1; 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str1="select * from packcon";
			  Statement st1= con.createStatement();
			  ResultSet res1 = st1.executeQuery(str1);
				while(res1.next())
				{
					ctr2++;
				}
					tpacode.setText("pc00"+ctr2);
  	titem1.setText("");
	titem2.setText("");
	titem3.setText("");
	titem4.setText("");
	titem5.setText("");
	titem6.setText("");
	titem7.setText("");
	titem8.setText("");
	titem9.setText("");
	titem10.setText("");
	tpcode.setText("");
	tpname.setText("");
	tpage.setText("");
	tpphno.setText("");
	tpaddress.setText("");
	ttcost.setText("");	
	tpcost.setText("");	
		model.setRowCount(0);
		cmbitem1.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem2.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem3.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem4.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem5.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem6.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem7.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem8.setSelectedIndex(0);
		bg.clearSelection();
			cmbitem9.setSelectedIndex(0);
		bg.clearSelection();
	cmbitem10.setSelectedIndex(0);
		bg.clearSelection();		
	  }
		  }
	  catch(Exception ey)
	  {
		  System.out.println(ey);
	  }
	  }
    if(e.getSource()==bupdate)
	  {
		 	 try	
		 {  
		 if(rbttest.isSelected())
		 {
		    Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");    
	        String gen;
			  if(rbtmale.isSelected())
				  gen="Male";
			  else
				  gen="Female";
	 String str="update patienttbl set pname='"+tpname.getText()+"',page='"+tpage.getText()+"',pcont='"+tpphno.getText()+"',paddress='"+tpaddress.getText()+"',pgender='"+gen+"' where  pcode='"+tpcode.getText()+"'";
	 Statement st = con.createStatement();
	 st.executeUpdate(str);
				if(gen =="male")
				{
							String str1="update testtbl set titem1='"+titem6.getText()+"',titem2='"+titem7.getText()+"',titem3='"+titem8.getText()+"',titem4='"+titem9.getText()+"',titem5='"+titem10.getText()+"' where  pname='"+tnamecmb.getSelectedItem()+"'";
							Statement st1 = con.createStatement();
							st1.executeUpdate(str1);
				 }
				 else
				 {
						 String str2="update testtbl set titem6='"+titem6.getText()+"',titem7='"+titem7.getText()+"',titem8='"+titem8.getText()+"',titem9='"+titem9.getText()+"',titem10='"+titem10.getText()+"' where  tname='"+tnamecmb.getSelectedItem()+"'";
						 Statement st2 = con.createStatement();
						 st2.executeUpdate(str2);
				 }
				 Statement st3=con.createStatement();
			  String str4="insert into testcon(pcode,pname,page,pcont,paddress,pgender,tname,testv1,testv2,testv3,testv4,testconid,tcost)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str4);
			  ps.setString(1,tpcode.getText());
			  ps.setString(2,tpname.getText());
			  ps.setString(3,tpage.getText());
			  ps.setString(4,tpphno.getText());
			  ps.setString(5,tpaddress.getText());
			  ps.setString(12,ttecode.getText());
			  ps.setString(13,ttcost.getText());
			  String gen1,tname1;
			  if(rbtmale.isSelected())
				  gen1="Male";
			  else
				  gen1="Female";
			  ps.setString(6,gen1);
			  tname1=""+tnamecmb.getSelectedItem();
			   ps.setString(7,tname1);
			   ps.setString(8,titem1.getText());			  
			   ps.setString(9,titem2.getText());			  
			   ps.setString(10,titem3.getText());			  
			   ps.setString(11,titem4.getText());			  
			     ps.executeUpdate();
		JOptionPane.showMessageDialog(null,"Record Updated");	 
		 } 
      if(rbtpackage.isSelected())
       {   
		      Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="update packcon set test1='"+cmbitem1.getSelectedItem()+"',test2='"+cmbitem2.getSelectedItem()+"',test3='"+cmbitem3.getSelectedItem()+"',test4='"+cmbitem4.getSelectedItem()+"',test5='"+cmbitem5.getSelectedItem()+"',test6='"+cmbitem6.getSelectedItem()+"',test7='"+cmbitem7.getSelectedItem()+"',test8='"+cmbitem8.getSelectedItem()+"',test9='"+cmbitem9.getSelectedItem()+"',test10='"+cmbitem10.getSelectedItem()+"',packname='"+tpackname.getText()+"' where pcode='"+tpcode.getText()+"'";
			  Statement st = con.createStatement();
			  st.executeUpdate(str);
			  	JOptionPane.showMessageDialog(null,"Record Updated");		   
		   }
		   Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
		    String str1="insert into packcon(pcode,packname,test1,test2,test3,test4,test5,test6,test7,test8,test9,test10,pcost,packconid)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str1);
			  ps.setString(1,tpcode.getText());
			  ps.setString(2,tpackname.getText());
			  String tname1,tname2,tname3,tname4,tname5,tname6,tname7,tname8,tname9,tname10;
			  tname1=""+cmbitem1.getSelectedItem();
			  tname2=""+cmbitem1.getSelectedItem();
			  tname3=""+cmbitem1.getSelectedItem();
			  tname4=""+cmbitem1.getSelectedItem();
			  tname5=""+cmbitem1.getSelectedItem();
			  tname6=""+cmbitem1.getSelectedItem();
			  tname7=""+cmbitem1.getSelectedItem();
			  tname8=""+cmbitem1.getSelectedItem();
			  tname9=""+cmbitem1.getSelectedItem();
			  tname10=""+cmbitem1.getSelectedItem();
			    ps.setString(3,tname1);
			   ps.setString(4,tname2);
			   ps.setString(5,tname3);
			   ps.setString(6,tname4);
			   ps.setString(7,tname5);
			   ps.setString(8,tname6);
			   ps.setString(9,tname7);
			   ps.setString(10,tname8);
			   ps.setString(11,tname9);
			   ps.setString(12,tname10);
			   ps.setString(13,tpcost.getText());
			   ps.setString(14,tpacode.getText());
			   ps.executeUpdate();
		 }
		  catch(Exception r)
				{
					System.out.println(r);
				}
		 }		   
	   
   
    
    if(e.getSource()==bcancel)
	  {
		  this.dispose();
	  }
  
  }
 public void focusLost(FocusEvent fe)
	{
						if(fe.getComponent()==tpcode)
						{
							try
							{
							Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
							String str="select * from patienttbl where pcode='"+tpcode.getText()+"'";
							Statement st = con.createStatement();
							ResultSet res = st.executeQuery(str);
							String gen2="";
								while(res.next())
								{
									tpname.setText(res.getString(2));
									tpage.setText(res.getString(5));
									tpphno.setText(res.getString(7));
									tpaddress.setText(res.getString(3));
									 if(res.getString(4).equals("Male"))
										  {
											  rbtmale.setSelected(true);
										  } 
										  else
										  {
											rbtfemale.setSelected(true);
										  }
														}	
							}
										catch(Exception ex)
									{
										System.out.println(ex);
									}
									
					}			
		if(rbtpackage.isSelected())
	 { 
	   if(fe.getComponent()==tpackname)
	   {
		   try
		   {
		Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
		String str="select * from packtbl where packid='"+tpackname.getText()+"'";
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery(str);
		Vector v;
			while(res.next())
			{
				
				for(int i=6;i<=15;i++)
				{
					v=new Vector();
					v.add(res.getString(i));
				    model.addRow(v);
					
			}
			tpcost.setText(res.getString(4));
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}			
	  }
 }
 if(rbttest.isSelected())
		 { 
	       if(fe.getComponent()==ttestid)
		   {
			   try
			   {
			Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			String str="select * from testtbl where tid='"+ttestid.getText()+"'";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(str);
			while(res.next())
				{
					tnamecmb.addItem(res.getString(2));
					ttcost.setText(res.getString(14));
				}
		    }
        catch(Exception ey)
		{
			System.out.println(ey);
		}			
      }
     }
	
	}	
public void focusGained(FocusEvent fe)
	{}
		public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==tnamecmb)
		{
			try
			{
				 if(rbttest.isSelected())
		 {
			Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			String str="select * from testtbl where tname='"+tnamecmb.getSelectedItem()+"'";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(str);
			while(res.next())
						{
							if(rbtmale.isSelected())
						  {
			 titem6.setText(res.getString(4));
			 titem7.setText(res.getString(5));
			 titem8.setText(res.getString(6));
			 titem9.setText(res.getString(7));
			 titem10.setText(res.getString(8));
			 	 		  }
						  else
						  {
			 titem6.setText(res.getString(9));
			 titem7.setText(res.getString(10));
			 titem8.setText(res.getString(11));
			 titem9.setText(res.getString(12));
			 titem10.setText(res.getString(13));
						}
				}
		     }
			}
	 	catch(Exception f)
			{
			System.out.println(f);
			}
				
		}
      }
public static void main(String argv[])throws IOException
		{
			testcon obj=new testcon();
		}
}