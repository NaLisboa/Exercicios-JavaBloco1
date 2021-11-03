package br.com.generation.poliformismo;

public class ImprimirAnimal {

	public static void main(String[] args) {


		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
		t.fazerAnimalComer(new Animal());

	}

}
