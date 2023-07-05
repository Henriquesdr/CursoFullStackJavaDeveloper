package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Rick", 9.9);
		Aluno a2 = new Aluno("Deborah", 9.5);
		Aluno a3 = new Aluno("Tuza", 8.8);
		Aluno a4 = new Aluno("Erick", 5.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Predicate<Aluno> reprovado = aprovado.negate();

		System.out.println(alunos.stream().allMatch(aprovado));

		System.out.println(alunos.stream().anyMatch(aprovado));

		System.out.println(alunos.stream().noneMatch(reprovado));

	}
}
