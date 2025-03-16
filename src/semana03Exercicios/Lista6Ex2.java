package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista6Ex2 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que gere uma senha numérica de n dígitos (solicitado ao usuário),  
		 * ou  seja,  a  aplicação  solicita  a  quantidade  de  dígitos  e  o  programa apresenta 
		 * a senha em tela.
		 */
		
		String c = "0123456789";
		String senha = "";
		int tamanho = c.length();
		int qtde = 0;
		
		while(true) {
			try {
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dígitos da senha."));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		
		
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random() * tamanho);
			senha += c.charAt(indice);
		}
		System.out.println("Senha: " + senha);
		JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
		
	}

}
