package br.com.generation.aula4;

import java.util.Scanner;

public class matrizexemplo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [][] notasAlunos = new double[2][4];
		
		System.out.println("***Notas dos Alunos***");
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				            //onde vai andar//notasAlunos
				System.out.printf("Digite as notas: %d %d: ", l,c);
				notasAlunos[l][c] = entrada.nextDouble(); //começa em [0][0]
			}
			System.out.println();
		}
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c] + "," );
			}
			System.out.println();
		}
	}

}
