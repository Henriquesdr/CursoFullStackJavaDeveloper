package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto"); // ou String s = "texto"
		s.toUpperCase(); // = objeto
		
		//Wrappers = sao a versao objeto dos tipos Primitivos !!!
		int a = 123;
		System.out.println(a);
		
	}
}
