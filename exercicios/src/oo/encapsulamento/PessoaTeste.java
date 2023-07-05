package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Henrique", "Soares", 22);
		System.out.println(p1);
		System.out.println(p1.getnomeCompleto());

		Pessoa p2 = new Pessoa("Deborah", "Araujo", -23);
		System.out.println(p2);
		System.out.println(p2.getnomeCompleto()); // toString
	}
}
