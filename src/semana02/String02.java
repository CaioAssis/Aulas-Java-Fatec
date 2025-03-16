package semana02;

public class String02 {

	public static void main(String[] args) {
		String s = "Aula de POO";
		
		int tamanho = s.length(); //11 letras
		for(int i=0; i<tamanho; i++) {
			System.out.println(s.charAt(i));
		}

	}

}
