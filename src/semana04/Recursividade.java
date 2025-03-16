package semana04;

public class Recursividade {

	static int contador = 1; //metodo estatico só pode usar variaveis estaticas
	public static void contar(int limite) { //Recursividade -> método chama ele mesmo
		if(contador<=limite) {
			System.out.println(contador++);
			contar(limite);
		}
	}
	
	public static void somatorio(int limite) {
		int total = 0;
		for(int i=1; i<=limite; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	/*public static int somatorioRecursivo(int limite) {
		if(return somatorioRecursivo(limite - 1))
		else return 0;
	}*/
	
	public static void main(String[] args) {
		contar(10);
		somatorio(10);
		//System.out.println(somatorioRecursivo(10));
	}
}
