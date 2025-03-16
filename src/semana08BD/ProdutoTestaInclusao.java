package semana08BD;

public class ProdutoTestaInclusao {

	public static void main(String[] args) {
		Produto p = new Produto(51, "Pinga", 10.30);
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.inserir(p));
	}

}
