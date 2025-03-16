package semana01;

public class Conversoes {

	public static void main(String[] args) {
		
		double d = 12.543654;
		int v = (int)d; //para converter double para int
		
		float f = 5.6f;
		byte b = (byte)f;

		String s = "100";
		int a = Integer.parseInt(s);
		float c = Float.parseFloat(s);
		double e = Double.parseDouble(s);
	}

}
