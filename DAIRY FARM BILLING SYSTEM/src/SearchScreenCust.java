import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class SearchScreenCust implements ActionListener  {

	/**
	 * @param args
	 */
	

	 private JTextField textBox, custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
    private JTextArea custAddress;
    
    private JFrame frame;
   private  JButton custImg;
    private DateComboBox1 custDobField,custDojField;
    
    
private	String driverName = "org.gjt.mm.mysql.Driver";
private	String url = "jdbc:mysql://192.168.100.254/tydb156";

private String userName = "ty156";
private String password = "12345";
    	private Connection con = null;
    	
    	private Statement stmt;
    	private ResultSet rs;
	
	public SearchScreenCust(JTextField textBox,JFrame frame,JTextField custnameField, JTextArea custAddress,JTextField custFilepath,
			JTextField custEMailField, JTextField custMobNoField,
			JTextField custUserNameField, DateComboBox1 custDobField,
			JTextField custPasswordField, DateComboBox1 custDojField,
			JTextField custEidField,
			JTextField cusAmtFiled ,JButton custImg) {
		// TODO Auto-generated constructor stub
		  this.textBox=textBox;
		  this.frame=frame;
		
		
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
		
		this.custImg=custImg;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.dispose();
		
		
		
		
	String name=textBox.getText();
	System.out.println("get text  ="+name);
		
		JFrame display = new JFrame("SEARCH");
		       display.setSize(600, 600);
		      display.setLayout(null);   
		
		JPanel  panel=new JPanel();
		 panel.setLayout(null);
		 panel.setBackground(Color.BLACK);
		 panel.setBounds(0, 0, 600, 600);
		

		 try {
				
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from customer");
				   
				
				   
				    
				   
				      JButton iname[]=new JButton[50000];
				     
				      int count=0;
				      int a=20,b=20;        	 
				        	int total=1;
				        	int mul=1;
				        		 while(total!=2) 
				        		 {
				        			
				        			 
				        			   
				        			 
				        		    	 for(int i=0;i<=4;i++)
						        	 {  rs.next();
						        	 
						        	 
						        	 int no=-1;
						        	 String str=rs.getString(2);
						        	 
						        	 no=str.indexOf(name);
						        	 
						        	// System.out.println("database name"+str+"  empname   "+textBox);
						        	 
						        	 
				        			   System.out.println("index : "+no + "name"+rs.getString(2 ) );
						        	 
						        	 if(count==(5*mul))
			        			        {
			        			        	a=20;
			        			        	b=b+110;
			        			        	mul++;
			        			        }
						        	
						        	   
				        			  
						        		  
						        	 
						        	 
						        	  if(no>=0)
				        		       {
						        		  
						        		    
						        		  iname[rs.getInt(1)]=new JButton(rs.getString(1)); 
						        		       
						        		  
	 					        		   
				        	  String path=rs.getString(6);
				        	  
				        	  iname[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  iname[rs.getInt(1)].setBounds(a,b, 100, 100);
				        	 
				        	 
				        	  panel.add(iname[rs.getInt(1)]);
				        	 
				        	 
				        	 
				        //	Display.add(milkProducts);
				        	
				        	
				        	System.out.println("");
				        	
				        	
				   	iname[rs.getInt(1)].addActionListener(new SetUpdateCust(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled,custImg));
				        	    
	                              a=a+110;
				        		  
				        		   
				        		   System.out.println(count);
					        		  count++;
						        	  } 
						        	  else
						        	  {
						        		  
						        	  }
						        	   
						        
					        		
				        		 }
				        			 
				        			
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
		display.add(panel);
		display.setVisible(true);
		
		
		
		
		
	}
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
