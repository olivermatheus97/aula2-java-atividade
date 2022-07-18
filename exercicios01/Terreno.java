package exercicios01;

public class Terreno {

	private Double areaImoveis;
	private Double valor;

	public Terreno(double areaImoveis, double valor) {
		this.areaImoveis = areaImoveis;
		this.valor = valor;
	}

	public Double getAreaImoveis() {
		return areaImoveis;
	}

	public void setAreaImoveis(Double areaImoveis) {
		this.areaImoveis = areaImoveis;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Area do imovel: " + this.areaImoveis + " Metros" + "\nValor: R$" + this.valor;
	}
}