package semana09;

public class ArCondicionado {
	
private boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void ver() {
		System.out.println("Ar: "+status);
	}

}
