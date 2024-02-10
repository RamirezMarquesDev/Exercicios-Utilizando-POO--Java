package application;

import java.util.Locale;
import java.util.Scanner;

import util.MediaPares;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		MediaPares teste = new MediaPares(n);
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			double number = sc.nextDouble();
			teste.adicionarNumero(number);		
		}
		if (teste.calcularMedia() != 0) {
		System.out.printf("\nMédia Dos Pares = %.1f%n", teste.calcularMedia());		
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();

	}

}
