import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Prev implements  ActionListener  {

	/**
	 * @param args
	 */
	private JPanel old,memberPanel;
	private  AdminPage framepanel;
	
	public Prev(JPanel old , JPanel memberPanel ,AdminPage framepanel)
	{
		this.old=old;
		 this.memberPanel=memberPanel;
		  this.framepanel=framepanel;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		memberPanel.setVisible(false);
		framepanel.add(old);
		 old.setVisible(true);
		 
		 old.updateUI();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
