package controle;

public class For1 {

	public static void main(String[] args) {

// FOR :::      FOCADA PARA QUANTIDADES -> DETERMINADAS <- DE REPETIÇOES !!!
// DENTRO DO FOR TEMOS ::: (separados por ;)
// 1-> DETERMINAR A VARIAVEL;
// 2-> EXPRESSAO;
// 3-> MANIPULAÇAO DA VARIAVEL (QUATIDADE DE REPETIÇOES, ETC.)
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		for (int contador2 = 0; contador2 <= 20; contador2 += 2) {
			System.out.printf("i = %d\n", contador2);
		}
	}
}
