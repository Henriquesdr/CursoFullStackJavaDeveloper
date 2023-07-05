package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; // Atribuiçao por VALOR (Tipo primitivo) !!!
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);

		Data d1 = new Data(26, "Fevereiro", 2001);
		Data d2 = d1; // Atribuiçao por REFERENCIA (Objeto) !!!
		d1.dia = 31;
		d2.mes = "Dezembro";
		d1.ano = 2022;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataInicial(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		// O Tipo Primitivo nao altera nada nesse mesmo caso
		int c = 10;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataInicial(Data d) {
		d.dia = 26;
		d.mes = "Fevereiro";
		d.ano = 2001;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
}
