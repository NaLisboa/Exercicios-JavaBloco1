package br.com.generation.exercicios;

import java.util.Scanner;

/*Autor: Nathalia Lisboa
 * Data 01/10/2021
 */

public class Exercicio2_0110 {
	//eu tenho 9769 dias de vida
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano; 
		int mes; 
		int dia; 
		int dias;
		
		System.out.println("Digite a idade em dias: ");
		dias = leia.nextInt();
		
		ano = dias / 365;
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("Eu Nath?lia tenho " + ano + " anos, " + mes + " meses e " + dia +" dias");
		
		leia.close();

	}

}
