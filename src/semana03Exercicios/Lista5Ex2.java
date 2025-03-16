package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista5Ex2 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que recebe uma frase e mostre essa frase quebrada por palavra e uma em cada linha.
		 */
		
		String frase = JOptionPane.showInputDialog("Digite a frase.");
		if(frase != null && !frase.equals("")) {
			String[] s = frase.split(" ");
			for(int i = 0; i<s.length; i++) System.out.println(s[i]);
		}
	}

}
