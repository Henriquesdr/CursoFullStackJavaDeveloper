package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(1 > 2);
		System.out.println(1 >= 2);
		System.out.println(1 < 2);
		System.out.println(1 <= 2);
		System.out.println(1 != 1);
		
		double nota = 9.9;
		boolean bomComportamento = !true;
		boolean passouComMedia = nota >= 6;
		boolean taOk = bomComportamento && passouComMedia;
		
		System.out.println("\nTa okay? " + taOk);
	}
}
