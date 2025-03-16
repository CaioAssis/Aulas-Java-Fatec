package semana11;

public class UsaAnimal {

	public static void main(String[] args) { //UML - Abstrato = Itálico
		Gato g = new Gato();
		g.codigo = "1";
		g.nome = "Nelson";
		g.mostrar();
		
		g.comer();
		g.beber();
		g.dormir();

	}

}
