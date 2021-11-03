package br.com.generation.exercicios;

import java.util.Scanner;

/*Autor: Nathalia Lisboa
 * Data: 01/10/2021
*/

public class Exercicio7_0110 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, f, e, x, y;

		System.out.println("Digite o valor de a?: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b?: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c?: ");
		c = leia.nextInt();
		
		System.out.println("Digite o valor de d?: ");
		d = leia.nextInt();
		
		System.out.println("Digite o valor de e?: ");
		e = leia.nextInt();
		
		System.out.println("Digite o valor de f?: ");
		f = leia.nextInt();
		
		
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("O valor de X é " + x);
		System.out.println("O valor de Y é " + y);
		
		leia.close();

	}

}
