package view;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.AdminControl;
import Controller.EmployeeControl;
import Model.Stock;
public class EmployeeView {
	static Scanner sc=new Scanner(System.in);
	static int m;
	public void employeelogin() {
	System.out.println("1---> Log In");
	System.out.println("2---> signup");
           m=sc.nextInt();
	
	employeeMethods() ;
	}

	public void employeeMethods() {
		EmployeeControl ec=new EmployeeControl();
		if(m==1) {
			while(true)
			{
			System.out.println("Enter email_id:");
			String email_id=sc.next();
			sc.nextLine();
			System.out.println("Enter password:");
			String password=sc.next();
			boolean b= ec.employeeLogin(email_id,password);
			if(!b) {
				System.out.println("Invalid UserName And PassWord");
				System.out.println("-----------------------------------");
			}
			while(b) 
			{
				System.out.println("1---> insert stock");
				System.out.println("2---> remove stock");
				System.out.println("3---> view stock");
				System.out.println("4---> view salary");
				System.out.println("5---> Exit");
				int r=sc.nextInt();
				if(r==1) {
					System.out.println("Enter pack Id : ");
					int pack_id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter pack name : ");
					String pack_name=sc.next();
					sc.nextLine();
					System.out.println("Enter The total number of stock : ");
					int total=sc.nextInt();
					if(ec.insertStock(pack_id,pack_name,total))
					{
					System.out.println("Stock Inserted!");
					System.out.println("-----------------------------------");
					}
				}
				if(r==2)
				{
					System.out.println("Enter the pack_Id you want to remove?");
					int pack_id=sc.nextInt();
					ec.removeStock(pack_id);
					System.out.println("Stock Removed");
					System.out.println("--------------------------------------");
				}
				if(r==3) {
					System.out.println("Enter the pack_id for the stock you need to see:");
					int pack_id=sc.nextInt();
					ArrayList<Stock> al=ec.viewStock(pack_id);
					for(Stock l:al) {
						System.out.println("Pack_Id : "+l.getPack_id());
						System.out.println("Pack_Name : "+l.getPack_Name());
						System.out.println("Total : "+l.getTotal());
					}
					System.out.println("--------------------------------------");

				}
				if(r==4) {
					System.out.println("Enter your name to view salary: ");
					String empl_name=sc.next();
					System.out.println("Your Salary is : "+ec.viewSalary(empl_name));
					System.out.println("--------------------------------------");
					//emp_salary=rs.getInt("emp_salary");
					//System.out.println("Your salary is:");
				}
				if(r==5) {
					b=false;
					System.out.println("* * * * * * THANK YOU * * * * * *");
				}
			}
			}
		}
			if(m==2) {
				System.out.println("Enter name:");
				String name=sc.next();
				sc.nextLine();
				System.out.println("Enter age:");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter email_id:");
				String email_id=sc.nextLine();
				System.out.println("Enter password:");
				String password=sc.nextLine();
				System.out.println("Enter department:");
				String dept_name=sc.next();
				sc.nextLine();
				System.out.println("Enter phonenumber:");
				long phonenumber=sc.nextLong();
				int num=EmployeeControl.employeeSignUp(name,age,email_id,password,dept_name,phonenumber);
				if(num==1)
				{
					while(true) {
					System.out.println("Employee Registered successfully Login to continue");
					AdminControl.increaseDeptEmpcount(dept_name);
					System.out.println("---LOGIN---");
					System.out.println("Enter email_id to login: ");
					String emailid=sc.next();
					System.out.println("Enter password to login: ");
					String pass_word=sc.next();
					boolean b=ec.employeeLogin(emailid,pass_word);
					if(!b) {
						
						System.out.println("Alert! enter correct login details");
					}
					while(b) 
					{
						System.out.println("1---> insert stock");
						System.out.println("2---> remove stock");
						System.out.println("3---> view all stock");
						System.out.println("4---> view salary");
						System.out.println("5---> Exit");
						int r=sc.nextInt();
						if(r==1) {
							System.out.println("Enter pack Id : ");
							int pack_id=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter pack name : ");
							String pack_name=sc.next();
							sc.nextLine();
							System.out.println("Enter The total number of stock : ");
							int total=sc.nextInt();
							ec.insertStock(pack_id,pack_name,total);
							System.out.println("Stock Inserted!");
							System.out.println("-----------------------------------");
						}
						if(r==2)
						{
							System.out.println("Enter the pack_Id you want to remove?");
							int pack_id=sc.nextInt();
							ec.removeStock(pack_id);
							System.out.println("Stock Removed");
							System.out.println("--------------------------------------");
						}
						if(r==3) {
							System.out.println("Enter the pack_id for the stock you need to see: ");
							int pack_id=sc.nextInt();
							ec.viewStock(pack_id);
							System.out.println("--------------------------------------");

						}
						if(r==4) {
							System.out.println("Enter your name to view you salary");
							String empl_name=sc.next();
							ec.viewSalary(empl_name);
							System.out.println("--------------------------------------");
						}
						if(r==5) {
							b=false;
							System.out.println("* * * * * * THANK YOU * * * * * *");
						}
					}
				}
				}
			}
				
			
		
	}
	
	
}
