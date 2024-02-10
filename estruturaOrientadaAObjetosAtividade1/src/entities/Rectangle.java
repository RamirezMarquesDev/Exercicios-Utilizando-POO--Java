package entities;

public class Rectangle {

	public double width, height;
	
	public double area(double widht, double height) {
		
		return this.width * this.height; 
	}
	
	public double perimeter(double widht, double height) {
		
		return (this.width + this.height)*2;
	}
	
	public double diagonal(double widht, double height) {
		
		return Math.sqrt(Math.pow(widht, 2)+ Math.pow(height,2));
		
	}
	
	public String toString() {
		
		return "AREA = " 
				+ String.format("%.2f",area(width, height))
				+ "\nPRIMETER = "
				+ String.format("%.2f",perimeter(width, height))
				+ "\nDIAGONAL = "
				+ String.format("%.2f",diagonal(width, height));
	}
	
}
