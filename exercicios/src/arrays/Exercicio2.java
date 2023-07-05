package arrays;

import java.util.Arrays;

public class Exercicio2 {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.7;
		notasAlunoA[1] = 7;
		notasAlunoA[2] = 7.9;
		notasAlunoA[3] = 10;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);

		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		System.out.println("Média aluno A: ");
		System.out.println(totalA / notasAlunoA.length);

		// Inicializando as notas diretamente!!!
		final double notaArmazenada = 7.7;
		double[] notasAlunoB = { 6.9, 6.7, notaArmazenada, 9 };
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println("Média aluno B: ");
		System.out.println(totalB / notasAlunoB.length);

		// FOREACH :::
		System.out.println("Foreach: ");
		for (double i : notasAlunoA) {
			System.out.println(i);
		}

		for (double i : notasAlunoB) {
			System.out.println(i);
		}
	}

}