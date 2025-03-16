package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Array03 {

	public static void main(String[] args) 
			throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("dados.txt");
		
		int[] dados = new int[300000];
		for(int i=0; i< dados.length; i++) {
			int n = (int)(14 + Math.random()*17);
			dados[i] = n;
			pw.println(n);
		}
		pw.close();
		System.out.println("Fim");

	}

}
