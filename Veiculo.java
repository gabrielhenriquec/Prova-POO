public class Veiculo extends Motor{
	public int peso;
	public int veloMax;
	private float preco;

	Veiculo() {
		peso = 0;
		veloMax = 0;
		preco = 0;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
