package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio05_aula3 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0;
		int soma = 0;
		
		
		do {
			System.out.println("Digite um n�mero");
			numero = leia.nextInt();
			soma += numero;
		}
			
			
		while (numero != 0);
			
			System.out.println("A soma dos n�meros digitados s�o: " + soma);
			

			
	}

}
