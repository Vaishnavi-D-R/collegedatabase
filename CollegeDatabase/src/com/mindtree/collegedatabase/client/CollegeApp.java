package com.mindtree.collegedatabase.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.collegedatabase.entity.College;
import com.mindtree.collegedatabase.service.CollegeService;
import com.mindtree.collegedatabase.service.impl.CollegeServiceImpl;


public class CollegeApp {
static College college=new College();
static CollegeService service=new CollegeServiceImpl();
static Scanner sc=new Scanner(System.in);
//List<Employee> list=new ArrayList();
public static void main(String[] args) {
	System.out.println("*******************WELCOME***********************");
	int choice=0;
	do {System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter your choice: ");
		displayMenu();
		choice=sc.nextInt();
		switch(choice) {
		case 1://create a college
				getCreatedCollege();
				break;
			
		case 2://create a student 
				
				break;
		
		case 3:// display all students data
				
				break;
		
		case 4:// 
				
				break;
				
		default:System.out.println("Invalid choice");
				break;
		}
	}while(choice!=5);
}
private static void getCreatedCollege() {
	boolean isInserted=false;
	college = createCollege();
	try {
		isInserted=service.insertCollegeToDb(college);
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	if (isInserted) {
		System.out.println("Employee inserted successfully");
	} else {
		System.out.println("something went wrong..");
	}
		
}
private static College createCollege() {
	System.out.println("Enter college Id");
	int id=sc.nextInt();
	System.out.println("Enter college name");
	sc.nextLine();
	String name=sc.nextLine();
	System.out.println("Enter college total strength");
	int strength=sc.nextInt();
	college=new College(id,name,strength);
	return college;
}
private static void displayMenu() {
	System.out.println("1.Create College");
	System.out.println("2.Create Student and assign to college");
	System.out.println("3.Display all college and their students data");
	//If they have the same student strength order them in the ascending order of the college name
	System.out.println("4.Display student data of a given subject under a given college");
	// descending order by age  if age is same  descending order by name
	System.out.println("5.Exit");
	
}
}
