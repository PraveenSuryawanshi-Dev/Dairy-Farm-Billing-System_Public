import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

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
public class MembershipPanel extends JFrame {

	/**
	 * @param args
	 */

	
	
/*	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
	*/
	
	public MembershipPanel( ) 
	{

		super("MEMBERSHIP");
   
			 	setBounds(800, 80, 250, 450);
				JPanel p=new JPanel();
				p.setLayout(new FlowLayout());
				p.setSize(400,400);
				p.setBackground(Color.DARK_GRAY);
				add(p);
				
				 JLabel name = new JLabel("");
				  name.setForeground(Color.YELLOW);
				 
				  p.add(name);
			
				
			  	JButton img=new JButton(new ImageIcon());
			  	img.setBackground(Color.GRAY);
			  	
				img.setPreferredSize(new Dimension(200,200));
				p.add(img);
				
				JLabel uname = new JLabel("MEMBER USERNAME");
				uname.setForeground(Color.WHITE);
				 p.add(uname);
				 
				JTextField untf= new JTextField(20);
				 p.add(untf);
				 
				 JLabel space = new JLabel("                                       ");
				  p.add(space);
				 JButton check = new JButton("CHECK");
				 check.setBackground(Color.ORANGE);
				 check.setForeground(Color.RED);
				 
				 Font myFont= new Font("",Font.BOLD,8);
				 check.setFont(myFont);
				 
				 check.setPreferredSize(new Dimension(63,20));
				  p.add(check);
				 
				
				
			  JLabel	password=new JLabel("PASSWORD :");
			  password.setForeground(Color.WHITE);

			  
				p.add(password);
				
			JPasswordField	passwordField=new JPasswordField(20);
				p.add(passwordField);
	
			JLabel	notify=new JLabel("                                                           ");
			notify.setForeground(Color.YELLOW);
				p.add(notify);
				
			JButton	pay=new JButton("PAY");
				
				pay.setBackground(Color.gray);
				pay.setForeground(Color.YELLOW);
				
				 setResizable(false);
				
				p.add(pay);
				
				setVisible(true);
				
				  check.addActionListener(new MemberValidate(name,img,notify,untf));
				  //pay.addActionListener(
						pay.addActionListener( new PayMember(untf,passwordField,notify,pay));
				 // pay.addActionListener(new BillBuffer("a",2,"b"));
				 
			    
	
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MembershipPanel();
	}




	

}
