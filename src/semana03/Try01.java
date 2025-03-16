package semana03;

import javax.swing.JOptionPane;

/*
 * try -> catch -> finally
 * 
 * checked -> compilador identifica em tempo de compilação
 * unchecked -> não são identificadas pelo compilador / ident em tempo de execução
 */


public class Try01 {

	public static void main(String[] args) {
		
		try {
			float nota = Float.parseFloat(
					JOptionPane.showInputDialog("Nota?"));
			JOptionPane.showMessageDialog(null,"Sucesso!");
		}
		catch(NumberFormatException e){ //nome do erro + variavel (objeto) ---- para encontrar o nome do erro, necessario forçar o erro ou pesquisar
			JOptionPane.showMessageDialog(null,"Erro: " + e);
		}
		finally {
			JOptionPane.showMessageDialog(null, "Encerrado");
		}
	}
}
