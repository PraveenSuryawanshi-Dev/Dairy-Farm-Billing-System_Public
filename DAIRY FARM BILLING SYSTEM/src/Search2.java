import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class Search2 extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	private JTextField nameField, empFilepath, eMailField, mobNoField, userNameField, empPasswordField, empEidField, salaryFiled;
	private JComboBox empSelectCategory;
	private JButton empImg,empUpdate,empSave;
	private JTextArea empAddress;
	private JPanel operation2;
	private DateComboBox1 dobField,dojField;
	
	public Search2(JButton empSave,JButton empUpdate,JPanel operation2,JTextField nameField,JComboBox empSelectCategory,JTextField empFilepath,JButton empImg,JTextArea empAddress,JTextField eMailField,JTextField mobNoField,JTextField userNameField,DateComboBox1 dobField,JTextField empPasswordField,DateComboBox1 dojField,JTextField empEidField,JTextField salaryFiled)
	{   this.empSave=empSave;
		this.empUpdate=empUpdate;
		this.operation2=operation2;
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		    operation2.remove(empSave);
		    
		  

		   operation2.add(empUpdate);
		    operation2.updateUI();
		    
		    //  update1.addActionListener(new Update1(name, filepath, img, rate, qty, id, productDescription));
		    		    
		    System.out.println(" in search 2");
		    
		
		setLayout(null);
		 setResizable(false);
		 
		JPanel update=new JPanel();
		update.setLayout(null);
		add(update);
		update.setBackground(Color.DARK_GRAY);
		update.setBounds(0,0,350,125);
		setSize(300,125);
		
		 Font font=new Font("",Font.BOLD,11);
		 
		JLabel search=new JLabel("SEARCH");
		search.setBounds(10,10,50,30);
		
		search.setForeground(Color.white);
		search.setFont(font);
		update.add(search);
		
		
		
		JTextField textBox=new JTextField("username",30);
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
		go.addActionListener(new SearchScreen(textBox,this,empSave,empUpdate,operation2,nameField,empSelectCategory,empFilepath,empImg,empAddress,eMailField,mobNoField,userNameField,dobField,empPasswordField,dojField,empEidField,salaryFiled));
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
