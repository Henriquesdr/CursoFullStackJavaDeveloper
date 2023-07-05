package classe;

public class Data {

	int dia;
	String mes;
	int ano;

	Data() {
		// dia = 1;
		// mes = "Janeiro";
		// ano = 1970;
		this(1, "Janeiro", 1970); // Usando "THIS" como método
	}

	Data(int dia, String mesM, int anoA) {
		this.dia = dia; // Usando "THIS" pra indicar e diferenciar
		mes = mesM;
		ano = anoA;
	}

	// FORMA MAIS INTERESSANTE !!!
	String obterDataFormatada() {
		final String formato = "%d/%s/%d"; // VARIAVEL LOCAL :::
											// Escopo e utilidade apenas dentro do metodo!!!
											// Da linha de definiçao ABAIXO ...
		return String.format(formato, this.dia, mes, ano);
	}

	// SOMENTE EXEMPLO !!!
//	void imprimirDataFormatada() {
//		System.out.println(obterDataFormatada());
//	}
}
