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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Search implements  ActionListener {

	/**
	 * @param args
	 */
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
		
		private String comp;
		private  JTextField search , stockqty ;
	    private JPanel productDp;
	    private JLabel totalBill;
		  
		public Search(JTextField search,JPanel productDp,JLabel totalBill ,JTextField stockqty)
		{
			this.search=search;
			this.productDp=productDp;
			this.totalBill=totalBill;
			this.stockqty=stockqty;
			
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			comp=search.getText();
			
			
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
				   
				   rs=stmt.executeQuery("select * from product ;");
				   
				
				   
				    
				   
				      JButton product[]=new JButton[500000];
				     
				      int count=0;
				      int a=20,b=20;        	 
				        	int total=1;
				        	int mul=1;
				        		 while(total!=2) 
				        		 {
				        			
				        			 
				        			   
				        			 
				        		    	 for(int i=0;i<=4;i++)
						        	 {  rs.next();
						        	 
						        	 
						        	 int no=-1;
						        	 String str=rs.getString(3);
						        	 
						        	 no=str.indexOf(comp);
						        	 
						        	 
				        			   System.out.println("index : "+no + "name"+rs.getString(3) );
						        	 
						        	 if(count==(5*mul))
			        			        {
			        			        	a=20;
			        			        	b=b+110;
			        			        	mul++;
			        			        }
						        	
						        	   
				        			  
						        		  
						        	 
						        	 
						        	  if(no>=0)
				        		       {
						        		  
						        		  
						        		   product[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  product[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  product[rs.getInt(1)].setBounds(a,b, 100, 100);
				        	 
				        	 
				        	  panel.add(product[rs.getInt(1)]);
				        	 
				        	 
				        	 
				        //	Display.add(milkProducts);
				        	
				        	
				        	//System.out.println( "caption "+ product[rs.getInt(1)].getText());
				        	
				       product[rs.getInt(1)].addActionListener(new Operation(product[rs.getInt(1)],productDp,totalBill, stockqty,rs.getInt(1),rs.getString(3),rs.getFloat(5)));
				       
				    //  JButton buttonref,JPanel productDp ,JLabel totalBill ,JTextField stockqty, int pid , String pname , float price
				        	
				        	
				        	    
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
		
	
}
