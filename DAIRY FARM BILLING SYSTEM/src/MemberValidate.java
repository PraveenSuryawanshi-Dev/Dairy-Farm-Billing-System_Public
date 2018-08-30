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
import javax.swing.JTextField;

/**
 * 
 */

/**
praveen and jigar *
 */
public class MemberValidate implements ActionListener {

  private JLabel name, notify ;
   private JButton img;
	private JTextField untf;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
		
		
	
	public MemberValidate(JLabel name, JButton img, JLabel notify,
			JTextField untf) {
		this.name=name;
		this.img=img;
		this.notify=notify;
		this.untf=untf;
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
      String name1=untf.getText();
      
    
      
       System.out.println(" getname  =" + name1);
		try {
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
			   String query2="select * from customer where cust_username="+"'"+name1+"' "+";";
		       
			   Statement stmt2=con.createStatement();
			   
				  ResultSet rs2=stmt2.executeQuery(query2);
			 
				
			    
			     	  
			          if(rs2.next()==true)
			          {
			        	  notify.setText("  ");
			    	name.setText(rs2.getString(5));   	
			    	String path=rs2.getString(6);
			    	img.setIcon(new ImageIcon(path));
			    	
			          }
			          else
			          {
			        	   notify.setText("INVALID MEMBER USER NAME           ");
			        	    name.setText("");   	
			        	  
			        		String path="";
			        	  	img.setIcon(new ImageIcon(path));
			          }
			     
			    
			    
			    
		System.out.println("Opened database successfully..");	
	
		}
	catch ( Exception e1 ) 
	{
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

}
