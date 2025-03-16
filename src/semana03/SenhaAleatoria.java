package semana03;

public class SenhaAleatoria {

	public static void main(String[] args) {
		String c = "0123456789ABCDEabcde!@#$%+[]"; //caracteres que podem aparecer na senha
		String senha = "";
		int tamanho = c.length();
		int qtde = 6; //quantidade de caracteres
		
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random() * tamanho);  //randomiza character
			senha += c.charAt(indice); //adiciona na variavel da String o character String c em relacao ao indice 
		}
		System.out.println(senha);

	}

}
