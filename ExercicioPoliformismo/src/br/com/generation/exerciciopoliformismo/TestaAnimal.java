package br.com.generation.exerciciopoliformismo;

public class TestaAnimal {

	
		public static void main(String[] args) {
			
			Cachorro cach = new Cachorro();
			
			cach.nome();
			cach.idade();
			cach.emitirSom();
			cach.correr();
			System.out.println("\n===========================================\n");
			
			Cavalo ca = new Cavalo();
			
			ca.nome();
			ca.idade();
			ca.emitirSom();
			ca.correr();
			System.out.println("\n===========================================\n");
			
			Preguica pre = new Preguica();
			
			pre.nome();
			pre.idade();
			pre.emitirSom();
			pre.correr();
			
		}
}

