package semana04;

import javax.swing.JOptionPane;

public class Metodos02 {
	
	
	/**
	 * Recebe dois valores inteiros e retorna a soma entre eles
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 * @return - resultado da soma
	 */
	public static int somar(int a, int b) {
		//o retorno do metodo deve ser compativel com seu tipo (public [INT] somar...)
		
		int resposta = a+b;
		
		return resposta;
	}
	/**
	 * Gera uma senha aleatória contendo n dígitos
	 * @param qtdeDigitos - a quantidade de dígitos da senha
	 * @return - a senha
	 */
	public static String gerarSenha(int qtdeDigitos) {
		String c = "0123456789ABCDEabcde!@#$%+[]";
		String senha = "";
		int tamanho = c.length();
		
		for(int i=0; i<qtdeDigitos; i++) {
			int indice = (int)(Math.random() * tamanho);
			senha += c.charAt(indice);
		}
		return senha;
	}

	
	/**
	 * Solicita a entrada de uma nota de prova
	 * A nota deve ser um valor entre 0 e 10
	 * @param men - uma mensagem que aparece ao usuário
	 * @return - o valor da nota digitada
	 * Caso a nota digitada seja inválida, será retornado o valor -1
	 */
	////////////////////////////////////////////////////
	////////////////////////////////////////////////////
	//NÃO FAZER ENTRADAS EM METODOS
	//PODE DAR RUINZÃO
	////////////////////////////////////////////////////
	////////////////////////////////////////////////////

	public static double lerNota(String men) {
		double nota = 0;
		while(true) {
					try {
						nota = Double.parseDouble(JOptionPane.showInputDialog(men));
						if(nota<0 || nota>10) nota = -1;
						break;
				}
				catch(NumberFormatException erro) {
				}
		}
		return nota;
	}
	
	/**
	 * Realiza a validação de uma nota de prova
	 * A nota deve ser um valor entre 0 a 10
	 * @param nota - a nota a ser validada
	 * @return - [true] caso a nota seja válida ou [false] caso contrário
	 */
	public static boolean validar(double nota ) {
		if(nota >=0 && nota<=10)
			return true;
		else
			return false;
	}
	
}
