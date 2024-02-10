package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: " + emp.name + ", $ %.2f", emp.netSalary());
		System.out.println();
		System.out.print("\nWhich percentage to increase Salary? ");
		emp.percentage = sc.nextDouble();
		
		System.out.printf("\nUpdated: " + emp.name + ", $ %.2f", emp.increaseSalary(emp.percentage));
		
		sc.close();
	}

}
