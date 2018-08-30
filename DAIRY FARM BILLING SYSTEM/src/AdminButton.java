import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class AdminButton implements ActionListener {

	/**
	 * @param args
	 */
	private JFrame loginFrame;
	AdminButton(JFrame loginFrame)
	{
		this.loginFrame=loginFrame;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		 
		
		AdminLoginPage cal=new AdminLoginPage();
		 cal.main(null);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.dispose();
		  
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
