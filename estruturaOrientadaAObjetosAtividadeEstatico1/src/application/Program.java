package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is dollar price? ");
		CurrencyConverter.dolar = sc.nextDouble();	                 
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dolarBuy = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f" , CurrencyConverter.Converter());
		
		
		sc.close();
	}

}
