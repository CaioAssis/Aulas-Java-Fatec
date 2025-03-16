package semana02;

public class For01 {

	public static void main(String[] args) 
			throws InterruptedException {


		
		/*
		for(int a=1; a<=10; a++) {
			System.out.println(a);
			Thread.sleep(200);
		}
		
		System.out.println("");
		
		for(int a=10; a>0; a--) {
			System.out.println(a);
			Thread.sleep(100);
		}
		*/
		
		for(char c = 'A'; c<= 'z'; c++) {
			System.out.println(c + " - " + (int)c);
			Thread.sleep(100);
		}
	}

}
