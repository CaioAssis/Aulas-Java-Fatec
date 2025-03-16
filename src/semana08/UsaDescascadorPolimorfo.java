package semana08;

import javax.swing.JOptionPane;

public class UsaDescascadorPolimorfo {

	public static void main(String[] args) {
		
		String op = JOptionPane.showInputDialog("Qual fruta será descascada?\n" + 
		"\n1 - Banana\n2 - Banana Nanica\n3 - Banana Prata\n4 - Abacaxi\n5 - Laranja");
		
		Fruta f = null; // cria objeto nulo
		
		switch(op) {
		case "1":
			f = new Banana();  //define objeto como novo objeto
			break;
		case "2":
			f = new Nanica(); 
			break;
		case "3":
			f = new Prata(); 
			break;
		case "4":
			f = new Abacaxi(); 
			break;
		case "5":
			f = new Laranja(); 
			break;
		}
		DescascadorPolimorfo.run(f);

	}

}
