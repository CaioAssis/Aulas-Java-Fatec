package semana03;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		String[] alunos = {"Jenifer", "Abner", "Sara", "Flavio"};
		
		System.out.println(alunos); // objeto
		System.out.println(Arrays.toString(alunos)); //crtl+shift+O para import
		
		System.out.println();
		
		String[] vetor = alunos;
		vetor[0] = "Guilherme";
		
		System.out.println(alunos);
		System.out.println(Arrays.toString(alunos));
		
	}

}
