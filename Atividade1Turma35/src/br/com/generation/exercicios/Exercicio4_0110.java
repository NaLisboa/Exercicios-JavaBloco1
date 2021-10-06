package br.com.generation.exercicios;

	import java.util.Scanner;
	
	
	/*Autor: Nathalia Lisboa
	 * Data: 01/10/2021
	 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	calcule a seguinte expressão:
	
		D = R + S / 2
		onde R = (A + B)²
			 S = (B + C)²
	*/
	
public class Exercicio4_0110 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		
		System.out.println("Insira o número A: ");
		A = leia.nextInt();
		
		System.out.println("Insira o número B: ");
		B = leia.nextInt();
		
		System.out.println("Insira o número C: ");
		C = leia.nextInt();
		
		R = (A + B) * (A + B);
		System.out.println("Valor de R é: " + R);
		
		S = (B + C) * (B + C);
		System.out.println("O valor de S é: " + S);
		
		D = (R + S) / 2;
		System.out.println("Valor de D é: " + D);
		
		leia.close();	

	}

}
