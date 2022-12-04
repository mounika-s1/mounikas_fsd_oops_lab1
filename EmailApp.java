package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.services.CredentialService;
import com.gl.emailapp.services.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService service=new CredentialServiceImpl();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first name:");
	    String firstName= sc.next();
	    System.out.println("Enter the last name:");
	    String lastName= sc.next();
	    
	    Employee employee=new Employee(firstName,lastName);
	    
	    String dept=null;
	    service.passwordGenerator();
	    
	    System.out.println("Choose the department the employee belongs to from the below options");
	    System.out.println("1. Press 1 for Technical");
	    System.out.println("2. Press 2 for Admin");
	    System.out.println("3. Press 3 for Human Resource");
	    System.out.println("4. Press 4 for Legal");
	    
	    System.out.println("Select any one from above");
	    
	    int choice=sc.nextInt();
	    switch(choice) {
	    case 1:
	    	dept= "tech";
	    	break;
	    case 2:
	    	dept = "adm";
	    	break;
	    case 3:
	    	dept= "hr";
	    	break;
	    case 4:
	    	dept="leg";
	    	break;
	    default:
	    	System.out.println("The entered choice is wrong, please choose a correct department");
	    	break;
	    }
	    service.emailGenerator(employee,dept);
	    service.displayCredentials(employee, dept);
	    
	}

}
