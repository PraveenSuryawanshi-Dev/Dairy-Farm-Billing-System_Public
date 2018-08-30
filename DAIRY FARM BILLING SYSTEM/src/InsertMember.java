import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class InsertMember implements ActionListener {

	/**
	 * @param args
	 */
	private JPanel member;
	private JPanel adminPage;
	private JButton custSave , custUpdate;
	
	public InsertMember(JPanel member,JPanel adminPage,JButton custSave , JButton custUpdate)
	{
		this.member=member;
		this.adminPage=adminPage;
		this.custSave=custSave;
		this.custUpdate=custUpdate;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("in insert member :");
		    member.remove(custUpdate);
		   member.add(custSave);
		  adminPage.add(member);
		  
		  member.updateUI();
		
		
	}
	
	public static void main(String[] e) {
		// TODO Auto-generated method stub

	}

	

}
