package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Guitarra g1 = new Guitarra("Les Paul", 49000.90, true);
		Guitarra g2 = new Guitarra("Telecaster", 17500.90, false);
		Guitarra g3 = new Guitarra("Stratocaster", 43000.90, true);
		Guitarra g4 = new Guitarra("SG", 42900.90, true);
		Guitarra g5 = new Guitarra("Flying V", 43300.90, true);
		Guitarra g6 = new Guitarra("Semiacústica", 7300.90, false);

		List<Guitarra> guitarra = Arrays.asList(g1, g2, g3, g4, g5, g6);

		Predicate<Guitarra> cara = g -> g.preco >= 20000;
		Predicate<Guitarra> bonita = g -> g.bonita;
		Function<Guitarra, String> guitarraDeFamoso = g -> "Essa " + g.nome + " pelo preço de: R$" + g.preco
				+ " provavelmente tem história!!!";

		guitarra.stream().filter(cara).filter(bonita).map(guitarraDeFamoso).forEach(System.out::println);
	}
}
