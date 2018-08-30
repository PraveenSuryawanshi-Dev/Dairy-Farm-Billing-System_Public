import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
public class Switch implements ActionListener  {

	/**
	 * @param args
	 */
    private 	JPanel operation, operation2, adminPage;
    JButton insertItem,insertEmp,empSave,empUpdate;
    private String compare;
    
    
    
    
	public Switch(JButton insertEmp ,JPanel operation,JPanel operation2,JPanel adminPage,JButton empSave,JButton empUpdate)
	{    this.operation=operation;
	      this.insertEmp=insertEmp;

		this.operation2=operation2;
		this.adminPage=adminPage;
		 this.empSave=empSave;
		 this.empUpdate=empUpdate;
		this.compare=insertEmp.getText();
	}
	public Switch(JButton insertItem,JPanel operation,JPanel operation2,JPanel adminPage)
	{
		 this.operation=operation;
	      this.insertItem=insertItem;

		this.operation2=operation2;
		this.adminPage=adminPage;
		this.compare=insertItem.getText();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  
		
		 
		String item="INSERT ITEM";
		 String emp="INSERT EMP";
		 String update="UPDATE EMP";
		  if(item.equals(compare)==true)
		  {   
			  System.out.println(" : item");
			  adminPage.remove(operation2);
			  adminPage.add(operation);
			  operation.updateUI();
				
		  }
		  if(emp.equals(compare)==true)
		  { 
			    operation2.remove(empUpdate);
			  empSave.setBounds(200,620,100,30);
				 operation2.add(empSave);	 
			  System.out.println(" : employee");
			  
			  adminPage.remove(operation);
			  adminPage.add(operation2);
			  operation2.updateUI();
				
		  }
		
		  
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	
	

}
