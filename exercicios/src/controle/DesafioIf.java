package controle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 9.9;

		// NÃO USAR ; EM ESTRUTURAS DE CONTROLE !!!   (EXISTE UMA EXCEÇAO)...
		
		if (nota >= 9.0) {
			System.out.println("Quadro de honra!!!");
			System.out.println("Aluno fera!!!");
		}

		if (nota < 9.0) {
			System.out.println("Consultar situação!");
		}
	}
}
