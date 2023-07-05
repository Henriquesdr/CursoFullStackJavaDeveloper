package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 77.88;
		double y = 66.7;
		System.out.println(x - y);
		System.out.println(x + y);
		System.out.println(x / y);
		System.out.println(x * y);
		
		int a = 8;
		int b = 3;
		System.out.println(b - a);
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b);
		System.out.println(a / (float)b);
		
		System.out.println(8 % 3);     // % = Operador modulo: pega o RESTO da divisao!!!
		System.out.println(a % b);
		
		System.out.println(x - y / a * b);
		System.out.println(x - y / (a * b));
		System.out.println((x - y) / a * b);
		                                    // PRECEDENCIA == PRIMEIRO " / " , SEGUNDO " * " , etc...!!!
	}
}
