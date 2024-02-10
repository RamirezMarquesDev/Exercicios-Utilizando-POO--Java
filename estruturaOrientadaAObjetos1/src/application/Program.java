package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		System.out.println();
		
		Product produto = new Product(name, price);
		
		//novo modo sovrescrevento metodo toString implicitamente ou seja automatico
		System.out.println("Product data: " + produto);
		
		//essa seria a maneira sem ser implicita
		//System.out.println("Product data: " + produto.toString());
		
		
		//antigo modo
		//System.out.printf("Product data: %s, $ %.2f, %d units, total: $ %.2f%n",produto.name,produto.price,produto.quantity,produto.totalValueInStock());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + produto);
		//System.out.printf("Updated data: %s, $ %.2f, %d units, total: $ %.2f%n",produto.name,produto.price,produto.quantity,produto.totalValueInStock());
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		//System.out.printf("Updated data: %s, $ %.2f, %d units, total: $ %.2f%n",produto.name,produto.price,produto.quantity,produto.totalValueInStock());
		
		
		
		sc.close();
	}

}
