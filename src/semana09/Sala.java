package semana09;

public class Sala {

	public String descricao;
	public Lampada lampada;
	public ArCondicionado ar;
	
	public Sala() { //Para que os objetos sejam criados ao mesmo tempo
		ar = new ArCondicionado();
		lampada = new Lampada();
	}

	public void mostrar() {
		System.out.println(descricao);
		lampada.ver();
		ar.ver();
	}

}
