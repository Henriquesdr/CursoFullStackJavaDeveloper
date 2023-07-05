package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "Henrique";
		compra1.itens.add(new Item("Bola", 1, 90.00));
		compra1.itens.add(new Item("Chuteira", 1, 569.90));
		compra1.itens.add(new Item("Camisa do Cruzeiro", 1, 350.90));

		System.out.println(compra1.itens.size());

		System.out.println(compra1.obterValorTotal());
	}

}
