package oo.heranca.desafio1;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + 10 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += 10;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 10) {
			velocidadeAtual -= 10;
		} else {
			velocidadeAtual = 0;
		}
	}
}
