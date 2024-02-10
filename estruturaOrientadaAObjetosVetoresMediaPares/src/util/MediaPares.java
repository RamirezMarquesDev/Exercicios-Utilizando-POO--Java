package util;

public class MediaPares {
	
	private double[] numbers;
	private double sum;
	private int count;
	
	public MediaPares (int n){
		this.numbers = new double[n];
		this.count = 0;
		this.sum = 0;
	}
	public void adicionarNumero(double number) {
		if (number %2 == 0) {
		numbers[count] = number;
		sum += number;
		count++;
		}		
	}
	public double calcularMedia() {
		if (count == 0) {
			return 0;
		}
		return sum / count;
	}	
}
