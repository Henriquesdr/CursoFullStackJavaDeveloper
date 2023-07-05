package oo.heranca.teste;

import oo.heranca.desafio1.Carro;
import oo.heranca.desafio1.Ferrari;
import oo.heranca.desafio1.McLaren;

public class TesteCarros {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.toString());
		Carro mcLaren = new McLaren();
		System.out.println(mcLaren.toString());

		ferrari.acelerar();
		System.out.println(ferrari.toString());
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println(ferrari.toString());

		mcLaren.acelerar();
		mcLaren.acelerar();
		System.out.println(mcLaren.toString());
		mcLaren.acelerar();
		System.out.println(mcLaren.toString());
		mcLaren.frear();
		System.out.println(mcLaren.toString());

		System.out.println(ferrari.velocidadeDoAr());

	}

}
