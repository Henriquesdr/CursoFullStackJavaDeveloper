package controle.exercicios;

import java.util.Scanner;

public class ExercNumPrimo {

	public static void main(String[] args) {

		int contadorDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número pra verificar se é primo: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDivisores++;
			}
		}
		if (contadorDivisores == 0) {
			System.out.println("O número " + numero + " é primo!");
		} else {
			System.err.println("O número " + numero + " NÃO é primo!");
		}

		entrada.close();
	}
}
