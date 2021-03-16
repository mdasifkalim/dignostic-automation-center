import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;			
import java.text.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
public class payment extends Frame implements ActionListener,FocusListener
{
 /* JLabel lreceipt =new JLabel("Receipt No");
  JLabel lpcode =new JLabel("Patient Code");
  JLabel lpname =new JLabel("Patient name");  
  JLabel lpaddress =new JLabel("Patient address");
  JLabel lpgender =new JLabel("Sex");
  JLabel lpage =new JLabel("AGE");
  JLabel lpdate =new JLabel("Date");
  JLabel lpmobile =new JLabel("Patient mobile"); */
   JLabel lpamount =new JLabel("Amount"); 
   JLabel lpreason=new JLabel("Reason for payment"); 
  JButton bnew =new JButton("New");
  JButton bsave =new JButton("Save");
  JButton bedit =new JButton("Edit");
  JButton bcancel =new JButton("Cancel");
				JLabel ltname=new JLabel("Test_Name");
				JLabel ltcost=new JLabel("Test_Cost");
				JLabel lpcost =new JLabel("Package cost");
		        JLabel litem1=new JLabel("Test_value1");
				JLabel litem2=new JLabel("Test_value2");
				JLabel litem3=new JLabel("Test_value3");
				JLabel litem4=new JLabel("Test_value4");
		 JTextField treceipt=new JTextField("");
  JTextField tpcode=new JTextField("");
  JTextField tpname=new JTextField("");
  JTextField tpaddress=new JTextField("");
   JTextField tpage=new JTextField("");
  JTextField tpdate=new JTextField("");
  JTextField tpmobile=new JTextField("");
  JTextField tpamount=new JTextField("");
  JTextField tpgender=new JTextField("");
  JTextField tpreason=new JTextField("");
   JTextField ttest=new JTextField("");
  JTextField tpackage=new JTextField("");
        JTextField titem1=new JTextField("");
		JTextField titem2=new JTextField("");
		JTextField titem3=new JTextField("");
		JTextField titem4=new JTextField("");
		JTextField tname=new JTextField("");
	    JTextField ttcost=new JTextField("");
		JTextField tpcost=new JTextField("");
		JRadioButton rbttest=new JRadioButton("Test_Id");
	JRadioButton rbtpackage=new JRadioButton("Package_Id");
	ButtonGroup bg1=new ButtonGroup();
	String tp="";
	String col[]={"Test Name"};
			String  testname;
			Object  data[][] = {{testname}};
		DefaultTableModel model = new DefaultTableModel(col,0);
			JTable tbl= new JTable(data,col);
	JScrollPane scrl=new JScrollPane(tbl);
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/payment.png "));
 public payment()
 {
	setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("Paymemt");
		limg1.setBounds(0,0,getWidth(),getHeight());
	   scrl.setVisible(false);	
	    titem1.setVisible(false); 
		titem2.setVisible(false);
		titem3.setVisible(false);
		titem4.setVisible(false);
		tname.setVisible(false); 
		ttcost.setVisible(false); 
		tpcost.setVisible(false); 
		litem1.setVisible(false); 
		litem2.setVisible(false);
		litem3.setVisible(false);
		litem4.setVisible(false);
			ltcost.setVisible(false);
			lpcost.setVisible(false);
			ttcost.setVisible(false);
			tpcost.setVisible(false);
				lpamount.setVisible(false);
				tpamount.setVisible(false);
				lpreason.setVisible(false);
				tpreason.setVisible(false);
				 ltname.setVisible(false);
		tname.setVisible(false);
		
		/*lreceipt.setBounds(20,40,100,40);
	    lpcode.setBounds(20,90,100,40);
		lpname.setBounds(20,150,100,40);
		lpaddress.setBounds(20,210,120,40);
		lpgender.setBounds(560,210,100,40);
		lpage.setBounds(280,210,100,40);
		lpdate.setBounds(560,150,100,40);
		lpmobile.setBounds(280,150,120,40);*/
		lpamount.setBounds(20,630,120,40);
	
		            ltname.setBounds(40,270,100,30);
        		    litem1.setBounds(40,320,100,30);
					litem2.setBounds(40,370,100,30);
					litem3.setBounds(40,420,100,30);
					litem4.setBounds(40,470,100,30);
					ltcost.setBounds(20,570,100,30);
					lpcost.setBounds(20,570,100,30);
			  treceipt.setBounds(150,40,90,30);
			  tpcode.setBounds(150,90,90,30);
			  tpname.setBounds(150,150,90,30);
			  tpaddress.setBounds(150,210,90,30);
			  tpdate.setBounds(690,150,90,30);
			  tpmobile.setBounds(430,150,90,30);
			  tpage.setBounds(430,210,90,30);	
			  tpgender.setBounds(690,210,90,30);
			  ttest.setBounds(430,90,90,30);	
			  tpackage.setBounds(690,90,90,30);
			  tpamount.setBounds(170,640,90,30);
			  tpreason.setBounds(450,640,90,30);
				     tname.setBounds(170,270,100,30);
        			  titem1.setBounds(170,320,100,30);
					titem2.setBounds(170,370,100,30);
					titem3.setBounds(170,420,100,30);
					titem4.setBounds(170,470,100,30);
					ttcost.setBounds(150,570,100,30);				 
					tpcost.setBounds(150,570,100,30);				 
	rbttest.setBounds(280,90,90,30);
	rbtpackage.setBounds(560,90,100,30);			  
		 bnew.setBounds(20,700,100,40);
		 bsave.setBounds(140,700,100,40);
		 bedit.setBounds(260,700,100,40);
		 bcancel.setBounds(380,700,100,40);
		 scrl.setBounds(40,300,150,200);
		 Color c2=new Color(43,159,255);
				bnew.setBackground(c2);
				bsave.setBackground(c2);
				bedit.setBackground(c2);
				bcancel.setBackground(c2);
					bnew.setForeground(new Color(255,255,255));
					bedit.setForeground(new Color(255,255,255));
					bsave.setForeground(new Color(255,255,255));
					bcancel.setForeground(new Color(255,255,255));
					Font f3=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f3);
			bsave.setFont(f3);
			bedit.setFont(f3);
			bcancel.setFont(f3);
			Color c3=new Color(204,238,255);
			  treceipt.setBackground(c3);
			  tpcode.setBackground(c3);
			  tpname.setBackground(c3);
			  tpaddress.setBackground(c3);
			  tpdate.setBackground(c3);
			  tpmobile.setBackground(c3);
			  tpage.setBackground(c3);
			  tpgender.setBackground(c3);
			  ttest.setBackground(c3);
			  tpackage.setBackground(c3);
			  tpamount.setBackground(c3);
			  tpreason.setBackground(c3);
				     tname.setBackground(c3);
        			  titem1.setBackground(c3);
					titem2.setBackground(c3);
					titem3.setBackground(c3);
					titem4.setBackground(c3);
					ttcost.setBackground(c3);
					tpcost.setBackground(c3);
	rbttest.setBackground(c3);
	rbtpackage.setBackground(c3);
	Font f4=new Font("Copperplate Gothic Light",Font.BOLD,12);	
				lpamount.setFont(f4);
				lpreason.setFont(f4);
				lpcost.setFont(f4);
					 ltname.setFont(f4);
        		    litem1.setFont(f4);
					litem2.setFont(f4);
					litem3.setFont(f4);
					litem4.setFont(f4);
					ltcost.setFont(f4);
				Color c4=new Color(0,0,64);		
					lpamount.setForeground(c4);
					lpreason.setForeground(c4);
					lpcost.setForeground(c4);
					ltname.setForeground(c4);
        		    litem1.setForeground(c4);
					litem2.setForeground(c4);
					litem3.setForeground(c4);
					litem4.setForeground(c4);
					ltcost.setForeground(c4);
						
	    tbl.setModel(model);
bg1.add(rbttest);
bg1.add(rbtpackage);
add(rbttest);
add(rbtpackage);
//add(lpcode);
add(tpcode);
add(scrl);
add(lpamount);
add(tpamount);
//add(lpreason);
//add(tpreason);
//add(lreceipt);
add(treceipt);
//add(lpname);
add(tpname);
add(ttest);
add(tpackage);
//add(lpaddress);
add(tpaddress);
//add(lpgender);
add(tpgender);
//add(lpage);
add(tpage);
//add(lpdate);
add(tpdate);
//add(lpmobile);
add(tpmobile);
add(titem1);
add(titem2);
add(titem3);
add(titem4);
add(tname);
add(ltname);
add(ltcost);
add(lpcost);
//add(lpcode);
add(ttcost);
add(tpcost);
add(litem1);
add(litem2);
add(litem3);
add(litem4);
add(bnew);
add(bsave);
add(bedit);
add(bcancel);
add(limg1);
	 bnew.addActionListener(this); 
	 bsave.addActionListener(this);
	 bedit.addActionListener(this);
	 bcancel.addActionListener(this);
	 rbttest.addActionListener(this);
	 rbtpackage.addActionListener(this);
	 tpcode.addFocusListener(this);
	 tpackage.addFocusListener(this);	 
	 ttest.addFocusListener(this);	 
	 repaint();
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==rbttest)
	  {
	  if(rbttest.isSelected())
			  {
								 tp="test";
								 scrl.setVisible(false);
								titem1.setVisible(true); 
								titem2.setVisible(true);
								titem3.setVisible(true);
								titem4.setVisible(true);
								tname.setVisible(true); 
								litem1.setVisible(true); 
								litem2.setVisible(true);
								litem3.setVisible(true);
								litem4.setVisible(true);
			ltcost.setVisible(true);
			lpcost.setVisible(false);
			ttcost.setVisible(true);
			tpcost.setVisible(false);
				lpamount.setVisible(false);
				tpamount.setVisible(false);
				lpreason.setVisible(false);
				tpreason.setVisible(false);

													ltname.setVisible(true);
					tp="test";
			  }
	  }
	 if(e.getSource()==rbtpackage)
			{
			  if(rbtpackage.isSelected())
					{
				tp="package";
				scrl.setVisible(true);
				lpcost.setVisible(true);
				tpcost.setVisible(true);
				 titem1.setVisible(false); 
		titem2.setVisible(false);
		titem3.setVisible(false);
		titem4.setVisible(false);
		tname.setVisible(false); 
		ttcost.setVisible(false); 
		litem1.setVisible(false); 
		litem2.setVisible(false);
		litem3.setVisible(false);
		litem4.setVisible(false);
		ltcost.setVisible(false);
		lpcost.setVisible(false);
		ltname.setVisible(false);
			ltcost.setVisible(false);
			lpcost.setVisible(true);
			ttcost.setVisible(false);
			tpcost.setVisible(true);
				lpamount.setVisible(true);
				tpamount.setVisible(true);
				lpreason.setVisible(true);
				tpreason.setVisible(true);
			}
		}
	  if(e.getSource()==bnew)
	  {
		  try
		  {
			  int ctr=1; 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from paymenttbl";
			  Statement st= con.createStatement();
			  ResultSet res = st.executeQuery(str);
				while(res.next())
				{
					ctr++;
				}
					treceipt.setText("R00"+ctr);
					tpname.setText("");
					tpaddress.setText("");
					tpmobile.setText("");
					tpage.setText("");
					tpcode.setText("");
					ttcost.setText("");
					tpcost.setText("");
					
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
			   String str="insert into paymenttbl(receiptno,receiptdate,amount,payfor)values(?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,treceipt.getText());
			  ps.setString(2,tpdate.getText());
			  ps.setString(3,ttcost.getText());
			   ps.setString(4,tname.getText());
			   ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
		  }
		  catch(Exception a)
		  
		  {
			  System.out.println(a);
		  }
	  }
    if(e.getSource()==bedit)
	  {
		 try
		 {	   
		      Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			 String str="update paymenttbl set receiptdate='"+tpdate.getText()+"',payfor='"+tname.getText()+"',amount='"+ttcost.getText()+"' where receiptno='"+treceipt.getText()+"'";
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
				if(fe.getComponent()==tpcode)
				{
							try
							 {
							  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
								  String str="select * from patienttbl where pcode='"+tpcode.getText()+"'";
								  Statement st = con.createStatement();
								  ResultSet res = st.executeQuery(str);
								  while(res.next())
										  {	
											  tpname.setText(res.getString(2));
											  tpaddress.setText(res.getString(5));
											  tpmobile.setText(res.getString(7));
											  tpage.setText(res.getString(8));
											  tpgender.setText(res.getString(4));
											  tpdate.setText(res.getString(6));
						  
										  }
							  }
							  catch(Exception ee)
							  {
								  System.out.println(ee);
							  }
							
				}
  if(fe.getComponent()==tpackage)
	   {
		  try
		   {
		Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
		String str="select * from packcon where packname='"+tpackage.getText()+"'";
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
					if(fe.getComponent()==ttest)
					{
					try
							{
						  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
						  String str="select * from testcon where testconid='"+ttest.getText()+"'";
						  Statement st = con.createStatement();
						  ResultSet res = st.executeQuery(str);
						  while(res.next())
						  {
							  tname.setText(res.getString(7));
							   titem1.setText(res.getString(8));
							  titem2.setText(res.getString(9));
							  titem3.setText(res.getString(10));
							  titem4.setText(res.getString(11));
							  ttcost.setText(res.getString(13));
			       		}
					}
					  
					  catch(Exception ex)
					  {
						  System.out.println(ex);
					  }
						
					}
					
	}
	  public void focusGained(FocusEvent fe)
	{}


public static void main(String argv[])throws IOException
		{
			payment obj=new payment();
		}
  }
  
 