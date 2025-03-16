package semana08Exercicios;

import javax.swing.JOptionPane;

public class CalcArea {
	public static void main(String[] args) {
		FormaGeometrica forma = null;
		String op;
		while(true) {
			try {
				op = JOptionPane.showInputDialog("Escolha a forma a ser calculada.\n"
						+ "1 - Quadrado\n"
						+ "2 - Triangulo\n"
						+ "3 - Circulo");
				break;
			}
			catch (Exception e) {System.out.println(e);}
		}
		try {
			switch(op) {
			case "1":
				forma = new Quadrado();
				break;
			case "2":
				forma = new Triangulo();
				break;
			case "3":
				forma = new Circulo();
				break;
			}
		
			forma.calcularArea();
		}
		catch(Exception e) {System.out.println(e);}
	}
}
