package lambdas;

@FunctionalInterface // Interfaces que possuem somente um método !!!

// para definir funções LAMBDAS EM CIMA DE INTERFACES
// é necessário ter uma INTERFACE FUNCIONAL !!!
public interface Calculo {

	double executar(double a, double b);

	// Para não deixar de ser uma interface funcional com mais métodos use:
	// Default ou Static (por exemplo) !!!
	default String legal() {
		return "Legal";
	}

	static String massa() {
		return "Massa";
	}
}
