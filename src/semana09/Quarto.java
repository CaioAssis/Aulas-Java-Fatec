package semana09;

public class Quarto {
	
	public String descricao;
	public Lampada lampada1, lampada2;
	public ArCondicionado ar;
	
	public Quarto() {  //Para que os objetos sejam criados ao mesmo tempo
		ar = new ArCondicionado();
		lampada1 = new Lampada();
		lampada2 = new Lampada();
	}

	public void mostrar() {
		System.out.println(descricao);
		lampada1.ver();
		lampada2.ver();
		ar.ver();
	}
}
