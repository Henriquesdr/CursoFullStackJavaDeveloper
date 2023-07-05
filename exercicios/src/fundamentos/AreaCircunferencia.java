package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.5;
		final double PI = 3.1416;

		double area = PI * raio * raio;
		System.out.println("Área é igual a: " + area + " m²");

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área é igual a: " + area + " m²");

	}
}
