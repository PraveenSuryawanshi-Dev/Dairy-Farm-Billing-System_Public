/**
 * 
 */

/**
 * @author Jigar and Praveen
 *
 */

import java.awt.*;
import java.io.File;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.filechooser.*;

public class AdminPage extends JPanel   {

	/**
	 * @param args
	 */
	private JComboBox selectCategory;
	private JTextField name;
	private JTextField filepath;
	private JTextArea productDescription;
	private JTextField rate;
	private  JTextField qty;
	private JTextField id;
	static private String uname;
	
	public AdminPage()
	{
		
	}
	
	public AdminPage(String uname)
	{
	  this.uname=uname;	
	}
	
	static public String getUname()
	{
		return uname;
	}
	
	public  static void main(String [] args) throws Exception {	
		 		
	   	
	 
		AdminPage framepanel=new AdminPage();
		
		 String uname=getUname();
		
		framepanel.setLayout(null);
		framepanel.setBackground(Color.darkGray);
		framepanel.setBounds(0, 0,1152,870);
		SqlConnection sql=new SqlConnection();
		  sql.activateDB();
		  
		  JButton update1=new JButton("UPDATE");
		  JButton save=new JButton("SAVE");
		
				//AdminPage a=new AdminPage();
				JFrame adminPage=new JFrame("WELCOME ADMIN");
				adminPage.setResizable(false);
				
				  adminPage.setBackground(Color.BLACK);
				adminPage.setLayout(null);
				adminPage.setSize(1152,870);
				
			JLabel notification=new JLabel("");	
			notification.setForeground(Color.YELLOW);
		framepanel.add(notification);
		notification.setBounds(500,50, 500, 30);
			

				JPanel opName=new JPanel();
				opName.setLayout(null);
				opName.setBackground(Color.BLACK);
				//opName.setBounds(200,250,580,470);
				opName.setBounds(20,160,360,530);
				JButton insertItem=new JButton( "INSERT ITEM");
				JButton updateItem=new JButton("UPDATE ITEM");
				JButton deleteItem=new JButton("DELETE ITEM");
				JButton insertEmp=new JButton("INSERT EMP");
				JButton updateEmp=new JButton("UPDATE EMP");
				JButton deleteEmp=new JButton("DELETE EMP");
				 
				
			
				 
				
				insertItem.setBackground(Color.GRAY);
				updateItem.setBackground(Color.GRAY);
				deleteItem.setBackground(Color.GRAY);
				insertEmp.setBackground(Color.GRAY);
				updateEmp.setBackground(Color.GRAY);
				deleteEmp.setBackground(Color.GRAY);
				
				Font font=new Font("",Font.BOLD,15);
				
				insertItem.setForeground(Color.white);
				   insertItem.setFont(font);
				   
				   updateItem.setForeground(Color.white);
				   updateItem.setFont(font);
					   
				   deleteItem.setForeground(Color.white);
				   deleteItem.setFont(font);
						   
				   insertEmp.setForeground(Color.white);
				   insertEmp.setFont(font);
							   
				   updateEmp.setForeground(Color.white);
				   updateEmp.setFont(font);
				    
				   deleteEmp.setForeground(Color.white);
				   deleteEmp.setFont(font);
				
				
				insertItem.setBounds(20,20, 150,150);
				updateItem.setBounds(20,190,150,150);
				deleteItem.setBounds(20,360,150,150);
				insertEmp.setBounds(190,20,150,150);
				updateEmp.setBounds(190,190,150,150);
				deleteEmp.setBounds(190,360,150,150);
				
				opName.add(insertItem);
				opName.add(updateItem);
				opName.add(deleteItem);
				opName.add(insertEmp);
				opName.add(updateEmp);
				opName.add(deleteEmp);
				
				 framepanel.add(opName);
				
				
				
				
		     JPanel operation=new JPanel();
		        
		     
		        //operation.setBounds(800,130,300,675);
		        operation.setBounds(400,100,680,690);
		        operation.setLayout(null);
		        operation.setBackground(Color.white);
			

				JButton logOut=new JButton("LOGOUT");
				
				logOut.addActionListener(new LogOutAdmin(adminPage));
				 
				logOut.setBounds(985,55,100,30);

				logOut.setBackground(Color.GRAY);
				logOut.setForeground(Color.white);
				logOut.setFont(font);
				
				framepanel.add(logOut);
                    
				
				//logOut.addActionListener(new LogOutButton());
				//

				JLabel itemName=new JLabel("NAME :");
				itemName.setBounds(15, 15, 100, 30);
				operation.add(itemName);
				
				
				JTextField name=new JTextField(25);
				name.setBounds(70,15,150,30);
				operation.add(name);
				
				
				JLabel category=new JLabel("CATEGORY :");
				category.setBounds(250,15,70,30);
				operation.add(category);
				
				String []categories={"SELECT PRODUCT TYPE *","MILK PRODUCTS","ICE CREAMS","OTHER PRODUCTS"};
				JComboBox selectCategory=new JComboBox(categories);
				selectCategory.setBounds(350,15,160,30);
				operation.add(selectCategory);
				selectCategory.addItemListener(new SaveButton(selectCategory)); 
				
				selectCategory.addItemListener(new Update1(selectCategory));
				
				selectCategory.setBackground(Color.GRAY);
				
				selectCategory.setForeground(Color.white);
				selectCategory.setFont(font); 
				
				
				JLabel imgsrc=new JLabel("IMAGE SOURCE :");
				imgsrc.setBounds(15, 80, 100, 30);
				operation.add(imgsrc);
				
				JTextField filepath=new JTextField(30);
			   
				filepath.setBounds(120,80,350,30);
				 
				
				operation.add(filepath);
				
				JButton choose=new JButton("choose");
				operation.add(choose);
				choose.setBackground(Color.GRAY);
				
				choose.setForeground(Color.white);
				choose.setFont(font);
				
				choose.setBounds(470,80,90,30);
				
				
				
				JButton img=new JButton("Click On Me...");
				operation.add(img);
				img.setBounds(120,150,150,150);
				
				img.setBackground(Color.GRAY);
				
				img.setForeground(Color.white);
				img.setFont(font);
				
				img.addActionListener(new ChooseButton(filepath,img));
				
					
				
				JTextArea productDescription=new JTextArea("Description :",40,40);
				productDescription.setBackground(Color.GRAY);
				productDescription.setForeground(Color.WHITE);
				
			
				
		
		 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
					int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
					
					 
					
		
					
					  JScrollPane  productDescriptionJsp= new JScrollPane(productDescription,v,h);
					  productDescriptionJsp.setBounds(350,150,200,100);
					
					//custAddress.setBounds(350,150,200,100);
					operation.add(productDescriptionJsp);
				
				
				
				
				choose.addActionListener(new ChooseButton(filepath,img));
				
				JLabel price=new JLabel("PRICE :");
				operation.add(price);
				 price.setBounds(15,375,70,30);
						
				 JTextField rate=new JTextField(25);
				 operation.add(rate);
				 rate.setBounds(90,375,70,30);
				 
				 JLabel stock=new JLabel("STOCK :");
				 operation.add(stock);
				 stock.setBounds(15,440,70,30);
							
					 JTextField qty=new JTextField(25);
					 operation.add(qty);
					 qty.setBounds(90,440,70,30);
				 
					 JLabel pid=new JLabel("ITEM_ID :");
					 operation.add(pid);
					 pid.setBounds(15,500,70,30);
								
						 JTextField id=new JTextField(25);
						 operation.add(id);
						 id.setBounds(90,500,70,30); 
					 
					 
						
						 
							

						
							//operation.add(save);
							
							 save.addActionListener( new SaveButton(name,filepath,productDescription,rate,qty,id,notification ,uname));
						 
							JButton reset=new JButton("RESET");
							 
							reset.setBounds(350,620,100,30);

							reset.setBackground(Color.GRAY);
							operation.add(reset);
							
							reset.setForeground(Color.white);
							reset.setFont(font);
							
							 reset.addActionListener(new Reset(name,filepath,img,rate,qty,id,productDescription,selectCategory));
							
							insertItem.addActionListener(new InsertItem( save,operation,update1));
							updateItem.addActionListener(new  UpdateItem(name,filepath,img,rate,qty,id,productDescription,operation,update1, save,notification ,uname,selectCategory)); 
					//-------------------------------------
							save.setForeground(Color.white);
							save.setFont(font);
						
							update1.setForeground(Color.white);
							update1.setFont(font);
			      
							//selectCategory.addItemListener(new Update1(selectCategory));
			      //
//------------------------------------------------------------------------------------------------------------------------------				
				
                 JPanel operation2=new JPanel();
		        

		        //operation.setBounds(800,130,300,675);
                 operation2.setBounds(400,100,680,690);
                 operation2.setLayout(null);
                 operation2.setBackground(Color.white);
			

				
				

				JLabel empName=new JLabel("NAME :");
				empName.setBounds(15, 15, 100, 30);
				operation2.add(empName);
				
				
				JTextField nameField=new JTextField(25);
				nameField.setBounds(70,15,150,30);
				operation2.add(nameField);
				
				
				nameField.addKeyListener(new KeyAdapter()
			    	{
						public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						if (!((c>=65 && c<=90) || (c>=97 && c<=122) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE)))
							e.consume();
					}
			});
				
				
				JLabel EmpCategory=new JLabel("CATEGORY :");
				EmpCategory.setBounds(250,15,70,30);
				operation2.add(EmpCategory);
				
				String []empCategories={"SELECT EMPLOYEE","ADMIN","USER"};
				JComboBox empSelectCategory=new JComboBox(empCategories);
				empSelectCategory.setBounds(350,15,160,30);
				operation2.add(empSelectCategory);
				
		
				
				
				
				empSelectCategory.setBackground(Color.GRAY);
				
				empSelectCategory.setForeground(Color.white);
				empSelectCategory.setFont(font); 
				
				
				JLabel empImgSrc=new JLabel("IMAGE SOURCE :");
				empImgSrc.setBounds(15, 80, 100, 30);
				operation2.add(empImgSrc);
				
				JTextField empFilepath=new JTextField(30);
			   
				empFilepath.setBounds(120,80,350,30);
				 
				
				operation2.add(empFilepath);
				
				JButton empChoose=new JButton("choose");
				operation2.add(empChoose);
				empChoose.setBackground(Color.GRAY);
				
				empChoose.setForeground(Color.white);
				empChoose.setFont(font);
				
				empChoose.setBounds(470,80,90,30);
				
				
				
				JButton empImg=new JButton("Click On Me...");
				operation2.add(empImg);
				empImg.setBounds(120,150,150,150);
				
				empImg.setBackground(Color.GRAY);
				
				empImg.setForeground(Color.white);
				empImg.setFont(font);
				
				empImg.addActionListener(new ChooseButton(empFilepath,empImg));
				
				
				JTextArea empAddress=new JTextArea("address :",40,40);
				empAddress.setBackground(Color.GRAY);
				empAddress.setForeground(Color.WHITE);
				
				   JScrollPane  empAddressJsp= new JScrollPane(empAddress,v,h);
				   empAddressJsp.setBounds(350,150,200,100);
				
				
				
				// empAddress.setBounds(350,150,200,100);
				operation2.add(empAddressJsp);
				
				
				
				
				
				empChoose.addActionListener(new ChooseButton(empFilepath,empImg));
				
			
				 
					JLabel eMail=new JLabel("E_MAIL :");
					operation2.add(eMail);
					eMail.setBounds(15,325,150,30);
					
					 
							
					 JTextField eMailField=new JTextField(40);
					 operation2.add(eMailField);
					 eMailField.setBounds(95,325,250,30);
					
					 
					 JLabel mobNo=new JLabel("MOBILE :");
						operation2.add(mobNo);
						mobNo.setBounds(350,325,150,30);
						
								
						 JTextField mobNoField=new JTextField(14);
						 operation2.add(mobNoField);
						 mobNoField.setBounds(460,325,100,30);
						
				 
				
				JLabel userName=new JLabel("USER_NAME :");
				operation2.add(userName);
				userName.setBounds(15,375,150,30);
						
				 JTextField userNameField=new JTextField(80);
				 operation2.add(userNameField);
				 userNameField.setBounds(95,375,250,30);
				 
				 JLabel dob=new JLabel("DOB :");
					operation2.add(dob);
					dob.setBounds(350,375,150,30);
							
					
					
					
					
					// JTextField dobField=new JTextField(80);
					DateComboBox1		 dobField=new DateComboBox1();
					 operation2.add(dobField);
					 dobField.setBounds(488,375,150,30);
				 
					 /* dobField.addActionListener(new ItemAdaptar()
					  {
					 
				 
					
						public void itemStateChanged(ItemEvent p)
						 {
						 	if(p.getSource()==dobField)
						 	{
						 		System.out.println("tbookno is selected");
						 	String	sbookno = dobField.getSelectedItem().toString();
						 		System.out.println(sbookno);
						 	}
						}
					  });*/
					 
					 
				 JLabel empPassword=new JLabel("PASSWORD :");
				 operation2.add(empPassword);
				 empPassword.setBounds(15,440,150,30);
							
					 JTextField empPasswordField=new JTextField(80);
					 operation2.add(empPasswordField);
					 empPasswordField.setBounds(95,440,250,30);
					 
					 JLabel doj=new JLabel("DOJ :");
						operation2.add(doj);
						doj.setBounds(350,440,150,30);
								
						 //JTextField dojField=new JTextField(80);
						DateComboBox1 dojField=new DateComboBox1();
						 operation2.add(dojField);
						 dojField.setBounds(488,440,150,30);
						 
				 
					 JLabel empEid=new JLabel("EMP_ID :");
					 operation2.add(empEid);
					 empEid.setBounds(15,500,70,30);
								
						 JTextField empEidField=new JTextField(25);
						 operation2.add(empEidField);
						 empEidField.setBounds(90,500,70,30); 
					 
						 JLabel salary=new JLabel("SALARY :");
						 operation2.add(salary);
						 salary.setBounds(350,500,70,30);
									
							 JTextField salaryFiled=new JTextField(25);
							 operation2.add(salaryFiled);
							 salaryFiled.setBounds(460,500,100,30);  
						
						 
							

							 JButton empSave=new JButton("SAVE");
							 
					          empSave.setBounds(200,620,100,30);

							 empSave.setBackground(Color.GRAY);
								
								
								empSave.setForeground(Color.WHITE);
								empSave.setFont(font);
							
								
								JButton empUpdate=new JButton("UPDATE");
								 
								empUpdate.setBounds(200,620,100,30);

						         empUpdate.setBackground(Color.GRAY);
									
									
								empUpdate.setForeground(Color.WHITE);
								empUpdate.setFont(font);
								
								
						 
							JButton empReset=new JButton("RESET");
							 
							empReset.setBounds(350,620,100,30);

							empReset.setBackground(Color.GRAY);
							operation2.add(empReset);
							
							empReset.setForeground(Color.white);
							empReset.setFont(font);
							
					
						updateEmp.addActionListener(new Search2(empSave,empUpdate,operation2,nameField,empSelectCategory,empFilepath,empImg,empAddress,eMailField,mobNoField,userNameField,dobField,empPasswordField,dojField,empEidField,salaryFiled));
						
						//dobField.addItemListener(new  UpdateEmployee(dobField,dojField,empSelectCategory));
						//dojField.addItemListener(new   UpdateEmployee(dobField,dojField, empSelectCategory));
						
						
						
							insertEmp.addActionListener(new Switch(insertEmp,operation,operation2, framepanel,empSave,empUpdate));
							insertItem.addActionListener(new Switch(insertItem,operation,operation2, framepanel));
							
						empUpdate.addActionListener(new  UpdateEmployee(nameField,empSelectCategory,empFilepath,empImg,empAddress,eMailField,mobNoField,userNameField,dobField,empPasswordField,dojField,empEidField,salaryFiled,notification));
				
							
						empSave.addActionListener(new  SaveEmployee(nameField,empSelectCategory,empFilepath,empImg,empAddress,eMailField,mobNoField,userNameField,empPasswordField,empEidField,salaryFiled,notification));
						//dobField.addItemListener(new  SaveEmployee(dobField,dojField));
						//dojField.addItemListener(new  SaveEmployee(dobField,dojField));
					
				        System.out.println( " :" +insertEmp.getText());
				        
				        empReset.addActionListener(new EmpReset(nameField,empSelectCategory,empFilepath,empImg,empAddress,eMailField,mobNoField,userNameField,dobField,empPasswordField,dojField,empEidField,salaryFiled,notification));
//-------------------------------------------------------------------------------------------------------------------------------
				        
				        
				        JPanel memberPanel=new JPanel();
				        memberPanel.setLayout(null);
				        memberPanel.setBackground(Color.BLACK);
						//opName.setBounds(200,250,580,470);
				        memberPanel.setBounds(20,160,290,530);
						JButton insertMember=new JButton( "INSERT MEMBER");
						JButton updateMember=new JButton("UPDATE MEMBER");
						JButton deleteMember=new JButton("DELETE MEMBER");
					
						 
						
						
						 
						
						insertMember.setBackground(Color.GRAY);
						updateMember.setBackground(Color.GRAY);
						deleteMember.setBackground(Color.GRAY);
						
						
						
						
						insertMember.setForeground(Color.white);
						insertMember.setFont(font);
						   
						updateMember.setForeground(Color.white);
						updateMember.setFont(font);
							   
						deleteMember.setForeground(Color.white);
						deleteMember.setFont(font);
								   
						  
						
						insertMember.setBounds(20,20, 250,150);
						updateMember.setBounds(20,190,250,150);
						deleteMember.setBounds(20,360,250,150);
						
						
						memberPanel.add(insertMember);
						memberPanel.add(updateMember);
						memberPanel.add(deleteMember);
						
						
						
						
						
						JPanel operation3=new JPanel();
				        

				        //operation.setBounds(800,130,300,675);
						operation3.setBounds(400,100,680,690);
						operation3.setLayout(null);
						operation3.setBackground(Color.white);
					

						
						

						JLabel custName=new JLabel("NAME :");
						custName.setBounds(15, 15, 100, 30);
						operation3.add(custName);
						
						
						JTextField custnameField=new JTextField("",25);
						custnameField.setBounds(70,15,150,30);
						operation3.add(custnameField);
						custnameField.addKeyListener(new KeyAdapter()
				    	{
							public void keyTyped(KeyEvent e) {
							char c = e.getKeyChar();
							if (!((c>=65 && c<=90) || (c>=97 && c<=122) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE)))
								e.consume();
						}
				});
					/*	
						JLabel EmpCategory=new JLabel("CATEGORY :");
						EmpCategory.setBounds(250,15,70,30);
						operation2.add(EmpCategory);
						
						String []empCategories={"SELECT EMPLOYEE","ADMIN","USER"};
						JComboBox empSelectCategory=new JComboBox(empCategories);
						empSelectCategory.setBounds(350,15,160,30);
						operation2.add(empSelectCategory); 
						
				
						
						
						
						empSelectCategory.setBackground(Color.GRAY);
						
						empSelectCategory.setForeground(Color.white);
						empSelectCategory.setFont(font);   */
						
						
						JLabel custImgSrc=new JLabel("IMAGE SOURCE :");
						custImgSrc.setBounds(15, 80, 100, 30);
						operation3.add(custImgSrc);
						
						JTextField custFilepath=new JTextField(30);
					   
						custFilepath.setBounds(120,80,350,30);
						 
						
						operation3.add(custFilepath);
						
						JButton custChoose=new JButton("choose");
						operation3.add(custChoose);
						custChoose.setBackground(Color.GRAY);
						
						custChoose.setForeground(Color.white);
						custChoose.setFont(font);
						
						custChoose.setBounds(470,80,90,30);
						
						
						
						JButton custImg=new JButton("Click On Me...");
						operation3.add(custImg);
						custImg.setBounds(120,150,150,150);
						
						custImg.setBackground(Color.GRAY);
						
						custImg.setForeground(Color.white);
						custImg.setFont(font);
						
						custImg.addActionListener(new ChooseButton(custFilepath,custImg));
						
						
						JTextArea custAddress=new JTextArea("address :",40,40);
						custAddress.setBackground(Color.GRAY);
						custAddress.setForeground(Color.WHITE);
						
						  JScrollPane  custAddressJsp= new JScrollPane(custAddress,v,h);
						  custAddressJsp.setBounds(350,150,200,100);
						
						//custAddress.setBounds(350,150,200,100);
						operation3.add(custAddressJsp);
						
						
						
						
						
						custChoose.addActionListener(new ChooseButton(custFilepath,custImg));
						
					
						 
							JLabel custEMail=new JLabel("E_MAIL :");
							operation3.add(custEMail);
							custEMail.setBounds(15,325,150,30);
							
							 
									
							 JTextField custEMailField=new JTextField("",40);
							 operation3.add(custEMailField);
							 custEMailField.setBounds(95,325,250,30);
							
							 
							 JLabel custMobNo=new JLabel("MOBILE :");
								operation3.add(custMobNo);
								custMobNo.setBounds(350,325,150,30);
								
										
								 JTextField custMobNoField=new JTextField("",14);
								 operation3.add(custMobNoField);
								 custMobNoField.setBounds(460,325,100,30);
								
						 
						
						JLabel custUserName=new JLabel("USER_NAME :");
						operation3.add(custUserName);
						custUserName.setBounds(15,375,150,30);
								
						 JTextField custUserNameField=new JTextField("",80);
						 operation3.add(custUserNameField);
						 custUserNameField.setBounds(95,375,250,30);
						 
						 JLabel custDob=new JLabel("DOB :");
							operation3.add(custDob);
							custDob.setBounds(350,375,150,30);
									
							// JTextField custDobField=new JTextField("",80);
							DateComboBox1 custDobField=new DateComboBox1();
							 operation3.add(custDobField);
							 custDobField.setBounds(480,375,120,30);
						 
						 
						 JLabel  custPassword=new JLabel("PASSWORD :");
						 operation3.add(custPassword);
						 custPassword.setBounds(15,440,150,30);
						
							 JTextField custPasswordField=new JTextField(80);
							 operation3.add(custPasswordField);
							 custPasswordField.setBounds(95,440,250,30);
							 
							 JLabel custDoj=new JLabel("DOJ :");
								operation3.add(custDoj);
								custDoj.setBounds(350,440,150,30);
										
								// JTextField custDojField=new JTextField("",80);
								DateComboBox1 custDojField=new DateComboBox1();
								 operation3.add(custDojField);
								 custDojField.setBounds(480,440,130,30);
								 
						 
							 JLabel CustEmpEid=new JLabel("CUST_ID :");
							 operation3.add(CustEmpEid);
							 CustEmpEid.setBounds(15,500,70,30);
										
								 JTextField custEidField=new JTextField(25);
								 operation3.add(custEidField);
								 custEidField.setBounds(90,500,70,30); 
							 
								 JLabel custAmt=new JLabel("AMOUNT :");
								 operation3.add(custAmt);
								 custAmt.setBounds(350,500,70,30);
											
									 JTextField cusAmtFiled=new JTextField("",25);
									 operation3.add(cusAmtFiled);
									 cusAmtFiled.setBounds(460,500,100,30);  
								
								 
									

									 JButton custSave=new JButton("SAVE");
									 
									 custSave.setBounds(200,620,100,30);

									 custSave.setBackground(Color.GRAY);
										
										
									 custSave.setForeground(Color.WHITE);
									 custSave.setFont(font);
									
										
										JButton custUpdate=new JButton("UPDATE");
										 
										custUpdate.setBounds(200,620,100,30);

										custUpdate.setBackground(Color.GRAY);
											
											
										custUpdate.setForeground(Color.WHITE);
										custUpdate.setFont(font);
										
										
								 
									JButton custReset=new JButton("RESET");
									 
									custReset.setBounds(350,620,100,30);

									custReset.setBackground(Color.GRAY);
									operation3.add(custReset);
									
									custReset.setForeground(Color.white);
									custReset.setFont(font);
									
							
								
									insertMember.addActionListener(new InsertMember(operation3, framepanel,custSave,custUpdate));
									
								updateMember.addActionListener(new Search3(custUpdate,custSave,operation3,custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled ,custImg));
								
				
								
								custSave.addActionListener(new CustSave(custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled, notification,uname));
						        
									
							custUpdate.addActionListener(new CustUpdate(custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled,notification,uname));
								
								custReset.addActionListener(new CustReset(custnameField,custAddress,custFilepath,custEMailField,custMobNoField,custUserNameField,custDobField,custPasswordField,custDojField,custEidField,cusAmtFiled, notification,custImg));
				
//-------------------------------------------------------------------------------------------------	------			
				
				//toolbar

				JToolBar tools=new JToolBar();
				tools.setBounds(0,0,1158,30);
				tools.setBackground(Color.BLACK);

				JButton membership=new JButton("NEXT >>>");
				
				
				membership.setBackground(Color.GRAY);
				tools.add(membership);
				
				membership.addActionListener(new Membership(opName,memberPanel,framepanel));
				
				
          

				
				JButton prev=new JButton("<<< PREVIOUS");
				
				
				prev.setBackground(Color.GRAY);
				tools.add(prev);
				
			     prev.addActionListener(new Prev(opName, memberPanel,framepanel));
				
				
				 
				 adminPage.add(tools);
	

				  
				  
				  
				// framepanel.add(opName);
				// framepanel.add(operation2);
				
				 
				 adminPage.add(framepanel);
				 adminPage.setVisible(true);

		 deleteItem.addActionListener(new Delete(0));
		 deleteEmp.addActionListener(new Delete(1));
		 deleteMember.addActionListener(new Delete(2));
		
		
	}



	
	


	

}
