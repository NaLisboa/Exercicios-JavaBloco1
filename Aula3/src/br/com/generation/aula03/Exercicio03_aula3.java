package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio03_aula3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, contadorMenor = 0, contadorMaior = 0;
		
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		while(idade != -99 && idade != 0) {
			
			if(idade <= 21) {
				contadorMenor++;
			}
			
			if(idade >= 50) {
				contadorMaior++;
			}
			
			System.out.println("DIGITE A IDADE -> (PARA ENCERRAR DIGITE -99:");
			idade = entrada.nextInt();
		}
		
		System.out.println("TOTAL DE PESSOAS COM MENOS DE 21 ANOS: " + contadorMenor);
		System.out.println("TOTAL DE PESSOAS COM MAIS DE 50 ANOS: " + contadorMaior);
	}

}
