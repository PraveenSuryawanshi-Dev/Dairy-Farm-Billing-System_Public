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
public class LogOutAdmin implements ActionListener {

	/**
	 * @param args
	 */
	private JFrame frame;
	
	public LogOutAdmin(JFrame	adminPage)
	{
		this.frame=adminPage;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		AdminLoginPage.main(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	

}
