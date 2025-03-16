package semana02;

import javax.swing.JOptionPane;

public class While02 {

	public static void main(String[] args) {
		
		//Elabore uma aplicação que solicite a digitação de um valor entre 0 e 10
		
		while(true) {
			float val = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor."));
			if(val >=0 && val <= 10) break;	
		}
	
		while(true) {
		float val2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor."));
		if(val2 >=0 && val2 <= 10) break;	
		}
		//JOptionPane.showMessageDialog(null, "A média é: " + (val + val2) / 2);
	}
	
}