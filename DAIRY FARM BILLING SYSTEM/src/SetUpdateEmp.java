import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
 * @author praveen and jigar
 *
 */
public class SetUpdateEmp implements ActionListener {

	/**
	 * @param args
	 */
	
	private JTextField textBox,nameField, empFilepath, eMailField, mobNoField, userNameField, empPasswordField, empEidField, salaryFiled;
	private JComboBox empSelectCategory;
	private JButton empImg;
	private JTextArea empAddress;
	private DateComboBox1 dobField , dojField;
	
 private	String  ename, epass , img, address, mob , email , name;
	private String sal,dob,doj,esc;
 private String  eid;
 

	
 
public 	SetUpdateEmp(int eid,String type,String ename,String epass,float sal,String doj ,String img,String address,String mob ,String email ,String dob,String name 	,JTextField nameField,JComboBox empSelectCategory,JTextField empFilepath,JButton empImg,JTextArea empAddress,JTextField eMailField,JTextField mobNoField,JTextField userNameField,DateComboBox1 dobField,JTextField empPasswordField,DateComboBox1 dojField,JTextField empEidField,JTextField salaryFiled)
		{
		this.eid=Integer.toString(eid);
		
		this.ename=ename;
		this.epass=epass;
		this.sal=Float.toString(sal);
		this.doj=doj;
		this.img=img;
		this.address=address;
		this.mob=mob;
		this.email=email;
		this.dob=dob;
		this.name=name;
		this.esc=type;
				
		
		
		this.nameField=nameField;
		this.empFilepath=empFilepath;
		this.eMailField=eMailField;
		this.mobNoField=mobNoField;
		this.userNameField=userNameField;
		this.dobField=dobField;
		this.empPasswordField=empPasswordField;
		this.dojField=dojField;
		this.empEidField=empEidField;
		this.salaryFiled=salaryFiled;
		
		this.empSelectCategory=empSelectCategory;
		this.empImg=empImg;
		this.empAddress=empAddress;
		
	}
	
	


















	@Override
	
	/*
		
	}*/
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("IN SETUPDATEEMP "+dob+"   "+doj+"  "+esc );
		 
		 
		
		dobField.setSelectedItem(dob);
		dojField.setSelectedItem(doj);
		empSelectCategory.setSelectedItem(esc);
		
		nameField.setText(name);
		 empFilepath.setText(img);
		 eMailField.setText(email);
		 mobNoField.setText(mob);
		 userNameField.setText(ename);
		 userNameField.setEditable(false);
		
		 empPasswordField.setText(epass);
		
		 empEidField.setText(eid);
		 empEidField.setEditable(false);
		 salaryFiled.setText(sal);
		 
		 empImg.setIcon(new ImageIcon(img));
		 empAddress.setText(address);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	

}
