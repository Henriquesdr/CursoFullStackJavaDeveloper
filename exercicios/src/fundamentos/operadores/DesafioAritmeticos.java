package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double a = 6 * (3 + 2);
		double aa = Math.pow(a, 2);
		double aaa = aa / (3 * 2); // expressao 1
		
		double b = (1 - 5) * (2 - 7);
		double bb = b / 2;
		double bbb = Math.pow(bb, 2); // expressao 2
		
		double c = aaa - bbb;
		double cc = Math.pow(c, 3); // expressao superior resolvida
		
		double d = Math.pow(10, 3);
		
		double e = cc / d;
		System.out.println(e);
		
		// RESOLUÇAO
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		
		double supA = numA / denA;
		double supB = numB;
		
		double sup = Math.pow(supA - supB, 3);
		double inf = Math.pow(10, 3);
		
		double resultado = sup / inf;
		System.out.println(resultado);
	}
}
