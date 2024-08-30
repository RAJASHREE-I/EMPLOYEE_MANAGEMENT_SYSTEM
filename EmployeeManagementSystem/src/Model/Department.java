package Model;
import java.util.Scanner;
public class Department {
	Scanner sc=new Scanner(System.in);
	int dept_id;
	String dept_name;
	int employeecount;
	Department()
	{
		this.dept_name=null;
		
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public int getEmployeecount() {
		return employeecount;
	}
	public void setEmployeecount(int employeecount) {
		this.employeecount = employeecount;
	}
	
}
