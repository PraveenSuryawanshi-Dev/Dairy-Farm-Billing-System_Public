import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class LogOutButton implements ActionListener{

	/**
	 * @param args
	 */
	 private JFrame Display;
	 private String uname;
	
	public LogOutButton(JFrame Display , String username)
	{
		 this.Display=Display;	
	    this.uname=username;	 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Login.main(null);
		Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Display.dispose();
		
		
		JFrame contact=new JFrame("DETAILS");
		// contact.setBounds(200, 200, 200, 200);
		
		contact.setSize(210,210);
		contact.setLayout(new FlowLayout());
		
		JPanel detail=new JPanel();
		    detail.setLayout(new GridLayout(15,1));
		
		JLabel info1=new JLabel(" THANK-YOU !!!  ");
		
		JLabel space1=new JLabel("");
		
		JLabel info2=new JLabel("  NAME   :   "+uname);
		 
		JLabel space2=new JLabel("");
		
		JLabel info3=new JLabel("  PAY TOTAL AMOUT : 10000000 ");
		
		JLabel space3=new JLabel("");
		
		JLabel info4=new JLabel("GOOD BYEE !!!");
		
		
		
		detail.add(info1);
		detail.add(space1);
		detail.add(info2);
		detail.add(space2);
		detail.add(info3);
		detail.add(space3);
		detail.add(info4);
	
	
		detail.setBackground(Color.ORANGE);
		
		contact.add(detail);
		
		
		contact.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
