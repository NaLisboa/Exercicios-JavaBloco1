package br.com.generation.aula03;

public class Exemplo02 {

	public static void main(String[] args) throws InterruptedException {
		
		
		int contador = 10;
		
		while(contador >= 0) {
			System.out.println("Repeti��o... nr: " + contador);
			contador--;
			Thread.sleep(1000);
		}

	}

}
