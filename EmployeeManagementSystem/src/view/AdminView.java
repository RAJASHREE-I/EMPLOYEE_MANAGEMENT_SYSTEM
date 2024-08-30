package view;
import java.util.*;

import Controller.AdminControl;
//import Model.AdminFunction;
//import Model.Department_table;
import Model.Employee;
import Model.EmployeeFunction;
public class AdminView {
	static Scanner sc=new Scanner(System.in);
	public void adminMethods() {
		System.out.println("1--->Login");
		AdminControl ac=new AdminControl();
		int x=sc.nextInt();
		if(x==1) {
			while(true) {
			System.out.println("Enter email_id:");
			String a_email=sc.next();
			sc.nextLine();
			System.out.println("Enter password:");
			String a_password=sc.next();
			sc.nextLine();
			boolean b= ac.adminLogin(a_email,a_password);
			
			if(!b) {
				System.out.println("Alert! enter correct username and password");
				System.out.println("--------------------------------------");
		}
			
			while(b) {
				System.out.println("1 - update employee");
				System.out.println("2 - Remove employee");
				System.out.println("3 - View employee");
				System.out.println("4 - change employee department");
				System.out.println("5 - Add Department");
				System.out.println("6 - update salary");
				System.out.println("7 - Exit");
				int adminChoice=sc.nextInt();
				switch(adminChoice)
				{
				case 1:
					System.out.println("Enter employee id:");
					int emp_id=sc.nextInt();
					System.out.println("Enter employee's new phone number : ");
					long phonenumber=sc.nextLong();
					int res=ac.updateEmployee(emp_id,phonenumber);
					if(res==1)
					{
						System.out.println("The employee of Employee ID "+emp_id+"'s phone number has been updated to "+phonenumber);
					}
					//System.out.println("Employee phone number has been updated");
					System.out.println("-----------------------------------------------------------------------------------");
					break;
					
				case 2:
					System.out.println("Enter employee Name:");
					String name=sc.next();
					sc.nextLine();
					String emp_dept=EmployeeFunction.get_Department(name); 
					ac.removeEmployee(name);
					ac.decreaseCount(emp_dept);
					System.out.println("Employee removed successfully");
					System.out.println("--------------------------------------");
					break;

				case 3:
					ArrayList<Employee> ev=ac.displayEmployee();
					for(Employee e:ev)
					{
						System.out.println("Employee Id : "+e.getEmp_id());
						System.out.println("Employee Name : "+e.getName());
						System.out.println("Employee Age : "+e.getAge());
						System.out.println("Employee Email : "+e.getEmail_id());
						System.out.println("Employee Password : "+e.getPassword());
						System.out.println("Employee Department : "+e.getDept_id());
						System.out.println("Employee Phone Number : "+e.getPhonenumber());
						System.out.println("Employee Salary : "+e.getSalary());
						System.out.println();
						System.out.println("--------------------------------------------------");
						System.out.println();
					}
					break;
				
				case 4:
					System.out.println("Enter employee name to change department");
					String emp_name=sc.next();
					sc.nextLine();
					
					System.out.println("Enter the department");
					String emp_dept1=sc.next();
					sc.nextLine();
					String dept=EmployeeFunction.get_Department(emp_name);  
					ac.decreaseCount(dept);
					AdminControl.increaseDeptEmpcount(emp_dept1);
					int n=ac.changeDepartment(emp_dept1,emp_name);
					if(n==1)
					{
						System.out.println("The Employee "+emp_name+" has been changed to the Department "+emp_dept1);
						System.out.println("------------------------------------------------------------");
					}
					break;
				
				case 5:
					System.out.println("Enter department Name :");
					String dept_name=sc.next();
					ac.addDepartment(dept_name,0);
					System.out.println("Department has been added successfully");
					System.out.println("-----------------------------------");
					break;
				
				case 6:
					System.out.println("Enter the name of the employee:");
					String employee_name=sc.next();
					System.out.println("Enter salary:");
					int emp_salary=sc.nextInt();
					if(ac.updateSalary(employee_name,emp_salary)==1) {
					System.out.println("Salary updated successsfully!");
					System.out.println("-----------------------------------");
					}
					else
					{
						System.out.println("Salary not updated");
						System.out.println("-----------------------------------");
					}
					break;
				case 7:
					b=false;
					System.out.println("* * * * * * THANK YOU * * * * * *");
					
			}
				
			}
		}
		}
	}
}

		
		




	

