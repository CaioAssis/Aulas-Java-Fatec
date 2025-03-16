package semana03;

import javax.swing.JOptionPane;

public class Try06 {

	public static void main(String[] args) {
		// Manter o programa no ar
		while(true) { ////////////
			try{
				int idade = -1;
				do {
					idade = Integer.parseInt(JOptionPane.showInputDialog("Idade (0 a 120"));
				}while(idade<0 || idade>120); //quando o requisito for verdadeiro, break
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma idade válida!");
			}
	
		}
	}
}
