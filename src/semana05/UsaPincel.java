package semana05;

public class UsaPincel {
	public static void main(String[] args) {
		Pincel p1 = new Pincel();
		p1.cor = "preto";
		p1.fabricante = "Faber Castell";
		p1.preco = 10;
		p1.abrirTampa();
		p1.escrever();
		
		Pincel p2 = new Pincel();
		p2.cor = "azul";
		p2.fabricante = "Faber Castell";
		p2.preco = 12;
		p2.recarregar();
	}

}
