package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoais;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		DadosPessoais[] dados = new DadosPessoais[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " +(i+1)+ "ª Pessoa: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int years = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			dados[i] = new DadosPessoais(name,years,height);			
		}		
		double somaAlturas = 0;
        int somaIdade = 0;
        String menores = "";
        
        for (DadosPessoais pessoa : dados) {
            somaAlturas += pessoa.getAltura();
            somaIdade += (pessoa.getIdade() < 16) ? 1 : 0;
            if (pessoa.getIdade() < 16) {
                menores += pessoa.getName() + "\n";
            }
        }
        System.out.printf("Altura média: %.2f%n", (somaAlturas / n));
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", (somaIdade / (double) n * 100));
        System.out.println("\n" + menores);
        
		sc.close();
	}
}
