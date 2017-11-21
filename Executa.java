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
		System.out.println("No motor, número de cilindros : " + motor.getNumCilindro());
		System.out.println("No motor, a potência é de: " + motor.getPotenci() + "cavalos");
		
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		
		//VEÍCULO
		System.out.println("VEÍCULO");
		veiculo.setNumCilindro(5);
		veiculo.setPeso(500);
		veiculo.setPotenci(500);
		veiculo.setPreco(5000000);
		veiculo.setVeloMax(732);
		System.out.println("O número de cilindros : " + veiculo.getNumCilindro());
		System.out.println("A potência é de: " + veiculo.getPotenci() + "cavalos");
		System.out.println("O peso do veíuculo é: " + veiculo.getPeso() + "Kg");
		System.out.println("O preço do veículo é: " + veiculo.getPreco() + "R$");
		System.out.println("A velocidade máxima é: " + veiculo.getVeloMax() + "Km/h");
		
		
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
		System.out.println("O número de cilindros : " + carroPasseio.getNumCilindro());
		System.out.println("A potência é de: " + carroPasseio.getPotenci() + "cavalos");
		System.out.println("O peso do veíuculo é: " + carroPasseio.getPeso() + "Kg");
		System.out.println("O preço do veículo é: " + carroPasseio.getPreco() + "R$");
		System.out.println("A velocidade máxima é: " + carroPasseio.getVeloMax() + "Km/h");
		System.out.println("A cor do veículo é: " + carroPasseio.getCor());
		System.out.println("O modelo do veículo é: " + carroPasseio.getModelo());
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		//CAMINHÃO
		System.out.println("CAMINHÃO");
		caminhao.setAlturaMax(450);
		caminhao.setComprimento(2210);
		caminhao.setToneladas(60);
		caminhao.setNumCilindro(7);
		caminhao.setPotenci(450);
		caminhao.setPreco(83000);
		caminhao.setVeloMax(220);
		System.out.println("O número de cilindros é: " + caminhao.getNumCilindro());
		System.out.println("A potência é de: " + caminhao.getPotenci() + "cavalos");
		System.out.println("O preço do veículo é: " + caminhao.getPreco() + "R$");
		System.out.println("A velocidade máxima é: " + caminhao.getVeloMax() + "Km/h");
		System.out.println("A altura máxima é: " + caminhao.getAlturaMax() + "cm");
		System.out.println("O comprimento do caminhão é: " + caminhao.getComprimento() + "cm");
		System.out.println("A quantidade de toneladas do caminhão é: " + caminhao.getToneladas() + "toneladas");
		
		
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
		System.out.println("A marca da moto é a(o): " + moto.getMarca());
		System.out.println("A cor da moto é: " + moto.getCor());
		System.out.println("o modelo de mato é: " + moto.getModelo());
		System.out.println("A marcha atual é: " + moto.marcha);

		
	}

}
