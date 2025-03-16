package semana03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try05 {

	public static void main(String[] args) {
		//Exemplo de checked exception
		
		try {
			BufferedReader br =
					new BufferedReader(new FileReader("file.txt"));
		} catch (FileNotFoundException e1) {}

		for(int i=0; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
		
	}

}
