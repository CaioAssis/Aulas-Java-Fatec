package semana07;

import java.sql.SQLException;

public class ProdutoDAO {
	//DAO = Data Access Object
	private BD bd;
	public ProdutoDAO() {
		bd = new BD();
	}
	
	
	/**
	 * Apresenta em tela a relação de produtos
	 */
	public void listar() {
		if(bd.getConnection()) {
			String sql = "select * from produtos";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				 while(bd.rs.next()) { // avança ponteiro para proxima casa. retorna false no quando não tem mais linhas
					/*Produto p = new Produto();	//forma 1
					p.setCodigo(bd.rs.getInt("codigo"));
					p.setDescricao(bd.rs.getString("descricao"));
					p.setPreco(bd.rs.getDouble("preco"));
					System.out.println(p);
					//*/
					
					Produto p = new Produto(	//forma 2
						bd.rs.getInt("codigo"),
						bd.rs.getString("descricao"),
						bd.rs.getDouble("preco")
						);
					System.out.println(p);
					
				 }
			}
			catch(SQLException e) {
				System.out.println("Erro:" + e);
			}
			finally {
				bd.close();
			}
		}
		
		else System.out.println("Falha na conexão!");
	}
	/**
	 * Apresenta em tela a relação de produtos cujo preço seja superior ao fornecido
	 * @param preco - valor para comparação
	 */
	public void listar(double preco) {
		if(bd.getConnection()) {
			String sql = "select * from produtos where preco > ?"; // ? = bd.st.setDouble
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setDouble(1, preco);
				bd.rs = bd.st.executeQuery();
				 while(bd.rs.next()) { // avança ponteiro para proxima casa. retorna false no quando não tem mais linhas
					/*Produto p = new Produto();	//forma 1
					p.setCodigo(bd.rs.getInt("codigo"));
					p.setDescricao(bd.rs.getString("descricao"));
					p.setPreco(bd.rs.getDouble("preco"));
					System.out.println(p);
					//*/
					
					Produto p = new Produto(	//forma 2
						bd.rs.getInt("codigo"),
						bd.rs.getString("descricao"),
						bd.rs.getDouble("preco")
						);
					System.out.println(p);
					
				 }
			}
			catch(SQLException e) {
				System.out.println("Erro:" + e);
			}
			finally {
				bd.close();
			}
		}
		else System.out.println("Falha na conexão!");
	}
		
		/**
		 * Apresenta em tela a relação de produtos cuja descrição seja semelhante ao fornecido
		 * @param descricao
		 */
		public void listar(String descricao) {
			if(bd.getConnection()) {
				String sql = "select * from produtos where descricao like ?"; // ? = bd.st.setString
				try {
					bd.st = bd.con.prepareStatement(sql);
					bd.st.setString(1, "%" + descricao + "%");
					bd.rs = bd.st.executeQuery();
					 while(bd.rs.next()) { // avança ponteiro para proxima casa. retorna false no quando não tem mais linhas
						/*Produto p = new Produto();	//forma 1
						p.setCodigo(bd.rs.getInt("codigo"));
						p.setDescricao(bd.rs.getString("descricao"));
						p.setPreco(bd.rs.getDouble("preco"));
						System.out.println(p);
						//*/
						
						Produto p = new Produto(	//forma 2
							bd.rs.getInt("codigo"),
							bd.rs.getString("descricao"),
							bd.rs.getDouble("preco")
							);
						System.out.println(p);
						
					 }
				}
				catch(SQLException e) {
					System.out.println("Erro:" + e);
				}
				finally {
					bd.close();
				}
			}
		
		else System.out.println("Falha na conexão!");
	}
}
