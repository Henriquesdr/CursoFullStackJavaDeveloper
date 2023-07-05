package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Boa noite x";
		s = s.replace("x", "Rapaziada");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);

		System.out.println("Rickzada na area".toUpperCase());

		String x = "Rickzada na area".toUpperCase();
		System.out.println(x);

		String y = "Bom dia x"
				.replace("x", "galerinha do mal")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos PRIMITIVOS nao tem o operador "."(ponto) !!!
	}
}
