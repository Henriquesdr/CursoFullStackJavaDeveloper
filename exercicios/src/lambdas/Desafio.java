package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Function<Produto, Double> calcularPrecoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> aplicarImpostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> aplicarFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondarPreco = preco -> Double
				.parseDouble(String.format("%.2f", preco).replace(",", "."));
		Function<Double, String> formatarPreco = preco -> ("R$" + preco).replace(".", ",");

		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		String precoFinalFormatado = calcularPrecoFinal.andThen(aplicarImpostoMunicipal).andThen(aplicarFrete)
				.andThen(arredondarPreco).andThen(formatarPreco).apply(p1);

		System.out.println("O preço final é de " + precoFinalFormatado);
	}
}
