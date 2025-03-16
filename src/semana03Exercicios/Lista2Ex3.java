package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista2Ex3 {

	public static void main(String[] args) {
		/*Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.*/
		
		float num, resp;
			
			while(true) {
				try {
					num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número."));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			
			if(num >= 0) resp = num*2;
			else resp = num*3;
			System.out.println(resp);
	}

}
