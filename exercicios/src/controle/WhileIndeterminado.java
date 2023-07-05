package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

// WHILE :::   Mais usado para repetiçoes INDETERMINADAS, segue o exemplo :::

		Scanner entrada = new Scanner(System.in);
		String s = ""; // String vazia !!!

		while (!s.equalsIgnoreCase("sair")) {
			System.out.println("Digite a palavra chave: ");
			s = entrada.nextLine();
		}
		entrada.close();
	}
}
