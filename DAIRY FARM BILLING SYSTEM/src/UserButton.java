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
public class UserButton implements ActionListener {

	/**
	 * @param args
	 */
	private JFrame loginFrame;
	UserButton(JFrame loginFrame)
	{
		this.loginFrame=loginFrame;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Login call=new Login();
		 call.main(null);
		 loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 loginFrame.dispose();
		
	}

}
