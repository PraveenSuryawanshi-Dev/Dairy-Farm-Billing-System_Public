
/**
 * 
 */

/**
 * @author Jigar Shah & Praveen Suryawanshi
 *
 */

//import java.awt.image.*;
import java.awt.*;

import javax.swing.*;

 class DisplayItem {

	/**
	 * @param args
	 */
	 
	 
	 // constructor
	 
	 
	 
	 DisplayItem()
	 {
			// TODO Auto-generated method stub
			
			
	JFrame Display=new JFrame("WELCOME");
	Display.setLayout(null);
	 Display.setSize(1152,870);
	 
	 

	JPanel productPanel=new JPanel();
	productPanel.setLayout(null);
	productPanel.setBackground(Color.BLACK);
	productPanel.setBounds(200,250,580,470);

	Display.add(productPanel);

	// class to add items in panel

	 //productId product=new productId();
	  
	  //product.addProduct(productPanel);
	 




	//


	JButton icecream1=new JButton();
	icecream1.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream1.png"));

	JButton icecream2=new JButton("Cow Milk");
	icecream2.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream2.png"));

	JButton icecream3=new JButton("Toned Milk");
	icecream3.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream3.png"));

	JButton icecream4=new JButton("Gold Milk");
	icecream4.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream4.png"));

	JButton icecream5=new JButton("Kesar Milk");
	icecream5.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream5.png"));

	JButton icecream6=new JButton("Strawberry Mik");
	icecream6.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream6.png"));

	JButton icecream7=new JButton("Mango Milk");
	icecream7.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream7.png"));

	JButton icecream8=new JButton("Cow Milk");
	icecream8.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream8.png"));

	JButton icecream9=new JButton(" Milk");
	icecream9.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream9.png"));

	JButton icecream10=new JButton(" Milk");
	icecream10.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream10.png"));

	JButton icecream11=new JButton(" Milk");
	icecream11.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream11.png"));

	JButton icecream12=new JButton(" Milk");
	icecream12.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream12.png"));

	JButton icecream13=new JButton(" Milk");
	icecream13.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream13.png"));

	JButton icecream14=new JButton(" Milk");
	icecream14.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream14.png"));

	JButton icecream15=new JButton(" Milk");
	icecream15.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream15.png"));

	JButton icecream16=new JButton(" Milk");
	icecream16.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream16.png"));

	JButton icecream17=new JButton(" Milk");
	icecream17.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream17.png"));

	JButton icecream18=new JButton(" Milk");
	icecream18.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream18.png"));

	JButton icecream19=new JButton(" Milk");
	icecream19.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream19.png"));

	JButton icecream20=new JButton(" Milk");
	icecream20.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream20.png"));



	icecream1.setBounds(20,20, 100, 100);
	icecream2.setBounds(20,130, 100, 100);
	icecream3.setBounds(20,240, 100, 100);
	icecream4.setBounds(20,350,100,100);

	icecream5.setBounds(130,20, 100, 100);
	icecream6.setBounds(130,130, 100, 100);
	icecream7.setBounds(130,240, 100, 100);
	icecream8.setBounds(130,350, 100, 100);

	icecream9.setBounds(240,20, 100, 100);
	icecream10.setBounds(240,130, 100, 100);
	icecream11.setBounds(240,240, 100, 100);
	icecream12.setBounds(240,350, 100, 100);

	icecream13.setBounds(350,20, 100, 100);
	icecream14.setBounds(350,130, 100, 100);
	icecream15.setBounds(350,240, 100, 100);
	icecream16.setBounds(350,350, 100, 100);

	icecream17.setBounds(460,20, 100, 100);
	icecream18.setBounds(460,130, 100, 100);
	icecream19.setBounds(460,240, 100, 100);
	icecream20.setBounds(460,350, 100, 100);


	productPanel.add(icecream1);
	productPanel.add(icecream2);
	productPanel.add(icecream3);
	productPanel.add(icecream4);
	productPanel.add(icecream5);
	productPanel.add(icecream6);
	productPanel.add(icecream7);
	productPanel.add(icecream8);
	productPanel.add(icecream9);
	productPanel.add(icecream10);
	productPanel.add(icecream11);
	productPanel.add(icecream12);
	productPanel.add(icecream13);
	productPanel.add(icecream14);
	productPanel.add(icecream15);
	productPanel.add(icecream16);
	productPanel.add(icecream17);
	productPanel.add(icecream18);
	productPanel.add(icecream19);
	productPanel.add(icecream20);

	/*
	JButton productId[] = new JButton[200];
	for(int i=0;i<=40;i++)
	{
		 productId[i]= new JButton("productId"+i);
		  
		 System.out.println("Button created");
		
		 
		  
	}

	//int A=,B=20,C=100,D=100;
	//int x=0,y=0,i,j;
	/* for(int i=20;i<=x;i=i+110)
	   {
		  for(int j=20;j<=y;j=j+110)
		  {  
			 
			  productId[i].setBounds(i,j,100,100);
			  p1.add(productId[i]);
			   
		  }
	   }
	 
	 */
		

		     
		        

		 
	 
	  

	JPanel billCounter=new JPanel();
	JPanel productDp = new JPanel();
	productDp.setBounds(5,120,290,468);
	productDp.setBackground(Color.WHITE);
	billCounter.add(productDp);

	billCounter.setBounds(800,130,300,675);
	billCounter.setLayout(null);
	billCounter.setBackground(Color.ORANGE);
	JLabel date=new JLabel("DATE :");

	JLabel time=new JLabel("TIME  :");
	JLabel billno=new JLabel("BILL NO. :");
	JLabel menu=new JLabel(" MENU :");
	JLabel qty=new JLabel("ITEMS :");
	JLabel total=new JLabel("Total :");

	JButton print=new JButton("PRINT ");
	JButton cancel=new JButton("CANCEL");
	date.setBounds(10,10,100,30);
	billCounter.add(date);

	qty.setBounds(100,85,100,30);
	time.setBounds(10,35,100,30);
	billCounter.add(time);
	billCounter.add(qty);
	billno.setBounds(10,60,100,30);
	billCounter.add(billno);

	menu.setBounds(10,85,100,30);
	billCounter.add(menu);

	total.setBounds(10,583,100,30);
	billCounter.add(total);

	print.setBounds(50,625,80,30);
	print.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\printButton.png"));
	print.setBackground(Color.GREEN);
	billCounter.add(print);

	cancel.setBounds(150,625,80,30);
	cancel.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\cancelButton.png"));
	billCounter.add(cancel);


	// category

	JButton category1=new JButton("ICECREAM PRODUCTS");
	JButton category2=new JButton("MILK PRODUCTS");
	JButton category3=new JButton("OTHER PRODUCTS");

	 category1.setBounds(20, 252, 170,50 );
	 category2.setBounds(20, 302, 170,50 );  
	 category3.setBounds(20, 352, 170,50 );
	 Display.add(category1);
	 Display.add(category2);
	 Display.add(category3);

	//



	//logoutButton

	JButton logOut=new JButton("LOGOUT");
	 
	logOut.setBounds(1000,75,100,30);

	logOut.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\logout.png"));
	Display.add(logOut);

	//


	//toolbar

	JToolBar tools=new JToolBar();
	tools.setBounds(0,0,1158,30);
	tools.setBackground(Color.BLACK);

	JButton b1=new JButton("CONTACT US");
	tools.add(b1);
	 
	 Display.add(tools);
	 
	 //
	 
	 //scrollbar
	 
	 JScrollBar scroll=new JScrollBar(JScrollBar.VERTICAL);
	   scroll.setBounds(565,0,15,470);
	   scroll.setBackground(Color.BLACK);
	   productPanel.add(scroll);
	  
	  //
	  
	  
	  
	  
	Display.add(productPanel);
	Display.add(billCounter);
	Display.setVisible(true);

	// Change date daily
	 

	JLabel dateChange=new JLabel();
	billCounter.add(dateChange);

	dateChange.setBounds(50,10,100,30);


	Date d= new Date();
	d.changeDate(dateChange);

	//



	//change time continously

	JLabel timeChange=new JLabel();
	billCounter.add(timeChange);

	timeChange.setBounds(50,35,100,30);


	Time t= new Time();
	t.changeTime(timeChange);

	//

			
		}
	 
	 
	 
	 
	 
	 
	 //
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
	JFrame Display=new JFrame("WELCOME");
Display.setLayout(null);
 Display.setSize(1152,870);
 
 

JPanel productPanel=new JPanel();
productPanel.setLayout(null);
productPanel.setBackground(Color.BLACK);
productPanel.setBounds(200,250,580,470);

Display.add(productPanel);

// class to add items in panel

 //productId product=new productId();
  
  //product.addProduct(productPanel);
 




//


JButton icecream1=new JButton();
icecream1.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream1.png"));

JButton icecream2=new JButton("Cow Milk");
icecream2.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream2.png"));

JButton icecream3=new JButton("Toned Milk");
icecream3.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream3.png"));

JButton icecream4=new JButton("Gold Milk");
icecream4.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream4.png"));

JButton icecream5=new JButton("Kesar Milk");
icecream5.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream5.png"));

JButton icecream6=new JButton("Strawberry Mik");
icecream6.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream6.png"));

JButton icecream7=new JButton("Mango Milk");
icecream7.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream7.png"));

JButton icecream8=new JButton("Cow Milk");
icecream8.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream8.png"));

JButton icecream9=new JButton(" Milk");
icecream9.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream9.png"));

JButton icecream10=new JButton(" Milk");
icecream10.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream10.png"));

JButton icecream11=new JButton(" Milk");
icecream11.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream11.png"));

JButton icecream12=new JButton(" Milk");
icecream12.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream12.png"));

JButton icecream13=new JButton(" Milk");
icecream13.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream13.png"));

JButton icecream14=new JButton(" Milk");
icecream14.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream14.png"));

JButton icecream15=new JButton(" Milk");
icecream15.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream15.png"));

JButton icecream16=new JButton(" Milk");
icecream16.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream16.png"));

JButton icecream17=new JButton(" Milk");
icecream17.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream17.png"));

JButton icecream18=new JButton(" Milk");
icecream18.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream18.png"));

JButton icecream19=new JButton(" Milk");
icecream19.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream19.png"));

JButton icecream20=new JButton(" Milk");
icecream20.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\icecream20.png"));



icecream1.setBounds(20,20, 100, 100);
icecream2.setBounds(20,130, 100, 100);
icecream3.setBounds(20,240, 100, 100);
icecream4.setBounds(20,350,100,100);

icecream5.setBounds(130,20, 100, 100);
icecream6.setBounds(130,130, 100, 100);
icecream7.setBounds(130,240, 100, 100);
icecream8.setBounds(130,350, 100, 100);

icecream9.setBounds(240,20, 100, 100);
icecream10.setBounds(240,130, 100, 100);
icecream11.setBounds(240,240, 100, 100);
icecream12.setBounds(240,350, 100, 100);

icecream13.setBounds(350,20, 100, 100);
icecream14.setBounds(350,130, 100, 100);
icecream15.setBounds(350,240, 100, 100);
icecream16.setBounds(350,350, 100, 100);

icecream17.setBounds(460,20, 100, 100);
icecream18.setBounds(460,130, 100, 100);
icecream19.setBounds(460,240, 100, 100);
icecream20.setBounds(460,350, 100, 100);


productPanel.add(icecream1);
productPanel.add(icecream2);
productPanel.add(icecream3);
productPanel.add(icecream4);
productPanel.add(icecream5);
productPanel.add(icecream6);
productPanel.add(icecream7);
productPanel.add(icecream8);
productPanel.add(icecream9);
productPanel.add(icecream10);
productPanel.add(icecream11);
productPanel.add(icecream12);
productPanel.add(icecream13);
productPanel.add(icecream14);
productPanel.add(icecream15);
productPanel.add(icecream16);
productPanel.add(icecream17);
productPanel.add(icecream18);
productPanel.add(icecream19);
productPanel.add(icecream20);

/*
JButton productId[] = new JButton[200];
for(int i=0;i<=40;i++)
{
	 productId[i]= new JButton("productId"+i);
	  
	 System.out.println("Button created");
	
	 
	  
}

//int A=,B=20,C=100,D=100;
//int x=0,y=0,i,j;
/* for(int i=20;i<=x;i=i+110)
   {
	  for(int j=20;j<=y;j=j+110)
	  {  
		 
		  productId[i].setBounds(i,j,100,100);
		  p1.add(productId[i]);
		   
	  }
   }
 
 */
	

	     
	        

	 
 
  
JPanel billCounter=new JPanel();
JPanel productDp = new JPanel();
productDp.setBounds(5,120,290,468);
productDp.setBackground(Color.WHITE);
billCounter.add(productDp);

billCounter.setBounds(800,130,300,675);
billCounter.setLayout(null);
billCounter.setBackground(Color.ORANGE);
JLabel date=new JLabel("DATE :");

JLabel time=new JLabel("TIME  :");
JLabel billno=new JLabel("BILL NO. :");
JLabel menu=new JLabel(" MENU :");
JLabel qty=new JLabel("ITEMS :");
JLabel total=new JLabel("Total :");

JButton print=new JButton("PRINT ");
JButton cancel=new JButton("CANCEL");
date.setBounds(10,10,100,30);
billCounter.add(date);

qty.setBounds(100,85,100,30);
time.setBounds(10,35,100,30);
billCounter.add(time);
billCounter.add(qty);
billno.setBounds(10,60,100,30);
billCounter.add(billno);

menu.setBounds(10,85,100,30);
billCounter.add(menu);

total.setBounds(10,583,100,30);
billCounter.add(total);

print.setBounds(50,625,80,30);
print.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\printButton.png"));
print.setBackground(Color.GREEN);
billCounter.add(print);

cancel.setBounds(150,625,80,30);
cancel.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\cancelButton.png"));
billCounter.add(cancel);


// category

JButton category1=new JButton("ICECREAM PRODUCTS");
JButton category2=new JButton("MILK PRODUCTS");
JButton category3=new JButton("OTHER PRODUCTS");

 category1.setBounds(20, 252, 170,50 );
 category2.setBounds(20, 302, 170,50 );  
 category3.setBounds(20, 352, 170,50 );
 Display.add(category1);
 Display.add(category2);
 Display.add(category3);

//



//logoutButton

JButton logOut=new JButton("LOGOUT");
 
logOut.setBounds(1000,75,100,30);

logOut.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\logout.png"));
Display.add(logOut);

//


//toolbar

JToolBar tools=new JToolBar();
tools.setBounds(0,0,1158,30);
tools.setBackground(Color.BLACK);

JButton b1=new JButton("CONTACT US");
tools.add(b1);
 
 Display.add(tools);
 
 //
 
 //scrollbar
 
 JScrollBar scroll=new JScrollBar(JScrollBar.VERTICAL);
   scroll.setBounds(565,0,15,470);
   scroll.setBackground(Color.BLACK);
   productPanel.add(scroll);
  
  //
  
  
  
  
Display.add(productPanel);
Display.add(billCounter);
Display.setVisible(true);

// Change date daily
 

JLabel dateChange=new JLabel();
billCounter.add(dateChange);

dateChange.setBounds(50,10,100,30);


Date d= new Date();
d.changeDate(dateChange);

//



//change time continously

JLabel timeChange=new JLabel();
billCounter.add(timeChange);

timeChange.setBounds(50,35,100,30);


Time t= new Time();
t.changeTime(timeChange);

//

		
	} 
	
}

