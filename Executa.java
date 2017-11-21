public class Executa {

	public static void main(String[] args) {
		Motor motor = new Motor();
		Veiculo veiculo = new Veiculo();
		CarroPasseio carroPasseio = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();
		
		//MOTOR
		System.out.println("MOTOR");
		motor.setNumCilindro(5);
		motor.setPotenci(500);
		System.out.println("No motor, n�mero de cilindros : " + motor.getNumCilindro());
		System.out.println("No motor, a pot�ncia � de: " + motor.getPotenci() + "cavalos");
		
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		
		//VE�CULO
		System.out.println("VE�CULO");
		veiculo.setNumCilindro(5);
		veiculo.setPeso(500);
		veiculo.setPotenci(500);
		veiculo.setPreco(5000000);
		veiculo.setVeloMax(732);
		System.out.println("O n�mero de cilindros : " + veiculo.getNumCilindro());
		System.out.println("A pot�ncia � de: " + veiculo.getPotenci() + "cavalos");
		System.out.println("O peso do ve�uculo �: " + veiculo.getPeso() + "Kg");
		System.out.println("O pre�o do ve�culo �: " + veiculo.getPreco() + "R$");
		System.out.println("A velocidade m�xima �: " + veiculo.getVeloMax() + "Km/h");
		
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		//CARRO DE PASSEIO
		System.out.println("CARRO DE PASSEIO");
		carroPasseio.setCor("Prata");
		carroPasseio.setModelo("Xsara");
		carroPasseio.setNumCilindro(4);
		carroPasseio.setPeso(3000);
		carroPasseio.setPotenci(180);
		carroPasseio.setPreco(53000);
		carroPasseio.setVeloMax(220);
		System.out.println("O n�mero de cilindros : " + carroPasseio.getNumCilindro());
		System.out.println("A pot�ncia � de: " + carroPasseio.getPotenci() + "cavalos");
		System.out.println("O peso do ve�uculo �: " + carroPasseio.getPeso() + "Kg");
		System.out.println("O pre�o do ve�culo �: " + carroPasseio.getPreco() + "R$");
		System.out.println("A velocidade m�xima �: " + carroPasseio.getVeloMax() + "Km/h");
		System.out.println("A cor do ve�culo �: " + carroPasseio.getCor());
		System.out.println("O modelo do ve�culo �: " + carroPasseio.getModelo());
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		//CAMINH�O
		System.out.println("CAMINH�O");
		caminhao.setAlturaMax(450);
		caminhao.setComprimento(2210);
		caminhao.setToneladas(60);
		caminhao.setNumCilindro(7);
		caminhao.setPotenci(450);
		caminhao.setPreco(83000);
		caminhao.setVeloMax(220);
		System.out.println("O n�mero de cilindros �: " + caminhao.getNumCilindro());
		System.out.println("A pot�ncia � de: " + caminhao.getPotenci() + "cavalos");
		System.out.println("O pre�o do ve�culo �: " + caminhao.getPreco() + "R$");
		System.out.println("A velocidade m�xima �: " + caminhao.getVeloMax() + "Km/h");
		System.out.println("A altura m�xima �: " + caminhao.getAlturaMax() + "cm");
		System.out.println("O comprimento do caminh�o �: " + caminhao.getComprimento() + "cm");
		System.out.println("A quantidade de toneladas do caminh�o �: " + caminhao.getToneladas() + "toneladas");
		
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		//MOTO
		System.out.println("MOTO");
		moto.setCor("Amarelo");
		moto.setModelo("Ninja");
		moto.setMarca("Kawasaki");
		moto.motoLigada();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.desceMarcha();
		moto.desceMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		System.out.println("A marca da moto � a(o): " + moto.getMarca());
		System.out.println("A cor da moto �: " + moto.getCor());
		System.out.println("o modelo de mato �: " + moto.getModelo());
		System.out.println("A marcha atual �: " + moto.marcha);

		
	}

}
