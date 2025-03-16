package semana10;

public class Vida { // consumer
	//consumir uma interface Fisio (required)
	
	public void viver(Fisio f) { // polimorfismo de interface
		f.beber();
		f.comer();
		f.dormir();
	}
	
}
