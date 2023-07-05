package classe;

public class Usuario {

	String nome;
	String email;

	public boolean equals(Object objeto) {

//		Usuario outro = (Usuario) objeto;

//		boolean nomeIgual = outro.nome.equals(this.nome);
//		boolean emailIgual = outro.email.equals(this.email);

//		return nomeIgual && emailIgual;

		// Esquema mais SEGURO !!!
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;

		} else {
			return false;
		}
	}

	// HASHCODE TEMPORARIO :::
	public int hashCode() {
		return this.nome.length();
	}
}
