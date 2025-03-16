package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista2Ex2 {

	public static void main(String[] args) {
		/*Faça uma aplicação que leia dois valores inteiros A e B se os valores forem iguais deverá 
		 * se somar os dois, caso contrário multiplique A por B. Ao final, mostrar seu conteúdo na tela.*/
		
	int a = 0, b = 0, resp;
			
			while(true) {
				try {
					a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número. [1]"));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			while(true) {
				try {
					b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número. [2]"));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			
			if(a == b) resp = a + b;
			else resp = a*b;
			
			JOptionPane.showMessageDialog(null, resp);
	}

}
