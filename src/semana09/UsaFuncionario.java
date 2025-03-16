package semana09;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Mesa m = new Mesa();
		Cargo c = new Cargo();
		
		m.codigo = 100;
		m.descricao = "Mesa 1m x 1m de madeira";
		
		c.codigo = 50;
		c.descricao = "Analista";
		
		f.codigo = 1;
		f.nome = "Juaum";
		f.mesa = m;
		f.cargo = c;
		f.mostrar();
	}
}
