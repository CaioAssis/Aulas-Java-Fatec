package semana09;

public class Lampada {
	private boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void ver() {
		System.out.println("Lampada: "+status);
	}

}
