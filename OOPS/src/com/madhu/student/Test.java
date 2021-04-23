package com.madhu.student;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Student stud= null;
		String select;
		Scanner scanner;
		do {
		System.out.println("Enter your choice:");
		System.out.println("1.Create student");
		System.out.println("2.Update student");
		scanner= new Scanner(System.in);
		Integer choice= scanner.nextInt();
		
		if(choice==1) {
			System.out.print("Enter student Roll No:");
			Integer roll_no=scanner.nextInt();
			
			System.out.print("Enter student Name:");
			String name=scanner.next();
			
			System.out.print("Enter student Address:");
			String address =scanner.next();
			
			stud = new Student(roll_no, name, address);
			stud.display();
			
		}else if(choice==2) {
			System.out.println("Enter new address");
			String newAddress= scanner.next();
			stud.setAddress(newAddress);
			stud.display();
		}
		System.out.println("Do you want to conytinue:Yes/No");
		select= scanner.next();
		
	}while(select.equalsIgnoreCase("Yes"));
		
	}

}
