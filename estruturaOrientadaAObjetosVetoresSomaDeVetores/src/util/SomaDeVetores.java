package util;

public class SomaDeVetores {
	private int numeroA;
	private int numeroB;
	private int numeroC;

	public SomaDeVetores() {
		
	}
	public SomaDeVetores(int numero) {
		this.numeroA = numero;
		this.numeroB = numero;
		this.numeroC = numero;
	}
	public int getNumeroA() {
		return numeroA;
	}
	public int getNumeroB() {
		return numeroB;
	}
	public int getNumeroC() {
		return numeroC;
	}
	public void setNumeroC() {
		this.numeroC = numeroA + numeroB;
	}
	
	
}
