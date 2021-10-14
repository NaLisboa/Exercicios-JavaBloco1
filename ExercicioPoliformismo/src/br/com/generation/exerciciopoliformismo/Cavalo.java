package br.com.generation.exerciciopoliformismo;

public class Cavalo implements Animal{

	@Override
	public void nome() {
		System.out.println("Nome do cavalo: Pocotó");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 5 anos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som: IRRIIIIINNN");
		
	}

	@Override
	public void correr() {
		System.out.println("Cavalo correndo: Pocotó pocotó...");
		
	}

}
