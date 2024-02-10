package entities;

public class Alunos {
	
	private String name;
	private double nota1;
	private double nota2;

	public Alunos(String nome, double nota1, double nota2) {
        this.name = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
	public String getNome() {
        return name;
    }
	public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
	public boolean estaAprovado() {
        return calcularMedia() >= 6.0;
    }
}