package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Jogador jogador1 = new Heroi(10, 20);

		Jogador maquina = new Monstro(10, 21);

		System.out.println("Vida do heroi = " + jogador1.vida);
		System.out.println("Vida do monstro = " + maquina.vida);

		jogador1.atacar(maquina);
		maquina.atacar(jogador1);
		System.out.println("Pós-ataque: ");
		System.out.println("Vida do heroi = " + jogador1.vida);
		System.out.println("Vida do monstro = " + maquina.vida);

		jogador1.atacar(maquina);
		maquina.atacar(jogador1);
		jogador1.atacar(maquina);
		maquina.atacar(jogador1);
		System.out.println("Pós-ataque: ");
		System.out.println("Vida do heroi = " + jogador1.vida);
		System.out.println("Vida do monstro = " + maquina.vida);

		maquina.andar(Direcao.LESTE);
		maquina.andar(Direcao.LESTE);
		maquina.andar(Direcao.NORTE);
		maquina.andar(Direcao.NORTE);
		jogador1.atacar(maquina);
		maquina.atacar(jogador1);
		System.out.println("Pós-ataque: ");
		System.out.println("Vida do heroi = " + jogador1.vida);
		System.out.println("Vida do monstro = " + maquina.vida);
	}
}
