package classe.desafioModulo;

public class Refeicao {

	public static void main(String[] args) {

		Alimento a1 = new Alimento("Arroz", 0.500);
		Alimento a2 = new Alimento("Feijão", 0.600);

		Pessoa p1 = new Pessoa("Rick", 71.5);
		System.out.println(p1.apresentar());

		p1.comer(a1);
		p1.comer(a2);

		System.out.println(p1.apresentar());

	}
}
