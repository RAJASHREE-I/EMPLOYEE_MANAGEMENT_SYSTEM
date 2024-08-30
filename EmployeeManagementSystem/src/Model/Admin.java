package Model;

import java.util.Scanner;

public class Admin {
	int admin_id;
	String admin_name;
	String a_email;
	String a_password;
	long adminphone_number;
	Scanner sc=new Scanner(System.in);
	
	
	

	public int getAdmin_id() {
		return admin_id;
	}



	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}




	public String getAdmin_name() {
		return admin_name;
	}




	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}




	public String getA_email() {
		return a_email;
	}




	public void setA_email(String a_email) {
		this.a_email = a_email;
	}




	public String getA_password() {
		return a_password;
	}




	public void setA_password(String a_password) {
		this.a_password = a_password;
	}




	public long getAdminphone_number() {
		return adminphone_number;
	}




	public void setAdminphone_number(long adminphone_number) {
		this.adminphone_number = adminphone_number;
	}

}
