
/**
 * 
 */

/**
 * @author Jigar Shah & Praveen Suryawanshi
 *
 */

//import java.awt.image.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 class DisplayItem extends JPanel  implements ActionListener {

	

	/**
	 * @param args
	 */
	 private JLabel timeChange ; 
	 JLabel itemCount;
	 private JLabel totalBill;
     private String username;
     
      static int count=0;
     
   
     
     public DisplayItem()
	 {
		
	 }
		
	 public DisplayItem(String username)
	 {
		 this.username=username;
	 }
	 
	 
	 public void paintComponent(Graphics g)
		{
			 super.paintComponent(g);
			  String path="/home/ty156/Downloads/BILLING SYSTEM/DAIRY FARM BILLING SYSTEM/img/displayItem.png";
			 ImageIcon displayImage=new ImageIcon(path);
			 displayImage.paintIcon(this,g, 0, 30);
		}
	 
	 
	
	 
	 
	void displayItem() throws Exception
	 {
		
		 new PayMember(username);
		
		itemCount=new JLabel(""+count);
		
		//itemCount=new JLabel("0");
		
	 	new BillBuffer(itemCount,count);

		
		// TODO Auto-generated method stub
		DisplayItem display=new DisplayItem();
		
		  
		
		  // d1.setLayout(null);
		totalBill=new JLabel("0.00");
		JPanel productDp = new JPanel();
		 
		productDp.setLayout(new BoxLayout(productDp,BoxLayout.Y_AXIS));
	JFrame Display=new JFrame("WELCOME");
	Display.setResizable(false);
	
	Display.setLayout(null);
	 Display.setSize(1152,870);
	 
	 display.setLayout(null);
	 display.setSize(1152,870);
	 
	 Display.add(display);
	 
     System.out.println("block 1");
	JPanel productPanel=new JPanel();
	productPanel.setLayout(null);
	productPanel.setBackground(Color.BLACK);
	productPanel.setBounds(200,250,580,470);

	//Display.add(productPanel);
	
	//trial panels
	JPanel milkProducts = new JPanel();
	JPanel  icecreamProducts = new JPanel();
	JPanel  otherProducts = new JPanel();
	
	milkProducts.setLayout(new GridLayout(5,5,8,8));
	milkProducts.setBackground(Color.BLACK);
	//milkProducts.setBounds(200,250,580,470);
	
	//icecreamProducts.setLayout(null);
	
	icecreamProducts.setLayout(new GridLayout(5,5,8,8));	
	icecreamProducts.setBackground(Color.BLACK);
	icecreamProducts.setBounds(200,250,580,1000);
	
	otherProducts.setLayout(new GridLayout(5,5,8,8));
	otherProducts.setBackground(Color.BLACK);
	//otherProducts.setBounds(200,250,580,470);
	
	
	 JTextField stockqty=new JTextField("1");
	 
	 stockqty.setForeground(Color.RED);
	 
	
	  SqlConnection call=new SqlConnection();
	  
      call.loadProductsicecream(icecreamProducts,Display,productDp,totalBill,stockqty );
      
      call.loadProductsmilk(milkProducts,Display,productDp,totalBill,stockqty);


 	   call.loadProductother(otherProducts,Display,productDp,totalBill,stockqty);
 	   
 	   //scrollpane-------------------------------
 	   
 	  int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
 	   JScrollPane  icecreamProductsJsp= new JScrollPane(icecreamProducts,v,h);
 	   
 	  icecreamProductsJsp.setBounds(200,250,580,470);
 	  
 	 JScrollPane  milkProductsJsp= new JScrollPane(milkProducts,v,h);
	   
 	milkProductsJsp.setBounds(200,250,580,470);
	  
	  JScrollPane  otherProductsJsp= new JScrollPane(otherProducts,v,h);
	   
	  otherProductsJsp.setBounds(200,250,580,470);
 	  
 	  
 	  
 	  
 	   
 	  JButton category1=new JButton("ICECREAM");
 	 category1.setToolTipText("CLICK TO ICECREAM ");
 	
 		JButton category2=new JButton("MILK");
 		category2.setToolTipText("CLICK TO MILK ");
 		 
 		JButton category3=new JButton("OTHER");
 		category3.setToolTipText("CLICK TO OTHER ");
 		
 		JButton searchButton=new JButton("SEARCH");
 		searchButton.setToolTipText("CLICK TO SEARCH ");
 		
 		JTextField  search = new JTextField("item name",20);
 	   
 		
 		 Font myFont= new Font("",Font.BOLD,20);
 		category1.setBackground(Color.orange);
 		category1.setFont(myFont);
 		category2.setBackground(Color.orange);
 		category2.setFont(myFont);
 		category3.setBackground(Color.orange);
 		category3.setFont(myFont);
 		
 		searchButton.setBackground(Color.orange);
 		searchButton.setFont(myFont);
 		

 		 category2.setBounds(20, 252, 170,50 );
 		 category1.setBounds(20, 302, 170,50 );  
 		 category3.setBounds(20, 352, 170,50 );
 		  search.setBounds(20, 410, 170, 30);
 		 searchButton.setBounds(20, 440, 170, 30);
 		 
 		 
 		display.add(category1);
 		display.add(category2);	
 		display.add(category3);
 		display.add(search);
 		display.add(searchButton);
 		 
 		
 		
 		 
 	category1.addActionListener( new  IcecreamCategoryButtons(icecreamProductsJsp,milkProductsJsp,otherProductsJsp,Display));
    category2.addActionListener(new MilkCategoryButtons(icecreamProductsJsp,milkProductsJsp,otherProductsJsp,Display));
 	 category3.addActionListener(new OtherproductsCategoryButtons(icecreamProductsJsp,milkProductsJsp,otherProductsJsp,Display));

 	searchButton.addActionListener(new Search(search,productDp,totalBill,stockqty));
	 
	System.out.println("block 2");


	System.out.println("block 3");
	  

	JPanel billCounter=new JPanel();
 	//productDp = new JPanel();
//	productDp.setBounds(5,120,290,468);
	productDp.setBackground(Color.WHITE);
	
	
	  int v1=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			int h1=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			
	 	   JScrollPane  productDpJsp= new JScrollPane(productDp,v1,h1);
	 	  productDpJsp.setBounds(5,120,290,468);
	
	billCounter.add(productDpJsp);

	billCounter.setBounds(800,130,300,675);
	billCounter.setLayout(null);
	billCounter.setBackground(Color.ORANGE);
	JLabel date=new JLabel("DATE :");

	JLabel time=new JLabel("TIME  :");
	JLabel billno=new JLabel("BILL NO. :");
	JLabel menu=new JLabel(" MENU :");
	JLabel qty=new JLabel("ITEMS :");
	JLabel total=new JLabel("Total :");

	 
	JButton pay=new JButton("PRINT ");
	pay.setToolTipText("PRINT BILL");
	
	JButton cancel=new JButton("CANCEL");
	date.setBounds(10,10,100,30);
	billCounter.add(date);
	
	JButton memberButton = new JButton("MEMBERSHIP");

	memberButton.setToolTipText("MEMBERSHIP");
	
	memberButton.setBounds(150,10,130,30);
	memberButton.setBackground(Color.LIGHT_GRAY);
	 billCounter.add(memberButton);
	 
	 memberButton.addActionListener(new ActionListener()
	 {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new MembershipPanel();
			
		}
		 
	 });
 
	qty.setBounds(100,85,100,30);
	itemCount.setBounds(150,85,100,30);
	
	itemCount.setForeground(Color.RED);
	itemCount.setFont(new Font("",Font.BOLD,15));
	
	time.setBounds(10,35,100,30);
	billCounter.add(time);
	billCounter.add(qty);
	billno.setBounds(10,60,100,30);
	billCounter.add(billno);

	menu.setBounds(10,85,100,30);
	billCounter.add(menu);

	total.setBounds(10,583,100,30);
	billCounter.add(total);
	
	billCounter.add(itemCount);
	

	
	
	 
	 
	 
	     totalBill.setBounds(60,583,100,30);
	     billCounter.add(totalBill);
	     
	    
	     Font font= new Font("",Font.BOLD,15);
	     
	   
         pay.setFont(font);
         
        pay.setBounds(10,85,100,30);
	    /// pay.setBounds(20,625,100,30);
	
	     pay.setBackground(Color.DARK_GRAY);
	     pay.setForeground(Color.ORANGE);
	billCounter.add(pay);
	
	
	 pay.addActionListener(new BillBuffer(username,1,""));
	 
	cancel.setForeground(Color.ORANGE);
	cancel.setBackground(Color.DARK_GRAY);
	cancel.setFont(font);
	cancel.setBounds(150,625,100,30);
	
	billCounter.add(cancel);

	System.out.println("block 4");
	// category

	cancel.addActionListener(new CancelButton(itemCount,count));
 
	 
	 
	//

 JLabel stock=new JLabel("STOCK :");

 
 stock.setBounds(600,200,130,30);
	
 stock.setBackground(Color.orange);
 stock.setFont(myFont);
 display.add(stock);

 stockqty.setBounds(690,200,50,30);
	

 display.add(stockqty);
 
 
	//logoutButton

	JButton logOut=new JButton("LOGOUT");
	 
	logOut.setBounds(970,75,130,30);
	
	logOut.setBackground(Color.orange);
	logOut.setFont(myFont);

	//logOut.setIcon(new ImageIcon("C:\\Users\\Vijay\\Desktop\\BILLING SYSTEM\\DAIRY FARM BILLING SYSTEM\\img\\logout.png"));
	display.add(logOut);
	
	logOut.addActionListener(new LogOutButton(Display,username));

	//
	System.out.println("block 5");
	
	

	//toolbar

	JToolBar tools=new JToolBar();
	tools.setBounds(0,0,1158,30);
	tools.setBackground(Color.BLACK);

	JButton b1=new JButton("CONTACT US");
	
	b1.setBackground(Color.orange);
	b1.setFont(myFont);
	
	
	tools.add(b1);
	b1.addActionListener(new ContactUS());
	
	
   //JButton b2=new JButton(" BLANK ");
	
	//b2.setBackground(Color.orange);
	//b2.setFont(myFont);
	
	
//	tools.add(b2);
	 //b2.addActionListener(new Blank(icecreamProducts,milkProducts,otherProducts, Display));
	
	
 JButton b3=new JButton(" CHART-SHEETS ");
	
	b3.setBackground(Color.orange);
	b3.setFont(myFont);
	
	
	tools.add(b3);
//	b3.addActionListener(new Blank(icecreamProducts,milkProducts,otherProducts, Display));
	
	
    JButton b4=new JButton(" PRODUCTS-DETAILS ");
	
	b4.setBackground(Color.orange);
	b4.setFont(myFont);
	
	
	tools.add(b4);
	b4.addActionListener(new ProductDetails());
	
	
	JButton Passwrd=new JButton("PASSWORD");
	 //JButton b2=new JButton(" BLANK ");
		
		Passwrd.setBackground(Color.orange);
		Passwrd.setFont(myFont);
		
		Passwrd.addActionListener (new ChangeScreenPassword(username));
		
		tools.add(Passwrd);
		
		
		
	 
	display.add(tools);
	 
	
	  
	   System.out.println("block 6");
	  
	  
	  Display.add(productPanel);
	   display.add(billCounter);
	Display.setVisible(true);

	// Change date daily
	 

	JLabel dateChange=new JLabel();
	billCounter.add(dateChange);

	dateChange.setBounds(50,10,100,30);


	Date d1= new Date();
	d1.changeDate(dateChange);

	//
	System.out.println("block 7");


	//change time continously

	JLabel timeChange=new JLabel();
	billCounter.add(timeChange);
      timeChange.setFont(myFont);
	timeChange.setBounds(50,35,100,30);

  	Time t= new Time(timeChange);//causin problem in timer delayin n not placing the components
	 t.start();

	
	System.out.println("block 8");
	//Change Pasword	
	
	
	
	
		}
	
	




	public static void main(String[] args) throws Exception
	{
		DisplayItem d = new DisplayItem();
		 d.displayItem();

		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



		
	  
	
}

