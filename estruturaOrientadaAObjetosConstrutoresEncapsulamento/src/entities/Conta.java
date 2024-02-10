package entities;

public class Conta {

	private int accNumber;
	private String name;
	private double saldo;

	public Conta(int accNumber, String name, double initialDeposit) {

		this.accNumber = accNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public Conta(int accNumber, String name) {

		this.accNumber = accNumber;
		this.name = name;
	}

	public int getAccNumber() {
		return this.accNumber;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double amount) {
		
		this.saldo = saldo - amount - 5;
	}
	
	public void deposit(double amount) {
		
		this.saldo += amount; 
	}
	public void mostrarDadosNovaConta() {
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",getAccNumber(),getName(),getSaldo());	
	}
	public void mostrarDadosAtualizados() {
		
		System.out.println("Updated Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",getAccNumber(),getName(),getSaldo());
	}
}
