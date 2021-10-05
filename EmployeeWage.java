package com.bz.employeewage;

public class EmployeeWage {

	public void employeeAttdence() {

		int empCheck = (int) (Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		
		EmployeeWage object = new EmployeeWage();
		
		object.employeeAttdence();

	}

}
