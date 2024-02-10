package entities;

public class DadosPessoais {
	
	private String name;
	private int idade;
	private double altura;
	
	public DadosPessoais(String name, int idade, double altura) {
		
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
}
