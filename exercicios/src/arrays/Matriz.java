package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int quantidadeNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d : ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}

		double mediaTurma = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("A média da turma é de: " + mediaTurma);

		for (double[] notasDosAlunos : notasDaTurma) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}

		entrada.close();
	}
}
