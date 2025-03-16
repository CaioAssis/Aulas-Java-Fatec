package semana02;

public class For02 {

	public static void main(String[] args) 
			throws InterruptedException {

		//Relogio
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m < 60; m++) {
				for(int s = 0; s < 60; s++) {
					System.out.println(h + ":" + m + ":" + s);
					Thread.sleep(100); //vel segundos
				}
			}
				
		}

	}

}
