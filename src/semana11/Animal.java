package semana11;

public abstract class Animal {
	//UML - Abstrato = Itálico
	//UML - Estático = Sublinhado
	//UML - ??? = Negrito
	
	public String codigo, nome;
	
	public abstract void comer();
	public abstract void beber();
	public abstract void dormir();
	
	public void mostrar() {
		System.out.println(codigo);
		System.out.println(nome);
	};
}
