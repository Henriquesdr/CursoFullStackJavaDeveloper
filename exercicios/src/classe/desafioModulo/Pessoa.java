package classe.desafioModulo;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;

	Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;

	}

	void comer(Alimento alimento) {
		if (alimento != null) {
			this.pesoPessoa += alimento.pesoAlimento;
		}
	}

	String apresentar() {
		return "Nome: " + nomePessoa + "\nPeso: " + pesoPessoa + "Kg.";
	}
}
