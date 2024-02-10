package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] pessoas = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");	
			
			System.out.print("Nome: ");
			String nomes = sc.nextLine();

			
			System.out.print("Idade: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			pessoas[i] = new Person(nomes, number);
		}	
		
		Person.imprimirMaisVelha(pessoas);
		
		sc.close();
	}	
}
