package semana09;

public class NotaFiscal {
	public String dataEmissao;
	public String cliente;
	public double total;
	public Item[] itens;
	
	public class Item{
		public int codigoProduto;
		public int quantidade;
		public double valor;
	}
}
