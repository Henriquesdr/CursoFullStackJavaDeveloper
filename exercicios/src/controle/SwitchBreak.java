package controle;

import java.util.Scanner;

public class SwitchBreak {

	// OBS.:::
	// o SWITCH trabalha DIRETAMENTE com VALORES !!!
	// Não pode ter "cases" com o mesmo valor !!!

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Digite a nota do aluno: ");
		int nota = entrada.nextInt();

		switch (nota) {
		case 10:
		case 9:
		case 8:
			conceito = "A";
			break;
		case 7:
		case 6:
			conceito = "B";
			break;
		case 5:
		case 4:
			conceito = "C";
			break;
		case 3:
		case 2:
			conceito = "D";
			break;
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "Não encontrado";
			break;
		}
		System.out.println("O aluno ficou com o conceito: " + conceito);

		entrada.close();
	}
}
