package semana05;

public class ContaBancaria {
	private final int VALOR_LIMITE_SAQUE = 1000;
	private int numero;
	private double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	/**
	 * 
	 * @param valor
	 * @return
	 */
	public String sacar(double valor) {
		String msg = "";
		if(valor<=VALOR_LIMITE_SAQUE) {
			if(valor<=saldo) {
				saldo -= valor;
				msg = "Saque realizado com sucesso!";
			}
			else {
				msg = "Saldo insuficiente para a operação!";
			}
		}
		else {
			msg =  "Excedido o valor limite para saque!";
		}
		return msg;
	}
	public double consultaSaldo() {
		return saldo;
	}
	public void mostrar() {
		System.out.println(saldo);
	}

}
