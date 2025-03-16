package semana09;

public class Casa {
	public Quarto quarto;
	public Sala sala;
	
	public Casa() { //Para que os objetos sejam criados ao mesmo tempo
		quarto = new Quarto();
		sala = new Sala();
	}
	
	public void mostrar() {
		quarto.mostrar();
		sala.mostrar();
	}

}
