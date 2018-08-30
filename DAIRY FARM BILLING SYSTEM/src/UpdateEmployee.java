import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class UpdateEmployee implements ActionListener  {

	/**
	 * @param args
	 */
	
	private JTextField nameField, empFilepath, eMailField, mobNoField, userNameField, empPasswordField, empEidField, salaryFiled;
	private JComboBox empSelectCategory;
	private JButton empImg;
	private JTextArea empAddress;
	private JLabel notification;
	
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private PreparedStatement stmt;
		private ResultSet rs;
		
		private DateComboBox1 dobField,dojField;
		private static String doj,dob,esc;
	
	
	public UpdateEmployee(JTextField nameField,JComboBox empSelectCategory,JTextField empFilepath,JButton empImg,JTextArea empAddress,JTextField eMailField,JTextField mobNoField,JTextField userNameField,DateComboBox1 dobField,JTextField empPasswordField,DateComboBox1 dojField,JTextField empEidField,JTextField salaryFiled ,JLabel notification)
	{   
		
		this.nameField=nameField;
		this.empFilepath=empFilepath;
		this.eMailField=eMailField;
		this.mobNoField=mobNoField;
		this.userNameField=userNameField;
		this.dobField=dobField;
		this.empPasswordField=empPasswordField;
		this.dojField=dojField;
		this.empEidField=empEidField;
		this.salaryFiled=salaryFiled;
		
	this.empSelectCategory=empSelectCategory;
		this.empImg=empImg;
		this.empAddress=empAddress;
		this.notification=notification;
		
	}
	
	
	

/*	public UpdateEmployee(DateComboBox1 dobField2, DateComboBox1 dojField2,
			JComboBox empSelectCategory2) {
		// TODO Auto-generated constructor stub
		this.dobField=dobField2;
		 this.dojField=dojField2;
		  this.empSelectCategory=empSelectCategory2;
		
	}*/


	@Override

	/*public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("UPDATE EMPLOYEE CLASS");
		 
		if(e.getSource()==dobField)
	 	{
	 		System.out.println("tbookno is selected");
	 	String	sbookno = dobField.getSelectedItem().toString();
	 		System.out.println(sbookno);
	 		
	 		dob=sbookno;
	 		
	 	}
		if(e.getSource()==dojField)
	 	{
	 		System.out.println("tbookno is selected");
	 	String	sbookno = dojField.getSelectedItem().toString();
	 		System.out.println(sbookno);
	 		
	 		doj=sbookno;
	 		
	 	}
		if(e.getSource()==empSelectCategory)
	 	{
	 		System.out.println("tbookno is selected");
	 	String	sbookno = empSelectCategory.getSelectedItem().toString();
	 		System.out.println(sbookno);
	 		
	 		esc=sbookno;
	 		
	 	}
	}
		*/
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name =nameField.getText();
	
		String type=(String) empSelectCategory.getSelectedItem();
		
		String path =empFilepath.getText();
		String email =eMailField.getText();
	
		String mob =	mobNoField.getText();
		String uname =userNameField.getText();
		String dob =(String) dobField.getSelectedItem();
		String upass =empPasswordField.getText();
		String doj =(String) dojField.getSelectedItem();
		int eid =Integer.parseInt(empEidField.getText());
		float sal =Float.parseFloat(salaryFiled.getText());
	
		String address =empAddress.getText();
		
		  
		  

			try {
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				
				   
				    
				  String sql = "UPDATE employee " + 
						   "SET e_id ="+"'"+eid+"' " +","  +"e_type ="+"'"+type+ "'" +","  +"e_img ="+"'"+path+"'" 
						   +"," +"e_password ="+"'"+upass+"'"+","+"e_salary ="+"'"+sal+"'"+","+"e_date_of_joing ="+"'"+doj+"'" 
						   +","+"e_address ="+"'"+address+"'"+","+"e_mob ="+"'"+mob+"'"+","+" e_email ="+"'"+email+"'"+"," 
						   +" e_date_of_birth ="+"'"+dob+"'"+","+"e_name ="+"'"+name+"'"+"WHERE e_username="+"'"+uname+"'"+";";	
				    
				      
				   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("UPDATE employee  SET e_img=? where e_id=? ");	
				                      
				                        ps1.setString(1, path);
				                        ps1.setInt(2, eid);
				               
				   
				            stmt= (PreparedStatement) con.prepareStatement(sql);
				            
				            
				          
				   
				          // String imgpath ="'"+filepath1+"'";
				   
				          // System.out.println(" product updated  path : "+ imgpath);
				    
				   
			int up =   stmt.executeUpdate();
			int ps=	  ps1.executeUpdate();
				//System.out.println("t "+up);
				    if(up>=1)
				    {
				    	notification.setText(name +" : EMPLOYEE UPDATED SUCCESSFULLY");
				    	System.out.println(" product updated");
				    }
				   
				     
				    
				    
				    
			System.out.println("Opened database successfully..");	
		
			}
		catch ( Exception e1 ) 
		{
			
			notification.setText(name +" : UNABLE TO UPDATE EMPLOYEE UNSUCCESSFULL ");
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
