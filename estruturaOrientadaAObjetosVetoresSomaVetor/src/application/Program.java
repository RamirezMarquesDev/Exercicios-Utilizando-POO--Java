package application;

import java.util.Locale;
import java.util.Scanner;

import util.SomaVetor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double media = 0;
		double number = 0;
		double soma = 0;
		SomaVetor[] sum = new SomaVetor[n];
		
		for (int i = 0; i < sum.length; i++) {
			System.out.print("Digite um numero: ");
			number = sc.nextDouble();
			sum[i] = new SomaVetor(number);
		}
		System.out.print("Valores: ");
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i].getNumber() + " ");
			soma += sum[i].getNumber();
		}
		media = soma/n;
		System.out.printf("\nSOMA: %.2f" , soma);
		System.out.printf("\nMEDIA: %.2f", media);
	
		
		
		sc.close();
	}

}
