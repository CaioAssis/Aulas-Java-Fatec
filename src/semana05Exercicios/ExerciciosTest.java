package semana05Exercicios;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExerciciosTest {

	public static void main(String[] args) {
		
		// A
		String palavra = JOptionPane.showInputDialog(null, "Digite uma palavra.");
		Exercicio.metodoA(palavra);
		//*/
		
		/*// B
		int num;
		while(true) {
			try {
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		Exercicio.metodoB(num);
		//*/
		
		/*// C
		Exercicio.metodoC();
		//*/
		
		/*// D
		int dia;
		while(true) {
			try {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
				break;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		Exercicio.metodoD(dia);
		//*/
		
		/*// E
		List<String> listaNomes = new ArrayList<>();
		while(true) {
			String nome = JOptionPane.showInputDialog("Digite o nome. Deixe em branco para encerrar.");
			if(nome == null || nome.trim().isEmpty())	break;
			else listaNomes.add(nome);
		}
		Exercicio.metodoE(listaNomes);
		//*/
		
		/*// F
		List<Integer> listaNumeros = new ArrayList<>();
		while(true) {
			try {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero. Digite [0] para encerrar."));
				if(num == 0) break;
				else listaNumeros.add(num);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro: " + e);
			}
		}
		
		System.out.print("Quantidade de números pares: ");
		System.out.println(Exercicio.metodoF(listaNumeros));
		//*/
		
		/*// G
		int[] val = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<10; i++) {
			while(true) {
				try {
					val[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			
		}
		
		System.out.println(Exercicio.metodoG(val));
		
		//*/
		
		/*// H
		float[] notas = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Média: ");
		System.out.println(Exercicio.metodoH(notas));
		//*/
		
		/*// I
		int v1 = 3;
		int v2 = 10;
		int[] resp = Exercicio.metodoI(v1, v2);
		for(int i=0; i<v1; i++) {
			System.out.println(resp[i]);
		}
		//*/
		
		/*// J
		
		//123.456.789/00
		//xxx.xxx.xxx/xx
		//123456789/00
		//123 456 789 00
		//123.456.78900
		String cpf = "123.456.789/00";
		if(Exercicio.metodoJ(cpf)) System.out.println("CPF válido.");
		else System.out.println("CPF inválido.");
		//*/
	}

}
