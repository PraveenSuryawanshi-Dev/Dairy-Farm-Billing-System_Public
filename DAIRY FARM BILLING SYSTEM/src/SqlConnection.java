/**
 * 
 */

/**
 * @author praveen 
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



 class SqlConnection {


	/**
	 * @param args
	 */
	 
	 static float amtBuffer=0;
	 JLabel rate;
	 
	
	      
private	String driverName = "org.gjt.mm.mysql.Driver";
private	String url = "jdbc:mysql://192.168.100.254/tydb156";
	
	private String userName = "ty156";
   private String password = "12345";
	private Connection con = null;
	
	
	
	
	private Statement stmt;
	private ResultSet rs;
	 private ResultSetMetaData rsmd;
	static int attempt=0;
	static int attempt1=0;
	 
	
	
	 
	
	void  AuthenticationUser( int box ,String uname,String upass,JLabel message,JFrame loginFrame) throws Exception
	 

	 {
		
		 
			try {
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   System.out.println("Opened database successfully.. box: "+box);	
						   
				      if(box==1)
				      {
				           
				    	  String query="select * from employee where e_username="+ "'"  +uname+ "'" +"and e_password="+"'"+upass+"' "+";";
						   
						   rs=stmt.executeQuery(query);
				   System.out.println("Opened database successfully.. :");	
				   
				  
			
					
				    String check="USER";
				    
					while(rs.next())
				      {
				          
				    	
				    
				   System.out.println("username in sql ="+rs.getString(3));
				   System.out.println("password in sql ="+rs.getString(4));
				       
				       boolean c=check.equals(rs.getString(2));
				      if(c==true)
				      {
				    	 
				    	  message.setText("       ");
				    	  
				    	  DisplayItem di = new DisplayItem(uname);
				    	  di.displayItem();
					 
					 loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 loginFrame.dispose();
					 
					 attempt=0;
					   
					  
				      }
				    else
				      {
				    	   if(attempt>=2)
				    	   {
				    		   System.exit(0);
				    	   }
				    	    
				    	   
				    	   else
				    	   {
				    		   attempt++;
				    	message.setText("USERNAME OR PASSWORD INVALID ATTEMPT :"+attempt);
				    	
				    	   } 
				      
				 
			    		  
			    	  } 
				      
		       }
					if(rs.next()==false)
					{
						  if(attempt>=2)
				    	   {
				    		   System.exit(0);
				    	   }
				    	    
				    	   
				    	   else
				    	   {
				    		   attempt++;
				    	message.setText("USERNAME OR PASSWORD INVALID ATTEMPT :"+attempt);
				    	
				    	   }
					}
				    	
				      }  
				 
				      
				      
				      
				      if(box==2)
				      {
				           
				    	  String query="select * from employee where e_username="+ "'"  +uname+ "'" +"and e_password="+"'"+upass+"' "+";";
						   
						   rs=stmt.executeQuery(query);
				   System.out.println("Opened database successfully.. :");	
				   
				  
			
					
				    String check="ADMIN";
				    
					while(rs.next())
				      {
				          
				    	
				    
				   System.out.println("username in sql ="+rs.getString(3));
				   System.out.println("password in sql ="+rs.getString(4));
				       
				       boolean c=check.equals(rs.getString(2));
				      if(c==true)
				      {
				    	 
				    	  message.setText("       ");
				    	 // AdminPage  d = new AdminPage ();
				    	  
				    	new   AdminPage(uname);
				    	 AdminPage.main(null);
				    	
				    	
					     
					 
					       loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							 loginFrame.dispose();
							 attempt1=0;
					   
					  
				      }
				    else
				      {
				    	   if(attempt1>=2)
				    	   {
				    		   System.exit(0);
				    	   }
				    	    
				    	   
				    	   else
				    	   {
				    		   attempt1++;
				    	message.setText("USERNAME OR PASSWORD INVALID ATTEMPT :"+attempt);
				    	
				    	   } 
				      
				 
			    		  
			    	  } 
				      
		       }
					if(rs.next()==false)
					{
						  if(attempt1>=2)
				    	   {
				    		   System.exit(0);
				    	   }
				    	    
				    	   
				    	   else
				    	   {
				    		   attempt1++;
				    	message.setText("USERNAME OR PASSWORD INVALID ATTEMPT :"+attempt1);
				    	
				    	   }
					}
				    	
				      }     
				      
				 
				    
			
			}
		catch ( Exception e ) 
		{
		        e.getMessage();
			System.out.println("USERNAME AND PASSWORD IS INCORRECT");	
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
	 
	 
	 
	 
	void activateDB()throws Exception
	{
			
				
				
				

				try {
					 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
				
					   stmt=con.createStatement();
					   
					   rs=stmt.executeQuery("select * from product ;");
					   
					
					     
					      while(rs.next())
					      {
					    
					    
					   System.out.println(rs.getString(3));
					   
					    	
					    
					      }
					    
					    
				System.out.println("Opened database successfully..");	
			
				}
			catch ( Exception e ) 
			{
			        e.getMessage();
				System.out.println("unable to open database ...");	
				 e.printStackTrace();
				 
				
		    }
				
				
	
		
	}
	

	
	
	
	void insertItem(String ptype,String pname,String filesrc,String description,String rs,String quantity,String pid,JLabel notification,String uname)throws Exception
	 
	{
	
		
		 
		
          int id=Integer.parseInt(pid);		
          int qnty=Integer.parseInt(quantity);	
          float mrp=Float.parseFloat(rs);
          
          System.out.println("in sql :product type :" + ptype +" product type ="+   ptype   +" product name="+  pname +" product path   ="+  filesrc +" desrription = "+  description  +" rs ="+mrp  +" quantity="+qnty +" product id="+pid);
          
         
			
			
			   
			   Calendar cal= Calendar.getInstance();
			      Timestamp ts= new Timestamp(cal.getTime().getTime());
			      
			     Timestamp time=ts;  
          
          
			try {
					 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
				
						System.out.println("Opened database successfully..");	
					   
                       PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  product values(?,?,?,?,?,?,?,?,?,?)");
						

                        
				
                       
                        ps.setInt(1,id);
                        ps.setString(2,ptype);
                        ps.setString(3, pname);
                        ps.setString(4, filesrc);
                        
                        ps.setFloat(5,mrp);
                        ps.setInt(6, qnty);
                        ps.setInt(7,qnty);
                        ps.setTimestamp(8,time);
                        ps.setString(9, uname);
                        ps.setString(10,description);
                       
					    
					   
					int up= ps.executeUpdate();
					   if(up>0)
					   {
						   notification.setText("ITEM INSERTED SUCCESSFULLY : "+pname +" ");
						   System.out.println(+up+" record inserted  in  database successfully..");	
					   }
					 con.close();
				
					   
		
					    
					    
			
			
				}  
			catch ( Exception e ) 
			{
				
				 notification.setText("UNSUCCESSFULL TO INSERT ITEM !! : "+pname);
			        e.getMessage();
			 System.out.println("unable to open database ...");	
			 System.out.println("unable to inserted record  in  database successfully..");	
				 e.printStackTrace();
				 
				
		    } 
		 
		
   }  
		
		
	
         
          
      	  
	
	
	/* void loadProductsicecream(JPanel icecreamProducts,JFrame Display , JPanel productDp , JLabel totalBill , JTextField stockqty)
	{
		try {
			Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
			   stmt=con.createStatement();
			   
			   rs=stmt.executeQuery("select * from product ;");
			
			
			   
			      JButton producticecream[]=new JButton[4000];
			      String prodcut1="ICE CREAMS";
			      int count=0;
			      int a=20,b=20;        	 
			        	int total=1;
			        	int mul=1;
			        		 while(true) 
			        		 {  
			        		 
			        			 for(int i=0;i<=4;i++)
			        				 
			        				 
					        	 {  
			        				 
			        				 rs.next();
			        				    
			        				 
			        			  
					        	 
					        	 if(count==(5*mul))
		        			        {
		        			        	a=20;
		        			        	b=b+110;
		        			        	mul++;
		        			        }
					        	 
					        	
					                      
					        	 
					        	 
					        	 boolean value=prodcut1.equals(rs.getString(2));

					        	   if(value==true)
					        	  {
					        		   System.out.println("in incecream section :value="+value);
					    			   
					        		   producticecream[rs.getInt(1)]=new JButton(rs.getString(1));
			        	  
			        	  String path=rs.getString(4);
			        	  
			        	  producticecream[rs.getInt(1)].setIcon(new ImageIcon(path));

			        	  producticecream[rs.getInt(1)].setBounds(a,b, 100, 100);
			        	 
			        	 icecreamProducts.add(producticecream[rs.getInt(1)]);
			        	 
			        	//Display.add(icecreamProducts);
			        	 
			        	 producticecream[rs.getInt(1)].addActionListener(new Operation(producticecream[rs.getInt(1)],productDp  , totalBill ,stockqty ,  rs.getInt(1) ,rs.getString(3) , rs.getFloat(5)));
				        	
			        	 
			        	 //scrolll
			        	 
			        	 
			        	
			        	 
			        	
			        	 
			        	 
			            // frame.setVisible(true);
			             
			             
			        	 //
			        	
                              a=a+110;
			        		  
			        		   
			        		   System.out.println(count);
				        		  count++;
					        	  }  
					        	   
					        	   else
					        	   {
					        			 System.out.println("in incecream section  rs :value="+rs.getString(3));
					        	   }
					       
			        				  
				    
					        	
				        		
			        		 }
			        			
			        	 }
			        	
			      
			        		 
			   
			
			    
			      
			    
			    
	//	System.out.println("Opened database successfully..");	
	
			        	 }
catch ( Exception e ) 
{
	        e.getMessage();
		System.out.println("unable to open database ...");	
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
		
	} */
	
	
	 void loadProductsicecream(JPanel icecreamProducts,JFrame Display , JPanel productDp , JLabel totalBill , JTextField stockqty )throws Exception
		{
			try {
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from product ;");
				
				
				   
				      JButton producticecream[]=new JButton[50000];
				      String prodcut1="ICE CREAMS";
				   
				        		 while(true) 
				        		 {  
				        		 
				        			 for(int i=0;i<=24;i++)
				        				 
				        				 
						        	 {  
				        				 
				        				 rs.next();
				        				    
				        				 
				        		
						        	 
						        	 boolean value=prodcut1.equals(rs.getString(2));

						        	   if(value==true)
						        	  {
						        		   System.out.println("in incecream section :value="+value);
						    			   
						        		   producticecream[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  producticecream[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  producticecream[rs.getInt(1)].setPreferredSize(new Dimension(100,100));
				        	 
				        	 icecreamProducts.add(producticecream[rs.getInt(1)]);
				        	 
				        	 producticecream[rs.getInt(1)].setToolTipText(""+rs.getString(3));
				        
				        	 producticecream[rs.getInt(1)].addActionListener(new Operation(producticecream[rs.getInt(1)],productDp  , totalBill ,stockqty ,  rs.getInt(1) ,rs.getString(3) , rs.getFloat(5)));
					        	
				        	
				        
						        	  }  
						        	   
						        	   else
						        	   {
						        			 System.out.println("in incecream section  rs :value="+rs.getString(3));
						        	   }
						       
				        				  
					    
						        	
					        		
				        		 }
				        			
				        	 }
				        	
				      
				        		 
				   
				
				    
				      
				    
				    
		//	System.out.println("Opened database successfully..");	
		
				        	 }
	catch ( Exception e ) 
	{
		        e.getMessage();
			System.out.println("unable to open database ...");	
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
	
	
	
	
	
	/* void loadProductsmilk(JPanel milkProducts,JFrame Display,JPanel productDp ,JLabel totalBill, JTextField stockqty )
	 {
		 try {
			
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from product ;");
				
				
				   
				      JButton productmilk[]=new JButton[4000];
				      String prodcut1="MILK PRODUCTS";
				      int count=0;
				      int a=20,b=20;        	 
				        	int total=1;
				        	int mul=1;
				        		// while(total!=8) 
				        	       while(true)
				        		 {  
				        		 
				        			 for(int i=0;i<=4;i++)
						        	 {  rs.next();
				        				
				        			  
						        	 
						        	 if(count==(5*mul))
			        			        {
			        			        	a=20;
			        			        	b=b+110;
			        			        	mul++;
			        			        }
						        	 
						        	
						                      
						        	 
						        	 
						        	 boolean value=prodcut1.equals(rs.getString(2));

						        	   if(value==true)
						        	  {
						        		   System.out.println("in MILK PRODUCTS section :value="+value);
						    			   
						        		   productmilk[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  productmilk[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  productmilk[rs.getInt(1)].setBounds(a,b, 100, 100);
				        	 
				        	 
				        	 milkProducts.add(productmilk[rs.getInt(1)]);
				        	 
				        	 
				        	 
				        //	Display.add(milkProducts);
				        	
				        	
				        	System.out.println( "caption "+ productmilk[rs.getInt(1)].getText());
				        	
				        	productmilk[rs.getInt(1)].addActionListener(new Operation(productmilk[rs.getInt(1)],productDp,totalBill , stockqty , rs.getInt(1) ,rs.getString(3) , rs.getFloat(5)));
				        //	productmilk[rs.getInt(1)].addMouseMotionListener(new Operation(productmilk[rs.getInt(1)],rs.getString(3)));
				        	
				        	    
	                              a=a+110;
				        		  
				        		   
				        		   System.out.println(count);
					        		  count++;
						        	  }  
						        	   
						        	   else
						        	   {
						        		   
						        	   }
						       
						        	 
					    
						        	
					        		
				        		 }
				        			 
				        			
				        	 }
				        	
				      
				        		
				   
				
				    
				      
				    
				    
		//	System.out.println("Opened database successfully..");	
		
				        	 }
	catch ( Exception e ) 
	{
		        e.getMessage();
			System.out.println("unable to open database ...");	
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
		 
	 }*/
	 
	 
	 void loadProductsmilk(JPanel milkProducts,JFrame Display , JPanel productDp , JLabel totalBill , JTextField stockqty)throws Exception
	 {
			try {
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from product ;");
				
				
				   
				      JButton productmilk[]=new JButton[50000];
				      String prodcut1="MILK PRODUCTS";
				   
				        		 while(true) 
				        		 {  
				        		 
				        			 for(int i=0;i<=24;i++)
				        				 
				        				 
						        	 {  
				        				 
				        				 rs.next();
				        				    
				        				 
				        		
						        	 
						        	 boolean value=prodcut1.equals(rs.getString(2));

						        	   if(value==true)
						        	  {
						        		   System.out.println("in milk section :value="+value);
						    			   
						        		   productmilk[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  productmilk[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  productmilk[rs.getInt(1)].setPreferredSize(new Dimension(100,100));
				        	 
				        	  milkProducts.add(productmilk[rs.getInt(1)]);
				        	 
				        	  productmilk[rs.getInt(1)].setToolTipText(""+rs.getString(3));
				        	  
				        	  productmilk[rs.getInt(1)].addActionListener(new Operation(productmilk[rs.getInt(1)],productDp  , totalBill ,stockqty ,  rs.getInt(1) ,rs.getString(3) , rs.getFloat(5) ));
					        	
				        	
				        
						        	  }  
						        	   
						        	   else
						        	   {
						        			 System.out.println("in milk section  rs :value="+rs.getString(3));
						        	   }
						       
				        				  
					    
						        	
					        		
				        		 }
				        			
				        	 }
				        	
				      
				        		 
				   
				
				    
				      
				    
				    
		//	System.out.println("Opened database successfully..");	
		
				        	 }
	catch ( Exception e ) 
	{
		        e.getMessage();
			System.out.println("unable to open database ...");	
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
	
	
	
	 
	 

	/* void loadProductother(JPanel otherProducts,JFrame Display , JPanel productDp , JLabel totalBill , JTextField stockqty)
	 {
		 try {
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from product ;");
				
				
				   
				      JButton productother[]=new JButton[4000];
				      String prodcut1="OTHER PRODUCTS";
				      int count=0;
				      int a=20,b=20;        	 
				        	int total=1;
				        	int mul=1;
				        		 while(true) 
				        		 {  
				        		 
				        			 for(int i=0;i<=4;i++)
						        	 {  rs.next();
				        				
				        			  
						        	 
						        	 if(count==(5*mul))
			        			        {
			        			        	a=20;
			        			        	b=b+110;
			        			        	mul++;
			        			        }
						        	 
						        	
						                      
						        	 
						        	 
						        	 boolean value=prodcut1.equals(rs.getString(2));

						        	   if(value==true)
						        	  {
						        		   System.out.println("in MILK PRODUCTS section :value="+value);
						    			   
						        productother[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  productother[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  productother[rs.getInt(1)].setBounds(a,b, 100, 100);
				        	 
				        	 otherProducts.add(productother[rs.getInt(1)]);
				        	 
				  //      Display.add(otherProducts);
				        	 System.out.println("in MILK PRODUCTS section :ID="+rs.getInt(1));
				        	 
				        	 productother[rs.getInt(1)].addActionListener(new Operation(productother[rs.getInt(1)],productDp,totalBill, stockqty , rs.getInt(1) ,rs.getString(3) , rs.getFloat(5)));
				        	    
	                              a=a+110;
				        		  
				        		   
				        		   System.out.println(count);
					        		  count++;
						        	  }  
						        	   
						        	   else
						        	   {
						        		   
						        	   }
						       
						        	 
					    
						        	
					        		
				        		 }
				        			 
				        			
				        	 }
				        	
				      


				
				    
				      
				    
				    


		
				        	 }
	catch ( Exception e ) 
	{                    
		         
	          	        e.getMessage();
			System.out.println("unable to open database ...");	
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

*/

	 void loadProductother(JPanel otherProducts,JFrame Display , JPanel productDp , JLabel totalBill , JTextField stockqty )throws Exception
	
	 {
		 try {
				Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
			
				   stmt=con.createStatement();
				   
				   rs=stmt.executeQuery("select * from product ;");
				
				
				   
				      JButton otherbutton[]=new JButton[50000];
				      String prodcut1="OTHER PRODUCTS";
				   
				        		 while(true) 
				        		 {  
				        		 
				        			 for(int i=0;i<=24;i++)
				        				 
				        				 
						        	 {  
				        				 
				        				 rs.next();
				        				    
				        				 
				        		
						        	 
						        	 boolean value=prodcut1.equals(rs.getString(2));

						        	   if(value==true)
						        	  {
						        		   System.out.println("in other section :value="+value);
						    			   
						        		   otherbutton[rs.getInt(1)]=new JButton(rs.getString(1));
				        	  
				        	  String path=rs.getString(4);
				        	  
				        	  otherbutton[rs.getInt(1)].setIcon(new ImageIcon(path));

				        	  otherbutton[rs.getInt(1)].setPreferredSize(new Dimension(100,100));
				        	 
				        	  otherProducts.add(otherbutton[rs.getInt(1)]);
				        	  
				        	  otherbutton[rs.getInt(1)].setToolTipText(""+rs.getString(3));
				        
				        	  otherbutton[rs.getInt(1)].addActionListener(new Operation(otherbutton[rs.getInt(1)],productDp  , totalBill ,stockqty ,  rs.getInt(1) ,rs.getString(3) , rs.getFloat(5) ));
					        	
				        	
				        
						        	  }  
						        	   
						        	   else
						        	   {
						        			 System.out.println("in milk section  rs :value="+rs.getString(3));
						        	   }
						       
				        				  
					    
						        	
					        		
				        		 }
				        			
				        	 }
				        	
				      
				        		 
				   
				
				    
				      
				    
				    
		//	System.out.println("Opened database successfully..");	
		
				        	 }
	catch ( Exception e ) 
	{
		        e.getMessage();
			System.out.println("unable to open database ...");	
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
	
	
	 
	 

void deactivateDB()throws Exception
	{
		try {
			con.close();
			System.out.println("closed database successfully...");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to close database ...");	
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args)throws NullPointerException
	
	{
		SqlConnection sql=new SqlConnection();
		//sql.AuthenticationUser("aniket","pass123");
	// sql.activateDB();
		//sql.update();	 
		 // sql.deactivateDB()
	//sql.deleteId(1);
		 
	//sql.deleteName("dahi");
		 
	
	}

}
