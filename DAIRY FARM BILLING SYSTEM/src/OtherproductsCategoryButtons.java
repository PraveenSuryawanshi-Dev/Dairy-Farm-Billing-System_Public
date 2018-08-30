import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class OtherproductsCategoryButtons implements ActionListener {

	/**
	 * @param args
	 */
	private JScrollPane  otherProducts,icecreamProducts,milkProducts;
	private JFrame Display;
	
	

	public OtherproductsCategoryButtons(JScrollPane icecreamProducts , JScrollPane  milkProducts  ,  JScrollPane otherProducts , JFrame Display)
	{
		this.icecreamProducts=icecreamProducts;
		this.milkProducts=milkProducts;
		 this.otherProducts=otherProducts;
		this.Display=Display;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// TODO Auto-generated method stub
		System.out.println("other product CREAM BUTTON SELECTED");
		
	//	milkProducts.setVisible(false);
		//icecreamProducts.setVisible(false);
		
		  Display.add(otherProducts);
			
		
		  otherProducts.updateUI();
		  otherProducts.updateUI();
		  
			Display.remove(icecreamProducts);
			Display.remove(milkProducts);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
