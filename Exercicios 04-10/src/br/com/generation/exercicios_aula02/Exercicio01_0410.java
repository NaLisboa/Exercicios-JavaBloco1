package br.com.generation.exercicios_aula02;

import java.util.Scanner;

/* Autor: Nathalia Lisboa
   Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class Exercicio01_0410 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva 3 n�meros: ");
		
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("Esse � o maior n�mero: " + n1);
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println("Esse � o maior n�mero: " + n2);
		}
		else {
			System.out.println("Esse � o maior n�mero: " + n3);
		}
		
		leia.close();
	}

}
