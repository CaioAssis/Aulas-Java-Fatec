package semana09;

import java.util.ArrayList;
import java.util.List;

public class UsaCargo {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();

		f1.codigo = 1;
		f2.codigo = 2;
		f3.codigo = 3;
		f1.nome = "Ana";
		f2.nome = "Bia";
		f3.nome = "Denis";

		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);

		Cargo c1 = new Cargo();

		c1.codigo = 100;
		c1.descricao = "Programador";
		c1.listaFuncionarios = lista;
		c1.mostrar();
		
		
	}
}
