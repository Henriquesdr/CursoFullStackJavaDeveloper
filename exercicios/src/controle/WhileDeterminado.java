package controle;

public class WhileDeterminado {

	public static void main(String[] args) {

		int contador = 1;
		
		int contador2 = 1;

		// contador :::
		while (contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}
		// contador2 :::
		while (contador2 <= 20 ) {
			System.out.printf("\ni = %d\n", contador2);
			contador2 += 2;
		}
	}
}
