package br.com.henrique.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}
