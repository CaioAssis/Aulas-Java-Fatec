package semana02;

import java.util.Scanner;

public class Entrada01 {

	public static void main(String[] args) {
		// Entrada de dados com Scanner

		Scanner sc = new Scanner(System.in); //criar objeto classe Scanner
		System.out.println("Entre com a largura:");
		double largura = sc.nextDouble();
		
		System.out.println("Entre com o comprimento:");
		double comprimento = sc.nextDouble();
		
		double area = largura * comprimento;
		System.out.println("Area: " + area);
		
		sc.close();
	}

}
