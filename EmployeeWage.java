package com.bz.employeewage;

public class EmployeeWage {
	
	int wagePerHour = 20;
	int partTimeHours = 4;
	int dailyHour = 8;
	int dailyWage;
	int partTimeWage;


	public void employeeAttdence() {

		int empCheck = (int) (Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");
		}
		System.out.println();
	}
	
	
	void dailyWage() {

		dailyWage = wagePerHour * dailyHour;
		System.out.println("Employee Daily wage = " + dailyWage);
	}
	
public void employeePartTimeWage() {
		
	    partTimeWage = wagePerHour * partTimeHours;
	    System.out.println("Employee Part Time Wage :"+ partTimeWage);
	}

	public static void main(String[] args) {
		
		EmployeeWage object = new EmployeeWage();
		
		object.employeeAttdence();
		
		object.dailyWage();
		
		object.employeePartTimeWage();

	}

}
