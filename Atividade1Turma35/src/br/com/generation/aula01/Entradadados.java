package br.com.generation.aula01;

import java.util.Scanner;

public class Entradadados {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in); //funcao dentro de funcao
		
		int a, b , soma;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
				
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de a + b ?: " + soma);
		
		leia.close();
	}

}
