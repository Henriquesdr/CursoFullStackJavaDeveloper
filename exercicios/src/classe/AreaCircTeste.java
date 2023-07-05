package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		// CRIANDO INSTANCIA :::
		AreaCirc a1 = new AreaCirc(10);
		// a1.raio = 100; // (UTILIZAVEL pois RAIO é uma variavel)
		// a1.pi = 10; // (NÃO UTILIZAVEL pois PI virou uma constante)

		System.out.println(a1.area());

		// SEM CRIAR INSTANCIA :::
		System.out.println(AreaCirc.area(100));

		// System.out.println(AreaCirc.PI);
		// System.out.println(Math.PI);

	}
}
