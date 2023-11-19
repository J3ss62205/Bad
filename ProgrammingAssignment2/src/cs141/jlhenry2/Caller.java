package cs141.jlhenry2;
import java.util.*;
//Name: Jessica Henry
//Class: CS 141 
//Program Name: Caller
//Description:This program will all of the user inputs and turn them into employees data
// It'll print out the employees and all of the info about them 
public class Caller {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		int numEmp = 1; //this will hold the number of employees 
		int org;
		int google = 0;
		int microsoft = 0;
		String str;
		//This is our variables!!!!!!!
		
		Employee emp1 = new Employee(numEmp);
		Employee emp2 = new Employee(numEmp);
		numEmp++;
		Employee emp3 = new Employee(numEmp);
		numEmp++;
		//This makes our 3 employees
		
		System.out.println("NAME: JESSICA HENRY");
		System.out.println("------------ Welcome to the Employee Management System ------------ ");
		// Employee 1 ----------------------------------------------------------
		System.out.print("Please enter #1 employee's name: ");
		emp1.setName(scnr.nextLine()); // this gets the name
		System.out.print("Please enter #1 employee's gender: ");
		emp1.setGender(scnr.nextLine()); // This gets the gender
		System.out.print("Please enter #1 employee's job title: ");
		emp1.setJobTitle(scnr.nextLine()); // this gets the job title
		System.out.println("Please enter #1 employee's birthday (Format MM/DD/YYYY): ");
		str= scnr.nextLine(); 
		emp1.setBirthday(scnr.nextLine()); //This gets their birthday
		emp1.setID();
		System.out.print("Please choose an organization for employee #1 as a number (1: Google, 2: Microsoft): ");
		org = scnr.nextInt();
		scnr.nextLine();
		while (org != 1 && org != 2){
			System.out.print("The organization you entered is not in the system, please choose either 1 or 2: ");
			org = scnr.nextInt();
			scnr.nextLine();
		}
		if(org == 1) {
			google++;
		}
		else {
			microsoft++;
		}
		emp1.Organization(org); //This gets where they work
		
		// Employee 2 ----------------------------------------------------------
		System.out.println("----------");
		System.out.println("Please enter #2 employee's name: ");
		emp2.setName(scnr.nextLine()); // this gets the name
		System.out.println("Please enter #2 employee's gender: ");
		emp2.setGender(scnr.nextLine()); // This gets the gender
		System.out.print("Please enter #2 employee's job title: ");
		emp2.setJobTitle(scnr.nextLine()); // this gets the job title
		System.out.println("Please enter #2 employee's birthday (Format MM/DD/YYYY): ");
		emp2.setBirthday(scnr.nextLine()); //This gets their birthday
		emp2.setID();
		System.out.println("Please choose an organization for employee #2 as a number (1: Google, 2: Microsoft): ");
		org = scnr.nextInt();
		scnr.nextLine();
		while (org != 1 && org != 2){
			System.out.print("The organization you entered is not in the system, please choose either 1 or 2: ");
			org = scnr.nextInt();
			scnr.nextLine();
		}
		if(org == 1) {
			google++;
		}
		else {
			microsoft++;
		}
		emp2.Organization(org); //This gets where they work
		// Employee 3 ----------------------------------------------------------
		System.out.println("----------");
		System.out.print("Please enter #3 employee's name: ");
		emp3.setName(scnr.nextLine()); // this gets the name
		System.out.print("Please enter #3 employee's gender: ");
		emp3.setGender(scnr.nextLine()); // This gets the gender
		System.out.println("Please enter #3 employee's job title: ");
		emp3.setJobTitle(scnr.nextLine()); // this gets the job title
		System.out.println("Please enter #3 employee's birthday (Format MM/DD/YYYY): ");
		emp3.setBirthday(scnr.nextLine()); //This gets their birthday
		emp3.setID();
		System.out.println("Please choose an organization for employee #3 as a number (1: Google, 2: Microsoft): ");
		org = scnr.nextInt();
		scnr.nextLine();
		while (org != 1 && org != 2){
			System.out.println("The organization you entered is not in the system, please choose either 1 or 2: ");
			org = scnr.nextInt();
			scnr.nextLine();
		}
		if(org == 1) {
			google++;
		}
		else {
			microsoft++;
		}
		emp3.Organization(org); //This gets where they work
		// Done with Employees!!!
		
		System.out.println("---------- Stats ----------");
		System.out.println("Total number of employees in the system is: " + (google + microsoft));
		System.out.println("Microsoft: " + microsoft + " Google: " + google);
		System.out.println("------------");
		System.out.println("----- Printing all the employees in the System -----");
		emp1.print();
		System.out.println("------------");
		emp2.print();
		System.out.println("------------");
		emp3.print();
	}

}

