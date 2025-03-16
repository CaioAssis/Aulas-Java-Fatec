package semana10;

public interface Motor { //new -> Interface
	//interfaces não podem instanciar objeto
	
	public abstract void ligar(); 
	public void desligar();
	void acelerar(int v);
	void frear();
	
	//Pelas interfaces sempre serem PUBLIC ABSTRACT, não é necessário escrever.
}
