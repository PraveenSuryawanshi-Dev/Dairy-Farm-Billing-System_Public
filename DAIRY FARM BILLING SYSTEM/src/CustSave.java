import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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

 
public class CustSave implements ActionListener  {
  
	
	 private JTextField  custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
     private JTextArea custAddress;
     private JLabel notification;
     private DateComboBox1 custDobField,custDojField;
     private String uname;
     
     private	String driverName = "org.gjt.mm.mysql.Driver";
     private	String url = "jdbc:mysql://192.168.100.254/tydb156";
     	
     	private String userName = "ty156";
        private String password = "12345";
     	private Connection con = null;
     	
     	private Statement stmt;
     	private ResultSet rs;
	
	public CustSave(JTextField custnameField, JTextArea custAddress,JTextField custFilepath,
			JTextField custEMailField, JTextField custMobNoField,
			JTextField custUserNameField, DateComboBox1 custDobField,
			JTextField custPasswordField, DateComboBox1 custDojField,
			JTextField custEidField,
			JTextField cusAmtFiled ,JLabel notification , String uname) {
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


	/**
	 * @param args
	 */
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		  int EidField=Integer.parseInt(custEidField.getText());		
        
          float AmtFiled=Float.parseFloat(cusAmtFiled.getText());
          
          //System.out.println("in sql :product type :" + ptype +" product type ="+   ptype   +" product name="+  pname +" product path   ="+  filesrc +" desrription = "+  description  +" rs ="+mrp  +" quantity="+qnty +" product id="+pid);
          
          
			try {
					 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
				
						System.out.println("Opened database successfully..");	
					   
                       PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  customer values(?,?,?,?,?,?,?,?,?,?,?,?)");
						

                        
                    
                       
                        ps.setInt(1,EidField);
                        ps.setString(2, custUserNameField.getText());
                        ps.setString(3, custPasswordField.getText());
                        ps.setFloat(4,AmtFiled);
                        ps.setString(5,custnameField.getText());
                        ps.setString(6, custFilepath.getText());
                        
                        ps.setString(7,custAddress.getText());
                        
                        ps.setString(8, custEMailField.getText());
                        
                        ps.setString(9,custMobNoField.getText());
                        
                        ps.setString(10,(String) custDojField.getSelectedItem());
                        
                      
                      
                        ps.setString(11,(String) custDobField.getSelectedItem());
                        
                        ps.setString(12,uname);
                       
                        
                     
                      
                       
					    
					   
					int up= ps.executeUpdate();
					   if(up>0)
					   {
						   notification.setText(custnameField.getText()+"  INESERTED SUCCESSFULLY ");
						   System.out.println(+up+" record inserted  in  database successfully..");	
					   }
					 con.close();
				
					   
		
					    
					    
			
			
				}  
			catch ( Exception e ) 
			{
				 
				notification.setText(custnameField.getText()+"  UNSUCCESSFULL TO INSERT ");
			        e.getMessage();
			 System.out.println("unable to open database ...");	
			 System.out.println("unable to inserted record  in  database successfully..");	
				 e.printStackTrace();
				 
				
		    } 
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
