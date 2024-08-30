package main;
import java.util.Scanner;

import view.AdminView;
import view.EmployeeView;

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1----> admin");
		System.out.println("2----> employee");
		int choice =sc.nextInt();
        if(choice==1) {
        	AdminView ad=new AdminView();
        	ad.adminMethods();
        }
        if(choice==2){
        	EmployeeView ef=new EmployeeView();
        	ef.employeelogin();
        }
        sc.close();
	}

}
