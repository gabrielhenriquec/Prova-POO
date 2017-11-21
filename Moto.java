public class Moto {
	private int usarMarcha;
	public int marcha;
	public String marca;
	public String modelo;
	public String cor;
	public boolean ligada, desligada;
	Moto() {
		
	}

	
	void sobeMarcha(){
		if (marcha < 5){
			marcha ++;
		}
	}
	void desceMarcha(){
		if(marcha > 0){
			 marcha--;
		}
	}
	
	public void validaMarcha() throws Exception {
		if (marcha < 0) {
			throw new Exception("A marcha precisa ser maior que 0");
		} else if (marcha > 5) {
			throw new Exception("A marcha precisa ser menor que 5");
		}
	}
	
	void motoLigada(){
		
	}
	
	public int getUsarMarcha() {
		return usarMarcha;
	}

	public void setUsarMarcha(int usarMarcha) {
		this.usarMarcha = usarMarcha;
	}

	
	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
