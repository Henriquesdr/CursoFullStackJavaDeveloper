package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional: ");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		// Se tiver somente um parâmetro, não necessita dos parenteses() ou chaves{} !!!
		// exemplo: (nome) OU nome !!! (antes da " -> " )
		// exemplo: -> {} OU -> ...
		System.out.println("\nLambda #01: ");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod Reference #01: ");
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #02: ");
		aprovados.forEach(nome -> meuImprimir(nome));

		System.out.println("\nMethod Reference #02: ");
		aprovados.forEach(Foreach::meuImprimir);
	}

	public static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
