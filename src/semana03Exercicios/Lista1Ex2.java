package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista1Ex2 {

	public static void main(String[] args) {
		//Faça uma  classe que  calcule  a  área  de  um  quadrado,  em  seguida  mostre  o  dobro desta área para o usuário. 
		
		
		float tam = 0;
		
		while(true) {
			try {
				tam = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho de um lado do quadrado."));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		
		float area = tam * tam;
		JOptionPane.showMessageDialog(null, "O dobro da área do quadrado é " + area*2);
		
		
	}

}
