

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


  class LoginButton implements ActionListener {

	/**
	 * @param args
	 */
	  
	private  JTextField username,password;
	  private JLabel message;
	  private JFrame loginFrame;
	  
	  
	  
	    
	  public LoginButton(JTextField userTextField,JPasswordField passwordTextField,JLabel message,JFrame loginFrame)
	  {
		  this.username=userTextField;
		   this.password=passwordTextField;
		   this.message=message;
		    this.loginFrame=loginFrame;
		  
		  
	  }
	  
	  
	  @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		  String uname,upass;
		   uname=username.getText();
		   upass=password.getText();
		    
		    SqlConnection call=new SqlConnection();
		     try {
				call.AuthenticationUser(1,uname,upass,message,loginFrame);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		          
		   
		       
		     
		    //  message.setText("USERNAME OR PASSWORD INVALID ");
		
			 //  System.out.println("the username is :"+uname+"   password is :"+upass);
			   
			  
		     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
