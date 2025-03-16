package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista3Ex2 {

	public static void main(String[] args) {
		/*
		 *Elabore uma aplicação que apresente no final o somatório dos valores 
		 *pares existentes na faixa de 1 até 500.
		 */
		
		int soma = 0;
		
		for(int i=1; i<=500; i++) {
			if(i%2 == 0) soma = soma + i;
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos números pares entre 1 e 500\né igual a " + soma);
		//System.out.println(soma);
	}

}
