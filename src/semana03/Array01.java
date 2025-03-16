package semana03;

public class Array01 {

	public static void main(String[] args) {
		
		//formas de criação de arrays
		String[] nomes = {"Ana", "Bia"}; //1
		
		String[] produtos = new String[2]; //2
		produtos[0] = "Sabão";
		produtos[1] = "Sabonete";
		
		
		String n = "Paulo;Sandro;Bianca;Paula"; //3
		String[] v = n.split(";");
		
		for(int i=0; i<v.length; i++) {
			System.out.println(v[i]);
		}
		
		System.out.println();
		
		//iterator
		for(String s:v) { //s recebe v
			System.out.println(s);
		}
		
	}

}
