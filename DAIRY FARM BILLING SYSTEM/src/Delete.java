import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
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
 * @author Vijay
 *
 */
public class Delete extends JFrame implements  ActionListener {

	/**
	 * @param args
	 */
	
	
	private JTextField textBox;
	private int n;
	
	public Delete(int n)
	{	
		super("DELETE ITEM");
		
		 this.n=n;
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		setLayout(null);
		JPanel update=new JPanel();
		update.setLayout(null);
		add(update);
		update.setBackground(Color.DARK_GRAY);
		update.setBounds(0,0,350,125);
		setSize(300,125);
		 Font font=new Font("",Font.BOLD,11);
	
		JLabel search=new JLabel("SEARCH");
		
		search.setForeground(Color.white);
		search.setFont(font);
		search.setBounds(10,10,50,30);
		update.add(search);
		
		
		
		JButton go=new JButton("GO");
		
		
		go.setBounds(70,50,60,30);
		
        go.setBackground(Color.GRAY);
		
		go.setForeground(Color.white);
		go.setFont(font);
		update.add(go);
		
		//String str=textBox.getText();
		//System.out.println("get text="+str);
		 if(n==0)
		 {
			 JTextField textBox=new JTextField("product_name",30);
				textBox.setBounds(70,10,140,30);
				update.add(textBox);
		go.addActionListener(new deleteItemDisplay(textBox,this));
		 }
		 if(n==1)
		 {
			 JTextField textBox=new JTextField("employee_username",30);
				textBox.setBounds(70,10,140,30);
				update.add(textBox);
			 
			 go.addActionListener(new deleteEmpDisplay(textBox,this));
		 }
		 
		 if(n==2)
		 {
			 JTextField textBox=new JTextField("cust_username",30);
				textBox.setBounds(70,10,140,30);
				update.add(textBox);
			 go.addActionListener(new deleteCustDisplay(textBox,this));
		 }
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
