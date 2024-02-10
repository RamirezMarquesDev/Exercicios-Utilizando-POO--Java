package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] anrgs) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c1;
		
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String Name = sc.next();
		sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char testDeposit = sc.next().charAt(0);
		
		if (testDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			c1 = new Conta(number, Name, initialDeposit);
		} else {
			c1 = new Conta(number, Name);
		}
		System.out.println();
		c1.mostrarDadosNovaConta();
		
		System.out.print("\nEnter a deposit value: ");
		double amount = sc.nextDouble();
		c1.deposit(amount);
		c1.mostrarDadosAtualizados();
		System.out.print("\nEnter a withdraw value: ");
		amount = sc.nextDouble();
		c1.saque(amount);
		c1.mostrarDadosAtualizados();

		sc.close();
	}

}
