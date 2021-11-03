package br.com.generation.aula03;

public class ExemploSoma {

	public static void main(String[] args) {
		
		
		int n = 5;
		int i, soma;
		
		for(i = 0, soma = 0; //primeiro declara os valores
				i <= n; //depois a equação
				
				i++) { //fim de soma
			
			System.out.println("Soma = " + soma + " + " + i);
			
			soma += i;
			
			System.out.println(" = " + soma);
		}

	}

}
