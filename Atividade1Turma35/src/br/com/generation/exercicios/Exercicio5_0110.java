package br.com.generation.exercicios;

import java.util.Scanner;

/*Autor: Nathalia Lisboa
 * Data: 01/10/2021
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
*/

public class Exercicio5_0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double N1, N2, N3, mediaFinal;

		System.out.println("Digite a primeira nota: ");
		N1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		N2 = leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		N3 = leia.nextInt();
		
		mediaFinal = ((N1*2) + (N2*3) + (N3*5))/10;
		System.out.println("Sua m�dia final �: " + mediaFinal);
		
		leia.close();
	}

}
