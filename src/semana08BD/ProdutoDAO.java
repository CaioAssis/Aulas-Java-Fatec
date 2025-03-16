package semana08BD;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	private String men, sql;
	private BD bd;
	
	public ProdutoDAO() {
		bd = new BD();
	}
	
	/**
	 * Retorna a lista de produtos existentes na tabela produtos
	 * @return
	 */
	public List<Produto> getProdutos(String sql){
		List<Produto> lista = new ArrayList<Produto>();
		////////////////////
		bd.getConnection();
		//String sql = "select * from produtos";
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				Produto p = new //criando um produto a partir dos dados do banco
						Produto(bd.rs.getInt(1), bd.rs.getString(2), bd.rs.getDouble(3));
				lista.add(p);
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		finally {
			bd.close();
		}
		////////////////////
		
		return lista;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public String inserir(Produto p) {
		sql = "insert into produtos values(?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, p.getCodigo());
			bd.st.setString(2, p.getDescricao());
			bd.st.setDouble(3, p.getPreco());
			bd.st.executeUpdate();
			men = "Produto inserido com sucesso!";
		}
		catch(SQLException e) {
			System.out.println(e);
			men = "Falha na inclusão do produto! " + e;
		}
		finally {
			bd.close();
		}
		return men;
	}
}

