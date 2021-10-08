package br.com.generation.atividadesaula5;

public class VideogameObjetos {

	public static void main(String[] args) {
		
		
		Videogame videoGame = new Videogame();
		
		videoGame.setModelo("Playstation 5 - PS5");
		videoGame.setMarca("Sony");
		videoGame.setAno(2021);
		videoGame.setMemoria("825 GB");
		videoGame.setAcessorios("2 controles DualSense, Cabo HDMI, Cabo de Força e Cabo USB-C.");
		videoGame.setJogos("GTA 6, MORTAL KOMBAT e FIFA 2022");
		videoGame.setCor("Branco");
		videoGame.setVoltagem("Bivolt");
		
		
		System.out.println("Modelo do Console: " + videoGame.getModelo());
		System.out.println("Marca: " + videoGame.getMarca());
		System.out.println("Ano de Fabricação: " + videoGame.getAno());
		System.out.println("Memória: " + videoGame.getMemoria());
		System.out.println("Acessórios: " + videoGame.getAcessorios());
		System.out.println("Jogos acompanhantes: " + videoGame.getJogos());
		System.out.println("Cor: " + videoGame.getCor());
		System.out.println("Voltagem: " + videoGame.getVoltagem());

	}

}
