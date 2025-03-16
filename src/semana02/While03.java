package semana02;

import javax.swing.JOptionPane;

public class While03 {

	public static void main(String[] args) {

		float nota1, nota2;
		do {
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1?"));
		}
		while (nota1 < 0 || nota1 > 10);

		do {
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2?"));
		}
		while (nota2 < 0 || nota2 > 10);
	}

}
