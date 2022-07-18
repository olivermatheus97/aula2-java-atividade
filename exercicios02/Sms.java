package exercicios02;

public class Sms extends Mensagens {

	private String telefone;

	public Sms(String telefone, String nome, String mensagem) {
		super(nome, mensagem);
		this.telefone = telefone;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return nome() + ": " + mensagem() + " " + " " + telefone;
	}
}
