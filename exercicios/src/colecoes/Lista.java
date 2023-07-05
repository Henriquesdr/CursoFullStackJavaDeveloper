package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		// CRIAR O USUARIO :::
		// ASSIM:
		Usuario u1 = new Usuario("Rick");
		lista.add(u1);
		// OU:
		lista.add(new Usuario("Deborah"));
		lista.add(new Usuario("Erick"));
		lista.add(new Usuario("Tuza"));
		lista.add(new Usuario("Hugo"));

		System.out.println(lista.get(3)); // CONSEGUE ACESSAR PELO INDICE !!!

		lista.remove(3);
		lista.remove(new Usuario("Hugo"));

		for (Usuario u : lista) {
			System.out.println(u);
		}

	}

}
