package semana05;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
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
	public boolean setPreco(double preco) {
		if(preco>=0) {
			this.preco = preco;
			return true;
		}
		else {
			return false;
		}		
	}
	
	public String toString() {
		return "["+codigo+","+descricao+","+preco+"]";
	}
	

}
