package semana02;

public class Math03 {

	public static void main(String[] args) {
		//Simula um D6
		
		final int MINIMO = 1;
		final int FAIXA = 6;
		int n = (int)(Math.random()*FAIXA) + MINIMO;
		System.out.println(n);

	}

}
