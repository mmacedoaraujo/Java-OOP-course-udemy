package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		for (int i = 1; i <= numberEmployees; i++) {
			sc.nextLine();
			System.out.println("\nEMPLOYEE #" + i + " DATA:");
			System.out.print("Outsourced (y/n)? ");
			char outsourcedAnswer = sc.next().charAt(0);
			while (outsourcedAnswer != 'n' && outsourcedAnswer != 'y') {
				System.out.println("Please enter (y) option for yes or (n) for no...");
				outsourcedAnswer = sc.next().charAt(0);
			}
			if (outsourcedAnswer == 'n') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				employee.addEmployee(new Employee(name, hours, valuePerHour));
			}
			else {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employee.addEmployee(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			
		}
		
		System.out.println(employee);
		

		
		sc.close();
	}
}
