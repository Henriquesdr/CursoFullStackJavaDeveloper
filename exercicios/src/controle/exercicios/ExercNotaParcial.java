package controle.exercicios;

import java.util.Scanner;

public class ExercNotaParcial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double total = nota1 + nota2;

		double media = total / 2;

		String s = "A situação do aluno é: ";

		{
			if (media <= 10 && media >= 7) {
				System.out.println(s + media);
				System.out.println("Aprovado !!!");
				System.out.println("Parabéns!");
			}
			if (media < 7 && media >= 4) {
				System.out.println(s + media);
				System.out.println("Recuperação !!!");
			} else {
				System.out.println(s + media);
				System.out.println("Reprovado... que pena!");
			}
		}
		entrada.close();
	}
}
