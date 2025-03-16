package semana03;

import javax.swing.JOptionPane;

public class Try03 {

		public static void main(String[] args) {
			
			try {
				int idade = Integer.parseInt(
						JOptionPane.showInputDialog("Idade?"));
				int media = 100/idade;
				JOptionPane.showMessageDialog(null,"Sucesso!");
				System.out.println(media);
			}
			catch(Exception e){ //pega todas as excessões
				if(e.toString().indexOf("Number")>=0) { // toString transforma em String; indexOf procura parte da string e retorna o vetor inicial; se não encontra, retorna -1
					JOptionPane.showMessageDialog(null,"Digite um numero!");
				}
				else if (e.toString().indexOf("Arith")>=0) {
					JOptionPane.showMessageDialog(null,"A idade não pode ser zero!");
				}
			}
		}
	}
