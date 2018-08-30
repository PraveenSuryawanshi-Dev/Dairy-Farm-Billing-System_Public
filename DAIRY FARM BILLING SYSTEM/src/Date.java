/**
 * 
 */

/**
 * @author PRAVEEN AND JIGAR
 *
 */
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;

 class Date {

	/**
	 * @param args
	 */
	 Date()
	 {
		 
	 }
	 
	 void  changeDate(JLabel dl)
	 {
			DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal= Calendar.getInstance();
			
			dl.setText(df.format(cal.getTime()));	
	 }


}
