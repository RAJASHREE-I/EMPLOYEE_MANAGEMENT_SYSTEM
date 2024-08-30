package Model;
import java.sql.*;

public class Department_table 
{
	

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
		

	public static void decreaseCount(String dept) 
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
