package br.com.generation.exercicios_aula02;

import java.util.Scanner;

/*Autor: Nathalia Lisboa
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */

public class Exercicio2_0410 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		System.out.println("Escreva 3 n�meros: ");
		Scanner leia = new Scanner (System.in);
		
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n2 <= n3){
			System.out.println("A ordem crescrente �: " + n1 + n2 + n3);
		}
			
		else if (n1 <= n3 && n3 <= n2){
				System.out.println("A ordem crescrente �: " + n1 + n3 + n2);			
		}
		
		else if (n2 <= n1 && n1 <= n3){
			System.out.println("A ordem crescrente �: " + n2 + n1 + n3);			
		}
		
		else if (n2 <= n3 && n3 <= n1){
			System.out.println("A ordem crescrente �: " + n2 + n3 + n1);			
		}
		
		else if (n3 <= n2 && n2 <= n1){
			System.out.println("A ordem crescrente �: " + n3 + n2 + n1);
		}
		else {
			System.out.println("A ordem crescente �: ");
			
		}
		
		
		leia.close();
		
	}
	
	
}
