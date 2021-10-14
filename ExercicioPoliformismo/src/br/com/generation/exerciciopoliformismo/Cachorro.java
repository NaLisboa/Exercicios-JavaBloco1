package br.com.generation.exerciciopoliformismo;

public class Cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println("Nome do cachorro: Penélope");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 3 anos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som: Auauauau");
		
	}

	@Override
	public void correr() {
		System.out.println("Cachorro correndo...");
		
	}

}
