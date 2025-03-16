package semana09;

public class UsaPessoa {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("1", "Paulo", null);
		Pessoa p2 = new Pessoa("2", "Ana", p1);
		Pessoa p3 = new Pessoa("3", "Bruno", null);
		
		p1.conjuge = p2; //casamento
		
		p1.conjuge = null; //separação
		p2.conjuge = null; //separação
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
	}

}
