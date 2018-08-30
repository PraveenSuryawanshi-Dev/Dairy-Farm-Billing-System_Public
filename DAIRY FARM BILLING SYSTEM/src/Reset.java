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
public class Reset implements ActionListener {

	/**
	 * @param args
	 */
	private JTextField name;

	private JTextField filepath;

	private JButton img;
	private JTextField rate;
    
	 private JTextField qty;

	private JTextField id;

	private JTextArea productDescription;
	
	private JComboBox selectCategory;
	
	public Reset(JTextField name ,JTextField filepath,JButton img,JTextField rate,JTextField qty,JTextField id,JTextArea productDescription, JComboBox selectCategory)
			{
		
		this.name=name;
	
		this.filepath=filepath;
		
		this.img=img;
		
		this.rate=rate;
	
		this.qty=qty;
	
		this.id=id;
	
		this.productDescription=productDescription;
		
		this.selectCategory=selectCategory;
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		name.setText("");
		filepath.setText("");
		img.setIcon(new ImageIcon(""));
		rate.setText("");
		qty.setText("");
		id.setText("");
		productDescription.setText("");
		selectCategory.setSelectedItem(null);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
