package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilterProfessor {

	public static void main(String[] args) {

		Produto p1 = new Produto("Chuteira", 1999.90, 0.15, 0);
		Produto p2 = new Produto("Meia", 119.90, 0.07, 15);
		Produto p3 = new Produto("Caneleira", 99.90, 0.07, 15);
		Produto p4 = new Produto("Camisa", 399.90, 0.15, 0);
		Produto p5 = new Produto("Short", 159.90, 0.15, 15);

		List<Produto> produto = Arrays.asList(p1, p2, p3, p4, p5);

		// filter, filter, map :
		produto.stream()
		.filter(p -> p.desconto >= 0.15)
		.filter(p -> p.frete == 0)
		.filter(p -> p.preco >= 300)
				.map(p -> p.nome + " EM SUPER PROMOÇÃO !!!").forEach(System.out::println);
	}
}
