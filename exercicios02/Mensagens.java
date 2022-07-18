package exercicios02;

public class Mensagens {

	private String nome;
	private String mensagem;

	public Mensagens(String nome, String mensagem) {
		this.nome = nome;
		this.mensagem = mensagem;
	}

	public String nome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String mensagem() {
		return mensagem;
	}

	public void mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
