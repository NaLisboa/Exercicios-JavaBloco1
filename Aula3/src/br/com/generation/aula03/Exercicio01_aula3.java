package br.com.generation.aula03;



public class Exercicio01_aula3 {

	public static void main(String[] args) {
		
		int numeros;
		
		for(numeros = 1000; numeros <= 1999; numeros++) {
			
			if(numeros % 11 == 5) {
			System.out.println("Números divididos por 11 com resto = 5: " + numeros);
			}
		}
		
		

	}

}
