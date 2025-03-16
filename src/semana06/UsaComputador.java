package semana06;

public class UsaComputador {
	public static void main(String[] args) {
		Computador c = new Computador();
		System.out.println(c.descricao);
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.out.println(c.getClass());
		/*Pessoa p = new Pessoa();
		p.nome = "João";
		System.out.println(p.nome);
		//*/
	}
}
