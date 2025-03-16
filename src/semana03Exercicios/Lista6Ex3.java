package semana03Exercicios;

public class Lista6Ex3 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que gere aleatoriamente um 
		 * valor numérico de quatro dígitos e imprima 
		 * em tela cada um dos seus dígitos por extenso.
		 */
		
		String c = "0123456789";
		String numero = "";
		int tamanho = c.length();
		int qtde = 4;
		
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random() * tamanho);
			numero += c.charAt(indice);
		}
		System.out.println("Número: " + numero + "\n");
		System.out.println();
		
		for(int i = 0; i<numero.length(); i++) {
			switch(numero.charAt(i)) {
				case '1':
					System.out.print("um");
					break;
				case '2':
					System.out.print("dois");
					break;
				case '3':
					System.out.print("três");
					break;
				case '4':
					System.out.print("quatro");
					break;
				case '5':
					System.out.print("cinco");
					break;
				case '6':
					System.out.print("seis");
					break;
				case '7':
					System.out.print("sete");
					break;
				case '8':
					System.out.print("oito");
					break;
				case '9':
					System.out.print("nove");
					break;
				case '0':
					System.out.print("zero");
					break;	
			}
			if(i+1<numero.length()) System.out.print(", ");
			else System.out.println(".");
		}
		
	}

}
