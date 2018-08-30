import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */

public class ScrollAdjustment implements AdjustmentListener {

	
	/**
	 * @param args
	 */
	
	private JScrollBar scroll;
	private JPanel productPanel;
	
 public	ScrollAdjustment(JScrollBar scroll,JPanel productPanel)
	{
		this.scroll=scroll;
		 this.productPanel=productPanel;
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(" in scroll");
		 if(e.getSource()==scroll)
		 {
			 int value=scroll.getValue();
			 int max=scroll.getMaximum();
			 int newx=value*productPanel.getWidth()/max;

			// Point p=l.getLocatin();
			//  l.setLocation( newX,p.getY());
			 //
			// productPanel.repaint();
			  productPanel.updateUI();
					 
		 }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
