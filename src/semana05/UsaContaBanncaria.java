package semana05;

import javax.swing.JOptionPane;

public class UsaContaBanncaria {
	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		cb.depositar(1000);
		cb.depositar(500);
		JOptionPane.showMessageDialog(null, cb.sacar(1100));
		JOptionPane.showMessageDialog(null, "Salado atual: " + cb.consultaSaldo());
		
		cb.mostrar();
	}

}
