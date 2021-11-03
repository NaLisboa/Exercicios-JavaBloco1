package br.com.generation.exemplointerface;

public class Cachorro implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: au au");
		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo: zzzz");
		
	}

	@Override
	public void correr() {
		System.out.println("Cachorro correndo...");
		
	}

}
