package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// converter de numero para string binaria :::
		// map(Integer::toBinaryString) <--- resposta !!!
		// usando METHOD REFERENCE !!!

		// string binaria invertida :::
		UnaryOperator<String> stringBinariaInvertida = s -> new StringBuilder(s).reverse().toString();

		// converter de volta para numero depois da string invertida :::
		Function<String, Integer> stringInvertidaParaNum = n -> Integer.parseInt(n, 2);

		nums.stream().
		map(Integer::toBinaryString).
		map(stringBinariaInvertida).
		map(stringInvertidaParaNum).
		forEach(print);
	}
}
