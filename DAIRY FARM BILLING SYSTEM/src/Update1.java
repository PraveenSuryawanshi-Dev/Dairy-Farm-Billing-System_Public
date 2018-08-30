import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Update1 implements ActionListener,ItemListener {

	/**
	 * @param args
	 */
	
	private JTextField name, filepath, rate, qty, id;
	private JButton img;
	private JTextArea productDescription;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private PreparedStatement stmt;
		private ResultSet rs;
		
		private JComboBox selectCategory;
		
		private static String ptype;
		private JLabel notification;
		
		private String uname;
	
 public Update1(JComboBox selectCategory)	
 {
	   this.selectCategory=selectCategory;
	 
 }
		
		
		
public 	Update1(JTextField name,JTextField filepath,JButton img,JTextField rate,JTextField qty,JTextField id,JTextArea productDescription,JLabel notification ,String uname, JComboBox selectCategory)
{
	this.name=name;
	this.filepath=filepath;
	this.img=img;
	this.rate=rate;
	this.qty=qty;
	this.id=id;
	this.productDescription=productDescription;
	this.notification=notification;
	this.uname=uname;
	this.selectCategory=selectCategory;
}

@Override
public void itemStateChanged(ItemEvent ei) {
	// TODO Auto-generated method stub
	 ptype=(String)selectCategory.getSelectedItem();
	
}


@Override
public void actionPerformed(ActionEvent ea) {
	// TODO Auto-generated method stub
	 uname="admin";
	ptype=(String) selectCategory.getSelectedItem();
	 String name1=name.getText();
	 String filepath1=filepath.getText();
	  float rate1=Float.parseFloat(rate.getText());
	  int qty1=Integer.parseInt(qty.getText());
	  int  id1=Integer.parseInt(id.getText());
	  String  productDescription1=productDescription.getText();
	  
	  
	  
	   System.out.println("p_id ="+id1 );
	   System.out.println("p_type ="+ptype );
	   System.out.println("p_name ="+name1 );
	   System.out.println("p_path ="+filepath1 );
	   System.out.println("p_price ="+rate1 );
	   System.out.println("p_qty ="+qty1 );
	   System.out.println("p_desc ="+productDescription1 );
	
	   Calendar cal= Calendar.getInstance();
	      Timestamp ts= new Timestamp(cal.getTime().getTime());
	      
	     Timestamp time=ts;  
	  

		try {
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
			  /* 
			   String sql = "UPDATE product " +
			   "SET p_name ="+"'"+name1+"' "+","  +"p_imgpath ="+"'"+filepath1+"' "+","    +"p_price ="+"'"+rate1+"' "+"," 
					   
                  +"p_initial_stock ="+"'"+qty1+"' "+","   +"p_description ="+"'"+productDescription1+"' "+"," +"p_type ="+"'"+ptype+"' "+"," 
					   
			   + "WHERE p_id= "+"'"+id1+"' "+";";   */
			   
			   
			  /* String sql = "UPDATE product " +
					   "SET p_name ="+"'"+name1+"' " + "WHERE p_id= "+"'"+id1+"' "+";"; */
			   
			  /*  String sql = "UPDATE product "+   
					      "SET p_name =?  WHERE p_id= ?  ";
               stmt.setString(1, name1);
 			   stmt.setInt(2, id1);
			                           */  
			   
			    
			   String sql = "UPDATE product " + 
					   "SET p_name ="+"'"+name1+"' " +","  +"p_imgpath ="+"'"+filepath1+ "'" +","+"p_type ="+"'"+ptype+"'" 
					   +","  +"p_price ="+"'"+rate1+"'"+","+"p_initial_stock ="+"'"+qty1+"'"+","+"p_description ="+"'"+productDescription1+"'" + ","+"p_created_by ="+"'"+uname+"' " +"," +"p_final_stock ="+"'"+qty1+"' "+","  +"p_time ="+"'"+time+"' " +"WHERE p_id= "+"'"+id1+"' "+";";	
			    
			      
			   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("UPDATE product  SET p_imgpath=? where p_id=? ");	
			                       	
			                        ps1.setString(1, filepath1);
			                        ps1.setInt(2, id1);
			               
			   
			            stmt= (PreparedStatement) con.prepareStatement(sql);
			            
			            
			          
			   
			           String imgpath ="'"+filepath1+"'";
			   
			           System.out.println(" product updated  path : "+ imgpath);
			    
			   
			int up =   stmt.executeUpdate();   
			  ps1.executeUpdate();
			System.out.println("t "+up);
			    if(up>=1)
			    {
			    	notification.setText(name1 +" : PRODUCT UPDATED SUCCESSFULLY");
			    	System.out.println(" product updated");
			    }
			   
			     
			    
			    
			    
		System.out.println("Opened database successfully..");	
	
		}
	catch ( Exception e1 ) 
	{
		notification.setText(name1 +" :  UNSUCCESSFULL TO UPDATE PRODUCT");
		
	        e1.getMessage();
		System.out.println("unable to open database ...");	
		 e1.printStackTrace();
		 
		
  }
		
		
  finally
  {
	 try {
		con.close();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
  }
	  
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	

	

}
