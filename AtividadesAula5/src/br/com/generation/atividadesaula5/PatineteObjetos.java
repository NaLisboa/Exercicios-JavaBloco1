package br.com.generation.atividadesaula5;

public class PatineteObjetos {

	public static void main(String[] args) {
		
		Patinete pat = new Patinete();
		
		pat.setMarca("Wondrus");
		pat.setMateriais("Alum�nio, Pl�stico e Nylon");
		pat.setAno(2016);
		pat.setCor("Verde e branco");
		pat.setPesoMax("100Kgs");
		pat.setCaracteristicas("Antiderrapante, Guid�o com 2 n�veis de ajuste de altura, Dobr�vel, Luz LED, 3 rodas em PVC");
		pat.setFreio("Manual");
		pat.setGarantia("12 meses");

		
		
		System.out.println("Marca: " + pat.getMarca());
		System.out.println("Materiais: " + pat.getMateriais());
		System.out.println("Ano de Fabrica��o: " + pat.getAno());
		System.out.println("Cor: " + pat.getCor());
		System.out.println("Peso M�x. Suportado: " + pat.getPesoMax());
		System.out.println("Caracter�sticas: " + pat.getCaracteristicas());
		System.out.println("Freio: " + pat.getFreio());
		System.out.println("Garantia: " + pat.getGarantia());
	}

}

