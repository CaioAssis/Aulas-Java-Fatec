package semana09;

import java.util.List;

public class Cargo {
	public int codigo;
	public String descricao;
	public Funcionario[] funcionarios;
	public List<Funcionario> listaFuncionarios;
	
	public void mostrar() {
		System.out.println(codigo);
		System.out.println(descricao);
		for(Funcionario f:listaFuncionarios) {
			System.out.println(f.nome);
		}
	}

}
