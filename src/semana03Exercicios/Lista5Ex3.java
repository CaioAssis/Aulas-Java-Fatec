package semana03Exercicios;

public class Lista5Ex3 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que gere uma senha contendo 10 dígitos alfanuméricos.
		 */
		
		String c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String senha = "";
		int tamanho = c.length();
		int qtde = 10;
		
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random() * tamanho);
			senha += c.charAt(indice);
		}
		System.out.println(senha);
	}

}
