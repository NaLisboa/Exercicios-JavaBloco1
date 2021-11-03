package br.com.generation.exercicios;

import java.util.Scanner;

/*Autor: Nathalia Lisboa
 * Data: 01/10/2021
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/


public class Exercicio8_0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFab, custoCons;

		System.out.println("Qual é o valor de fábrica deste carro? ");
		custoFab = leia.nextInt();
		
		custoCons = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo deste carro ao consumidor é " + custoCons);

		leia.close();
	}

}
