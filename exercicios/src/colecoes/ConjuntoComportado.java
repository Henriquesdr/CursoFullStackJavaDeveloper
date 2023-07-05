package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> listaAprovados = new HashSet<>(); // DESORGANIZADA
		SortedSet<String> listaAprovados = new TreeSet<>(); // ORGANIZADA
		listaAprovados.add("Henrique");
		listaAprovados.add("Deborah");
		listaAprovados.add("Messi");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		for (int n : numeros) {
			System.out.println(n);
		}
	}
}