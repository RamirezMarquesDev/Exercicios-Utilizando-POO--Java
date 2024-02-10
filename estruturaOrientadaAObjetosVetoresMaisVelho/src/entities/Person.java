package entities;

public class Person {

	private String name;
	private int age;

	public Person(String nomes, int number) {
		this.name = nomes;
		this.age = number;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public static void imprimirMaisVelha(Person[] pessoas) {
        int indiceMaisVelha = 0;
        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getAge() > pessoas[indiceMaisVelha].getAge()) {
                indiceMaisVelha = i;
            }
        }

        System.out.println("Pessoa mais velha: " + pessoas[indiceMaisVelha].getName() +
                           ", Idade: " + pessoas[indiceMaisVelha].getAge());
    }
}
