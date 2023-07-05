package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

//	   REVISAO :::
// if (...) sentença; ou {}
// while (...) sentença; ou {}
// for (...; ...; ...) sentença; ou {}

		// DO sentença; ou {} WHILE (...);
		// DO WHILE = exceçao de estrutura q termina com ;
		// EXECUTA PELO MENOS UMA VEZ !!!

		Scanner entrada = new Scanner(System.in);
		String s = "";
		do {
			System.out.println("Digite as palavrinhas mágicas... ");
			System.out.println("Quer sair? ");
			s = entrada.nextLine();
		} while (!s.equalsIgnoreCase("Sim, por favor"));
		
		System.out.println("Palavrinhas mágicas! Obrigado!");
		System.out.println("Até logo!!!");

		entrada.close();
	}
}
