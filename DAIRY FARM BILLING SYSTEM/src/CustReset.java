import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CustReset implements ActionListener {

	 private JTextField  custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
     private JTextArea custAddress;
     private JLabel notification;
     private DateComboBox1 custDobField,custDojField;
     private JButton custImg;
	
	public CustReset(JTextField custnameField, JTextArea custAddress,
			JTextField custFilepath, JTextField custEMailField,
			JTextField custMobNoField, JTextField custUserNameField,
			DateComboBox1 custDobField, JTextField custPasswordField,
			DateComboBox1 custDojField, JTextField custEidField,
			JTextField cusAmtFiled, JLabel notification ,JButton custImg) {
		// TODO Auto-generated constructor stub
		
		 this.custImg=custImg;
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
		 this.notification=notification;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		custImg.setIcon(null);
		custnameField.setText("");
		custFilepath.setText("");
		custEMailField.setText("");
		 custMobNoField.setText("");
		  custUserNameField.setText("");
		  custPasswordField.setText("");
		  custEidField.setText("");
		  cusAmtFiled.setText("");
	      custAddress.setText("");
	     notification.setText("");
	     custDobField.setSelectedItem(null);
	      custDojField.setSelectedItem(null);
	      

	}

}
