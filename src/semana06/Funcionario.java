package semana06;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica{
	
	private String cargo;
	private double salario;
	
	/*Funcionario f = new Funcionario() {
		int codigo = 1;
		String nome = "Reinaldo";
		String cargo = "pedreiro";
		double salario = 220;
		};*/
	
	public void digitar() {
		super.digitar(); // superclasse - digitar do extends
		cargo = JOptionPane.showInputDialog("Cargo?");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salario?"));
	}
	
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: " + cargo);
		System.out.println("Salario: " + salario);
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
