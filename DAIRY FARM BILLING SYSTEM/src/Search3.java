import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
public class Search3 extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	private JButton custUpdate,custSave, custImg;
	private JPanel operation3;
	
	
	 private JTextField  custnameField, custFilepath,custEMailField, custMobNoField,custUserNameField,custPasswordField,custEidField,cusAmtFiled;
     private JTextArea custAddress;
     private DateComboBox1 custDobField,custDojField;
     
     
	public Search3(JButton custUpdate,JButton custSave,JPanel operation3 ,JTextField custnameField, JTextArea custAddress,JTextField custFilepath,
			JTextField custEMailField, JTextField custMobNoField,
			JTextField custUserNameField, DateComboBox1 custDobField,
			JTextField custPasswordField, DateComboBox1 custDojField,
			JTextField custEidField,
			JTextField cusAmtFiled ,JButton custImg)
	{
		
		this.custUpdate=custUpdate;
		this.custSave=custSave;
		this.operation3=operation3;
		
		
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	     operation3.remove(custSave);
		 operation3.add(custUpdate);
		 operation3.updateUI();
		 
			
		setLayout(null);
		JPanel update=new JPanel();
		update.setLayout(null);
		add(update);
		update.setBackground(Color.DARK_GRAY);
		update.setBounds(0,0,350,125);
		setSize(300,125);
		setResizable(false);
		
		 Font font=new Font("",Font.BOLD,11);
		 
		JLabel search=new JLabel("SEARCH");
		search.setBounds(10,10,50,30);
		
		search.setForeground(Color.white);
		search.setFont(font);
		update.add(search);
		
		
		
		JTextField textBox=new JTextField("customers",30);
		textBox.setBounds(70,10,140,30);
		update.add(textBox);
		
		JButton go=new JButton("GO");
		
		go.setBounds(70,50,60,30);
		go.setBackground(Color.GRAY);
		
		go.setForeground(Color.white);
		go.setFont(font);
		
		update.add(go);
		
		//String str=textBox.getText();
		//System.out.println("get text="+str);
		 go.addActionListener(new SearchScreenCust( textBox,this,custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled,custImg));
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
