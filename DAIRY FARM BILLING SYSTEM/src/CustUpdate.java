import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
public class CustUpdate implements ActionListener {

	/**
	 * @param args
	 */
	
	 private JTextField  custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
     private JTextArea custAddress;
     private DateComboBox1 custDojField,custDobField;
     
     private	String driverName = "org.gjt.mm.mysql.Driver";
     private	String url = "jdbc:mysql://192.168.100.254/tydb156";
     	
     	private String userName = "ty156";
        private String password = "12345";
 		private Connection con = null;
 		
 		private PreparedStatement stmt;
 		private ResultSet rs;
 		private JLabel notification;
	
 		private  String uname;
	public CustUpdate(JTextField custnameField, JTextArea custAddress,JTextField custFilepath,
			JTextField custEMailField, JTextField custMobNoField,
			JTextField custUserNameField, DateComboBox1 custDobField,
			JTextField custPasswordField, DateComboBox1 custDojField,
			JTextField custEidField,
			JTextField cusAmtFiled ,JLabel notification,String uname) {
		// TODO Auto-generated constructor stub
		
		 this.custnameField=custnameField;
		 this.custAddress=custAddress;
		 this.custFilepath=custFilepath;
		 this.custEMailField=custEMailField;
		 this.custMobNoField=custMobNoField;
		 this.custUserNameField=custUserNameField;
		 this.custDobField=custDobField;
		 this.custPasswordField=custPasswordField;
		 this.custDojField=custDojField;
		 this.custEidField=custEidField;
		 
		 this.cusAmtFiled=cusAmtFiled;
		 this.notification=notification;
		 this.uname=uname;
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cname=uname;
		 
		  String name=  custnameField.getText(); 
		  String filepath=  custFilepath.getText();
		  String email=     custEMailField.getText();
		  String mobNo=    custMobNoField.getText();
		  String custUserName=  custUserNameField.getText();
		  String dob=    (String) custDobField.getSelectedItem();
		  String custPassword=   custPasswordField.getText();
		  String doj=      (String) custDojField.getSelectedItem();
		  int cid=  Integer.parseInt(custEidField.getText());
		  float amt=    Float.parseFloat(cusAmtFiled.getText());
		  String address=custAddress.getText();
	     
		  
		  

			try {
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				 
				   
				    
				   String sql = "UPDATE customer " + 
						   "SET cust_id ="+"'"+cid+"'"+","+"cust_password ="+"'"+custPassword+ "'" +","+"cust_amt ="+"'"+amt+"'" 
						   +","+"cust_name ="+"'"+name+"'"+","+"cust_img_src ="+"'"+filepath+"'" +","+"cust_address ="+"'"+address+"'"+"," 
						   +"cust_e_mail ="+"'"+email+"'" +"," +"cust_mob_no ="+"'"+mobNo+"'" 
						   +","  +"cust_doj ="+"'"+doj+"'"+","+"cust_dob ="+"'"+dob+"'" 
						  
						   +","+"created_by="+"'"+cname+"'"+"WHERE cust_username= "+"'"+custUserName+"'"+";";	
				    
				      
				   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("UPDATE customer  SET cust_img_src=? where cust_username=? ");	
				                      
				                        ps1.setString(1, filepath);
				                        ps1.setString(2, custUserName);
				               
				   
				            stmt= (PreparedStatement) con.prepareStatement(sql);
				            
				            
				          
				   
				         
				   
				          
				    
				   
				int up =   stmt.executeUpdate();
				int up1 = ps1.executeUpdate();
				System.out.println("t "+up1);
				    if(up1>=1)
				    {  notification.setText(name +" : UPDATED CUSTOMER SUCCESSFULLY ");
				    	System.out.println(" customer updated");
				    }
				   
				     
				    
				    
				    
			System.out.println("Opened database successfully..");	
		
			}
		catch ( Exception e1 ) 
		{
			notification.setText(name +" : UNABLE TO UPDATE CUSTOMER ");  
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
