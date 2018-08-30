import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Vijay
 *
 */
public class NotUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JPanel panel=new JPanel(new BorderLayout());
    panel.setLayout( new BorderLayout());
    
     JTextArea textArea1 = new JTextArea(5,20);
     
     textArea1.setText("praveen \n suryawanshi");
     textArea1.setLineWrap(true);
     textArea1.setWrapStyleWord(true);
	
      panel.add(new JScrollPane(textArea1),BorderLayout.NORTH);
      JFrame frame = new JFrame();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.add(new JScrollPane(panel));
      frame.pack();
      
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
     
	}

}
