package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio06_aula3 {
	
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros = 0, multiplos = 0, media = 0, soma = 0;
		
		do {
		
		System.out.println("Digite um n�mero: ");
		numeros = leia.nextInt();
		
		if (numeros % 3 == 0 && numeros != 0) {
			soma = soma + numeros;
			multiplos++;
		}
		
		}
		
		while (numeros != 0);
		
		media = soma/multiplos;
		System.out.println("A m�dia dos m�ltiplos de 3 � de: " + media);
	}

}
