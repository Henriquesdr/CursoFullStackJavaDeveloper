package controle.exercicios;

import java.util.Scanner;

public class ExercNumPar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();

		if (num >= 0.0 && num <= 10.0) {
			if (num % 2 == 0) {
				System.out.println("Este número está entre 0 e 10; e é um número par! ");
			} else {
				System.out.println("Este número está entre 0 e 10; e é um número ímpar! ");
			}
		} else {
			System.out.println("Este número não está entre 0 e 10 !!! ");
		}
		entrada.close();
	}
}