package br.com.generation.poliformismo;

public class Cachorro extends Animal {

	 //polimorfismo -- é o princípio pelo qual duas ou mais classe
	//devidasas de uma superClasse(Classe mais genérica) podem invocar
	//métodos que tem a mesma ASSINATURA.. mas comportamentos distintos

	public void comer() {
		System.out.println("Cachorro comendo ração");
	}

}
