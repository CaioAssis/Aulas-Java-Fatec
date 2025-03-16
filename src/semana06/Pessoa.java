package semana06;

import javax.swing.JOptionPane;

public abstract class Pessoa { //abstract não pode gerar objetos
	private int codigo; // source - generate getters and setters
	protected String nome; //As subclasses enxergam atributos protegidos (Protected), mas não atributos privados.
	
	public void digitar() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
		nome = JOptionPane.showInputDialog("Nome?");
	}
	
	
	public void mostrar() {
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
