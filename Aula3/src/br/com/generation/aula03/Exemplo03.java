package br.com.generation.aula03;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) { // inicio do la�o de repeti��o
			
			System.out.println("Digite um n�mero: ");
			numero = in.nextInt();
			
			if(numero == 10) {
				System.out.println("Voc� acertou!!");
			}
			
			else {
				System.out.println("Voc� errou!!");
			}
		} //Fim do la�o de repeti��o - while

	}

}
