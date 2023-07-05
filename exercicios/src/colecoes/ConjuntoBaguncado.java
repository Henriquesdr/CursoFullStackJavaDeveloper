package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(3); // int -> Integer
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho do conjunto: " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho do conjunto: " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho do conjunto: " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(true));

		Set numeros = new HashSet();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		System.out.println(numeros);
		System.out.println(conjunto);

		// conjunto.addAll(numeros); // UNIAO ENTRE DOIS CONJUNTOS !!!
		conjunto.retainAll(numeros); // RETEM O VALOR EM COMUM !!!
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}
}
