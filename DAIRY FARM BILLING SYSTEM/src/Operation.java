import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.*;

import javax.swing.*;

import java.sql.*;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class Operation implements ActionListener,MouseMotionListener {

	/**
	 * @param args
	 */
	 private JButton product;
	 private JPanel   productDp ;
	 private JLabel totalBill ,itemCount;
	 private int pid;
	  private String pname;
	   private float price;
	 //
	   private	String driverName = "org.gjt.mm.mysql.Driver";
		private	String url = "jdbc:mysql://192.168.100.254/tydb156";
			
			private String userName = "ty156";
		   private String password = "12345";
	 	Connection con = null;
	 	
	 	Statement stmt;
	 	ResultSet rs;
	   static double   amtBuffer=0;
	   private String text;
	   private  int count;
	   
	   
	   private JTextField stockqty;
	 
	public Operation(JButton buttonref,JPanel productDp ,JLabel totalBill ,JTextField stockqty, int pid , String pname , float price )
	{
		product=buttonref;
		this.productDp=productDp;
		
		 this.totalBill=totalBill;
		  this.stockqty=stockqty;
		  this.pid=pid;
		   this.pname=pname;
		    this.price=price;
		    
		  
	} 
	
	public Operation(double i ,int j ,int k)
	{
		amtBuffer=0;
		
	}
	
	public Operation(JButton buttonref,String text)
	{
		product=buttonref;
		this.text= text;
	}
	

	
	public Operation(double amt)
	{
		amtBuffer=amt;
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		String rec=stockqty.getText();
		
		int rec1=Integer.parseInt(rec);
		
		int PID=Integer.parseInt(product.getText());
		System.out.println("product id is :"+PID);
		
		//SqlConnection call=new SqlConnection();
		//call.calculateBill(PID,productDp);
		
	  	 JButton item[]=new JButton[120000];
		 try {
			 Class.forName(driverName);
			   con = DriverManager.getConnection(url,userName,password);
		
			//   
			   Statement stmt1=con.createStatement();
			   
			   
			   
			  /* 
			   String query="select * from product where p_id="+PID; 
			 
			   
					 ResultSet  rs1=stmt.executeQuery(query);
					 
					   while(rs1.next())
					   {
						   int stock=rs1.getInt(7);
						   
						   if(stock<=0)
					   }
			    */
			   
			   
			  // 
			   
			   
			   
			   
			   stmt=con.createStatement();
			   int i=1;
			   
			   
			   
			   String query="select * from product where p_id="+PID; 
			 
			   
					   rs=stmt.executeQuery(query);
			    
			   
			   System.out.println("Opened database successfully.."+rs);
			  
		        
			     
			      while(rs.next())
			      {
			        int stock=rs.getInt(7);
			        
			         if(stock<=0)
			         {
			        	 JOptionPane.showMessageDialog(null,"WARNING : STOCK OVER :"+pname,"WARNING",JOptionPane.INFORMATION_MESSAGE);
			         }
			         else
			         {
			    	 
			      for(int j=1; j<=rec1 ;j++)
			      {
			   System.out.println("ITEM ="+rs.getString(3));
			   
             item[PID]=new JButton(rs.getString(3)+" "+rs.getFloat(5)+"/- "+" "+rs.getString(10));
             
            
			    
              amtBuffer=amtBuffer+rs.getFloat(5);
              
             
              
               System.out.println("the total amout is :" +amtBuffer);
                String lab=""+amtBuffer;
               
               totalBill.setText(lab);
               
               
              
                  
               
              
                item[PID].setBackground(Color.orange);
                
 
                
             
			   productDp.add( item[PID]);
			   
			   
			   productDp.updateUI();
			   
			   BillBuffer buffer = new   BillBuffer(totalBill);
			   
			   
			   
			      buffer.billAdd(pid);
			      new CancelButton(item[PID]);
			      
			   item[PID].addActionListener(new  DiscardItem(item[PID], rs.getFloat(5), totalBill,amtBuffer,pid ));
			    
			      }
			          
			   
			    	
			    
			      } 
			    
			      stockqty.setText("1"); 
		
		
		 }
		 }
			   
	catch ( Exception ee) 
	{
	        ee.getMessage();
		System.out.println("unable to open database ...");	
		 ee.printStackTrace();
		 
		
   }  
	 
		finally
		{
			try {
				con.close();
			} catch (SQLException ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}
		 

	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
	
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
		product.setToolTipText("  "+ text + " " );
		product.updateUI();
		System.out.println("in mouse 2   :"+text);
		
	}

	

}
