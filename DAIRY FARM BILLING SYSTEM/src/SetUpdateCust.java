import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class SetUpdateCust implements ActionListener {
	
	/**
	 * @param args
	 */
	 private JTextField  custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
     private JTextArea custAddress;
	 private DateComboBox1 custDobField,custDojField;
	
     private String  cratedby,nameField, Filepath,EMailField, MobNoField,UserNameField, DobField,PasswordField,Addres, DojField; 
     private int EidField;
      private float AmtFiled;
     private JButton custImg;
     
     
	public SetUpdateCust(int int1, String string, String string2, float float1,
			String name, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9,
			JTextField custnameField, JTextArea custAddress,
			JTextField custFilepath, JTextField custEMailField,
			JTextField custMobNoField, JTextField custUserNameField,
			DateComboBox1 custDobField, JTextField custPasswordField,
			DateComboBox1 custDojField, JTextField custEidField,
			JTextField cusAmtFiled ,JButton custImg) {
		// TODO Auto-generated constructor stub
		
		  this.nameField=name;
		  this.Addres=string4;
		  this.Filepath=string3;
		  this.EMailField=string5;
		  
		  this.MobNoField=string6;
		  this.UserNameField=string;
		  this.DobField=string8;
		  this.PasswordField=string2;
		  this.DojField=string7;
		  this.EidField=int1;
		  this.AmtFiled=float1;
		   this.cratedby=string9;
		
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
		
		System.out.println("i setUPdaTECUST");
		
	String  amt=Float.toString(AmtFiled);
	String id=Integer.toString(EidField);
		 
	System.out.println("i setUPdaTECUST id :"+id);
	
	
		custnameField.setText(nameField);
		custFilepath.setText(Filepath);
		 custEMailField.setText(EMailField);
		 custMobNoField.setText(MobNoField);
		  custUserNameField.setText(UserNameField);
		  custUserNameField.setEditable(false);
		   custDobField.setSelectedItem(DobField);
		    custPasswordField.setText(PasswordField);
		     custDojField.setSelectedItem(DojField);
		     
		             custEidField.setText(id);  
		             custEidField.setEditable(false);
		            //cusAmtFiled.setText(Float.toString(AmtFiled));
		             cusAmtFiled.setText(amt);
		     
	       custAddress.setText(Addres);
	       
	       System.out.println(" in setUPDATE : "+Filepath);
	       custImg.setIcon(new ImageIcon(Filepath));
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
