package semana07;

public class UsaProduto {
	public static void main(String[] args) {
		/*// Primeiro teste
		Produto p1 = new Produto();
		System.out.println(p1);
		Produto p2 = new Produto(10);
		System.out.println(p2);
		Produto p3 = new Produto(1, "Sabonete", 3.45);
		System.out.println(p3);
		//*/
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.listar("ac");
		
	
	}
}
