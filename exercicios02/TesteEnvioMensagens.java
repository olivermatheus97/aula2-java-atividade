package exercicios02;

public class TesteEnvioMensagens {

	public static void main(String[] args) {

		System.out.println("\nSms");
		Sms sms = new Sms("(062)3298-8390", "Matheus", "Boa noite amigos tudo bem?(essa é a mensagem)");
		System.out.println(sms);

		System.out.println("\nEmail");
		Email email = new Email("Jonathan", "Obrigado pai depois te pago um lanche(essa é a mensagem)",
				"malucobeleza@hotmail.com", "Matheus", "sabadodesol@hotmail.com");
		System.out.println(email);

	}
}
