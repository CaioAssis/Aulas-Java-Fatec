package semana08Exercicios;

import javax.swing.JOptionPane;

public class Circulo extends FormaGeometrica{
	@Override
	public void calcularArea() {
		try {
			float r = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida do raio do circulo."));
			System.out.println("Area = "+ r*r*3.14);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
