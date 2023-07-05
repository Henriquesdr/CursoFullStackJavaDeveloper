package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Aoba!");
		String coisaA = (String) caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(7.70);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
