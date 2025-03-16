package semana02;

import javax.swing.JOptionPane;

public class Entrada02 {

	public static void main(String[] args) {
		// Entrada de dados com Janela

		//metodo 1
		String s = JOptionPane.showInputDialog("Entre com a largura: ");
		int largura = Integer.parseInt(s);
		
		//metodo 2
		int comprimento = Integer.parseInt(
				JOptionPane.showInputDialog("Entre com o comprimento: "));
		
		int area = largura * comprimento;
		//System.out.println("Area: " + area);
		
		//Resultado em Janela
		JOptionPane.showMessageDialog(null, "Area: \n" + area);
	}

}
