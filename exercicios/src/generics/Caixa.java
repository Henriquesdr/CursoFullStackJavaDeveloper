package generics;

public class Caixa<TIPO> { // CLASSE GENÉRICA !!!

	private TIPO coisa;

	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}

	public TIPO abrir() {
		return coisa;
	}

}
