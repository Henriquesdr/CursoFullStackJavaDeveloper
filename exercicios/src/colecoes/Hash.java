package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Rick"));
		usuarios.add(new Usuario("Deborah"));
		usuarios.add(new Usuario("Messi"));

		System.out.println(usuarios.contains(new Usuario("Rick")));
		System.out.println(usuarios.contains(new Usuario("Henriuqe")));
	}
}
