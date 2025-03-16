package semana03;

public class Split01 {

	public static void main(String[] args) {
		
		String nomes = "Paulo;Sandro;Bianca;Paula";
		String[] v = nomes.split(";"); //separa nomes em vetores de v a cada ";"
		
		
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		
	}

}