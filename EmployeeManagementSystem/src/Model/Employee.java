package Model;

import java.util.Scanner;

public class Employee 
{
	int emp_id;
	String name;
	int age;
	String email_id;
	String password;
	String department;
	long phonenumber;
	int salary;
	Scanner sc=new Scanner(System.in);
	public Employee(int emp_id, String name, int age, String email_id, String password, String department,long phonenumber, int salary) 
	{
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.password = password;
		this.department = department;
		this.phonenumber = phonenumber;
		this.salary = salary;
	}
 

	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDept_id() {
		return department;
	}



	public void setDept_id(String dept_id) {
		this.department = dept_id;
	}



	public long getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
