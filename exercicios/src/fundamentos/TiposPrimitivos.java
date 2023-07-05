package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// Tipos numericos inteiros :::
		byte anosDeEmpresa = 30;
		short numeroDeVoos = 110;
		int id = 12345;
		long pontosAcumulados = 9_234_567_890L; // adicionar um L no final para definir q o numero é um literal LONG.

		// Tios numericos reais :::
		float salario = 77_000.00F;
		double vendasAcumuladas = 1_111_111_111.01;

		// Tipo booleano :::
		boolean estaDeFerias = false; // true

		// Tipo caractere :::
		char status = 'A'; // ativo

		// DIAS DE EMPRESA =
		System.out.println(anosDeEmpresa * 365);
		// NUMERO DE VIAGENS =
		System.out.println(numeroDeVoos / 2);
		// PONTOS POR REAL =
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println("Salario de: " + id + " = " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status do funcionário: " + status);

	}
}
