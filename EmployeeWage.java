package com.bz.employeewage;

import java.util.Random;

public class EmployeeWage {

	int wagePerHour = 20;
	int partTimeHours = 4;
	int dailyHour = 8;
	int daysPerMonth = 20;
	int totalHours = 100;
	int totalDays = 20;
	int dailyWage;
	int partTimeWage;
	int employeeHour;
	int monthlyWage;
	
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

	public void dailyWage() {

		dailyWage = wagePerHour * dailyHour;
		System.out.println("Employee Daily wage = " + dailyWage);
	}

	public void employeePartTimeWage() {

		partTimeWage = wagePerHour * partTimeHours;
		System.out.println("Employee Part Time Wage :" + partTimeWage);
	}

	public void bySwitchCase() {
		Random ran = new Random();
		int empCheck = ran.nextInt(3);

		switch (empCheck) {
		case 0:
			employeeHour = 8;
			System.out.print("Present");
			break;
		case 1:
			employeeHour = 4;
			System.out.print("Part Time");
			break;
		case 2:
			employeeHour = 0;
			System.out.println("Absent");
			break;

		}
		System.out.println();
	}

	public void monthlyWage() {

		monthlyWage = dailyWage * daysPerMonth;
		System.out.println("Monthly Wage Of Employee is =" + monthlyWage);
	}

	public void calculateWagesTillGivenCond() {

		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= totalHours && totalWorkingDays < totalDays) {
			totalWorkingDays++;

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			System.out.println("Random Integers: " + empCheck);

			switch (empCheck) {
			case 1:
				employeeHour = 8;
				System.out.print(" Present");
				break;
			case 2:
				employeeHour = 4;
				System.out.print("Part time Present " );
				break;
			case 0:
				employeeHour = 0;
				System.out.println("Absent");
				break;

			}

			empWage = employeeHour * wagePerHour;

			totalEmpWage = totalEmpWage + empWage;

			System.out.println("Day " + totalWorkingDays +  " empHours :" + employeeHour);
			System.out.println(" Wage :" + totalEmpWage);
			System.out.println(" Total Wage :" + totalEmpWage);
		}
	}

	public static void main(String[] args) {

		EmployeeWage object = new EmployeeWage();

		object.employeeAttdence();

		object.dailyWage();

		object.employeePartTimeWage();

		object.bySwitchCase();

		object.monthlyWage();
		
		object.calculateWagesTillGivenCond();

	}

}
