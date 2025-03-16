package semana05;

public class UsaLivro {
	
	public static void main(String[] args) {
		Livro livro; //declaração (aloca espaço na memória para esse objeto, mesmo que ele ainda não esteja criado)
		livro = new Livro(); //criação (instanciação)
		
		Livro livro1 = new Livro();
		livro1.mostrar();
		livro1.isbn = "1";
		livro1.titulo = "Poeira em alto mar";
		livro1.preco = 20.34f;
		livro1.novo = true;
		livro1.mostrar();
	}

}
