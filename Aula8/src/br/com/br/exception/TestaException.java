package br.com.br.exception;

public class TestaException {

	public static void main(String[] args) {

    int[] vetor = new int[4];
    		System.out.println("Antes do erro.");
    		
    		try {
    		
    		vetor[4] = 10;
    		}
    		catch(ArrayIndexOutOfBoundsException e) {
    		
    		System.out.println("Esse vetor est� com valor errado na posi��o!");
    		System.out.println(e);
  
    		}
	}

}
