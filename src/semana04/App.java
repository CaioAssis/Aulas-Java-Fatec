package semana04;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		//String r = Metodos02.gerarSenha(10);
		//System.out.println(r);
		//ou
		//System.out.println(Metodos02.gerarSenha(5));
		/////////////
		//System.out.println(Metodos02.lerNota("Digite a nota."));
		double nota = 0;
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota."));
		}
		while(!Metodos02.validar(nota));
		System.out.println(nota);

	}

}
