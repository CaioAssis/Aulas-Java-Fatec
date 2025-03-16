package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista2Ex1 {

	public static void main(String[] args) {
		//Faça uma aplicação para receber um número qualquer e informar na tela se é par ou ímpar. 
		
	int num = 0;
			
			while(true) {
				try {
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			
			
			if(num%2 == 1) JOptionPane.showMessageDialog(null, "Ímpar");
			else JOptionPane.showMessageDialog(null, "Par");
			
			
	}

}
