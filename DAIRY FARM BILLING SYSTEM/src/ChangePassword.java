import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class ChangePassword extends JFrame  {

	/**
	 * @param args
	 */
	private String uname;
	private JLabel name,cpassword,npassword,rpassword,notify;
	private JButton img,save;
	private JPasswordField cpassword1,npassword1,rpassword1;
	
	private String trupassword;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
	
	
	public ChangePassword(String uname) 
	{

		super("PROFILE");
		this.uname=uname;
				
		try {
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
			   stmt= (Statement) con.createStatement();
			   
			  rs=((java.sql.Statement) stmt).executeQuery("select * from employee where e_username= "+"'"+uname+"' "+";");
			   
			  // rs=stmt.executeQuery("select * from employee where e_username='monica'");
			   rs.next();
			   trupassword=rs.getString(4);
			   
			   
			   
			   
				setBounds(600, 30, 250, 450);
				
				//setSize(400,400);
				JPanel p=new JPanel();
				//p.setLayout(new GridLayout(5,2));
				p.setLayout(new FlowLayout());
				p.setSize(400,400);
				p.setBackground(Color.orange);
				add(p);
				
				name=new JLabel(""+rs.getString(12));
		    	p.add(name);
				 
				String imgpath=rs.getString(7);
				img=new JButton(new ImageIcon(imgpath));
			img.setBackground(Color.DARK_GRAY);
				img.setPreferredSize(new Dimension(200,200));
				
				p.add(img);
				
				cpassword=new JLabel("CURRENT PASSWORD :");
				p.add(cpassword);
				
				cpassword1=new JPasswordField(20);
				p.add(cpassword1);
				
			
				
				npassword=new JLabel("NEW PASSWORD :");
				p.add(npassword);
				
				npassword1=new JPasswordField(20);
				p.add(npassword1);
				
				
				
				rpassword=new JLabel("RE-TYPE PASSWORD :");
				p.add(rpassword);
				
				rpassword1=new JPasswordField(20);
				p.add(rpassword1);
				
				notify=new JLabel("");
				p.add(notify);
				
				save=new JButton("SAVE");
				
				save.setBackground(Color.DARK_GRAY);
				save.setForeground(Color.YELLOW);
				
				
				save.addActionListener(new  ChanegPasswordSave(uname,trupassword,cpassword1,npassword1,rpassword1,notify));
				p.add(save);
				
				setVisible(true);
			     
			    
			    
		System.out.println("Opened database successfully..");	
	
		}

		
		catch ( Exception e ) 
		{
		        e.getMessage();
			System.out.println("unable to open database ...");	
			 e.printStackTrace();
			 
			
	   }
		
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		

			
	}
	
	
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangePassword("karisma");
	}




	

}
