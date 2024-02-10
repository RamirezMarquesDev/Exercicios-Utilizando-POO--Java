package application;

import java.util.Locale;
import java.util.Scanner;

import util.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Dados[] pessoas = new Dados[n];
        int contadorHomens = 0;
        double somaAlturaMulheres = 0.0;
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a altura da %dª pessoa: ", i + 1);
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Digite o gênero da %dª pessoa (M/F): ", i + 1);
            char genero = sc.nextLine().charAt(0);

            pessoas[i] = new Dados(altura, genero);

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (genero == 'm') {
                contadorHomens++;
            } else if (genero == 'f') {
                somaAlturaMulheres += altura;
            }
        }
        double mediaAlturaMulheres = somaAlturaMulheres / (n - contadorHomens);

        System.out.printf("\nMenor altura: %.2f%n", menorAltura);
        System.out.printf("Maior altura: %.2f%n", maiorAltura);
        System.out.printf("Média de altura das mulheres: %.2f%n", mediaAlturaMulheres);
        System.out.println("Número de homens: " + contadorHomens);

        sc.close();
	}

}
