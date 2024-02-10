package application;

import java.util.Locale;
import java.util.Scanner;

import util.MaiorPosição;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double numeros = 0;
		double maiorNumero = 0;
		int contador = 0;
		
		MaiorPosição[] num = new MaiorPosição[n];
		
		for (int i = 0; i < num.length; i++){
			System.out.print("Digite um numero: ");
			numeros = sc.nextDouble();			
			num[i] = new MaiorPosição(numeros);
			if (num[i].getNumeros()> maiorNumero) {
				maiorNumero = num[i].getNumeros();
				contador = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR: %.1f%n", maiorNumero);
		System.out.print("POSICAO DO MAIOR VALOR = "+ contador);
		sc.close();
	}
}
