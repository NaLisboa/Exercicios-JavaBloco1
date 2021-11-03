package br.com.generation.metodosobrecarregado;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		MinhaCalculadora calcRetorno = new MinhaCalculadora();
		
		//somando dois inteiros
		System.out.println("Somando números: " + calcRetorno.soma(25, 63));
		//System.out.println("Somando números: " + calcRetorno.soma(2.5, 5.9));
		System.out.println("Somando números: " + calcRetorno.soma(5,10.0));

		
		
		
		
		
		}
}