package semana10;

public class UsaVida {
	public static void main(String[] args) {
		Vida v = new Vida();
		
		Pessoa p = new Pessoa();
		v.viver(p);
		
		Animal a = new Animal();
		v.viver(a);
		
		ET e = new ET();
		v.viver(e);
	}
}
