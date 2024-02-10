package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Medias;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Medias med = new Medias();

		med.name = sc.nextLine();
		med.t1 = sc.nextDouble();
		med.t2 = sc.nextDouble();
		med.t3 = sc.nextDouble();
		
		med.result();
		
		sc.close();
	}
}
