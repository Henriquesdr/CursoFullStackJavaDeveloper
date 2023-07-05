package oo.heranca.desafio1;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = true;
	private boolean ligarAr = false;

	public Ferrari() {
		super(100);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public void acelerar() {
		if (velocidadeAtual + 13 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			if (ligarTurbo && !ligarAr) {
				velocidadeAtual += 26;
			} else if (ligarTurbo && ligarAr) {
				velocidadeAtual += 20;
			} else if (!ligarTurbo && !ligarAr) {
				velocidadeAtual += 13;
			}
		}
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	public String toString() {
		return "Velocidade atual Ferrari = " + velocidadeAtual + " km/h";
	}
}
