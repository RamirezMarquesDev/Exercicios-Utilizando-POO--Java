package application;

import java.util.Locale;
import java.util.Scanner;

import util.SomaDeVetores;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int num = 0;
				
		SomaDeVetores[] a = new SomaDeVetores[n];
		SomaDeVetores[] b = new SomaDeVetores[n];
		SomaDeVetores[] c = new SomaDeVetores[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {			
			num = sc.nextInt();
			a[i] = new SomaDeVetores(num);
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {	
			num = sc.nextInt();
			b[i] = new SomaDeVetores(num);
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {			
			c[i] = new SomaDeVetores(a[i].getNumeroA() + b[i].getNumeroB());
			System.out.printf("%d\n", c[i].getNumeroC());
		}		
		sc.close();
	}

}
