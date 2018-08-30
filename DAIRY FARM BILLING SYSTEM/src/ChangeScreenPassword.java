import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class ChangeScreenPassword implements ActionListener {

	/**
	 * @param args
	 */
	
	String uname;
	
	public ChangeScreenPassword(String uname)
	{
		this.uname=uname;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		new ChangePassword(uname);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
