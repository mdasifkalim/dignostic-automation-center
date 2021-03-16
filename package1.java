import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java .sql.*;
import java.applet.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
public class package1 extends Frame implements ActionListener,FocusListener

{
/*	JLabel lpid= new JLabel("Package_id");
	JLabel ltname= new JLabel("Test Name");
	JLabel lcost= new JLabel("Total Cost");
	JLabel ldiscount =new JLabel("Discount");
	JLabel lpcost= new JLabel("Package Cost");*/
		JTextField tpid=new JTextField("");
	    JTextField tcost=new JTextField("");
		JTextField tdiscount=new JTextField("");
		JTextField tpackcost=new JTextField("");
			JButton bnew=new JButton("New");
			JButton bsearch=new JButton("Search");
			JButton bsave=new JButton("Save");
			JButton bedit=new JButton("Edit");
			JButton bcancel=new JButton("Cancel");
			JButton badd=new JButton("Add");
			JButton bremove = new JButton("Remove");
			String col[]={"Test_Id","Test Name","Cost"};
			String  tid,testname,testcost;
			Object  data[][] = {{tid,testname,testcost}};
			DefaultTableModel model = new DefaultTableModel(col,0);
			JTable tbl;
			JScrollPane scrl;		
	 JComboBox tnamecmb= new JComboBox();
	 ButtonGroup bg=new ButtonGroup();
	 JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/PACKAGE.png "));
public package1()
{
 setLayout(null);
	setVisible(true);
	setSize(1366,768);
	setTitle("PACKAGE");
		limg1.setBounds(0,0,getWidth(),getHeight());
	        
	    /*lpid.setBounds(40,40,200,40);
		ltname.setBounds(40,100,200,40);
		lcost.setBounds(40,340,220,40);
		ldiscount.setBounds(40,400,200,40);
		lpcost.setBounds(40,460,200,40);*/
		Font f1=new Font("Monotype Corsiva",Font.BOLD,18);	
			/*lpid.setFont(f1);
			ltname.setFont(f1);
			lcost.setFont(f1);
			ldiscount.setFont(f1);
			lpcost.setFont(f1);*/
			  tpid.setBounds(180,40,90,30);
			  tnamecmb.setBounds(180,100,220,30);
			  tcost.setBounds(180,340,90,30);
			  tdiscount.setBounds(180,400,90,30);
			  tpackcost.setBounds(180,460,90,30);
	 bnew.setBounds(40,540,100,40);
	 bsave.setBounds(160,540,100,40);
	 bedit.setBounds(400,540,100,40);
	 bsearch.setBounds(280,540,100,40);
	 bcancel.setBounds(520,540,100,40);
	 badd.setBounds(500,180,100,40);
	 bremove.setBounds(500,240,100,40);
	 tbl= new JTable(data,col);
	 scrl=new JScrollPane(tbl);
	 scrl.setBounds(40,160,250,150);
	 tbl.setModel(model);
	 
	 
	
	 
		
		Font f2=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f2);
			bsave.setFont(f2);
			bsearch.setFont(f2);
			bcancel.setFont(f2);
			bedit.setFont(f2);
			badd.setFont(f2);
			bremove.setFont(f2);
			
		 try
		 {
             Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from testtbl ";
			  Statement st = con.createStatement();
				  ResultSet res = st.executeQuery(str);
					while(res.next())
					{
					tnamecmb.addItem(res.getString(2));	
					}
     	}
		 catch(Exception t)
		 {
			 System.out.println(t);	
		 }
		 Color c2=new Color(43,159,255);
				bnew.setBackground(c2);
				bsave.setBackground(c2);
				bsearch.setBackground(c2);
				bedit.setBackground(c2);
				bcancel.setBackground(c2);
				badd.setBackground(c2);
				bremove.setBackground(c2);
					bnew.setForeground(new Color(255,255,255));
					bedit.setForeground(new Color(255,255,255));
					bsave.setForeground(new Color(255,255,255));
					bsearch.setForeground(new Color(255,255,255));
					bcancel.setForeground(new Color(255,255,255));
					badd.setForeground(new Color(255,255,255));
					bremove.setForeground(new Color(255,255,255));
		Font f3=new Font("Copperplate Gothic Light",Font.BOLD,14);	
			bnew.setFont(f3);
			bsave.setFont(f3);
			bsearch.setFont(f3);
			bedit.setFont(f3);
			bcancel.setFont(f3);
			badd.setFont(f3);
			bremove.setFont(f3);
			Color c3=new Color(204,238,255);
			  tpid.setBackground(c3);
			  tnamecmb.setBackground(c3);
			  tcost.setBackground(c3);
			  tdiscount.setBackground(c3);
			  tpackcost.setBackground(c3);
			  
//add(lpid);
add(scrl);
/*add(ltname);
add(lcost);
add(ldiscount);
add(lpcost);*/
add(tpid);
add(tcost);
add(tnamecmb);
add(tpackcost);
add(tdiscount);
add(bnew);
add(bsave);
add(bedit);
add(bsearch);
add(bcancel);
add(badd);
add(bremove);
add(limg1);
	 bnew.addActionListener(this);
	 bsave.addActionListener(this);
	 bsearch.addActionListener(this);
	 bedit.addActionListener(this);
	 bcancel.addActionListener(this);
	 badd.addActionListener(this);
	 bremove.addActionListener(this);
	 tnamecmb.addActionListener(this);
	tcost.addFocusListener(this);
	tdiscount.addFocusListener(this);
	 repaint();
}
  public void actionPerformed(ActionEvent e)
  {
	    if(e.getSource()==tnamecmb)
		{
			
			try
			{
			Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			String str="select * from testtbl where tname='"+tnamecmb.getSelectedItem()+"'";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(str);
			
				while(res.next())
				{  Vector v;
					v=new Vector();
					v.add(res.getString(1));
					v.add(res.getString(2));
					v.add(res.getString(14));
					model.addRow(v);
					break;
				}
				//model.removeRow(1);//tbl.getRowCount()-1);
			}
				catch(Exception f)
		{
			System.out.println(f);
		}
		}
	  ///////////////////////////////
	if(e.getSource()==bnew)
	{
		try
		  {	  int ctr=1; 
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str="select * from packtbl";
			  Statement st= con.createStatement();
			  ResultSet res = st.executeQuery(str);
				while(res.next())
				{
					ctr++;
				}
					tpid.setText("pack00"+ctr);
					tcost.setText("");
					tdiscount.setText("");
					tpackcost.setText("");			
					tnamecmb.setSelectedIndex(0);
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
			  	  String tname;
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  Statement st=con.createStatement();
			  String str="insert into packtbl(packid,tname,tcost,discount,packcost)values(?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,tpid.getText());
		       tname=""+tnamecmb.getSelectedItem();
			   ps.setString(2,tname);
			   ps.setString(3,tcost.getText());
			   ps.setString(4,tdiscount.getText());
			   ps.setString(5,tpackcost.getText());
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
			  String str="select * from packtbl where packid='"+tpid.getText()+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(str);
			  while(res.next())
			  {	
                 String tname[]=res.getString(2).split("/");
				  tnamecmb.setSelectedItem(tname[0]);
				  
				tcost.setText(res.getString(3));
				  tdiscount.setText(res.getString(4));
				  tpackcost.setText(res.getString(5));
			 }
		  }
		  catch(Exception s)
		  {
			  System.out.println(s);
		  }
	}
	if(e.getSource()==bedit)
	{ 
try
		 {	   
	 Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
	 String str="update packtbl set tname='"+tnamecmb.getSelectedItem()+"',tcost='"+tcost.getText()+"',discount='"+tdiscount.getText()+"',packcost='"+tpackcost.getText()+"' where  packid='"+tpid.getText()+"'";
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
	if(e.getSource()==badd)
	{
		try
		{
			  Connection con=DriverManager.getConnection("jdbc:odbc:diagnose");  
			  String str1 =JOptionPane.showInputDialog("Enter Test_Id");
			  String str="select * from testtbl where tid='"+str1+"'";
			  Statement st = con.createStatement();
			  ResultSet res = st.executeQuery(str);
			  Vector v;
				while(res.next())
				{
					v=new Vector();
					v.add(res.getString(1));
					v.add(res.getString(2));
					v.add(res.getString(14));
					model.addRow(v);
				}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	if(e.getSource()==bremove)
	{
		model.removeRow(tbl.getSelectedRow());
	}
  }
public void focusLost(FocusEvent fe)
{
	if(fe.getSource()==tdiscount)
	{
		int p,x;
		p=Integer.parseInt(tdiscount.getText());
		x=(p*Integer.parseInt(""+tcost.getText()))/100;
		tpackcost.setText(""+x);
	}

}
public void focusGained(FocusEvent fe)
{
	if(fe.getSource()==tcost)
		{
			int sum=0;
			for(int i=0;i<tbl.getRowCount();i++)
			{
				sum=sum+Integer.parseInt(""+tbl.getValueAt(i,2));
			}
			tcost.setText(""+sum);
		}
	
}

public static void  main(String argv[])throws IOException
{
	package1 obj=new package1();
}
}
	