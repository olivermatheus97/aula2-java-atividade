package exercicios01;

public class Apartamento extends Terreno {

	private int comodos;
	private boolean comodosFestas;

	public Apartamento(int comodos, boolean comodosFestas, Double valor, Double areaImoveis) {
		super(areaImoveis, valor);
		this.comodos = comodos;
		this.comodosFestas = comodosFestas;
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		this.comodos = comodos;
	}

	public boolean getComodosFestas() {
		return comodosFestas;
	}

	public void setComodosFesta(boolean comodosFestas) {
		this.comodosFestas = comodosFestas;

	}

	@Override
	public String toString() {
		return super.toString() + "\nComodos: " + this.comodos + "\nPossui salão de festas?  "
				+ (this.comodosFestas ? "Sim" : "Nao");
	}
}
