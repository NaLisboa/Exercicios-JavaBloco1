package br.com.generation.aula4;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double [4]; //[0][1][2][3]
		double soma = 0.0, media = 0.0;
		
		int i;
		System.out.println("Digite as 4 notas do aluno: ");
		for(i = 0; i < notas.length; i++) {
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i]; //+= também é uma soma
			media = soma / 4; ///divide pelo tamanho do vetor - notas.length tbm divide
			
		}

		
		System.out.println("Média: " + media);
	}

}
