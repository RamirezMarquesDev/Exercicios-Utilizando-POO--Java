package application;

import java.util.Locale;
import java.util.Scanner;

import util.AbaixoMedia;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		AbaixoMedia teste = new AbaixoMedia(n);
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			double number = sc.nextDouble();
			teste.adicionarNumero(number);		
		}
		System.out.printf("\nMédia do Vetor: %.3f%n", teste.calcularMedia());
		teste.imprimirAbaixoDaMedia();
		
		sc.close();
	}

}
