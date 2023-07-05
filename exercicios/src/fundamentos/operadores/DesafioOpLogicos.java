package fundamentos.operadores;

public class DesafioOpLogicos {

	public static void main(String[] args) {
		//Trabalho de Terça e trabalho de Quinta::
		boolean trab1 = !true;
		boolean trab2 = false;
		
		boolean comprouTv50 = trab1 && trab2;
		boolean comprouTv32 = trab1 ^ trab2;
		boolean tomouSorvete = trab1 || trab2;
		//Operador Unario :::
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTv50);
		System.out.println("Comprou TV 32\"? " + comprouTv32);
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
	}
}
