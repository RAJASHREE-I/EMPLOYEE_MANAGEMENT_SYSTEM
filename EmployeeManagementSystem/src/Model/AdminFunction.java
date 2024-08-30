package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
public class AdminFunction 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean admin_Login(String a_email,String a_password)
	{
		try
		{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
				String query="select * from admin where a_email=? and a_password=?";
				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setString(1, a_email);
				stmt.setString(2,a_password);
				ResultSet rs=stmt.executeQuery();
				if(rs.next())
				{
					return true;
				}
									
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static int update_Employee(int emp_id,long phonenumber) 
	{
		int r=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="update employee set emp_phNo=? where emp_id=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setLong(1,phonenumber);
			stmt.setInt(2,emp_id);
	        r=stmt.executeUpdate();
	        return r;
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		return r;
		}
	public static void remove_Employee(String emp_name) 
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="delete from employee where emp_name=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,emp_name);
			stmt.executeUpdate();
	}
		catch(Exception e) {
		e.printStackTrace();
		}

		}
	public static ArrayList<Employee> display_Employee() 
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="select * from employee";
			PreparedStatement stmt=con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				al.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getInt(8)));
				
			}
	}
		catch(Exception e) {
		e.printStackTrace();
		}
		return al;

		}
	public static int change_Department(String deptName,String emp_name) 
	{
		int n=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="update employee set emp_dept=? where emp_name=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, deptName);
			stmt.setString(2, emp_name);
			n=stmt.executeUpdate();
			return n;
	}
		catch(Exception e) {
		e.printStackTrace();
		}
		return n;
	}
	public static void add_Department(String dept_name,int m) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="insert into department(dept_name,emp_count) values(?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, dept_name);
			stmt.setInt(2, m);
			stmt.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

		
	}
	public static int update_Salary(String employee_name,int emp_salary) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="update employee set emp_salary=? where emp_name=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, emp_salary);
			stmt.setString(2,employee_name );
			int f=stmt.executeUpdate();
			if(f>0) {
				return 1;
			}
			else {
				return 0;
			}
	}
		catch(Exception e) {
		e.printStackTrace();
		}
		return 0;
	}
	public static void increase_DeptEmpcount(String dept_name) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="update department set emp_count=(emp_count+1) where dept_name=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,dept_name);
			stmt.executeUpdate();

	}
		catch(Exception e) {
		e.printStackTrace();
		}
		
	}
	public static void decrease_empCount(String dept) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
			String query="update department set emp_count=(emp_count-1) where dept_name=?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,dept);
			stmt.executeUpdate();
	}
		catch(Exception e) {
		e.printStackTrace();
		}

		
	}
		
	}


	

