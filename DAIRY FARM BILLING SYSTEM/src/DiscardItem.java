import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class DiscardItem implements ActionListener {

	/**
	 * @param args
	 */
	 private JButton item;
	 private JLabel totalBill;
	private static double amountBuffer;
	  private float rs;
	  private String value;
	  private int pid;
	
	
 public	DiscardItem(JButton item ,float rs ,JLabel totalBill,double amtBuffer ,int pid)
 {
	 this.item=item;
	  this.rs=rs;
	 this.totalBill=totalBill;
	 this.amountBuffer=amtBuffer;
	 this.pid=pid;
	
	
     
  
	 
 }

 
 
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String name=item.getText();
        System.out.println("discarded name :"+name   +  "    rs   ="+rs);
        
        
        amountBuffer = amountBuffer-rs;
        value= ""+amountBuffer;
         
           totalBill.setText(value);
           
       new  Operation(amountBuffer);
         
        BillBuffer buffer= new BillBuffer();
        
          buffer.billSub(pid);
          
		item.setVisible(false);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
