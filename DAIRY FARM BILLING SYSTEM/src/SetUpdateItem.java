import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
public class SetUpdateItem implements ActionListener {

	/**
	 * @param args
	 */
	private JTextField name;
	private String name1;
	private JTextField filepath;
	private String filepath1;
	private JButton img;
	private JTextField rate;
	private String rate1;
	private JTextField qty;
	private String qty1;
	private JTextField id;
	private String id1;
	private JTextArea productDescription;
	private String productDescription1,type;
	private JComboBox selectCategory;
	

	
	public SetUpdateItem(JTextField name,String name1 ,JTextField filepath,String filepath1,JButton img,JTextField rate,Float rate1,JTextField qty,int qty1
			,JTextField id,int id1
			,JTextArea productDescription
			,String productDescription1,String type ,JComboBox selectCategory )
			{
		
		this.name=name;
		this.name1=name1;
		this.filepath=filepath;
		this.filepath1=filepath1;
		this.img=img;
		this.type=type;
		
		this.rate=rate;
		this.rate1=Float.toString(rate1);
		this.qty=qty;
		this.qty1=Integer.toString(qty1);
		this.id=id;
		this.id1=Integer.toString(id1);
		this.productDescription=productDescription;
		this.productDescription1=productDescription1;
		this.selectCategory=selectCategory;
		
		 
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		selectCategory.setSelectedItem(type);
		name.setText(name1);
		filepath.setText(filepath1);
		img.setIcon(new ImageIcon(filepath1));
		rate.setText(rate1);
		qty.setText(qty1);
		id.setText(id1);
		id.setEditable(false);
		productDescription.setText(productDescription1);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
