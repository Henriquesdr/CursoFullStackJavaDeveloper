package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom"); // .PRINT imprime tudo na mesma linha!!!
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom"); // .PRINTLN Cria uma nova linha depois de executar a primeira!!!
		System.out.println("Dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6); //Quebra de linha aqui \n ou %n !!!
		System.out.printf("Salario: %.1f %n", 98765.432);
		System.out.printf("Nome: %s %n", "Henrique");
		
		Scanner entrada = new Scanner(System.in);   //Necessario fechar o SCANNER sempre pra nao ter advertencia!!!
		System.out.print("\n\nDigite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite sua profissao: ");
		String profissao = entrada.nextLine();       // NEXTLINE retorna uma STRING !!!
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();               // NEXTINT retorna um valo INTEIRO !!!
		
		entrada.nextLine(); //NECESSARIO add mais um NEXTLINE (aleatorio) pois a entrada do NEXTINT fez o programa nao ler os proximos NEXTLINE !!!
		
		System.out.println("\nTudo bem com você? ");
		String resposta = entrada.nextLine();
		System.out.println("Vamos finalizar. Até logo!!!");
		String despedida = entrada.nextLine();
		
		System.out.printf("\n\nNome: %s %s \nIdade: %d ", nome, profissao, idade, resposta, despedida);
		System.out.printf("\n\n%s trabalha com %s e tem %d anos de idade.", nome, profissao, idade);
		
		entrada.close();
	}
}
