package entities;

public class Medias {

	public String name;
	public double t1,t2,t3,soma;
	
	public void result() {
		
		this.soma = t1+t2+t3;
		if (this.soma < 60) {
			System.out.printf("FINAL GRADE = %.2f", this.soma);
			System.out.print("\nFailed");
			System.out.printf("\nMissing %.2f Poits",( 60 - this.soma ));
		}else {
			System.out.printf("FINAL GRADE = %.2f", this.soma);
			System.out.print("\nPass");
		}
		
	}
}
