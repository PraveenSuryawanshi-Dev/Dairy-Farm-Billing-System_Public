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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Praveen and Jigar
 *
 */
public class Search1 implements ActionListener{

	private static final Exception IOException = null;
	/**
	 * @param args
	 */
	private JTextField empName;
	private JFrame uItem;
	private	String driverName = "org.gjt.mm.mysql.Driver";
	private	String url = "jdbc:mysql://192.168.100.254/tydb156";
		
		private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
		
		private JTextField itemName, filepath, rate, qty, id;
		private JButton img;
		private JTextArea productDescription;
		private JPanel operation;
		private JFrame adminPage;
		private JComboBox selectCategory; 
		
		
	public Search1(JTextField name,JFrame uItem ,JTextField itemName,JTextField filepath,JButton img,JTextField rate,JTextField qty,JTextField id,JTextArea productDescription , JComboBox selectCategory )
	{
		empName=name;
		this.uItem=uItem;
		
		this.itemName=itemName;
		this.filepath=filepath;
		this.img=img;
		this.rate=rate;
		this.qty=qty;
		this.id=id;
		this.productDescription=productDescription;
		this.operation=operation;
		this.adminPage=adminPage;
		this.selectCategory=selectCategory;
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		uItem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		uItem.dispose();
		
		
		
		
	String name=	empName.getText();
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
				   
				   rs=stmt.executeQuery("select * from product");
				   
				
				   
				    
				   
				      JButton iname[]=new JButton[10000];
				     
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
						        	 
						        	 no=str.indexOf(name);
						        	 
						        	 System.out.println("database name"+str+"  empname   "+empName);
						        	 
						        	 
				        			   System.out.println("index : "+no + "name"+rs.getString(3) );
						        	 
						        	 if(count==(5*mul))
			        			        {
			        			        	a=20;
			        			        	b=b+110;
			        			        	mul++;
			        			        }
						        	
						        	   
				        			  
						        		  
						        	 
						        	 
						        	  if(no>=0)
				        		       {
						        		  
						        		    
						        		  iname[rs.getInt(1)]=new JButton(rs.getString(1)); 
						        		       
						        		  
	 					        		   
				        	  String path=rs.getString(4);
				        	  
				        	  iname[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  iname[rs.getInt(1)].setBounds(a,b, 100, 100);
				        	 
				        	 
				        	  panel.add(iname[rs.getInt(1)]);
				        	 
				        	 
				        	 
				        //	Display.add(milkProducts);
				        	
				        	
				        	//System.out.println(""+ );
				        	
				        	
				        	iname[rs.getInt(1)].addActionListener(new SetUpdateItem(itemName,rs.getString(3)
				        	,filepath,rs.getString(4),img,rate,rs.getFloat(5),qty,rs.getInt(6),id,rs.getInt(1),productDescription,rs.getString(10) ,rs.getString(2),selectCategory));
				        	
				        	
				        	    
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
