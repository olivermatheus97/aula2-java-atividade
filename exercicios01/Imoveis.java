package exercicios01;

public class Imoveis {

	public static void main(String[] args) {
		System.out.println("\nTerreno");
		Terreno terreno = new Terreno(70.0, 50000.0);
		System.out.println(terreno.toString());

		System.out.println("\nCasa");

		Casa casa = new Casa(5, 40.0, 70000.0, 70.0);
		System.out.println(casa.toString());

		System.out.println("\nApartamento");
		Apartamento apartamento = new Apartamento(6, false, 120000.0, 100.0);
		System.out.println(apartamento.toString());

	}
}
