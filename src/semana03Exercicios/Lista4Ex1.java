package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista4Ex1 {

	public static void main(String[] args) {
		/*
		 * Elabore  uma  aplicação que  peça  uma  nota,  entre  zero  e  dez.  
		 * Mostre  uma mensagem  caso  o  valor  seja  inválido  e  continue  pedindo  até  
		 * que  o  usuário informe um valor válido.
		 */
		
		float num;
			while(true) {
				try {
					num = Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota de [0] a [10] ."));
					if(num >= 0 && num <= 10) break;
					else JOptionPane.showMessageDialog(null, "Valor inválido!");
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}

		
	}

}
