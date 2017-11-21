
public class Caminhao extends Veiculo{
	public int toneladas;
	public int alturaMax;
	public int comprimento;
	
	Caminhao (){
		toneladas = 0;
		alturaMax = 0;
		comprimento = 0;
	}

	public int getToneladas() {
		return toneladas;
	}

	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
}
