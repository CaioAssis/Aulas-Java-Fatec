package semana03;

import javax.swing.JOptionPane;

public class Try02 {

		public static void main(String[] args) {
			
			try {
				int idade = Integer.parseInt(
						JOptionPane.showInputDialog("Idade?"));
				int media = 100/idade;
				JOptionPane.showMessageDialog(null,"Sucesso!");
				System.out.println(media);
			}
			catch(NumberFormatException e){ //nome do erro + variavel (objeto) ---- para encontrar o nome do erro, necessario forçar o erro ou pesquisar
				JOptionPane.showMessageDialog(null,"Erro: " + e);
			}
			catch(ArithmeticException e){
				JOptionPane.showMessageDialog(null,"A idade não pode ser zero!");
			}
		}
	}
