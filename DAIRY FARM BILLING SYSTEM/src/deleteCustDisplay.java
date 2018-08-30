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
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Vijay
 *
 */
public class deleteCustDisplay implements ActionListener {

	/**
	 * @param args
	 */
	
	private JTextField itemName;
	private JFrame uItem;
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
		

		
	public deleteCustDisplay(JTextField box ,JFrame uItem)
	{
		 this.itemName=box;
		 this.uItem=uItem;
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		uItem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		uItem.dispose();
		
		
		
		
	String name=	itemName.getText();
	System.out.println("get text="+name);
		
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
				        	 
				        	 
				        
				        	  iname[rs.getInt(1)].addActionListener(new DistroyCust(rs.getString(2),panel, iname[rs.getInt(1)]));
				          
				               
				        	
				        	    
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
