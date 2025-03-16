package semana02;

public class Ternario {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		int maior = (a>b)?a:b>a?b:a;
		
		String s = a>b?""+a:b>a?""+b:"Iguais";
		
		System.out.println(maior); // int
		
		System.out.println(s); // String
		
		System.out.println(a>b?""+a:b>a?""+b:"Iguais"); // Ternário direto no print

	}

}
