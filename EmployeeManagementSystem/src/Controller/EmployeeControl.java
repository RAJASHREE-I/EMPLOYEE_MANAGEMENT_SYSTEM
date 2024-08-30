package Controller;
import java.util.ArrayList;

import Model.EmployeeFunction;
import Model.Stock;
public class EmployeeControl 
{

	public  boolean employeeLogin(String email_id, String password) 
	{
		return EmployeeFunction.employee_Login(email_id,password);
	
	}

	public void removeStock(int pack_id) 
	{
		
		EmployeeFunction.remove_Stock(pack_id);
	}

	public ArrayList<Stock> viewStock(int pack_id) 
	{
		return EmployeeFunction.view_Stock(pack_id);
		
	}

	public int viewSalary(String empl_name) 
	{
		return EmployeeFunction.view_Salary(empl_name);
		
	}

	public boolean insertStock(int pack_id, String pack_name, int total) 
	{
		return EmployeeFunction.insert_Stock(pack_id,pack_name,total);
		
	}

	public static int employeeSignUp(String name, int age, String email_id, String password, String dept_name,
			long phonenumber) 
	{
		return EmployeeFunction.employee_SignUp(name,age,email_id, password, dept_name,phonenumber);
	}
	
}
