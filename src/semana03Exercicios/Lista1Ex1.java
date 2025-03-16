package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista1Ex1 {

	public static void main(String[] args) {
		//Faça uma classe que converta metros para centímetros.
		
		
		float metro = 0;
		
		while(true) {
			try {
				metro = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida (m)"));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		
		float centimetro = metro*100;
		JOptionPane.showMessageDialog(null, centimetro + " cm");
		
		
	}

}
