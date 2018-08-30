import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class CancelButton implements ActionListener{

	/**
	 * @param args
	 */
	static private JLabel count;
	
	static  private LinkedList plist = new LinkedList();
	
	private JButton product;
	
	private static int c=0;
	
	public CancelButton(JLabel count ,int c)
	{
		this.count =count;
		this.c=c;
	}
	
	
	
	public CancelButton(JButton product)
	{
		
		this.product=product;
		
		plist.add(product);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c=0;
		
		Iterator e1=plist.iterator();
		 while(e1.hasNext())
		   {
			   JButton b= (JButton) e1.next();
			    b.setVisible(false);
		   }
		count.setText(""+c);
		
		new BillBuffer().distroy();
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
