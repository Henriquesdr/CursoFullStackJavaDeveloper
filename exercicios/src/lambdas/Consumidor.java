package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Chuteira", 999.90, 0.1);
		imprimir.accept(p1);
		Produto p2 = new Produto("Meia", 50.90, 0.1);
		Produto p3 = new Produto("Caneleira", 100.90, 0.1);
		Produto p4 = new Produto("Short", 150.90, 0.1);
		Produto p5 = new Produto("Camisa", 350.90, 0.1);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimir);
		// O FOREACH já recebe um CONSUMER !!!
		produtos.forEach(p -> System.out.println(p.preco));

		produtos.forEach(System.out::println);
	}
}
