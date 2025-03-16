package semana05Exercicios;

import java.util.List;

public class Exercicio {

	
	/**
	 * Recebe palavra e apresenta em tela todas as letras da mesma separadamente.
	 * 
	 * @param palavra - Palavra recebida
	 */
	public static void metodoA(String palavra) {
		for(int i=0; i<palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
	}
	
	/**
	 * Fornece a tabuada (1 a 10) de num.
	 * @param num - número inteiro entre 1 e 10.
	 */
	public static void metodoB(int num) {
		if(num < 1 || num > 10) System.out.println("número inválido");
		else {
			for(int i=1; i<=10; i++) System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}
	
	/**
	 * Imprime cinco números inteiros aleatoriamente entre 1 e 100.
	 */
	public static void metodoC() {
		final int QTD = 5;
		final int MAX = 100;
		for(int i=0; i<QTD; i++) System.out.println((int)(Math.random() * MAX + 1));
	}
	
	
	/**
	 * Mostra o dia da semana a partir do número indicado.
	 * @param dia - Número de 1 a 7 que corresponde a um dia da semana. 1 = Domingo, 2 = Segunda, etc. 
	 */
	public static void metodoD(int dia) {
		switch(dia) {
			case 1: System.out.println("Domingo");
			break;
			
			case 2: System.out.println("Segunda");
			break;
			
			case 3: System.out.println("Terça");
			break;
			
			case 4: System.out.println("Quarta");
			break;
			
			case 5: System.out.println("Quinta");
			break;
			
			case 6: System.out.println("Sexta");
			break;
			
			case 7: System.out.println("Sábado");
			break;
			
			default: System.out.println("Inexistente");
			break;
			}
	}
	
	
	/**
	 * Recebe lista de nomes e os apresenta no console.
	 * @param listaNomes - Lista de nomes a serem apresentados.
	 */
	public static void metodoE(List<String> listaNomes) {

		 System.out.println("Nomes na lista: ");

		 for(String nome : listaNomes) System.out.println(nome);
	}
	
	/**
	 Recebe lista de números e retorna quantidade de números pares contidos nessa lista.
	 * @param listaNumeros - Lista de números inteiros que será verificada.
	 * @return int - Quantidade de números pares.
	 */
	public static int metodoF(List<Integer> listaNumeros) {
		int numPar=0;
		for(int numero : listaNumeros) {
			if(numero % 2 == 0) numPar++;
		}
		return numPar;
	}
	

	/**
	 * Recebe 10 valores inteiros e os soma.
	 * @param val - array com 10 elementos int.
	 * @return int - soma dos 10 elementos.
	 */
	public static int metodoG(int[] val) {
		int soma=0;
		for(int i=0; i<10; i++) {
			soma += val[i];
		}
		return soma;
	}
	
	/**
	 * Recebe notas e retorna média aritmética.
	 * @param notas - array de notas a serem calculadas.
	 * @return float - média aritmética.
	 */
	public static float metodoH(float[] notas) {
		float media = 0;
		int i=0;
		for(i=0; i<notas.length; i++) {
			media += notas[i];
		}
		return media/i;
	}

	/**
	 *  Gera n1 numeros aleatórios entre 0 e n2.
	 * @param n1 - quantidade de números gerados;
	 * @param n2 - número máximo da geração.
	 * @return array de números aleatórios gerados.
	 */
	public static int[] metodoI(int n1, int n2) {
		int[] vetor = new int[n1];
		for(int i=0; i<n1; i++) {
			vetor[i] = (int)(Math.random() * (n2 + 1));
		}
		return vetor;
	}
	
	
	/**
	 * Verifica formato do String [999.999.999/99]
	 * @param cpf - String a ser verificada
	 * @return True - Formato correto;
	 * False - Formato incorreto
	 */
	public static boolean metodoJ(String cpf) {
		String[] chck1 = cpf.split("\\.");
		
		if(chck1.length != 3) return false;
		
		String[] chck2 = chck1[2].split("/");
		
		if(chck2.length !=2) return false;

		if(chck1[0].length() == 3 && chck1[1].length() == 3 && chck2[0].length() == 3 && chck2[1].length() == 2) {
			try { 
				Integer.parseInt(chck1[0]);
				Integer.parseInt(chck1[1]);
				Integer.parseInt(chck2[0]);
				Integer.parseInt(chck2[1]);
				}
			catch(Exception e) {return false;}
		}
		else return false;
		return true;
	}
}
