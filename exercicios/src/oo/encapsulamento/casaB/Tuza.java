package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Deborah; // Necessario importar por estar em outro PACOTE !!!

public class Tuza extends Deborah {

	// Para acessar o PROTECTED não se deve criar uma instancia !!!
	// Pois ele é transmitido por herança !!!
	// Pode acessá-lo diretamente !!!
	void testeAcessos() {
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Deborah().todosSabem); // POR INSTANCIA ...

	}

}
