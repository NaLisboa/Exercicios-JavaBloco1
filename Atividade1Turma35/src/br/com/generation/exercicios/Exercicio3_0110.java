package br.com.generation.exercicios;

	import java.util.Scanner;
	
	/*Autor: Nathalia Lisboa
	 * Data: 01/10/2021
	 
	 * Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */
	
public class Exercicio3_0110 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos;
		int horas;
		int minutos;
		
		System.out.println("Quantidade de Segundos: ");
		segundos = leia.nextInt();
		System.out.println("Em segundos: " + segundos);
		
		minutos = (segundos) / 60;
		System.out.println("Em minutos: " + minutos);
		
		horas = (segundos) / 3600;
		System.out.println("Em horas: " + horas);
		
		
		leia.close();
		
	}

}
