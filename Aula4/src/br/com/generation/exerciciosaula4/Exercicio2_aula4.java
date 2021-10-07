package br.com.generation.exerciciosaula4;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
		System.out.println("A m�dia dos lan�amentos foi de: " + media);
		System.out.println("A ocorr�ncia da maior pontua��o foi de: " + maiorPont);
	}

}
