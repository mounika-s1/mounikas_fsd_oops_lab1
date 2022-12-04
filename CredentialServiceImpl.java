package com.gl.emailapp.services;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String passwordGenerator() {
		// TODO Auto-generated method stub
		String uppChars= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowChars= "abcdefghijklmnopqrstuvwxyz";
		String numbers= "1234567890";
		String splChars="!@#$%^&*()-=+;':,.<>/?";
		String values= uppChars+lowChars+numbers+splChars;
		
		Random random=new Random();
		char[] password=new char[8];
		int i;
		for (i=0; i<8; i++) {
			int randomValue=random.nextInt(values.length());
			password[i] = values.charAt(randomValue);
			
		}
		return new String(password);
	}

	@Override
	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		return (employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" +department +".abc.com");
	}

	@Override
	public void displayCredentials(Employee emp, String department) {
		System.out.println("Dear " + emp.getFirstName() + " " + emp.getLastName() + "Your email is generated as below: ");
		System.out.println("Email is :" + emailGenerator(emp,department));
		System.out.println("Password is:" + passwordGenerator());
		
	}
}
