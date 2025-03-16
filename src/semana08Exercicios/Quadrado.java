package semana08Exercicios;

import javax.swing.JOptionPane;

public class Quadrado extends FormaGeometrica{
	
	@Override
	public void calcularArea() {
		try {
			float l = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida de um lado do quadrado."));
			System.out.println("Area = "+ l*l);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
