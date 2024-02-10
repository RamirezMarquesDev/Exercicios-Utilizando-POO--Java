package entities;

public class Employee {

	public String name;
	public double grossSalary, tax, percentage;
	
	
	public double netSalary() {
		
		return this.grossSalary - this.tax;
	}
	
	public double increaseSalary(double percentage) {
		
		return netSalary() + (this.grossSalary * (percentage / 100));	
	}
	/*
	public String toString() {
		
		return "Name: "
				+ this.name
				+ "\nGross Salary: "
				+ "\nTax: "
				+ "\nEmployee: "
				+ this.name
				+ ", $ "
				+ netSalary()
				+ "\nWhich percentage to increase salary? "
				+ "\nUpdated data: "
				+ this.name
				+ ", $ "
				+ String.format("%.2f", increaseSalary(percentage));
		
	}*/
	
}
