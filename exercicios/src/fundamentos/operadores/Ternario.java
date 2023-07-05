package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.0;
		String resultadoParcial = media >= 3.0 ? "em recuperaçao" : "reprovado";
		String resultadoFinal = media >= 6.0 ? "aprovado" : resultadoParcial;
		
		// OBS.::: É possivel sim colocar mais de dois operadores ternarios dentro um do outro !!!
		// ex.: 
		// String resultadoFinal = media >= 6.0 ? "aprovado" : media >= 3 ? "em recuperaçao" : "reprovado";
		
		System.out.println("Nota do aluno: " + media);
		System.out.println("O aluno esta: " + resultadoFinal);
		
		boolean bomComportamento = true;
		boolean passouComMedia = media >= 6;
		boolean taOk = bomComportamento && passouComMedia;
		String resultado = taOk ? "Sim." : "Não";
		
		System.out.printf("Ta okay? %s", resultado);
		
// OBS.:::
// o OPERADOR TERNARIO é uma otima alternativa para mudar o boolean true ou false para uma alternativa de sua escolha !!!
// como por exemplo o "sim" ou "nao" !!!
		
	}
}
