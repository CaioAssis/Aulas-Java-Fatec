package semana05;

public class Motor {
	
	private final int VELOCIDADE_MAXIMA = 100; //CONSTANTE SEMPRE EM MAIÚSCULO
	private final int VELOCIDADE_MINIMA = 0; //CONSTANTE SEMPRE EM MAIÚSCULO
	
	private int velocidade;
	private boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void acelerar() {
		//implementação de uma régra de negócio (RN)
		if(status) {
			if(velocidade<VELOCIDADE_MAXIMA) {
				velocidade++;
			}
		}
	}
	
	public void frear() {
		if(status) {
			if(velocidade>VELOCIDADE_MINIMA) {
				velocidade--;
			}
		}
	}
	
	public void mostrar() {
		System.out.println("Status: "+status);
		System.out.println("Velocidade: "+velocidade);
	}
	
	public String toString() {
		return "["+status+"-"+velocidade+"]";
	}

}
