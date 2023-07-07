package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {

		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();

		porteiro.registrarObservador(namorada);

		// via LAMBDA:::
		porteiro.registrarObservador(e -> {
			System.out.println("Supresa via LAMBDA!");
			System.out.println("Ocorreu em: " + e.getMomento());
		});

		porteiro.monitorar();
	}
}
