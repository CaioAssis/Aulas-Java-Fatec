package semana05;

public class Livro {
	
	//atributos (propriedade)
	//definem o que o objeto é
	//definem o estado de um objeto
	
	public String titulo, isbn;
	public float preco;
	public boolean novo;
	
	/**
	 * Apresenta em tela o estado atual do objeto
	 */
	public void mostrar() {
		System.out.println("ISBN: "+isbn);
		System.out.println("Título: "+titulo);
		System.out.println("Preço: "+preco);
		System.out.println("Novo: "+novo);
	}
	
}
