package semana01;

public class Calculadora {

	public static void main(String[] args) {

		if(args.length == 3) {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
		/*System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);*/
		
		if(args[2] == "+") {
			System.out.println(n1+n2);
		}
		else if(args[2] == "-") {
			System.out.println(n1-n2);
		}
		else if(args[2] == "*") {
			System.out.println(n1*n2);
		}
		else if(args[2] == "/") {
			System.out.println(n1/n2);
		}
		else {
			System.out.println("Erro - Operador Inválido");
		}
		}
		else {
			System.out.println("Erro - Variáveis não encontradas");
		}
	}

}
