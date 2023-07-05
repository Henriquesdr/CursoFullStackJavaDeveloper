package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Fala meus consagrados".charAt(3));

		String s = "Bom dia";
		System.out.println(s.concat("!!!").toUpperCase());
		System.out.println(s.startsWith("B"));
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("noite"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Henrique";
		var sobrenome = "Soares";
		var idade = 21;
		var salario = 50_000.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome 
				+ "\nIdade: " + idade 
				+ "\nSalario: " + salario);
		
		System.out.printf("Nome: %s %s \nIdade: %s \nSalario: %s", nome, sobrenome, idade, salario);
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$ %.2f por mês.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f por mês.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Uma frase qualquer");
		System.out.println("Uma frase qualquer".contains("qual"));
		System.out.println("Uma frase qualquer".indexOf("qual"));
		System.out.println("Uma frase qualquer".substring(3));
		System.out.println("Uma frase qualquer".substring(3, 14));
	}
}
