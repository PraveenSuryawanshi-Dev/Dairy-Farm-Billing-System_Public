
/**
 * 
 */


/**
 * @author PRAVEEN SURYAWANSHI & JIGAR SHAH
 *
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;


  public class Login extends JPanel { 

	
	/**
	 * @param args
	 */
	
	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);
		 System.out.println(".1.hi......");
		
		 String f="/home/ty156/Downloads/BILLING SYSTEM/DAIRY FARM BILLING SYSTEM/img/login.png";
		 
		 ImageIcon loginImage=new ImageIcon(f);
	
		  loginImage.paintIcon(this,g, 50, 70);
	}
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login=new Login();
		
		System.out.println("2..hi......");
		
		JFrame loginFrame=new JFrame("login");
		
		loginFrame.setResizable(false);
		
		login.setLayout(null);
		
		loginFrame.setSize(1152,870);
		
		login.setBounds(0,0,0,0);
		
	  Font myFont= new Font("",Font.BOLD,20);
		 
		JLabel userId=new JLabel("NAME             :");
		JTextField userTextField=new JTextField("sunny",30);
		JLabel password=new JLabel("PASSWORD :");
        JPasswordField passwordTextField=new JPasswordField("superman",30);		
		JButton loginButton=new JButton("LOGIN");
		
		
		loginButton.setToolTipText("LOGIN");
		
		JLabel message=new JLabel("");
           
		userId.setBackground(Color.BLUE);
		
        
		
		//loginButton.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\loginButton.png"));
		//loginButton.setIcon(new ImageIcon("img\\loginButton.png"));
		
		//loginButton.setIcon(new ImageIcon(Login.getResource("loginButton.png")));
		loginButton.setBackground(Color.GRAY);
		 loginButton.setFont(myFont);
		
 Font myFont1= new Font("",Font.BOLD,14);
		 
		

		 
		
		 
 userId.setFont(myFont1);
 userId.setForeground(Color.black);
 
 password.setFont(myFont1);
 password.setForeground(Color.black);
		 
		 login.add(userId);
		 login.add(userTextField);
         login.add(password);
         login.add(passwordTextField);
         login.add(loginButton);
         login.add(message);
         
         userId.setBounds(770, 600,200,30);
         userTextField.setBounds(850,600,250,30);
         password.setBounds(770, 650, 200, 30);
         passwordTextField.setBounds(850,650, 250, 30);
         loginButton.setBounds(850, 700, 150, 30); 
         message.setBounds(780,550,350,80);
     	
       //toolbar

         JToolBar tools=new JToolBar();
         tools.setBounds(0,0,1158,30);
         tools.setBackground(Color.BLACK);

         JButton adminButton=new JButton("  ADMIN LOGIN  ");
         tools.add(adminButton);
         adminButton.setToolTipText("ADMIN BUTTON");
         
         adminButton.setBackground(Color.GRAY);
         adminButton.setFont(myFont);
         
          
         JButton contactUs=new JButton("  CONTACT US  ");
         tools.add(contactUs);
         contactUs.setToolTipText("CONTACT US");
         
         contactUs.setBackground(Color.GRAY);
         contactUs.setFont(myFont);
         
          contactUs.addActionListener(new ContactUS());
   
         
         JButton  help=new JButton("  HELP  ");
         tools.add(help);
          help.setToolTipText("HELP");
         
      //   HttpServletResponse res;
    //   sendRedirect("a1.jsp");
         
         help.setBackground(Color.GRAY);
         help.setFont(myFont);
        // help. 	
         
      //    help.addActionListener(new Servlet());
         
    //      help.addActionjListener(new SendRedirect());
          
	
         
          login.add(tools);
          
          //
         
          //program to EVENT HANDLING
          
          loginButton.addActionListener(new LoginButton(userTextField,passwordTextField,message,loginFrame));
           adminButton.addActionListener(new AdminButton(loginFrame));
         //
         
	   loginFrame.add(login);
		 loginFrame.setVisible(true);
		 
		
	}
	

}
