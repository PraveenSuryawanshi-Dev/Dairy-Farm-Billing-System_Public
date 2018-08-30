import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class MilkCategoryButtons implements ActionListener {

	/**
	 * @param args
	 */
	private JScrollPane  icecreamProducts, otherProducts, milkProducts;
	private JFrame Display;
	
	

	public MilkCategoryButtons(JScrollPane icecreamProducts , JScrollPane  milkProducts  ,  JScrollPane otherProducts , JFrame Display  )
			
	{
		this.icecreamProducts=icecreamProducts;
		this.milkProducts=milkProducts;
		 this.otherProducts=otherProducts;
		this.Display=Display;
	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// TODO Auto-generated method stub
		System.out.println("milk CREAM BUTTON SELECTED");
		
		    //icecreamProducts.setVisible(false);
	    	//otherProducts.setVisible(false);
		
		     Display.add(milkProducts);
			
		    
			milkProducts.updateUI();
			milkProducts.updateUI();
			
			Display.remove(icecreamProducts);
			Display.remove(otherProducts);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
