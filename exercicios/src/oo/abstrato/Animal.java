package oo.abstrato;

public abstract class Animal { // Só é possível um método abstrato em uma classe abstrata !!!

	public String respirar() {
		return "Usando Oxigênio";
	}

	public abstract String mover(); // MÉTODO ABSTRATO !!!

}
