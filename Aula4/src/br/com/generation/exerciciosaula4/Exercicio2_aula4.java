package br.com.generation.exerciciosaula4;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

import java.util.Scanner;

public class Exercicio2_aula4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] lanc = new double [10];
		double media = 0.0, maiorPont = 0.0, soma = 0.0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			lanc[i] = leia.nextDouble();
			soma = soma + lanc[i];
			media = soma/10;
			
			if(lanc[i] > maiorPont) {
				maiorPont = lanc[i];
			}
		}
		System.out.println("A média dos lançamentos foi de: " + media);
		System.out.println("A ocorrência da maior pontuação foi de: " + maiorPont);
	}

}
