package br.com.generation.exercicioheranca;

import java.util.Scanner;

public class HerancaCompleto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica p = new Preguica();
		
		
		//cachorro
		cachorro.setNome("Cachorro");
		cachorro.setIdade(3);
		cachorro.setOrigem("Em nossos lares");
		
		cav.setNome("Cavalo");
		cav.setIdade(10);
		cav.setOrigem("Na fazenda");
		
		p.setNome("Preguiça");
		p.setIdade(1);
		p.setOrigem("Na mata");
		
		
		System.out.println(cachorro.getNome());
		System.out.println("Idade do Cachorro: " + cachorro.getIdade());
		System.out.println("Onde geralmente ele vive: ");
		cachorro.EmitirSom("AUAUAUAUAU");
		
		System.out.println("=========================================================\n");
		
		System.out.println(cav.getNome());
		System.out.println("Idade do Cavalo: " + cav.getIdade());
		System.out.println("Onde geralmente ele vive: ");
		cav.EmitirSom("IRRRRRIIINN");
		
		System.out.println("=========================================================\n");
		
		System.out.println(p.getNome());
		System.out.println("Idade da Preguiça" + p.getIdade());
		System.out.println("Onde geralmente ele vive: " + p.getOrigem());
		p.EmitirSom("......");
		
		leia.close();
		
	}

}
