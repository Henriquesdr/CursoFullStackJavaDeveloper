package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.5, 7.0));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 6.0 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(9.5, 7.0));

		Function<Double, String> conceito = m -> m >= 6 ? "Aprovado" : "Reprovado";

		System.out.println(media.andThen(conceito).apply(7.0, 3.0));
	}
}
