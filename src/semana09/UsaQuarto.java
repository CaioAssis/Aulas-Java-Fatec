package semana09;

public class UsaQuarto {
	
	public static void main(String[] args) {
		Quarto q = new Quarto();
		q.lampada1.ligar();
		q.ar.ligar();
		
		q.ar.ver();
		q.lampada1.ver();
		q.lampada2.ver();
		
		q.mostrar();
	}
	
}
