package semana02;

public class Senha {

	public static void main(String[] args) {
		
		
		String senha = "";
		final int LIMITE = 10;
		
		for(int i=1; i<=10; i++) {
			int n = (int)(Math.random() * LIMITE);
			senha += n;
		}
		System.out.println(senha);
	}

}