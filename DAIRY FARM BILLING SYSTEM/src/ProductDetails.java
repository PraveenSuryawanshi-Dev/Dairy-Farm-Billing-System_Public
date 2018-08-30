import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ProductDetails extends JFrame implements ActionListener {

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
		
	 
	 public ProductDetails()
	// public BillReceipt()
	 
	 {
	 }
	 @Override
		public void actionPerformed(ActionEvent e) {
	 
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
           
           //JLabel e = new JLabel("EMPLOYEE :");
         //  desc.add(e); 
           JLabel en = new JLabel(""+emp_name);
           desc.add(en);
            
           desc.setBackground(Color.yellow);
        
          //  add(desc,BorderLayout.NORTH);
		   
            
            topPanel = new JPanel();
	   topPanel.setLayout(new BorderLayout());
		  
	
	   
		     
		    getContentPane().add(topPanel);
		    
		     String columnNAmes[]={"ITEM_NO","P_ID","P_TYPE","P_NAME","R_STOCK","PRICE"};
		     
		      String ino="",pid="",ptype="",pname="",rstock="";
		      String pprice="";
		   
		      table = new JTable();
		      
		      
		      
		      DefaultTableModel model = new DefaultTableModel();
		      
		        model.setColumnIdentifiers(columnNAmes);
		      
		        table.setModel(model);
		      
		  
		   
		  		 
	      
		  		 try {
		  			 Class.forName(driverName);
					   con = DriverManager.getConnection(url,userName,password);
				
		  			   stmt=con.createStatement();
		  			   
		  			   String q1="select * from product";
		  			   
		  			     ResultSet rs= stmt.executeQuery(q1);
		  			
		  			     
		  			     
		  			     
		  			     
		  			     int index=1;
		  			  
		  			   
		  			     while(rs.next())
		  			     { 
		  			    	 
		  			    	
		  			    	ino=""+index;
		  			    	pid=""+rs.getInt(1);
		  			    	ptype=""+rs.getString(2);
		  			    	 pname=""+rs.getString(3);
		  			    	  rstock=""+rs.getInt(7);
		  			    	  pprice=""+rs.getFloat(5);
		  			    	 
		  			    	 
		  			    	   model.addRow(new Object[]{ino,pid,ptype,pname,rstock,pprice});
		  			    	 
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

		ProductDetails mainFrame = new ProductDetails();
	mainFrame.setVisible(true);
		
		
		
	}


	
		
		
	

}

		
		
		
		
		
		