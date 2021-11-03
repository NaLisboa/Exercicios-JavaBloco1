package br.com.generation.exercicios_aula02;


/*Autor: Nathalia Lisboa
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/

import java.util.Scanner;

public class Exercicio04_0410 {

	
	public static void main(String[] args) {
		
		double numero = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse número é Par e a sua raíz quadrada é: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("Esse número é Ímpar e elevado ao quadrado o resultado é: " + Math.pow(numero, 2.0));
		}
		
		leia.close();

	}

}
