package br.com.generation.exercicios;

	import java.util.Scanner;
	
	
	/*Autor: Nathalia Lisboa
	 * Data: 01/10/2021
	 * Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
	calcule a seguinte express�o:
	
		D = R + S / 2
		onde R = (A + B)�
			 S = (B + C)�
	*/
	
public class Exercicio4_0110 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		
		System.out.println("Insira o n�mero A: ");
		A = leia.nextInt();
		
		System.out.println("Insira o n�mero B: ");
		B = leia.nextInt();
		
		System.out.println("Insira o n�mero C: ");
		C = leia.nextInt();
		
		R = (A + B) * (A + B);
		System.out.println("Valor de R �: " + R);
		
		S = (B + C) * (B + C);
		System.out.println("O valor de S �: " + S);
		
		D = (R + S) / 2;
		System.out.println("Valor de D �: " + D);
		
		leia.close();	

	}

}
