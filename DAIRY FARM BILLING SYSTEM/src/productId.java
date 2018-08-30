/**
 * 
 */

/**
 * @author praveen and jigar
 *
 */
import javax.swing.*;

class productId {

	/**
	 * @param args
	 */
	
	void addProduct(JPanel p)
  {
		
	//int x=20;
	//int y=20;
	 int cnt=200;
	  int A=130, B=20;
	JButton b[]=new JButton[cnt];
     for(int i=0;i<=cnt;i++)
     {
    	  for(int j=0;j<=5;j++)
    	  {
    		  p.add(b[i]);
    		  b[i].setBounds(A,B,100,100);
                 		  
    	
    	  }
    		  
     } 
	
		
		
	}
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
