package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(70.1);

		System.out.println("Peso inicial: " + p1.getPeso() + "kg");

		Comida arroz = new Arroz(0.4);
		Comida feijao = new Feijao(0.2);
		Comida sorvete = new Sorvete(0.3);

		p1.comer(arroz);
		p1.comer(feijao);
		System.out.println("Peso atual: " + p1.getPeso() + "kg");

		p1.comer(sorvete);
		System.out.println("Peso atual: " + p1.getPeso() + "kg");
	}
}
