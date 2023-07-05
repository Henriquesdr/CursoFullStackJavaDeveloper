package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 7;      // CONVERSAO IMPLICITA 
		System.out.println(a);
		
		float b = 1.0F;
		System.out.println(b);
		
		
		//CAST               CONVERSAO EXPLICITA
		float c = (float) 7.001002003004005;
		System.out.println(c);
		
		long d = (int) 12345.0909;
		System.out.println(d);
		
		int e = 500;
		byte f = (byte) e;
		System.out.println(f);
		
		double g = 10.1010;
		int h = (int) g;
		System.out.println(h);
		
		int i = 99;
		double j = (double) i;
		System.out.println(j);
		
	}
}
