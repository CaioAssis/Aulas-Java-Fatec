package semana04;

public class Metodos {
	//uma classe pode conter metodos com o mesmo nome, PORÉM, COM ASSINATURAS DIFERENTES -> Overload / Sobrecarga
	//File - Export - JAVA - Javadoc
	
	/**
	 * Recebe dois valores e retorna a soma entre eles
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void somar(float a, float b) {
		System.out.println(a+b);
		System.out.println();
	}
	
	
	/**
	 * Recebe dois valores e retorna a subtração entre eles
	 * @param a - primeiro valor
	 * @param b - segundoo valor
	 */
	public static void subtrair(float a, float b) {
		System.out.println(a-b);
	}
	

	/**
	 * Recebe dois valores e retorna a multiplicação entre eles
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void multiplicar(float a, float b) {
		System.out.println(a*b);
	}
	

	/**
	 * Recebe dois valores e retorna a divisão entre eles
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void dividir(float a, float b) {
		System.out.println(a/b);
	}
	
}
