package semana03Exercicios;

import javax.swing.JOptionPane;

public class Lista3Ex3 {

	public static void main(String[] args) {
		/*
		 *Elabore  uma  aplicação que  efetue  a  leitura  de  valores  positivos  
		 *inteiros  até que  um  valor  negativo  seja  informado.  Ao  final  devem  
		 *ser  apresentados  o maior e o menor valor informados pelo usuário.
		 */
		
		int num, maior = -1, menor = -1;
		while(true) {
			while(true) {
				try {
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro. \nDigite um número negativo para encerrar."));
					break;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			}
			if(num < 0) break;
			else {
				if(num <= menor || menor == -1) menor = num;
				if(num >= maior || maior == -1) maior = num;
			}
		}
		if(maior == -1 && menor == -1) JOptionPane.showMessageDialog(null, "Nenhum número foi informado!");
		else JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
	}

}
