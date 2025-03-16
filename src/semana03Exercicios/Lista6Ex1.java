package semana03Exercicios;

public class Lista6Ex1 {

	public static void main(String[] args) {
		/*
		 * Elabore  uma  aplicação  que  apresente  em  tela  
		 * dez  números  inteiros  gerados aleatoriamente. 
		 * Cada número deve ser impresso em uma linha da tela.
		 */
		
		final int QTD = 10;
		final int MIN = -100;	//menor numero
		final int MAX = 100;	//maior numero
		
		for(int i=0; i<QTD; i++) System.out.println((int)(Math.random() * (MAX + 1 - MIN)) + MIN);
		
	}

}
