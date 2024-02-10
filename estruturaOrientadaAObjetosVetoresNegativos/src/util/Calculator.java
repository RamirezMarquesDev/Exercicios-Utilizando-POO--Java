package util;

public class Calculator {
	
	private int number;
	
	
		
	public Calculator(int number) {
		
		this.number = number;	
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
	public void negative() {	
		if (this.number < 0) {
			
			System.out.println(this.number);	
		}
	}
}
