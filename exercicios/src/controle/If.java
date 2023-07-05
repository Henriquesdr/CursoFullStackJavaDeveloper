package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10.0 && media >= 6.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!!!");
		}

		if (media < 6.0 && media >= 4) {
			System.out.println("Recuperação!");
		}

		boolean criterioReprovacaoAtingido = media < 4; // QUEBRANDO EM VARIAVEIS !!! (IMPORTANTE)
		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}
