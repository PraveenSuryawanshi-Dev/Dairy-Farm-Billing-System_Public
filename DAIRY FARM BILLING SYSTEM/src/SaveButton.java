import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
 class SaveButton implements ActionListener,ItemListener{

	/**
	 * @param args
	 */
	 private JComboBox cb;
	
	   private JTextField name;
		private JTextField filepath;
		private JTextArea productDescription;
		private JTextField rate;
		private  JTextField qty;
		private JTextField id;
		private JLabel notification;
	  private String uname;
		    static String ptype;
		    
		  

		
		SaveButton( JComboBox selectCategory)
		{
			cb=selectCategory;
			
		}
		
		
	 public SaveButton(JTextField name,JTextField filepath,JTextArea productDescription,JTextField rate,JTextField qty,JTextField id ,JLabel notification ,String uname )
	 {
		 
		this.name=name;
		this.filepath=filepath;
		this.productDescription=productDescription;
		this.rate=rate;
	    this.qty=qty;
		this.id=id;
		this.notification=notification;
		this.uname=uname;
		 
	 }
	 
	
	
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
		
			 ptype=(String)cb.getSelectedItem();
			System.out.println("item selectd :"+ptype);
			  
			
			
		}
		

	 
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		  
		
		 
		 String pname="",filesrc="",description="", rs="", pid="",quantity="";
		  pname=name.getText();  
		  filesrc=filepath.getText();
		  description=productDescription.getText();
		  rs=rate.getText();
		  quantity=qty.getText();
		  pid=id.getText();
		 
		
		  
		  System.out.println(ptype+"--"+pname+"--"+filesrc+"--"+description+"--"+""+rs+"---"+ quantity+"---"+pid);
		 
		  //
		  SqlConnection call=new SqlConnection();
		  

	     try {
			call.insertItem(ptype,pname,filesrc,description,rs,quantity,pid,notification,uname);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		
		  
	
		
		 
		}
	 
	 
	private String getText(JTextField name2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	

	

}
