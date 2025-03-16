package semana08BD;

import java.util.List;

public class ProdutoTestaLista {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		String sql = "select * from produtos where preco < 20";
		List<Produto> lista = dao.getProdutos(sql);
		for(Produto p: lista) {
			System.out.println(p);
		}

	}

}
