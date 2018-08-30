import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 */

/**
 * @author Praveen And Jigar
 *
 */
public class UpdateItem extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	private JTextField name, filepath, rate, qty, id;
	private JButton img;
	private JTextArea productDescription;
	private JPanel operation;
	private JFrame adminPage;
	private JButton  update1 , save;
	private JLabel notification;
	private String uname;
	private JComboBox selectCategory;
	
	public UpdateItem(JTextField name,JTextField filepath,JButton img,JTextField rate,JTextField qty,JTextField id,JTextArea productDescription,JPanel operation,JButton update1 ,JButton save ,JLabel notification ,String uname, JComboBox selectCategory )
	{	
		super("UPDATE ITEM");
		this.name=name;
		this.filepath=filepath;
		this.img=img;
		this.rate=rate;
		this.qty=qty;
		this.id=id;
		this.productDescription=productDescription;
		this.operation=operation;
		this.adminPage=adminPage;
		this.update1=update1;
		this.save=save;
		this.notification=notification;
		this.uname=uname;
		
		this.selectCategory=selectCategory;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		        operation.remove(save);
		    update1.setBounds(200,620,100,30);
		    update1.setBackground(Color.GRAY);
		   operation.add(update1);
		    operation.updateUI();
		    
		      update1.addActionListener(new Update1(name, filepath, img, rate, qty, id, productDescription ,notification ,uname,selectCategory));
		    
		    
		    
		    
		
		setLayout(null);
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
		
		
		
		JTextField textBox=new JTextField(30);
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
		go.addActionListener(new Search1(textBox,this, name, filepath, img, rate, qty, id, productDescription, selectCategory));
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UpdateItem uItem=new UpdateItem();
		

	}
	

}
