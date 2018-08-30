import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author jigar and praveen
 *
 */
 class CategoryButtons implements ActionListener {

	/**
	 * @param args
	 */
	 JButton choice;
	 JPanel milkProducts;
	 JPanel icecreamProducts;
	 JPanel otherProducts;
	 JFrame Display;
	 
	 
	 public CategoryButtons(JButton category1,JPanel milkProducts, JPanel icecreamProducts,JPanel otherProducts,JFrame Display) {
		// TODO Auto-generated constructor stub
		 choice=category1;
		 this.Display=Display;                                                    
		 this.icecreamProducts=icecreamProducts;
		 this.milkProducts=milkProducts;
		 this.otherProducts=otherProducts;
		   
		
		 
		
	}

	

	 
	 @Override
		public void actionPerformed(ActionEvent e) {
		 
		 String selection=choice.getText();
            //  System.out.println("selection="+selection);	
              
              int count1=selection.compareTo("ICECREAM PRODUCTS");
              int count2=selection.compareTo("MILK PRODUCTS");
              int count3=selection.compareTo("OTHER PRODUCTS");
     		
               if(count1==0){
            	   System.out.println("selection1="+selection);
            	   Display.add(icecreamProducts);
               }
               if(count2==0){
            	   System.out.println("selection2="+selection);	
            	   Display.add(otherProducts);
               }
                if(count3==0){
                	 System.out.println("selection3="+selection);
                	  Display.add(icecreamProducts);
                }
              
		}
	     
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
