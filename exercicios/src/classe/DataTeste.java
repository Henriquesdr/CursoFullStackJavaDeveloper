package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data construtorVazio = new Data();

		Data meuNiver = new Data();
		meuNiver.dia = 26;
		meuNiver.mes = "Fevereiro";
		meuNiver.ano = 2001;

		Data niverMozao = new Data(16, "Agosto", 1999);

		System.out.println("Data com construtor vazio: " + construtorVazio.obterDataFormatada());
		System.out.println("\nMinha data de nascimento: " + meuNiver.obterDataFormatada());
		System.out.println("Data de nascimento da momo: " + niverMozao.obterDataFormatada());

		// Outro Exexmplo ::: Método usando Método !!! (NÃO INTERESSANTE)
//		meuNiver.imprimirDataFormatada();
//		niverMozao.imprimirDataFormatada();

	}
}
