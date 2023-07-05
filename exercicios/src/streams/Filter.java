package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Consumer<Object> print = System.out::println;

		Aluno a1 = new Aluno("Rick", 9.9);
		Aluno a2 = new Aluno("Deborah", 9.7);
		Aluno a3 = new Aluno("Tuza", 6.9);
		Aluno a4 = new Aluno("Erick", 5.7);
		Aluno a5 = new Aluno("Hugo", 4.9);
		Aluno a6 = new Aluno("Rael", 8.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> estaAprovado = a -> a.nota >= 6.0;

		Function<Aluno, String> saudacaoAprovados = a -> "Parabéns " + a.nome + "!!! Você foi aprovado(a)!";

		alunos.stream().filter(estaAprovado).map(saudacaoAprovados).forEach(print);
	}

}
