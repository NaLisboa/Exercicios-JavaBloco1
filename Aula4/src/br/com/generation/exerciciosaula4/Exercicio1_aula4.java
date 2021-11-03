package br.com.generation.exerciciosaula4;

import java.util.Scanner;

public class Exercicio1_aula4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] pont = new int [5];
		int maior = 0;
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite a pontuação: ");
			pont[i] = leia.nextInt();
			
			if(pont[i] > maior) {
				maior = pont[i];
			}
		}
			System.out.println("O maior número digitado é: " + maior);
	}

}
