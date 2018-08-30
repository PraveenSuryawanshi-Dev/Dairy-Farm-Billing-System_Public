import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class IcecreamCategoryButtons implements ActionListener,ContainerListener {

	private static final int JFRAME_EXIT_ON_CLOSE = 0;
	/**
	 * @param args
	 */

	private JFrame Display;

	
	private JScrollPane icecreamProducts,milkProducts,otherProducts;
	

	public IcecreamCategoryButtons(JScrollPane icecreamProducts, JScrollPane milkProducts,JScrollPane otherProducts, JFrame Display)
	{
		this.icecreamProducts=icecreamProducts;
		this.milkProducts=milkProducts;
		 this.otherProducts=otherProducts;
		this.Display=Display;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	
		System.out.println("ICE CREAM BUTTON SELECTED");
		
	//	 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			//int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			
	//	 JScrollPane jsp =new JScrollPane(icecreamProducts,v,h);
		 
		
			
			
			
		
		      
		  Display.add(icecreamProducts);
		  icecreamProducts.updateUI();
		  icecreamProducts.updateUI();
		// Display.setVisible(true);	
		

		Display.remove(milkProducts);
		Display.remove(otherProducts);
		
		
	}
	

	public void componentAdded(ContainerEvent e) {
		
		
	}


	public void componentRemoved(ContainerEvent e) {
		
	// milkProducts.setDefaultCloseOperation(JFRAME_EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	

}
