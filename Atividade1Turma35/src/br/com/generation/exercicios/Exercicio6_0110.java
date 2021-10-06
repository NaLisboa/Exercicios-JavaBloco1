package br.com.generation.exercicios;

import java.util.Scanner;

	/*Autor: Nathalia Lisboa
 * Data: 01/10/2021
 * Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
	que efetua tal c�lculo �:
	*/

public class Exercicio6_0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;

		System.out.println("Qual � o valor de x no ponto 1: ");
		x1 = leia.nextInt();
		
		System.out.println("Qual � o valor de y no ponto 1: ");
		y1 = leia.nextInt();
		
		System.out.println("Qual � o valor de x no ponto 2: ");
		x2 = leia.nextInt();
		
		System.out.println("Qual � o valor de y no ponto 2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A dist�ncia entre o ponto 1 e 2 � de " + d);
		
		leia.close();	
		
		
	}

}
