/**
 * 
 */
import java.awt.*;

import javax.swing.*;

/**
 * @author Praveen AND Jigar
 *
 */
public class EPage extends JPanel{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame page=new JFrame();
		page.setLayout(null);
		page.setSize(680,690);
		 
		
		
      
        page.setBackground(Color.ORANGE);
		
		
		
		JLabel EmpName=new JLabel("EMPLOYEE NAME :");
		EmpName.setBounds(15, 15, 120,30);
		page.add(EmpName);
		
		
		JTextField name=new JTextField(25);
		name.setBounds(125,15,150,30);
		page.add(name);
		

		JLabel EmpID=new JLabel("EMPLOYEE ID        :");
		EmpID.setBounds(15,50,120,30);
		page.add(EmpID);
		
		JTextField id=new JTextField(25);
		id.setBounds(125,50,150,30);
		page.add(id);
		
		
		JLabel salary=new JLabel("SALARY :");
		salary.setBounds(15,85,120,30);
		page.add(salary);
		
		
	//	JComboBox 
		
		page.setVisible(true);
	}

}
