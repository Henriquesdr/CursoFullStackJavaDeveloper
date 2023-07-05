package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// FUNÇÃO LAMBDA :::
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(3, 3));

		calc = (x, y) -> x * y;
		System.out.println(calc.executar(7, 7));

		System.out.println(calc.legal());
		System.out.println(Calculo.massa());
	}
}
