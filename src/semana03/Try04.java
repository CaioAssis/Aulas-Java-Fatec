package semana03;

import javax.swing.JOptionPane;

public class Try04 {

		public static void main(String[] args) {
			
			try {
				int idade = Integer.parseInt(
						JOptionPane.showInputDialog("Idade?"));
				int media = 100/idade;
				//System.out.println(media);
				
				String[] nomes = {"Sergio", "Ana"};
				System.out.println(nomes[idade]);
				JOptionPane.showMessageDialog(null,"Sucesso!");
				
			}
			catch(NumberFormatException|ArithmeticException e){ //duas excessoes num só catch
				JOptionPane.showMessageDialog(null,"Erro: " + e);
			}
			catch(ArrayIndexOutOfBoundsException e) { // indice(idade) não tem valor
				JOptionPane.showMessageDialog(null, "Problema no índice!");
			}
		}
	}

