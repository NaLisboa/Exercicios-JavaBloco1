package br.com.generation.aula4;

public class Vetores {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10];

		arrayVetor[5] = 2000;
		arrayVetor[9] = -587;
		
		for (int i = 0; i <= 9; i++) {     
				//mostra a posição do valor(0 a 9) //mostra a posição da caixa do vetor
			
			System.out.println(i + " | " + arrayVetor[i]);
		}
	}

}
