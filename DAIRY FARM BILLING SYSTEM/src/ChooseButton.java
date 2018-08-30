import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
 class ChooseButton implements ActionListener {

	/**
	 * @param args
	 */
 private JTextField fp;JButton imgbutton;
	 
	  
	  ChooseButton( JTextField filepath,JButton img)
	  {
		  
		  fp=filepath;
		  imgbutton=img;
		  
	  }
	  
	 @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		//jfilechooser code		 
			
			JFileChooser chooser=new JFileChooser();
			
			 Font  font =new Font("",Font.BOLD,20);
			chooser.setBackground(Color.GRAY);
			
			chooser.setForeground(Color.white);
			chooser.setFont(font);
			
			FileNameExtensionFilter filter=new FileNameExtensionFilter("JPG for Windows and PNG for LINUX","jpg","png");
			
			chooser.setFileFilter(filter);
			int returnVal=chooser.showOpenDialog(null);
			if(returnVal==JFileChooser.APPROVE_OPTION)
				{
				
				 String imgpath=chooser.getSelectedFile().toString();
			    System.out.println("You choosed to open this file :"+imgpath);
            
			fp.setText(imgpath);    
			imgbutton.setIcon(new ImageIcon(imgpath));
				}
		//
		 
		}

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
