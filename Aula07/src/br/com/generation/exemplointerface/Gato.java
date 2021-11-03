package br.com.generation.exemplointerface;

public class Gato implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O gato: miau...");
		
	}

	@Override
	public void dormir() {
		System.out.println("O Gato dormindo: sniff sniff...");
		
	}

	@Override
	public void correr() {}

}
