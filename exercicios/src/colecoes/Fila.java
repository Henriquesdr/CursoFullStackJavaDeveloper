package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// OFFER e ADD -> adicionam elementos na fila !!!
		// A diferença é o comportamento quando a fila está CHEIA.
		fila.add("Rick"); // ADD = joga uma excessao/problema !!!
		fila.offer("Deborah"); // OFFER = retorna falso e nao adiciona o elemento na fila !!!
		fila.add("Tuza");
		fila.offer("HUgo");
		fila.add("Erick");

		// PEEK e ELEMENT -> obtem o proximo elemento da fila (SEM REMOVER) !!!
		// A diferença é o comportamento quando a fila está VAZIA.
		System.out.println(fila.peek()); // retorna nulo (se a fila esta vazia) !!!
		System.out.println(fila.peek());
		System.out.println(fila.element()); // joga uma excessao (se a fila esta vazia) !!!
		System.out.println(fila.element());

		// POLL e REMOVE -> obtem o proximo elemento da fila (REMOVENDO) !!!
		// A diferença é o comportamento quando a fila está VAZIA.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna nulo (se a fila esta vazia) !!!
		System.out.println(fila.remove()); // joga uma excessao (se a fila esta vazia) !!!

		// alguns outros metodos:
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();
	}
}
