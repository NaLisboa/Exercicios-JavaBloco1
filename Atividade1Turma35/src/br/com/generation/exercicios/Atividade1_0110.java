package br.com.generation.exercicios;

/*Autor: Nathalia Lisboa
 * Data 01/10/2021
 */

import java.util.Scanner;

public class Atividade1_0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diaNascimento; int mesNasc; int anoNasc; int totalDias;
		
		System.out.println("Dia: ");
		diaNascimento = leia.nextInt();
		
		System.out.println("Mes: ");
		mesNasc = leia.nextInt();
		
		System.out.println("Ano: ");
		anoNasc = leia.nextInt();
		
		totalDias = diaNascimento + (mesNasc * 30) + ((2021 - anoNasc) * 365);
		
		System.out.println(totalDias);
		
		
		leia.close();
		
	}

}
