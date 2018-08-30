/**
 * 
 */

/**
 * @author praveen and Jigar
 *
 */

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 class Time extends Thread {

	/**
	 * @param args
	 * 
	 
	 */
	
	 private JLabel l;
	 
   Time(JLabel l )
   {
	   this.l=l;
	  
	 
   }
   
    public void run()
   {
    	     
		
		   while(true)
		   {
		   
			  
		  DateFormat df=new SimpleDateFormat("HH:mm:ss");
			Calendar cal= Calendar.getInstance();
	
			
			     l.setText(df.format(cal.getTime()));
			      
			
	     
		   }
	   
   }
	
}
