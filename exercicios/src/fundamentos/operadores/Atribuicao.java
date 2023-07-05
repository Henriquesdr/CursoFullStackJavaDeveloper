package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 7;
		int b = a;
		int c = a + b;
		System.out.println(c);
		
		c += b; // c = c + b !!!
		System.out.println(c);
		
		c -= a; // c = c - a !!!
		System.out.println(c);
		
		c *= b; // c = c * b !!!
		System.out.println(c);
		
		c /= a; // c = c / a !!!		
		System.out.println(c);
		
		c %= 2; // c = c % 2 !!! (0 ou 1) (par ou impar)
		System.out.println(c);
	}
}
