package semana09;

public class Funcionario {
	public int codigo;
	public String nome;
	public Mesa mesa; // entender isso
	public Cargo cargo; // entender isso

	public void mostrar() {
		System.out.println(codigo);
		System.out.println(nome);
		System.out.println(mesa.codigo + " - " + mesa.descricao);
		System.out.println(cargo.codigo+" - "+cargo.descricao);
	}
}
