package br.com.generation.poliformismo;

public class Cachorro extends Animal {

	 //polimorfismo -- � o princ�pio pelo qual duas ou mais classe
	//devidasas de uma superClasse(Classe mais gen�rica) podem invocar
	//m�todos que tem a mesma ASSINATURA.. mas comportamentos distintos

	public void comer() {
		System.out.println("Cachorro comendo ra��o");
	}

}
