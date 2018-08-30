import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 * 
 */

/**
 * @author Vijay
 *
 */
public class ChanegPasswordSave implements ActionListener{

	
	/**
	 * @param args
	 */
	private JTextField cpassword1, npassword1, rpassword1;
	private JLabel notify;
	private String uname,tp;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
	
	
	
	public ChanegPasswordSave(String uname,String trupassword,JPasswordField cpassword1,JPasswordField npassword1,JPasswordField rpassword1,JLabel notify)
	{    this.uname=uname;
	    this.tp=trupassword;
		this.cpassword1=cpassword1;
		this.npassword1=npassword1;
		this.rpassword1=rpassword1;
		this.notify=notify;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String cp,np,rp;	
		cp=cpassword1.getText();
		np=npassword1.getText();
		rp=rpassword1.getText();
		
		
		if(cp.equals(tp))
		{

			 
		         try
		       	 {
				 if(np==null)
				 {
					 notify.setText("CURRENT PASSWORD FIELDS CANNOT BE EMPTY."); 
				 }
				
		       	 }
			    catch(Exception ex)
			 {
			    	notify.setText("CURRENT PASSWORD FIELDS CANNOT BE EMPTY.."); 
			 }
       				
	
			 
		
			if(np.equals(rp))
			{
			try {
				 
				 
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				
				   
				    
				  String sql = "UPDATE employee set e_password=? WHERE e_username= ?";//"+"'"+uname+"' "+";";	
				   PreparedStatement ps1 =(PreparedStatement) con.prepareStatement(sql);
				                      
				                        ps1.setString(1, np);
				                        ps1.setString(2, uname);
				               
				   
				            stmt= (PreparedStatement) con.prepareStatement(sql);
				            
				  
			int up=	  ps1.executeUpdate();
				//System.out.println("t "+up);
				    if(up>=1)
				    {
				    	notify.setText("  PASSWORD UPDATED SUCCESSFULLY");
				    	System.out.println(" product updated");
				    }
				   
				     
				    
				    
				    
			System.out.println("Opened database successfully..");	
		
			}
		catch ( Exception e1 ) 
		{
			
			notify.setText(" : UNABLE TO UPDATE EMPLOYEE UNSUCCESSFULL ");
		        e1.getMessage();
     			System.out.println("unable to open database ...");	
	    		 e1.printStackTrace();
	 } 
			}
			else
			{
				
			notify.setText("NEW PASSWORD MISMATCH");
	         }
			
		}
		else
		{
			notify.setText("INVALID CURRENT PASSWORD");
			
		}
			
	// finally
	 {
		 try 
		 {
			con.close();
		 } 
		 
		 catch (SQLException e2) 
		 {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 
	 }
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
