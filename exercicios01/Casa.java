package exercicios01;

public class Casa extends Terreno {

	private int comodos;
	private Double areaTerreno;

	public Casa(int comodos, Double areaTerreno, Double valor, Double areaImoveis) {
		super(areaImoveis, valor);
		this.comodos = comodos;
		this.areaTerreno = areaTerreno;
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		this.comodos = comodos;
	}

	public Double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	@Override
	public String toString() {
		return super.toString() + "\nComodos: " + this.comodos + "\nArea do terreno: " + this.areaTerreno;
	}

}