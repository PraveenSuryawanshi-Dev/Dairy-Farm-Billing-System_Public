import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
public class SaveEmployee implements ActionListener  {

	/**
	 * @param args
	 */
	
	private JTextField nameField, empFilepath, eMailField, mobNoField, userNameField, empPasswordField, empEidField, salaryFiled;
	private JComboBox empSelectCategory;
	private JButton empImg;
	private JTextArea empAddress;
	private JLabel notification;
	private DateComboBox1  dobField,dojField;
	
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
     	private Connection con = null;
     	
     	private Statement stmt;
     	private ResultSet rs;
     static	private String dob,doj;
	
	
	public SaveEmployee(JTextField nameField,JComboBox empSelectCategory, JTextField empFilepath,JButton empImg,JTextArea empAddress, JTextField eMailField, JTextField mobNoField, JTextField userNameField,  JTextField empPasswordField,  JTextField empEidField, JTextField salaryFiled, JLabel notification)
	{

		this.nameField=nameField;
		this.empFilepath=empFilepath;
		this.eMailField=eMailField;
		this.mobNoField=mobNoField;
		this.userNameField=userNameField;
		
		this.empPasswordField=empPasswordField;
		
		this.empEidField=empEidField;
		this.salaryFiled=salaryFiled;
		
		this.empSelectCategory=empSelectCategory;
		this.empImg=empImg;
		this.empAddress=empAddress;
		this.notification=notification;
		
	}
	
	/*public SaveEmployee(DateComboBox1 dobField, DateComboBox1 dojField) {
		// TODO Auto-generated constructor stub
		
		System.out.println("in date");
		
		 this.dobField=dobField;
		 this.dojField=dojField;
	}
*/

	/*public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
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
	 	String	sbookno = dobField.getSelectedItem().toString();
	 		System.out.println(sbookno);
	 		
	 		doj=sbookno;
	 		
	 	}
		
		
	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("DOB"+dob  +   "   DOJ"+doj );
		String name =nameField.getText();
		
		String type=(String) empSelectCategory.getSelectedItem();
		
		String path =empFilepath.getText();
		String email =eMailField.getText();
	
		String mob =	mobNoField.getText();
		String uname =userNameField.getText();
		
		String upass =empPasswordField.getText();
		
		int eid =Integer.parseInt(empEidField.getText());
		float sal =Float.parseFloat(salaryFiled.getText());
	
		String address =empAddress.getText();
		
		
		try {
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
				System.out.println("Opened database successfully..");	
			   
              PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  employee values(?,?,?,?,?, ?,?,?,?,? ,?,?)");
				

               
           
              
               ps.setInt(1,eid);
               ps.setString(2, type);
               ps.setString(3, uname);
               ps.setString(4,upass);
               ps.setFloat(5,sal);
               ps.setString(6, doj);
               
               ps.setString(7,path);
               
               ps.setString(8, address);
               
               ps.setString(9,mob);
               
               ps.setString(10,email);
               
             
             
               ps.setString(11,dob);
               
               ps.setString(12,name);
              
               
            
             
              
			    
			   
			int up= ps.executeUpdate();
			   if(up>0)
			   {
				   notification.setText(nameField.getText()+"  INESERTED SUCCESSFULLY ");
				   System.out.println(+up+" record inserted  in  database successfully..");	
			   }
			 con.close();
		
			   

			    
			    
	
	
		}  
	catch ( Exception e1 ) 
	{
		 
		notification.setText(nameField.getText()+"  UNSUCCESSFULL TO INSERT ");
	        e1.getMessage();
	 System.out.println("unable to open database ...");	
	 System.out.println("unable to inserted record  in  database successfully..");	
		 e1.printStackTrace();
		 
		
   } 



}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	
}
