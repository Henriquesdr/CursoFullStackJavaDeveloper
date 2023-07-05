package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 !!!
		System.out.println(a);
		a--; // a = a - 1 !!!
		System.out.println(a);
		
		++b; // b = b + 1 !!!
		System.out.println(b);
		--b; // b = b - 1 !!!
		System.out.println(b);
		
		System.out.println("Mini desafio: ");
		System.out.println(++a == b--);  // ++a tem precedencia da comparaçao, por conta da posiçao do ++ antes do a !!!
		                                 // b-- só sera executado depois da comparaçao, pois a comparaçao tem precedencia
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
	}
}
