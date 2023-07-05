package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Rick", 9.9);
		Aluno a2 = new Aluno("Deborah", 9.5);
		Aluno a3 = new Aluno("Tuza", 8.8);
		Aluno a4 = new Aluno("Erick", 5.5);
		Aluno a5 = new Aluno("Rick", 9.9);
		Aluno a6 = new Aluno("Deborah", 9.5);
		Aluno a7 = new Aluno("Helena", 8.8);
		Aluno a8 = new Aluno("Hugo", 5.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("distinct :::"); // Implementar HASHCODE e o EQUALS na classe Aluno
											// para não ler o endereço de memória !!!
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip/Limit :::");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

		System.out.println("\ntakeWhile :::");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 6).forEach(System.out::println);
	}
}
