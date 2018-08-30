import java.awt.*;

import javax.swing.*;

import java.awt.Graphics;

import javax.swing.ImageIcon;


/**
 * 
 */

/**
 * @author praveen suryawanshi and jigar shah
 *
 */





 class AdminLoginPage extends JPanel {

	/**
	 * @param args
	 */
	
	
	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);
		 ImageIcon loginImage=new ImageIcon("/home/ty156/Downloads/BILLING SYSTEM/DAIRY FARM BILLING SYSTEM/img/adminloginpage.png");

		  loginImage.paintIcon(this,g, 0, 30);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    AdminLoginPage login=new  AdminLoginPage();
		
		JFrame loginFrame=new JFrame("ADMIN LOGIN WELCOME");
		loginFrame.setResizable(false);
		
		
		login.setLayout(null);
		
		loginFrame.setSize(1152,870);
		
		//login.setBounds(0,0,0,0);
		 Font myFont= new Font("",Font.BOLD,20);
		 
		 Font myFont1= new Font("",Font.BOLD,14);

		 
		JLabel userId=new JLabel("NAME             :");
		 
		userId.setFont(myFont1);
		userId.setForeground(Color.orange);
		
		JTextField userTextField=new JTextField("admin-username",30);
		
		
		
		JLabel password=new JLabel("PASSWORD :");
		
		password.setFont(myFont1);
		password.setForeground(Color.orange);
        JPasswordField passwordTextField=new JPasswordField("PASSWORD",30);	
        
        JLabel message= new JLabel("");
        
         
         
		JButton loginButton=new JButton("login");

        
		//loginButton.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\loginButton.png"));
		loginButton.setBackground(Color.orange);
		loginButton.setFont(myFont);
		
		 login.add(userId);
		 login.add(userTextField);
         login.add(password);
         login.add(passwordTextField);
         login.add(loginButton);
         login.add(message);
         
         userId.setBounds(440, 350,200,30);
         userTextField.setBounds(525,345,250,30);
         password.setBounds(440, 380, 200, 30);
         passwordTextField.setBounds(525,380, 250, 30);
         loginButton.setBounds(850, 700, 150, 30); 
         message.setBounds(440, 280, 300, 50);
         
         
       //toolbar

         JToolBar tools=new JToolBar();
         tools.setBounds(0,0,1158,30);
         tools.setBackground(Color.BLACK);

         JButton userButton=new JButton("USER LOGIN");
         tools.add(userButton);
         
         userButton.setBackground(Color.GRAY);
         userButton.setFont(myFont);
          
         JButton contactUs=new JButton("CONTACT US");
         tools.add(contactUs);
         
         contactUs.addActionListener(new ContactUS());
         
         contactUs.setBackground(Color.GRAY);
         contactUs.setFont(myFont);
   
         
         JButton  help=new JButton("HELP");
         tools.add(help);
         
         help.setBackground(Color.GRAY);
         help.setFont(myFont);
         
          login.add(tools);
          
          //
          loginButton.addActionListener(new AdminLoginButton(userTextField,passwordTextField,message,loginFrame));
          userButton.addActionListener(new UserButton(loginFrame));
         
	   loginFrame.add(login);
		 loginFrame.setVisible(true);
		
		
		
	}

}
