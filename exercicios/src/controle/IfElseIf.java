package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10.0 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota >= 8.0) {
			System.out.println("Nota A !!!");
			System.out.println("Parabéns !!!");
		} else if (nota >= 6.0 && nota < 8.0) {
			System.out.println("Nota B !!!");
		} else if (nota >= 4.0 && nota < 6.0) {
			System.out.println("Nota C !!!");
			System.out.println("Recuperação");
		} else if (nota < 4.0) {
			System.out.println("Nota D !!!");
			System.out.println("Que pena...");
			System.out.println("Está reprovado.");
		}

		System.out.println("Fim.");

		entrada.close();
	}
}
