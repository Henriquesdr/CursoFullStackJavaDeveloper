package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();
		
// OBS.::: NAO USAR == PARA COMPARAR STRING e sim o EQUALS !!!

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("TERCA")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("SEXTOU")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("SÁBADO")) {
			System.out.println(7);
		}

		else {
			System.out.println("Dia da semana não existente!");
		}

		entrada.close();
	}
}