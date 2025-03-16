package semana06;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{ // extends mostra afiliação/generalização - herança de atributos
	private String cpf;

	public void digitar() {
		//nome = JOptionPane.showInputDialog("Nome?"); //As subclasses enxergam atributos protegidos (Protected), mas não atributos privados.
		super.digitar(); // superclasse - digitar do extends
		cpf = JOptionPane.showInputDialog("CPF?");
	}
	
	
	public void mostrar() {
		super.mostrar();
		System.out.println("CPF: " + cpf);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
