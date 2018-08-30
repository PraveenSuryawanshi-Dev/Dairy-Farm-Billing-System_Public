import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class InsertItem implements ActionListener{

	/**
	 * @param args
	 */
	
	  private JPanel operation;
	    private JButton save , updateButton;
	    
	    
	public InsertItem(JButton save ,JPanel operation , JButton updateButton)
	{
		
		this.save=save;
		this.operation=operation;
		 this.updateButton=updateButton;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		  operation.remove(updateButton);
		 save.setBounds(200,620,100,30);
		 save.setBackground(Color.GRAY);
		  operation.add(save);
		   operation.updateUI();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
