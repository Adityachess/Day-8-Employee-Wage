package com.bz.employeewage;

public class EmployeeWage {
	
	int wagePerHour = 20;
	int dailyHour = 8;
	int dailyWage;


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

	public static void main(String[] args) {
		
		EmployeeWage object = new EmployeeWage();
		
		object.employeeAttdence();
		
		object.dailyWage();

	}

}
