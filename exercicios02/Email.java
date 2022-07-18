package exercicios02;

public class Email extends Mensagens {

	private String emailDest;
	private String nomeDest;
	private String emailRemt;

	public Email(String nome, String mensagem, String emailDest, String nomeDest, String emailRemt) {
		super(nome, mensagem);
		this.emailDest = emailDest;
		this.nomeDest = nomeDest;
		this.emailRemt = emailRemt;
	}

	public String emailDest() {
		return emailDest;
	}

	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}

	public String nomeDest() {
		return nomeDest;
	}

	public void setNomeDest(String nomeDest) {
		this.nomeDest = nomeDest;
	}

	public String emailRemt() {
		return emailRemt;
	}

	public void setEmailRemt(String emailRemt) {
		this.emailRemt = emailRemt;
	}

	@Override
	public String toString() {
		return this.emailDest() + "  -  " + this.nomeDest() + "\n" + this.emailRemt() + "   -   " + nome() + "\n"
				+ mensagem();
	}
}
