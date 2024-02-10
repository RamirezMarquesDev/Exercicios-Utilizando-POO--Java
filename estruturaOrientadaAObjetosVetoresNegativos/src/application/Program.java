package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");		
		int n = sc.nextInt();
		
		Calculator[] calc = new Calculator[n];
		while (n < 1 || n > 10) {
			System.out.print("Favor digitar um numero entre 1 e 10: ");
			n = sc.nextInt();
		}
		for (int i = 0; i < calc.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			calc[i] = new Calculator(number);		
		}
		System.out.println("Numeros Negativos: ");
		for (int i = 0; i < calc.length; i++) {
			calc[i].negative();
			}
		sc.close();
	}

}
