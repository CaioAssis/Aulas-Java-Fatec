package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista1Ex3 {

	public static void main(String[] args) {
		//Faça uma classe que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. 
		
		
		float f = 0;
		
		while(true) {
			try {
				f = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em graus Farenheit."));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		
		float c = (5* (f-32)/9);
		JOptionPane.showMessageDialog(null, f + " ºF convertido para \nCelsius é igual a " + String.format("%.2f", c) + " ºC");
		
		
	}

}
