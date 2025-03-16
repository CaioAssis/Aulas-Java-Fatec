package semana10;

public class Automovel implements Motor, Porta{

	public void ligar() {
		System.out.println("Ligando o automóvel");
	};
	
	public void desligar() {
		System.out.println("Desligando o automóvel");
	};
	
	public void acelerar(int v) {
		System.out.println("Acelerando o automóvel");
	};
	
	public void frear() {
		System.out.println("Freando o automóvel");
	}

	@Override
	public void abrir() {
		System.out.println("Abrindo a porta");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando a porta");
	};
}
