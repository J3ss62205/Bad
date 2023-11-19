package cs141.jlhenry2;
//Name: Jessica Henry
//Class: CS 141 
//Program Name: Employee
//Description:This program will take all of the user inputs and turn them into employees items
//It won't print out the employees info but it stores all of the info about them 

public class Employee {	
	String name;
	String jobTitle;
	String gender;
	String birthday;
	String organization;
	int ID;
	int empNum;
	//This will set all of the variables
	
	public Employee(int EmpNum) {
		this.empNum = EmpNum; //This is our constructor class
	}		
		
	public void setName(String newName) {
		name = newName; // this will assign the name
	}
	
	public void setJobTitle(String newJobTitle) {
		jobTitle = newJobTitle; //This will assign the job title
	}
	
	public void setGender(String newGender) {
		gender = newGender; // this will assign the gender
	}
	
	public void setBirthday(String newBirthday) {
		birthday = newBirthday; //this will assign the birthday
	}
	
	public void setID() {
		ID = (int)((Math.random() * 1000000 + 1) + 1000000);
		//This will make ID a random number
	}
	
	public void Organization(int org) {
		if (org == 1) { // if the user inputs 1 we will get google
			organization = "Google";
		}
		else if (org == 2){ // if the user inputs 2 we will get microsoft
			organization = "Microsoft";
		}
	}
	
	public void print() {
			System.out.println("Employee's name: " + name);
			System.out.println("Employee's gender: "+ gender);
			System.out.println("Employee's birthday: " + birthday);
			System.out.println("Employee's job title: " + jobTitle);
			System.out.println("Employee's ID: " + ID);
		


		
	}
	
	

}
