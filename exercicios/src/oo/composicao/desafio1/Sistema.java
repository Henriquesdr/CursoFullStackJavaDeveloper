package oo.composicao.desafio1;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Chuteira", 999.90, 1);
		compra1.adicionarItem(new Produto("Camisa do Cruzeiro", 349.99), 3);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Notebook", 7500.00, 1);
		compra2.adicionarItem(new Produto("Caneta", 3.50), 3);

		Cliente cliente = new Cliente("Henrique Soares dos Reis");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());
	}
}
