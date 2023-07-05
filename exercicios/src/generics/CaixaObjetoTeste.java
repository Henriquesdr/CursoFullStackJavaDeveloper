package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		// SEM GENERICS :::
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(7.70); // double -> Double
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Opa!"); // double -> Double
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
