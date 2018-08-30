import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Membership implements ActionListener  {

	/**
	 * @param args
	 */
	private JPanel panel;
	private AdminPage framepanel;
	private JPanel membership;
	
	public Membership(JPanel panel,JPanel membership ,AdminPage framepanel2 )
	{
		this.panel=panel;
		this.membership=membership;
		this.framepanel=framepanel2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		  panel.setVisible(false);
		  membership.setVisible(true);
		  framepanel.add(membership);
		  membership.updateUI();
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
