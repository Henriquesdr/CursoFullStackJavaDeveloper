package controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
				// CONTINUE serve para interromper a repetiçao de acordo com a expressao,
				// porem, continuar a contagem depois !!!
			}
			System.out.println("i = " + i);
		}
		for (int a = 0; a < 10; a++) {
			if (a == 6) {
				continue;
			}
			System.out.println("a = " + a);
		}
		System.out.println("Fim!");
	}
}
