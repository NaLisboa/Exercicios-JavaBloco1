package br.com.generation.atividadesaula5;

public class Avi�oObjeto {

	public static void main(String[] args) {
		
		
		Avi�o aviao = new Avi�o();
		
		aviao.setModelo("Boeing 747");
		aviao.setCompanhia("Azul");
		aviao.setAno(2021);
		aviao.setCor("Branco");
		aviao.setCapacidade("410 passageiros");
		
		
		
		System.out.println("Modelo: " + aviao.getModelo());
		System.out.println("Companhia A�rea: " + aviao.getCompanhia());
		System.out.println("Ano: " + aviao.getAno());
		System.out.println("Cor: " + aviao.getCor());
		System.out.println("Capacidade M�xima: " + aviao.getCapacidade());
	}

}