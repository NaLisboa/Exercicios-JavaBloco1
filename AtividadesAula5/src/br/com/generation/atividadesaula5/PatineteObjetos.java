package br.com.generation.atividadesaula5;

public class PatineteObjetos {

	public static void main(String[] args) {
		
		Patinete pat = new Patinete();
		
		pat.setMarca("Wondrus");
		pat.setMateriais("Alumínio, Plástico e Nylon");
		pat.setAno(2016);
		pat.setCor("Verde e branco");
		pat.setPesoMax("100Kgs");
		pat.setCaracteristicas("Antiderrapante, Guidão com 2 níveis de ajuste de altura, Dobrável, Luz LED, 3 rodas em PVC");
		pat.setFreio("Manual");
		pat.setGarantia("12 meses");

		
		
		System.out.println("Marca: " + pat.getMarca());
		System.out.println("Materiais: " + pat.getMateriais());
		System.out.println("Ano de Fabricação: " + pat.getAno());
		System.out.println("Cor: " + pat.getCor());
		System.out.println("Peso Máx. Suportado: " + pat.getPesoMax());
		System.out.println("Características: " + pat.getCaracteristicas());
		System.out.println("Freio: " + pat.getFreio());
		System.out.println("Garantia: " + pat.getGarantia());
	}

}

