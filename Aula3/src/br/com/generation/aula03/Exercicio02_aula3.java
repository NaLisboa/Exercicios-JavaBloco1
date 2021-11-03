package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio02_aula3 {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros, par = 0, impar = 0;
			
		for(int n = 0; n <= 10; n++) {
			System.out.println("Digite os números: ");
			numeros = leia.nextInt();
			
		if(numeros % 2 != 0) {
			par++;
		}
		
		else {
			impar++;
		}
		}
			System.out.println("Quantidade de números pares: " + par);
			System.out.println("Quantidade de números ímpares: " + impar);
	}

}
