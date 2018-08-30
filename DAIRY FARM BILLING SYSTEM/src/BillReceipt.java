import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 */

/**
 * @author praveen and jigar
 * 
 * 
 *
 */
public class BillReceipt extends JFrame {

	/**
	 * @param args
	 */
	private int bill_no ;
	  private  float total_bill,bala; 
	
	private String customer_name,emp_name;
	
	 private JPanel topPanel;
	 private  JTable table;
	 
	 private JScrollPane scrollPane;
	 
	 
	 private	String driverName = "org.gjt.mm.mysql.Driver";
	 private	String url = "jdbc:mysql://192.168.100.254/tydb156";
	 	
	 private String userName = "ty156";
	   private String password = "12345";
		private Connection con = null;
		
		private Statement stmt;
		private ResultSet rs;
		
	 
	 public BillReceipt(int bill_no ,String customer_name,float total_bill,String emp_name ,float bala)
	// public BillReceipt()
	 
	 {
		 this.bill_no=bill_no;
		  this.customer_name=customer_name;
		  this.total_bill=total_bill;
		  this.emp_name=emp_name;
		  this.bala=bala;
		  
		  
		  
		 setTitle("DAIRY FARM BILL");
		 setSize(700,500);
		 
		 setBackground(Color.DARK_GRAY);
		 setLayout(new BorderLayout());
		 
		

		 
		 
		 //
		  
		 JPanel  desc = new JPanel();
		 desc.setLayout(new GridLayout(5,2));
		 
		 // add(l,BorderLayout.NORTH);
		 
		 String b="",c="",t="",ba="";
		 
		   JLabel billNO = new JLabel("BILL_NO :");
            desc.add(billNO); 
            JLabel bn = new JLabel(""+bill_no);
            desc.add(bn);
            
 		   JLabel cn = new JLabel("CUSTOMER NAME :");
           desc.add(cn); 
           JLabel cna = new JLabel(""+customer_name);
           desc.add(cna);
           
		   JLabel total = new JLabel("TOTAL :");
           desc.add(total); 
           JLabel tn = new JLabel(""+total_bill);
           desc.add(tn);
           
           JLabel bal = new JLabel("BALANCE :");
           desc.add(bal); 
           JLabel ban = new JLabel(""+bala);
           desc.add(ban);
           
           JLabel e = new JLabel("EMPLOYEE :");
           desc.add(e); 
           JLabel en = new JLabel(""+emp_name);
           desc.add(en);
            
           desc.setBackground(Color.yellow);
        
            add(desc,BorderLayout.NORTH);
		   
            
            topPanel = new JPanel();
	   topPanel.setLayout(new BorderLayout());
		  
	
	   
		     
		    getContentPane().add(topPanel);
		    
		     String columnNAmes[]={"ITEM_NO","PRODUCT_CODE","PRODUCT_NAME","QTY","UNIt_PRICE","TOTAL"};
		     
		      String ino="",pcode="",qty="",price="",tot="";
		      String pname="";
		   
		      table = new JTable();
		      
		      
		      
		      DefaultTableModel model = new DefaultTableModel();
		      
		        model.setColumnIdentifiers(columnNAmes);
		      
		        table.setModel(model);
		      
		  
		   
		  		 
	      
		  		 try {
		  			 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
				
		  			   stmt=con.createStatement();
		  			   
		  			   String q1="select * from bill_cust where bill_no="+"'"+bill_no+"'";
		  			   
		  			     ResultSet rs= stmt.executeQuery(q1);
		  			
		  			     
		  			     
		  			     
		  			     
		  			     int index=1;
		  			   int p=-1,j=0;
		  			   
		  			     while(rs.next())
		  			     { 
		  			    	 pname="";
		  			    	 
		  			    	ino=""+index;
		  			    	 pcode=""+rs.getInt(3);
		  			       
		  			       qty=""+rs.getInt(4);
		  			    	  price=""+rs.getFloat(5);
		  			    	   tot=""+rs.getInt(4)*rs.getFloat(5);
		  			    	   
		  			    	 try
		  			    	 {
		  			    		Statement stmt1=con.createStatement();
		 		  			   
		 		  			   String q2="select p_name from product where p_id="+"'"+pcode+"'";
		 		  			   
		 		  			     ResultSet rs1= stmt1.executeQuery(q2);
		 		  			       
		 		  			       
		 		  			      rs1.next();
		 		  			       pname=rs1.getString(1);
		 		  				 System.out.println("in pname throw");
		  			    	 }
		  			    	 catch(Exception e1)
		  			    	 {
		  			    		 System.out.println("in pname catch");
		  			    		 System.out.println(e1);
		  			    	 }
		  			    	 
		  			    	 
		  			    	
		  			    	
		  				      
		  			    	 
		  			    	 
		  			    	   model.addRow(new Object[]{ino,pcode,pname,qty,price,tot});
		  			    	 
		  			    	    index++;
		  			    	  }
		  			    	
		  			 
		  			   
		  			   
		  		 }
		  		 catch(Exception e1)
		  		 {
		  			 System.out.println(e1);
		  			 
		  		 }
		  
		    
		  		
		    
		      
		      scrollPane= new JScrollPane(table);
		      
		      topPanel.add(scrollPane,BorderLayout.CENTER);
		      
		      
		      JPanel  ty = new JPanel();
		    
				 ty.setLayout(new GridLayout(1,1));
				 
				 // add(l,BorderLayout.NORTH);
				 
				   JLabel ty1 = new JLabel("                                                                               THANK YOU ");
		            ty.add(ty1);
		            
		            add(ty,BorderLayout.SOUTH);
		            
		            setVisible(true);
		    		
		  		  
	 }
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		//BillReceipt mainFrame = new BillReceipt();
	// mainFrame.setVisible(true);
		
		
		
	}

}
