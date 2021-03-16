import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;	
public class menuadmin extends JFrame implements ActionListener
{
	JMenuBar mb = new JMenuBar();
	JMenu mcreateuser=new JMenu("Create user");
	JMenu mmaster=new JMenu("Master");
	JMenuItem mpatient=new JMenuItem("Patient Profile");
	JMenuItem mtest=new JMenuItem("Test");
	JMenu mexit=new JMenu("Exit");
	JMenuItem mpackage=new JMenuItem("Package");	
	JMenu mtransaction=new JMenu("Transaction");
	JMenuItem mtconduct=new JMenuItem("Test Conduct");
	JMenuItem mpayment=new JMenuItem("payment");	
	JMenu mreport=new JMenu("Test Report");
	JMenuItem nereport=new JMenuItem("New Form");	
	JMenuItem mlogout =new JMenuItem("Logout");
	JMenuItem mchangepassword =new JMenuItem("Change Password");
	JMenuItem mnewuser=new JMenuItem("New User");
	JLabel limg1=  new JLabel(new ImageIcon("f:/dignocenter/MENU.png"));
	
public menuadmin()
{
		setLayout(null);
	setVisible(true);
	setSize(1366,993);
	setTitle("Welcome to Dignostic Center");
	limg1.setBounds(0,0,getWidth(),getHeight());
this.setJMenuBar(mb);	
mb.add(mcreateuser);
mcreateuser.add(mnewuser);
mb.add(mmaster);
mmaster.add(mpatient);
mmaster.add(mpackage);
mmaster.add(mtest);
mb.add(mtransaction);
mtransaction.add(mtconduct);
mtransaction.add(mpayment);
mb.add(mreport);
mreport.add(nereport);
mb.add(mexit);
mexit.add(mlogout);
mexit.add(mchangepassword);
add(limg1);
mpatient.addActionListener(this);
mtest.addActionListener(this);
mpackage.addActionListener(this);
mnewuser.addActionListener(this);
mlogout.addActionListener(this);
nereport.addActionListener(this);
mtconduct.addActionListener(this);
mpayment.addActionListener(this);
mchangepassword.addActionListener(this);
repaint();
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==mpatient)
	{
		patientprofile obj=new patientprofile();
	}
	if(e.getSource()==mpackage)
	{
		package1 obj=new package1();
	}
		if(e.getSource()==mtconduct)
	{
		testcon obj=new testcon();
	}
	if(e.getSource()==mpayment)
	{
			payment obj=new payment();
	}
	if(e.getSource()==mtest)
	{
		test obj=new test();
	}
	if(e.getSource()==mnewuser)
	{
		createuser obj= new createuser();
	}
	if(e.getSource()==mlogout)
	{
		this.dispose();
	}
	if(e.getSource()==nereport)
	{
		newreport obj= new newreport();
	}
	if(e.getSource()==mchangepassword)
	{
		changepassword obj=new changepassword();
	
	}
	
}
public static void main(String argv[])
{
	menuadmin obj=new menuadmin();
}	

}
