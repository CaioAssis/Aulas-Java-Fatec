package semana09;

public class Pessoa {
	public String cpf, nome;
	public Pessoa conjuge;

	public Pessoa(String cpf, String nome, Pessoa conjuge) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.conjuge = conjuge;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public void mostrar() {
		System.out.println(cpf);
		System.out.println(nome);
		if (conjuge == null) {
			System.out.println("Solteira(o)");
		} else {
			System.out.println("Casada(o) com " + conjuge.nome);
		}
	}

}
