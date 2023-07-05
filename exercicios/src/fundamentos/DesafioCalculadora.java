package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// LER NUMERO 1;
		// LER NUMERO 2;
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = entrada.nextDouble();		
		System.out.println("Informe a operação a ser feita: ");
		String operacao = entrada.next();
		
		// LOGICA :::
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f ", num1, operacao, num2, resultado);
		
		entrada.close();
	}
}
