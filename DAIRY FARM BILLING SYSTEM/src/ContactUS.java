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
public class ContactUS implements ActionListener 
{

	/**
	 * @param args
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	
		// TODO Auto-generated method stub
		JFrame contact=new JFrame("CONTACT US");
		// contact.setBounds(200, 200, 200, 200);
		
		contact.setSize(290,260);
		contact.setLayout(new FlowLayout());
		
		JPanel detail=new JPanel();
		  detail.setLayout(new GridLayout(15,1));
		
	
		
		JLabel info1=new JLabel(" PROJECT NAME : DAIRY FARM BILLING SYSTEM");
		
		JLabel space1=new JLabel("");
		
		JLabel info2=new JLabel("DEVELOPERS :");
		
		JLabel space2=new JLabel("");
		
		JLabel info3=new JLabel("NAME :PRAVEEN SURYAWANSHI");
		JLabel info4=new JLabel("EMAIL ID :suryawanshi.praveen007@gmail.com");
		JLabel info5=new JLabel("MOBILE NO :9225523840");
		
		JLabel space3=new JLabel("");	
	
		JLabel info6=new JLabel("NAME :JIGAR SHAH");
		JLabel info7=new JLabel("EMAIL ID :shahjigar47@gmail.com");
		JLabel info8=new JLabel("MOBILE NO :8552939459");
		JLabel space4=new JLabel("");
		
		
		JLabel info9=new JLabel("developed for NOWROSJEE WADIA COLLEGE");
		
		
		detail.add(info1);
		detail.add(space1);
		detail.add(info2);
		detail.add(space2);
		detail.add(info3);
		detail.add(info4);
		detail.add(info5);
		detail.add(space3);
		detail.add(info6);
		detail.add(info7);
		detail.add(info8);
		detail.add(space4);
		detail.add(info9);
		detail.setBackground(Color.ORANGE);
		
		contact.add(detail);
		
		
		contact.setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	

}
