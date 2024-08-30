package Model;
import java.sql.*;
import java.util.ArrayList;
public class EmployeeFunction {
		public static boolean employee_Login(String email_id,String password) 
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
				String query="select * from employee where emp_emailId=? and emp_password=?";
				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setString(1, email_id);
				stmt.setString(2,password);
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
			
		public static int employee_SignUp(String name, int age, String email_id, String password, String dept_name,long phonenumber) 
			{
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="insert into employee(emp_name,emp_age,emp_emailId,emp_password,emp_dept,emp_phNo)values(?,?,?,?,?,?)";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setString(1,name);
					stmt.setInt(2, age);
					stmt.setString(3, email_id);
					stmt.setString(4,password);
					stmt.setString(5, dept_name);
					stmt.setLong(6,phonenumber);
					int n=stmt.executeUpdate();
					return n;
			}
				catch(Exception e) {
				e.printStackTrace();
				}
				return 0;
		
				
			}
			public static boolean insert_Stock(int pack_id, String pack_name, int total) 
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="insert into stock(pack_id,pack_name,total)values(?,?,?)";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setInt(1,pack_id);
					stmt.setString(2,pack_name);
					stmt.setInt(3, total);
					int g=stmt.executeUpdate();
					if(g==1) {
						return true;
					}
			}
				catch(Exception e) {
				e.printStackTrace();
				}
			return false;
		}
			public static void remove_Stock(int packId) 
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="delete from stock where pack_id=?";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setInt(1,packId);
					stmt.executeUpdate();
			}
				catch(Exception e) {
				e.printStackTrace();
				}
			}
			public static ArrayList<Stock> view_Stock(int packId) 
			{
				ArrayList<Stock> al=new ArrayList<Stock>();
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="select * from stock where pack_id=?";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setInt(1,packId);
					ResultSet rs=stmt.executeQuery();
					while(rs.next()) {
						al.add(new Stock(rs.getInt(1),rs.getString(2),rs.getInt(3)));
					}
				}
				catch(Exception e) {
				e.printStackTrace();
				}
				return al;
		
			}
			public static  String get_Department(String emp_name ) 
			{
				String emp_dept="";
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="select emp_dept from employee where emp_name=?";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setString(1,emp_name);
					ResultSet rs=stmt.executeQuery();
					while(rs.next())
					{
						emp_dept=rs.getString("emp_dept");
						return emp_dept;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return emp_dept;
				
			}
			public static int view_Salary(String empl_name) {
				int emp_salary=0;
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
					String query="select emp_salary from employee where emp_name=?";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setString(1,empl_name);
					ResultSet rs=stmt.executeQuery();
					while(rs.next())
					{
						emp_salary=rs.getInt("emp_salary");
						return emp_salary;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return emp_salary;
				
			}
				
			}

