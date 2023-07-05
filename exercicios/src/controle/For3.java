package controle;

public class For3 {

	public static void main(String[] args) {

// ESCOPO ::: dependendo da posiçao da variavel, ela será afetada ou nao !!!
		// A ORDEM É MUITO IMPORTANTE !!!

		// int i = 0;
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		int i = 0;
//		System.out.println("\nSaiu do FOR... ");
//		System.out.println(i + "\n");

		// LAÇO FOR DENTRO DO OUTRO :::

		for (int a = 0; a <= 10; a++) {
			for (int b = 0; b <= 10; b++) {
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
	}
}
