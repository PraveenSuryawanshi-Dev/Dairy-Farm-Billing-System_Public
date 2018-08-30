import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Scrollpane extends JFrame  {

	/**
	 * @param args
	 */
	
	public Scrollpane()
	{
		super("scrollpane");
		
		setSize(900,900);
		
		setLayout(null);
		
		JPanel panel = new JPanel();
               
	     panel.setLayout(new GridLayout(5,5,8,8));
		
		//   panel.setLayout(null);
		   
		   JButton b[]=new JButton[10000];
		 int i=0 ,f=0;
		   while(f!=1)
		   {
		 for(int t=0 ;t<=2;t++)
		     {

                       
                  b[i]=new JButton("ok"+i);
                  
		    	   b[i].setPreferredSize(new Dimension(100,100));
                 
                  
		    	  //b[j].setPreferredSize(new Dimension(100,100));
		    	 
		    	   panel.add(b[i]);
		    	 
		    	  i++;
		    	 
		    	  
		      
		    }
		 f++;
		    
		   }
		 
		 panel.setBackground(Color.black);
		 
		//panel.setBounds(200,200,400,400);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		
		
		JScrollPane jsp= new JScrollPane(panel,v,h);
	      jsp.setBounds(200,250,580,470);
	      jsp.setBackground(Color.yellow);
		//jsp.setPreferredSize(new Dimension(200,400));
		
		// jsp.setBounds(200, 200, 200, 200);

		  
		
		
		add(jsp);
		
		setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Scrollpane();
	}

}
