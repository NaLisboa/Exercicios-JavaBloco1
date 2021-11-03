package br.com.generation.atividadesaula5;

public class AviãoObjeto {

	public static void main(String[] args) {
		
		
		Avião aviao = new Avião();
		
		aviao.setModelo("Boeing 747");
		aviao.setCompanhia("Azul");
		aviao.setAno(2021);
		aviao.setCor("Branco");
		aviao.setCapacidade("410 passageiros");
		
		
		
		System.out.println("Modelo: " + aviao.getModelo());
		System.out.println("Companhia Aérea: " + aviao.getCompanhia());
		System.out.println("Ano: " + aviao.getAno());
		System.out.println("Cor: " + aviao.getCor());
		System.out.println("Capacidade Máxima: " + aviao.getCapacidade());
	}

}