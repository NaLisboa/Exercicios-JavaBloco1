package br.com.generation.exercicios_aula02;


/*Autor: Nathalia Lisboa
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
*/

import java.util.Scanner;

public class Exercicio04_0410 {

	
	public static void main(String[] args) {
		
		double numero = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse n�mero � Par e a sua ra�z quadrada �: " + Math.sqrt(numero));
		}
		
		else {
			System.out.println("Esse n�mero � �mpar e elevado ao quadrado o resultado �: " + Math.pow(numero, 2.0));
		}
		
		leia.close();

	}

}
