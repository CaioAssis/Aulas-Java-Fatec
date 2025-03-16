package semana02;

public class Math02 {

	public static void main(String[] args) {
		
		/*
		double n = Math.random();
		System.out.println(n);
		*/
		
		/* --- Teste int random
		int teste = (int)(Math.random()*100);
		System.out.println(teste);
		*/
		
		final int LIMITE =60; // Constante
		
		for(int j=1; j<=10; j++) {
			System.out.print("Cartão " + j + ": ");
			for(int i=1; i<=6; i++) {
				System.out.print((int)(Math.random()*LIMITE) + " ");
			}
			System.out.println();
		}
	}

}
