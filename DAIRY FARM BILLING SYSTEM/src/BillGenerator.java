import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 * 
 */

/**
 * @author ty156
 *
 */
public class BillGenerator extends JPanel{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String[] cols={"BILL_NO","PRODUCTS","QTY"};
	      String[] rows={};  
		 
		JTable table= new JTable();
		
		JScrollPane tabscroll=new JScrollPane(table);
		
		 JFrame billGen=new JFrame("BILL");
		 billGen.setLayout(null);
		  billGen.setBackground(Color.black);
		     billGen.setSize(420,700);
		  
		        JButton logo = new JButton("");
		      logo.setBounds(10,10,390,80);
		       String path="/home/ty156/Downloads/BILLING SYSTEM/DAIRY FARM BILLING SYSTEM/img/login.png";
		       
		  logo.setIcon(new ImageIcon(path));
		  
		       logo.setBackground(Color.gray);
		 
		   billGen.add(logo);
		  

		      
		      
		      
		  
			 JPanel content = new JPanel();
			
			   content.setBounds(10,100,390,690);
		       content.setBackground(Color.white);
		 
		   billGen.add(content);
		 
		  
		   tabscroll.setBounds(10,100,390,690);
		    
		    billGen.add(tabscroll);
		     
		    
		    billGen.setVisible(true);
		    
		   
		    billGen.setResizable(false);
		    
		  
		

	}

}
