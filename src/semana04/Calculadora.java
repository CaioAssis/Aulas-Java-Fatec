package semana04;

//import semana04.Calculadora; //<--- para utilizar em outros pacotes
//ou
//semana04.Calculadora.imprimir() //<--- para chamar direto, sem importar

public class Calculadora {
	/*
	public static void main(String[] args) {
		imprimir();
		imprimirFrase("teste main", 2);
	}
	*/
	public static void somar(int a, int b) { //especificação
		/*
		 * public - todos enxergam
		 * private - só a classe enxerga
		 */
		
		//implementação
		System.out.println(a+b);
	}
	
	public static void imprimir() {
		System.out.println("Frase estática do metodo");
	}

	public static void imprimirFrase(String frase, int qtde) {
		for (int i=0; i<qtde; i++)
			System.out.println(frase);
	}
}
