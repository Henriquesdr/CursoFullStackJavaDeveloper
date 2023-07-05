package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		//String a = entrada.next();
		String a = entrada.nextLine();
		
		System.out.println(a);
		
		System.out.println("2" == a.trim());
		System.out.println("2".equals(a.trim()));
		System.out.println("2".equals(a));
		
		// .TRIM ignora os espaços no system.in NO NEXTLINE !!!
		                                            
		// EQUALS para comparar STRINGS !!!
		
		entrada.close();
	}
}
