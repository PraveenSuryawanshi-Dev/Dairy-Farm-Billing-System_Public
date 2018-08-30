import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class PayMember implements ActionListener {
	
  private 	JTextField untf;
   private JTextField passwordField;
   
	private JLabel notify ;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		static String username;
		private  JButton pay;
		
		

	public PayMember(JTextField untf, JPasswordField passwordField,
			JLabel notify ,JButton pay) {
		
		
		this.untf=untf;
		this.passwordField=passwordField;
		this.notify=notify;
		this.pay=pay;
	}

	public PayMember(String username2) {
		// TODO Auto-generated constructor stub
		
		 this.username=username2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		 String name1=untf.getText();
	      
		    
	      
	       System.out.println(" getname  =" + name1);
	       
	       String name2=passwordField.getText();
		         
		 System.out.println(" getname  =" + name2);
			try {
				 Class.forName(driverName);
				   con = (Connection) DriverManager.getConnection(url,userName,password);
			
				   String query2="select * from customer where cust_username="+ "'"  +name1+ "'" +"and cust_password="+"'"+name2+"' "+";";
			       
				   Statement stmt2=con.createStatement();
				   
					  ResultSet rs2= stmt2.executeQuery(query2);
				 
					   
					  /* while(rs2.next())
					   {
						     System.out.println("in check");
						   notify.setText("valid");
						   
					   }*/
				       
				     	  
				          if(rs2.next())
				          {
				     
				        	  BillBuffer b =new BillBuffer();
				        	   b.payMember(username,2,name1);	
				        	  notify.setText("valid");
				        	 			    	
				    	
				          }
				          else
				          {
				        	   notify.setText("INVALID MEMBER PASSWORD           ");
				        	    
				          }
				   
				    
				    
				    
			System.out.println("Opened database successfully..");	
		
			}
		catch ( Exception e1 ) 
		{
			notify.setText("INVALID MEMBER PASSWORD           ");
		        e1.getMessage();
			System.out.println("unable to open database ...");	
			 e1.printStackTrace();
			 
			
	   }
			finally
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
			
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
