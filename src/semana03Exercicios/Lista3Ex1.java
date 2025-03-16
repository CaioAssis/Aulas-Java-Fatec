package semana03Exercicios;

public class Lista3Ex1 {

	public static void main(String[] args) {
		/*
		 *Elabore  uma  aplicação que  apresente  os  valores  de  conversão  de  graus Celsius  
		 *em  Fahrenheit,  de  10  em  10  graus,  iniciando  a  contagem  em  10 graus  Celsius  
		 *e  finalizando  em  100  graus  Celsius.  O  programa  deverá apresentar os valores das 
		 *duas temperaturas. 
		 */
		
		for(int c=10; c<=100; c+=10) {
			float f = 32 + (c * 9 / 5);
			System.out.println(c + " ºC ---> " + String.format("%.1f", f) + " ºF");
		}
	}

}
