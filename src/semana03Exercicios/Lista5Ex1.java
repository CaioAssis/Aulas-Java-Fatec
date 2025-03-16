package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista5Ex1 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que recebe uma palavra e a apresenta de forma invertida (tipo espelho). 
		 */
		
		String s = JOptionPane.showInputDialog("Digite a palavra.");
		for(int i = s.length(); i>0; i--) {
			System.out.print(s.charAt(i-1));
		}

	}

}
