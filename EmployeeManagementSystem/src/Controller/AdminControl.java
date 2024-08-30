package Controller;

import java.util.ArrayList;

import Model.AdminFunction;
import Model.Employee;

public class AdminControl 
{

	public int updateEmployee(int emp_id, long phonenumber) 
	{
		return AdminFunction.update_Employee(emp_id,phonenumber);
		
	}

	public void removeEmployee(String name) 
	{
		AdminFunction.remove_Employee(name);
		
	}

	public ArrayList<Employee> displayEmployee() 
	{
		return AdminFunction.display_Employee();
		
	}

	public void addDepartment(String dept_name, int i) 
	{
		AdminFunction.add_Department(dept_name,i);
		
	}

	public int updateSalary(String employee_name, int emp_salary) 
	{
		return AdminFunction.update_Salary(employee_name,emp_salary);
		
	}

	public boolean adminLogin(String a_email, String a_password) 
	{
		return AdminFunction.admin_Login(a_email,a_password);

	}

	public int changeDepartment(String emp_dept1, String emp_name) 
	{
		return AdminFunction.change_Department(emp_dept1,emp_name);
		
	}
	 public static void increaseDeptEmpcount(String dept_name) 
	 {
		 AdminFunction.increase_DeptEmpcount(dept_name);
	 }

	public void decreaseCount(String emp_dept) 
	{
		AdminFunction.decrease_empCount(emp_dept);
		
	}
	
	
}
