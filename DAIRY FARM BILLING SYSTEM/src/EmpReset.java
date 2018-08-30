import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EmpReset implements ActionListener {

	private JTextField nameField, empFilepath, eMailField, mobNoField, userNameField, empPasswordField, empEidField, salaryFiled;
	private JComboBox empSelectCategory;
	private JButton empImg;
	private JTextArea empAddress;
	private JLabel notification;
	private DateComboBox1  dobField,dojField;
	
	
	public EmpReset(JTextField nameField, JComboBox empSelectCategory,
			JTextField empFilepath, JButton empImg, JTextArea empAddress,
			JTextField eMailField, JTextField mobNoField,
			JTextField userNameField, DateComboBox1 dobField,
			JTextField empPasswordField, DateComboBox1 dojField,
			JTextField empEidField, JTextField salaryFiled, JLabel notification) {
		
		this.nameField=nameField;
		this.empFilepath=empFilepath;
		this.eMailField=eMailField; 
		this.mobNoField=mobNoField;
		this.userNameField=userNameField;
		
		this.empPasswordField=empPasswordField;
		
		this.empEidField=empEidField;
		this.salaryFiled=salaryFiled;
		
		this.empSelectCategory=empSelectCategory;
		this.empImg=empImg;
		this.empAddress=empAddress;
		this.notification=notification;
		this.dobField=dobField;
		 this.dojField=dojField;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 nameField.setText("");
		 empFilepath.setText("");
		 eMailField.setText("");
		  mobNoField.setText("");
		   userNameField.setText("");
		    empPasswordField.setText("");
		      empEidField.setText("");
		       salaryFiled.setText("");
		       
		  empSelectCategory.setSelectedItem(null);
	 empImg.setIcon(null);
		 empAddress.setText("");
		 notification.setText("");
   dobField.setSelectedItem(null);
    dojField.setSelectedItem(null);
		

	}

}
