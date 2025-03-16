package semana07;

public class Produto {
		private int codigo;
		private String descricao;
		private double preco;
		
		
		public Produto() {} // default
		
		public Produto(int codigo) { //para passar dados nesse padrao
			this.codigo = codigo;
		}
		
		public Produto(int codigo, String descricao) { //para passar dados nesse padrao
			this.codigo = codigo;
			this.descricao = descricao;
		}
		
		public Produto(int codigo, String descricao, double preco) { //para passar dados nesse padrao
			this.codigo = codigo;
			this.descricao = descricao;
			this.preco = preco;
		}
		
		public String toString() {
			return "[" +codigo+ "," +descricao+ "," +preco+ "]";
		}
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
		
}
