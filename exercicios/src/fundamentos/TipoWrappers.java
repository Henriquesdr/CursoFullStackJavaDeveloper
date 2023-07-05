package fundamentos;

//import java.util.Scanner;

public class TipoWrappers {   //Usar letra inicial MAIUSCULA dos PRIMITIVOS, como se fossem classes!!!

	public static void main(String[] args) { 
		
		//Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;    // int
		// Integer.parseInt(entrada.next());
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 2);
		System.out.println(l / 2);
		
		//entrada.close();
		
		Float f = 123.0F;
		System.out.println(f * 3);
		
		Double d = 123.456;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';    // char
		System.out.println(c);
		System.out.println(c.getClass());
		System.out.println(c + "Peidei e saí");
		
	}
}
