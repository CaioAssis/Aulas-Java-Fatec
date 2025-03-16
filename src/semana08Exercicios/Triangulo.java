package semana08Exercicios;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica{
	@Override
	public void calcularArea() {
		try {
			float b = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida da base do triangulo."));
			float h = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida da altura do triangulo."));
			System.out.println("Area = "+ b*h/2);
		}
		catch(Exception e) {System.out.println(e);}
	}
}
