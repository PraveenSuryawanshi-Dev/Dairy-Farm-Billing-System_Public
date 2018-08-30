import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;




/**
 * 
 */

/**
 * @author jigar and praveen
 *
 */
public class DistroyCust implements ActionListener {

	/**
	 * @param args
	 */
	
	 private String cUsername;
	  private JPanel  panel;
	  private JButton itemButton;
	  
	  
	  private	String driverName = "org.gjt.mm.mysql.Driver";
		private	String url = "jdbc:mysql://192.168.100.254/tydb156";
			
			private String userName = "ty156";
		   private String password = "12345";
	  	private Connection con = null;
	  	
	  	private Statement stmt;
	  	private ResultSet rs; 
	
	
	 public DistroyCust(String cUsername ,JPanel panel,JButton itemButton)	
	 {
		  this.cUsername=cUsername;
		   this.panel=panel;
		   this.itemButton=itemButton;
		 
	 }
	 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			try {
				
				
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
					System.out.println("Opened database successfully..");	
				   
	            PreparedStatement ps1=(PreparedStatement) con.prepareStatement("delete  from  customer where cust_username=?");
	            
							    ps1.setString(1,cUsername);

				int up= ps1.executeUpdate();
				   if(up>0)
				   {       panel.remove(itemButton);
					   System.out.println(up+" record deleted from  database successfully..");	
				    panel.updateUI();
				   }
		
			
				   

				    
				    
		
		
	}  
		catch ( Exception e ) 
		{
		        e.getMessage();
		 System.out.println("unable to open database ...");	
		 System.out.println("unable to delete  record  from  database successfully..");	
			 e.printStackTrace();
			 
			
		}

	finally
	{
		 try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
			
			
		}


	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
