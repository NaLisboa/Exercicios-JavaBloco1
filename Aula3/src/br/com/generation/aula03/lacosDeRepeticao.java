package br.com.generation.aula03;

public class lacosDeRepeticao {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10)
		
		{//inicio do la?o
			
			System.out.println("Repeti??o... nr: " + contador);
			
			contador++;
			Thread.sleep(1000); //1000milisegundos = 1 segundo
			
		}//fim do la?o

	}

}
