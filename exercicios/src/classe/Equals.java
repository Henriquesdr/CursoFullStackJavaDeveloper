package classe;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Henrique Soares";
		u1.email = "henrique.soares@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Henrique Soares";
		u2.email = "henrique.soares@gmail.com";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));

		System.out.println(u1.equals(new Date()));

		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}
