package util;

public class AbaixoMedia {
	
	private double[] numbers;
	private double sum;
	private int count;
	
	public AbaixoMedia() {	
	}
	public AbaixoMedia(int n) {
		this.numbers = new double[n];
		this.sum = 0;
		this.count = 0;
	}
	public void adicionarNumero(double number) {
		numbers[count] = number;
		sum += number;
		count++;
	}
	public double calcularMedia() {
		if (count == 0) {
			return 0;
		}
		return sum / count;
	}
	public void imprimirAbaixoDaMedia() {
        double media = calcularMedia();
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double number : numbers) {
            if (number < media) {
                System.out.println(number);
            }
        }
    }
}
