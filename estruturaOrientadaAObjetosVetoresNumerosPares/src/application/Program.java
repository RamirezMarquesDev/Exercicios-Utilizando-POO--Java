package application;

import java.util.Locale;
import java.util.Scanner;

import util.NumerosPares;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai Digitar? ");
		int n = sc.nextInt();
		int numeros = 0;
		int sum = 0;
		
		NumerosPares[] num = new NumerosPares[n];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			numeros = sc.nextInt();
			num[i] = new NumerosPares(numeros);
		}
		
		System.out.println("Numeros Pares: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i].getNumeros() %2 == 0) {
				sum++;
				System.out.print(num[i].getNumeros() +" ");
			}
		
		}
		System.out.print("\nQuantidade de pares = "+ sum);
		sc.close();
	}

}
