import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class BillBuffer implements ActionListener {

	/**
	 * @param args
	 */
	int bid;
	static private JLabel itemCount ,count;
  static	LinkedList itemList= new LinkedList();
  String uname;
  Savepoint sp1;
  
  int flag=0;
  private	String driverName = "org.gjt.mm.mysql.Driver";
  private	String url = "jdbc:mysql://192.168.100.254/tydb156";
  	
  	private String userName = "ty156";
     private String password = "12345";
  	private Connection con = null;
  	
  	private Statement stmt;
  	private ResultSet rs;
   int num=0;
   float custamt=0;
   String cname;
   float total,totalall, cbal;
   
  
  public BillBuffer(   )
  {
	  
	  
	   
  }
  
  public BillBuffer( JLabel count  )
  {
	  
	  this.count=count;
	   
  }
  

  
   public BillBuffer(JLabel itemCount , int  count)
   {
	   this.itemCount=itemCount;
	  
	   
   }
	
public void   count()
   {

	  itemCount.setText(""+itemList.size());
	  
	  
   }
	

public  BillBuffer(String uname,int j, String k)
{
	this.uname=uname;
	this.num=j;
	 this.cname=k;
	 
	 System.out.println("username ="+uname);
	 System.out.println("num ="+num);
	 System.out.println("customer name ="+cname);
	

}
	public void billAdd(int pid)
	{
		

		
		String   id=Integer.toString(pid);
		
		 itemList.add(id);
		 
		 count();
		 // Iterator e=itemList.iterator();
		  
		 // System.out.println( "total item"+itemList.size());
		  
		  
//count(itemCount);		
	
		
		/* System.out.println("-----in add-------");
		  
		   while(e.hasNext())
		   {
			   System.out.println( e.next());
		   }
		 */
		  
		   
		
		
	}
	
	public void billSub(int pid)
	{
		
		// System.out.println("-----in remove-------");
 
		 String   id=Integer.toString(pid);
		 
		 
		 
		itemList.remove(id);
		 
	     count();
	     
	//	 System.out.println( "total item"+itemList.size());
		 
		// Iterator e1=itemList.iterator();
		/* while(e1.hasNext())
		   {
			   System.out.println( e1.next());
		   }*/
		      
	
	     
	     
		    
		
	}
	
	public void distroy()
	{ 
		count.setText("0");
		 
		new Operation(0,0,0);
		
		Iterator e1=itemList.iterator();
		  while(e1.hasNext())
		   {
			    itemList.remove();
		   }
		count();
	}
	
	
	 public void payMember(String uname,int num, String cname)
	  {
		  

		
			
		
			if(num==2)
			{
				
				try{
					
					 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
					
						Iterator ec=itemList.iterator();
						  while(ec.hasNext())
						   {
							  
							  System.out.println("-----------in bill");
							  
							  int id=Integer.parseInt((String) ec.next());
							  // int id=(Integer) ec.next();
							   //System.out.println("ans   ="+id);
							  
		String qt="select p_price from product where p_id="+id;
		
		  System.out.println("quer    ="+qt);
							  
				Statement st=con.createStatement();
					           ResultSet s=st.executeQuery(qt);
					           while(s.next())
					            {
					        	     total=s.getFloat(1);
					           	 totalall=totalall+total;
					            	
					           }
					        
						   }
						  
						  
						 System.out.println("Total amt is "+totalall);
						 
						
					
			//----------------1				
			TreeSet t=new TreeSet(itemList);
			 Iterator e1=t.iterator();
			System.out.println(t);
			
			 while(e1.hasNext())
			   {
				 int cnt=0;
				 
				int op=Integer.parseInt((String) e1.next());
				
				Iterator e2=itemList.iterator();
				
				 while(e2.hasNext())
				   {
					 	int on=Integer.parseInt((String) e2.next());
					 	if(op==on)
					 	{
					 		cnt++;
					 		
					   	
					 	}
					 	else
					 	{
					 		
					 	}
					 	
				   }
				   
				       try{
				    	   
				    	   
				    	 //validate customer
			    		   Statement sc=con.createStatement();
			    		   
			    		     String q1="select cust_amt from customer where cust_username="+"'"+cname+"'";
			    		    ResultSet r1=  sc.executeQuery(q1);
			    		  
			    		    
			    		    
			    		    System.out.println("CUSTOMER query ="+q1);
		    		    	
			    		    
			    		    while(!r1.next()) 
			    		       {
			    		    
			    		    	   cbal=r1.getFloat(1);
			    		    	   
			    		    		System.out.println("CUSTOMER AMT ="+cbal);
			    		    	
			    		    	   
			    		       }
			    		    	   
			    		    	   
			    		    	 System.out.println("CURRENT BALANCE ="+cbal +" TOTAL BALANCE ="+totalall);
			    		    	 
			    		    	   if(cbal<=0)
			    		    	   {
			    		    	
			    		    	
			    		   
			  	   JOptionPane.showMessageDialog(null,"NO BALANCE ","WARNING",JOptionPane.INFORMATION_MESSAGE);			    		    		   
			    		    	      
			    		    		    break;
			    		    		   
			    		    	   }
			    		    	
				    		    
			    		       
			    		       if(cbal<totalall)
			    		       {
			    JOptionPane.showMessageDialog(null,"BALANCE INSUFFICIENT","WARNING",JOptionPane.INFORMATION_MESSAGE);			    				    		    	   
			    		             break;
			    		       }
			    		      
			    		   
			    		   
			    		   
			    		   //
	                         
				    	   
						   String query2="select p_price,p_final_stock,p_name from product where p_id="+"'"+op+"' "+";";
						       
						   Statement stmt2=con.createStatement();
						   
							  ResultSet rs2=stmt2.executeQuery(query2);
							  
							    rs2.next();
					
							    System.out.printf(" price="+rs2.getInt(1));
							    
							     int stock=rs2.getInt(2);
							     
							     
							     String pname=rs2.getString(3);
							      
							       if(stock>=1)
							       {
							    	  
							    	    flag++;
							    	   System.out.println(" pname  counter of product :"+"pname "+""+cnt);
							    	   if(stock>=cnt)
							    		   
							           {
							    		  
							    		   
							    		   
							    		   
							    		   //bill
							    		   PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  bill (cust_type,e_username) values (?,?)");
										   
									        ps.setString(1,cname);
									        ps.setString(2,uname);
									               		   
											int up= ps.executeUpdate();
											   if(up>0)
											   {
												   
												   System.out.println(+up+" record inserted  in  database successfully..");	
											   }
							    		   
											   
											  //update final stock
											   
											 int  stockr=stock-cnt;
											 
											   PreparedStatement pss=(PreparedStatement) con.prepareStatement("UPDATE product  SET p_final_stock=? where p_id=? ");	
							                     
							                     pss.setInt(1, stockr);
							                     pss.setInt(2, op);
							                     int n=  pss.executeUpdate();
							                     if(n>0)
							                     {
							                   	  System.out.println("PRODUCT DEDUCTED");
							                     }
											   
											   
											   
											   
											   
											 //bill_cust
											   
											   Statement stmt1=con.createStatement();
											    
											    String query1="select count(*) from bill";
												   
												    
											    
											      ResultSet rs1=stmt1.executeQuery(query1);
											       
											   
												  
												    rs1.next();
												    
												     bid=rs1.getInt(1)+16;
											   
											//   ResultSet rs1=stmt1.executeQuery(query1);
											    
											   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("INSERT INTO  bill_cust( bill_no,p_id,qty,unit_price,total_amt,period) values (?,?,?,?,?,?)");
												

										        
												
										       
										        ps1.setInt(1,rs1.getInt(1)+16);
										        ps1.setInt(2,op);
										        ps1.setInt(3,cnt);
										        ps1.setFloat(4,rs2.getFloat(1));
										                
										         total=rs2.getFloat(1)*cnt;
										         
										          
										        
										      //  total=total+total1;
										        
										        ps1.setFloat(5,total);
										        
										        Calendar cal= Calendar.getInstance();
										      Timestamp ts= new Timestamp(cal.getTime().getTime());
										      
										      ps1.setTimestamp(6,ts);
										       
										      
											   
												int up1= ps1.executeUpdate();
												   if(up1>0)
												   {
													   System.out.println("total purschase is : "+total);
													 
													   System.out.println(+up1+" record inserted  in bill_cust database successfully..");
													   
													   //new BillReceipt(bid ,"NA", total,uname,0);
													   
													   System.out.println("----------------------<<<<bill GENERATED NW>>>>");
												   }
											   
												   
												 
							    		   
							    	   }
							    	   else
							    	   {
							    		   
							    		  /* try
								    	   {
								    	  con.rollback(sp1);
								    	   }
								    	   catch(Exception e33)
								    	   {
								    		   System.out.println("in catch2 "+e33);
								    		   
								    	   }*/
							    		    
							    		   int  r=cnt-stock;
							    		   JOptionPane.showMessageDialog(null,"WARNING : STOCK LESS - REMOVE :"+pname+" "+r+"","error",JOptionPane.INFORMATION_MESSAGE);
							    		
							    		    flag=0;
							    		    break;
							    	   
							    	   }
							    	   
							       
							       
							       }
							       
							       else
							       {
							    	   /*try
							    	   {
							    	  con.rollback(sp1);
							    	   }
							    	   catch(Exception e33)
							    	   {
							    		   System.out.println("in catch1 "+e33);
							    		   
							    	   }*/
							    	   JOptionPane.showMessageDialog(null,"WARNING : STOCK OVER :"+pname,"error",JOptionPane.INFORMATION_MESSAGE);
									      
							          flag=0;
							    	    break;
							       
							       }
							       
							       
							       
						
				       }
				       catch(Exception e7)
				       {     
				    	   try
				    	   {
				    	  con.rollback(sp1);
				    	   }
				    	   catch(Exception f)
				    	   {
				    		   System.out.println(f);
				    		   
				    	   }
				    	   System.out.println(e7);
				       }
					   
				 
			   }
			

			}
				catch(Exception e5)
				{
					 System.out.println(e5);
				}
				
				
				
				finally
				{
					
					 
			   
					
					 Iterator e4=itemList.iterator();
					 System.out.println("------------------------------2 DISPLAYING ALL PRODUCTs ");
					 while(e4.hasNext())
					   {
						   System.out.println( e4.next());
					   }
					 
				
				}
				
		/*	try {
					con.commit();
					con.releaseSavepoint(sp1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			*/
				
			 }
				
				 if(flag>0)
				 {
					//bill receipt
					  
					   new BillReceipt(bid,cname,total,uname,12);
				 }
				
			}
				
	 
	 
	 
	 
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		
			 System.out.println("_+_+_+_+++++++++++++++++++++++++__+_++");

			if(num==1)
			{
			
			try{
				
				 Class.forName(driverName);
				   con = DriverManager.getConnection(url,userName,password);
				 
				
		//----------------1				
		TreeSet t=new TreeSet(itemList);
		 Iterator e1=t.iterator();
		System.out.println(t);
		
		 while(e1.hasNext())
		   {
			 int cnt=0;
			 
			int op=Integer.parseInt((String) e1.next());
			
			Iterator e2=itemList.iterator();
			
			 while(e2.hasNext())
			   {
				 	int on=Integer.parseInt((String) e2.next());
				 	if(op==on)
				 	{
				 		cnt++;
				 		
				   	
				 	}
				 	else
				 	{
				 		
				 	}
				 	
			   }
			   
			       try{
			    	   
			    	   

                         
			    	   
					   String query2="select p_price,p_final_stock,p_name from product where p_id="+"'"+op+"' "+";";
					       
					   Statement stmt2=con.createStatement();
					   
						  ResultSet rs2=stmt2.executeQuery(query2);
						  
						    rs2.next();
				
						    System.out.printf(" price="+rs2.getInt(1));
						    
						     int stock=rs2.getInt(2);
						     
						     
						     String pname=rs2.getString(3);
						      
						       if(stock>=1)
						       {
						    	  /* con.setAutoCommit(false);
						    	   
						    	    try
						    	     {
						    	   sp1=con.setSavepoint("sp1");
						    	     }
						    	     catch(Exception rv)
						    	     {
						    	    	 System.out.println(rv);
						    	     }
						    	     */
						    	    flag++;
						    	   System.out.println(" pname  counter of product :"+"pname "+""+cnt);
						    	   if(stock>=cnt)
						    		   
						           {
						    		  
						    		   
						    		   
						    		   //bill
						    		   PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  bill (cust_type,e_username) values (?,?)");
									   
								        ps.setString(1,"NR");
								        ps.setString(2,uname);
								               		   
										int up= ps.executeUpdate();
										   if(up>0)
										   {
											   
											   System.out.println(+up+" record inserted  in  database successfully..");	
										   }
						    		   
										   
										  //update final stock
										   
										 int  stockr=stock-cnt;
										 
										   PreparedStatement pss=(PreparedStatement) con.prepareStatement("UPDATE product  SET p_final_stock=? where p_id=? ");	
						                     
						                     pss.setInt(1, stockr);
						                     pss.setInt(2, op);
						                     int n=  pss.executeUpdate();
						                     if(n>0)
						                     {
						                   	  System.out.println("PRODUCT DEDUCTED");
						                     }
										   
										   
										   
										   
										   
										 //bill_cust
										   
										   Statement stmt1=con.createStatement();
										    
										    String query1="select count(*) from bill";
											   
											    
										    
										      ResultSet rs1=stmt1.executeQuery(query1);
										       
										   
											  
											    rs1.next();
											    
											     bid=rs1.getInt(1)+16;
										   
										//   ResultSet rs1=stmt1.executeQuery(query1);
										    
										   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("INSERT INTO  bill_cust( bill_no,p_id,qty,unit_price,total_amt,period) values (?,?,?,?,?,?)");
											

									        
											
									       
									        ps1.setInt(1,rs1.getInt(1)+16);
									        ps1.setInt(2,op);
									        ps1.setInt(3,cnt);
									        ps1.setFloat(4,rs2.getFloat(1));
									                
									         total=rs2.getFloat(1)*cnt;
									         
									        
									        
									      //  total=total+total1;
									        
									        ps1.setFloat(5,total);
									        
									        Calendar cal= Calendar.getInstance();
									      Timestamp ts= new Timestamp(cal.getTime().getTime());
									      
									      ps1.setTimestamp(6,ts);
									       
									      
										   
											int up1= ps1.executeUpdate();
											   if(up1>0)
											   {
												   System.out.println("total purschase is : "+total);
												 
												   System.out.println(+up1+" record inserted  in bill_cust database successfully..");
												   
												   //new BillReceipt(bid ,"NA", total,uname,0);
												   
												   System.out.println("----------------------<<<<bill GENERATED NW>>>>");
											   }
										   
											   
											 
						    		   
						    	   }
						    	   else
						    	   {
						    		   
						    		  /* try
							    	   {
							    	  con.rollback(sp1);
							    	   }
							    	   catch(Exception e33)
							    	   {
							    		   System.out.println("in catch2 "+e33);
							    		   
							    	   }*/
						    		    
						    		   int  r=cnt-stock;
						    		   JOptionPane.showMessageDialog(null,"WARNING : STOCK LESS - REMOVE :"+pname+" "+r+"","error",JOptionPane.INFORMATION_MESSAGE);
						    		
						    		    flag=0;
						    		    break;
						    	   
						    	   }
						    	   
						       
						       
						       }
						       
						       else
						       {
						    	   /*try
						    	   {
						    	  con.rollback(sp1);
						    	   }
						    	   catch(Exception e33)
						    	   {
						    		   System.out.println("in catch1 "+e33);
						    		   
						    	   }*/
						    	   JOptionPane.showMessageDialog(null,"WARNING : STOCK OVER :"+pname,"error",JOptionPane.INFORMATION_MESSAGE);
								      
						          flag=0;
						    	    break;
						       
						       }
						       
						       
						       
					
			       }
			       catch(Exception e7)
			       {     
			    	   try
			    	   {
			    	  con.rollback(sp1);
			    	   }
			    	   catch(Exception f)
			    	   {
			    		   System.out.println(f);
			    		   
			    	   }
			    	   System.out.println(e7);
			       }
				   
			 
		   }
		

		}
			catch(Exception e5)
			{
				 System.out.println(e5);
			}
			
			
			
			finally
			{
				
				 
		   
				
				 Iterator e4=itemList.iterator();
				 System.out.println("------------------------------2 DISPLAYING ALL PRODUCTs ");
				 while(e4.hasNext())
				   {
					   System.out.println( e4.next());
				   }
				 
			
			}
			
	/*	try {
				con.commit();
				con.releaseSavepoint(sp1);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		*/
			
		 }
			
			 if(flag>0)
			 {
				//bill receipt
				  
				   new BillReceipt(bid ,"NA",total,uname,0);
			 }
			
		}
			
		
			
		
			
			
		
			
			 
		
		
		

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         
			
		//	new BillBuffer("p",2,"o");
			
		}

		

	}
	
	
	
	
	
/*	
	
  public void payMember(String uname,int num, String cname)
  {
	  

		
		float total=0;
	
		if(num==2)
		{
			
			
			System.out.println("in  member SCOP uname ="+uname);
			
			 System.out.println("username ="+uname);
			 System.out.println("num ="+num);
			 System.out.println("customer name ="+cname);
		
		try{
			
			
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
				System.out.println("Opened database successfully..");	
			   
	       PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  bill (cust_type,e_username) values (?,?)");
				

	        
		
	       
	       
	        ps.setString(1,cname);
	        ps.setString(2,uname);
	                
	          
	         
	         
			    
			   
			
			
			
			
	TreeSet t=new TreeSet(itemList);
	 Iterator e1=t.iterator();
	System.out.println(t);
	
	 while(e1.hasNext())
	   {
		 int cnt=0;
		 
		int op=Integer.parseInt((String) e1.next());
		
		Iterator e2=itemList.iterator();
		
		 while(e2.hasNext())
		   {
			 	int on=Integer.parseInt((String) e2.next());
			 	if(op==on)
			 	{
			 		cnt++;
			 		
			   	
			 	}
			 	else
			 	{
			 		
			 	}
			 	
		   }
		 System.out.println("product id="+op+"   quantty="+cnt);
		   
		       try{
		    	   
		    	   
		    Statement stmt1=con.createStatement();
		    
		    String query1="select count(*) from bill";
			   
			  ResultSet rs1=stmt1.executeQuery(query1);
			  
			    rs1.next();
			    
			    bid=rs1.getInt(1)+16; 
			    
			   System.out.printf(" bid="+bid);
			   
			   
			   String query2="select p_price,p_final_stock,p_name from product where p_id="+"'"+op+"' "+";";
			       
			   Statement stmt2=con.createStatement();
			   
				  ResultSet rs2=stmt2.executeQuery(query2);
				  
				    rs2.next();
		
				    System.out.printf(" price="+rs2.getFloat(1));
				    
				        				    
				     int stock=rs2.getInt(2);
				     String pname=rs2.getString(3);
				       if(stock<=0)
				       {
				    	   JOptionPane.showMessageDialog(null,"WARNING : STOCK OVER :"+pname,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
				     
				     System.out.println("CURRENT STOCK ="+stock);
				     
				      int stockr=stock;
				     stock=stock-cnt;
				     
				     if(stock<0)
				       {
				    	   JOptionPane.showMessageDialog(null,"WARNING : REMAINGING STOCK :"+stockr+" NAME : "+pname,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
				      
				     
				     System.out.println("stock affter deduction="+stock);
				     
				     PreparedStatement pss=(PreparedStatement) con.prepareStatement("UPDATE product  SET p_final_stock=? where p_id=? ");	
                   
                   pss.setInt(1, stock);
                   pss.setInt(2, op);
               
          
				     
				    
			   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("INSERT INTO  bill_cust( bill_no,p_id,qty,unit_price,total_amt,period) values (?,?,?,?,?,?)");
				

		        
				
		       
		        ps1.setInt(1,rs1.getInt(1)+16);
		        ps1.setInt(2,op);
		        ps1.setInt(3,cnt);
		        ps1.setFloat(4,rs2.getFloat(1));
		                
		        float total1=rs2.getFloat(1)*cnt;
		          total=total+total1;
		          
		          
		        
		        ps1.setFloat(5,total);
		        
		        Calendar cal= Calendar.getInstance();
		      Timestamp ts= new Timestamp(cal.getTime().getTime());
		      
		      ps1.setTimestamp(6,ts);
		      
		       
		       
		    //  Connection conc= DriverManager.getConnection(url,userName,password);
		        
		           Statement stmtc=con.createStatement();
		              
		             ResultSet rsc=  stmtc.executeQuery("select cust_amt from customer where cust_username="+"'"+cname+"'");
		             
		                   while(rsc.next())
		                   {
		              
		              custamt=rsc.getFloat(1);
		                   }
		              
		              System.out.println(" custome aamt  --+="+custamt);
		               
		                System.out.println("current amt of custmer is :"+custamt);
		               
		               if(custamt<=0)
				       {
				    	   JOptionPane.showMessageDialog(null,"WARNING : NO BALANCE REFILL  :"+custamt,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
		               
		               
		               custamt=custamt-total;
		               
		               System.out.println("after deduction  amt of custmer is :"+custamt);
		               
		               if(custamt<=0)
		               {
				    	   JOptionPane.showMessageDialog(null,"WARNING : INSUFFICIENT BALANCE REFILL  :"+custamt,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
		               
		               
		              if(custamt>0) 
		              {  
		            	     try
		            	     
		            	     {
		            	  PreparedStatement pscu=con.prepareStatement("UPDATE customer  SET cust_amt=? where cust_username=? ");	
	                       	
	                        pscu.setFloat(1,custamt);
	                        pscu.setString(2,cname);
	                        
	                             int n=pscu.executeUpdate();
	                               if(n>0)
	                               {
	                            	   System.out.println("CUSTOME BALANCE UPDATED SUCCESSFULLY");
	                            	   
	                               }
	                               
		            	     }
		            	     catch(Exception e3)
		            	     {
		            	    	 System.out.println(e3);
		            	     }
	                               
		            	  
		            	  int up= ps.executeUpdate();
		   			   if(up>0)
		   			   {
		   				   
		   				   System.out.println(+up+" record inserted  in  database successfully..");	
		   			   }
		            	  
		            	  
		            	  
		            	  
		            	  int nc=  pss.executeUpdate();
	                      if(nc>0)
	                      {
	                    	  System.out.println("PRODUCT DEDUCTED");
	                      }
				   
			           	int up1= ps1.executeUpdate();
				    if(up1>0)
				   {
					    
					   
					   PreparedStatement psc=(PreparedStatement) con.prepareStatement("INSERT INTO  customer (cust_amt,cust_username) values (?,?)");
						

				        
						
				       
				       
				        psc.setFloat(1,custamt);
		                psc.setString(2,cname);			   
					   System.out.println("total purschase is : "+total);
					   
					 
					   System.out.println(+up1+" record inserted  in bill_cust database successfully..");
					   
					//   new BillReceipt(bid ,cname, total,uname,custamt);
					   
				   }
				
		       }
		       }
		       catch(Exception e7)
		       {
		    	 
		    	   
		    	   System.out.println(e7);
		       }
			   
		 
	   }
	

	}
		catch(Exception e5)
		{
			 System.out.println(e5);
		}
		
		
		
		finally
		{
			new BillReceipt(bid ,cname, total,uname,custamt);
			   
			System.out.println("==========================");
			
			System.out.println("BID = "+bid +" CNAME ="+cname +"total="+total+"uname"+uname+"custamt="+custamt);
			
			 Iterator e4=itemList.iterator();
			 System.out.println("------------------------------2 DISPLAYING ALL PRODUCTs ");
			 while(e4.hasNext())
			   {
				   System.out.println( e4.next());
			   }
			 
			
		} 
		
		
		
	 }	
	  
  }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		float total=0;
		
		

		if(num==1)
		{
		
		try{
			
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
			   PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO  bill (cust_type,e_username) values (?,?)");
			   
	        ps.setString(1,"NR");
	        ps.setString(2,uname);
	               		   
			int up= ps.executeUpdate();
			   if(up>0)
			   {
				   
				   System.out.println(+up+" record inserted  in  database successfully..");	
			   }
			
	//----------------1				
	TreeSet t=new TreeSet(itemList);
	 Iterator e1=t.iterator();
	System.out.println(t);
	
	 while(e1.hasNext())
	   {
		 int cnt=0;
		 
		int op=Integer.parseInt((String) e1.next());
		
		Iterator e2=itemList.iterator();
		
		 while(e2.hasNext())
		   {
			 	int on=Integer.parseInt((String) e2.next());
			 	if(op==on)
			 	{
			 		cnt++;
			 		
			   	
			 	}
			 	else
			 	{
			 		
			 	}
			 	
		   }
		   
		       try{
		    	   
		    	   
		    Statement stmt1=con.createStatement();
		    
		    String query1="select count(*) from bill";
			   
			  ResultSet rs1=stmt1.executeQuery(query1);
			  
			    rs1.next();
			    
			     bid=rs1.getInt(1)+16;
			
			   
			   String query2="select p_price,p_final_stock,p_name from product where p_id="+"'"+op+"' "+";";
			       
			   Statement stmt2=con.createStatement();
			   
				  ResultSet rs2=stmt2.executeQuery(query2);
				  
				    rs2.next();
		
				    System.out.printf(" price="+rs2.getInt(1));
				    
				     int stock=rs2.getInt(2);
				     
				     
				     String pname=rs2.getString(3);
				     
				       if(stock<=0)
				       {
				    	   JOptionPane.showMessageDialog(null,"WARNING : STOCK OVER :"+pname,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
				     
				     System.out.println("CURRENT STOCK ="+stock);
				     
				      int stockr=stock;
				     stockr=stock-cnt;
				     
				     if(stock<0)
				       {
				    	   JOptionPane.showMessageDialog(null,"WARNING : REMAINGING STOCK :"+stockr+" NAME : "+pname,"error",JOptionPane.INFORMATION_MESSAGE);
				       }
				     
				     System.out.println("CURRENT STOCK ="+stockr);
				     
				     stock=stock-cnt;
				     
				     System.out.println("stock affter deduction="+stock);
				     
				     PreparedStatement pss=(PreparedStatement) con.prepareStatement("UPDATE product  SET p_final_stock=? where p_id=? ");	
                     
                     pss.setInt(1, stock);
                     pss.setInt(2, op);
                     int n=  pss.executeUpdate();
                     if(n>0)
                     {
                   	  System.out.println("PRODUCT DEDUCTED");
                     }
            
				     
				    
			   PreparedStatement ps1=(PreparedStatement) con.prepareStatement("INSERT INTO  bill_cust( bill_no,p_id,qty,unit_price,total_amt,period) values (?,?,?,?,?,?)");
				

		        
				
		       
		        ps1.setInt(1,rs1.getInt(1)+16);
		        ps1.setInt(2,op);
		        ps1.setInt(3,cnt);
		        ps1.setFloat(4,rs2.getFloat(1));
		                
		        float total1=rs2.getFloat(1)*cnt;
		        total=total+total1;
		        
		        ps1.setFloat(5,total);
		        
		        Calendar cal= Calendar.getInstance();
		      Timestamp ts= new Timestamp(cal.getTime().getTime());
		      
		      ps1.setTimestamp(6,ts);
		       
		      
				   
				int up1= ps1.executeUpdate();
				   if(up1>0)
				   {
					   System.out.println("total purschase is : "+total);
					 
					   System.out.println(+up1+" record inserted  in bill_cust database successfully..");
					   
					   //new BillReceipt(bid ,"NA", total,uname,0);
					   
					   System.out.println("----------------------<<<<bill GENERATED NW>>>>");
				   }
				
				   
				   
				
		       }
		       catch(Exception e7)
		       {
		    	 
		    	   
		    	   System.out.println(e7);
		       }
			   
		 
	   }
	

	}
		catch(Exception e5)
		{
			 System.out.println(e5);
		}
		
		
		
		finally
		{
			 new BillReceipt(bid ,"NA", total,uname,0);
			
			
			 Iterator e4=itemList.iterator();
			 System.out.println("------------------------------2 DISPLAYING ALL PRODUCTs ");
			 while(e4.hasNext())
			   {
				   System.out.println( e4.next());
			   }
			 
		
		}
		
		
	 }
	}
		
	
		
	
		
		
	
		
		 
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
	//	new BillBuffer("p",2,"o");
		
	}

	

}
*/