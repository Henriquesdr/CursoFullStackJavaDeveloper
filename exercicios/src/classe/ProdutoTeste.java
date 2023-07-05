package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// Comparaçao ::: 1 TIPO(CLASSE); 2 NOME; 3 VALOR; EX.:::
		// int a = 3;
		// Scanner entrada = new Scanner(System.in);

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 7700.99;

		var p2 = new Produto("Caneta", 3.70);

		Produto.desconto = 0.5;

		double precoFinal1 = p1.precoComDesconto();
		System.out.println("\nPreço final do " + p1.nome + ": " + precoFinal1);
//		double precoFinalGerente1 = p1.precoComDesconto(0.5);
//		System.out.println("\nPreço final (do Gerente) do " + p1.nome + ": " + precoFinalGerente1);

		double precoFinal2 = p2.precoComDesconto();
		System.out.println("\nPreço final do " + p2.nome + ": " + precoFinal2);
//		double precoFinalGerente2 = p2.precoComDesconto(0.5);
//		System.out.println("\nPreço final (do Gerente) do " + p2.nome + ": " + precoFinalGerente2);

//		double mediaCompras = ((precoFinal1 + precoFinal2) / 2);
//		System.out.printf("\nMédia das compras = R$%.2f", mediaCompras);
	}
}
