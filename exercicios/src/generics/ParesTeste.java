package generics;

public class ParesTeste {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso = new Pares<>();

		resultadoConcurso.adicionar(1, "Rick");
		resultadoConcurso.adicionar(2, "Deborah");
		resultadoConcurso.adicionar(3, "Giovana");
		resultadoConcurso.adicionar(4, "Erick");
		resultadoConcurso.adicionar(1, "Henrique");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
	}
}
