package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();	
		sc.nextLine();
		
		Alunos[] alunos = new Alunos[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite nome, primeira e segunda nota do "+ (i+1)+"º aluno: ");
			String name = sc.nextLine();
			double s1 = sc.nextDouble();
			double s2 = sc.nextDouble();
			sc.nextLine();
			alunos[i] = new Alunos(name, s1, s2);
		}
		System.out.println("Alunos aprovados:");
		for (Alunos aluno : alunos) {
			if (aluno.estaAprovado()) {
                System.out.println(aluno.getNome());
            }
	     }		
		sc.close();

	}

}
