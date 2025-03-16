package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista4Ex2 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que leia um nome de usuário e a sua senha e NÃO
		 * aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e 
		 * voltando a pedir as informações. 
		 */
		
		String user=null, password=null;
		int cancel = 0;
		while(true && cancel == 0) {
			user = JOptionPane.showInputDialog("Digite o nome de usuário.");
			if(user == null) cancel = 1;
			else if (user.equals("")) JOptionPane.showMessageDialog(null, "Usuário não digitado!");
			else break;
		}
		while (true && cancel == 0) {
			password = JOptionPane.showInputDialog("Digite a senha.");
			if(password == null) cancel = 1;
			else if (password.equals("")) JOptionPane.showMessageDialog(null, "Senha não digitada!");
			else if (password.equals(user)) JOptionPane.showMessageDialog(null, "A senha não pode ser igual ao usuário!");
			else break;
		}
		if(cancel == 1) JOptionPane.showMessageDialog(null, "Cancelado!");
		else JOptionPane.showMessageDialog(null, "Sucesso!");
	}

}
