package oo.heranca.desafio1;

public class McLaren extends Carro implements Luxo {

	public McLaren() {
		super(100);
	}

	public void acelerar() {
		if (velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += 15;
		}
	}

	@Override
	public void ligarAr() {
	}

	@Override
	public void desligarAr() {
	}

	public String toString() {
		return "Velocidade atual McLaren = " + velocidadeAtual + " km/h";
	}
}
