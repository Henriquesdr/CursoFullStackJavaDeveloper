package fundamentos;

public class DesafioTemperatura {

	public static void main(String[] args) {
		
		// (°F - 32) * 5/9 = °C
		double fah = 86;
		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		double cel = (fah - AJUSTE) * FATOR;
		System.out.println("A coversão é igual a: " + cel + " °C");
		
		fah = 0;
		cel = (fah - AJUSTE) * FATOR;
		System.out.println("A coversão é igual a: " + cel + " °C");
	}
}
