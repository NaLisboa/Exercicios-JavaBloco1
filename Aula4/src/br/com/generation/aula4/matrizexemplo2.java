package br.com.generation.aula4;

public class matrizexemplo2 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 8.5;
		notasAlunos[0][1] = 9.6;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 5.3;
		
		notasAlunos[1][0] = 5.8;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 10.0;
		notasAlunos[1][3] = 3.5;
		
		double soma;
		for(int l = 0; 1 < notasAlunos.length; l++) {//Linha
			soma = 0;
			for(int c = 0; c < notasAlunos[l].length; c++) {//colunas
				soma = soma + notasAlunos[l][c]; //ou+=				
			}//colunas
			
			System.out.println("M?dia: " + l + " ?: " + (soma/4));
			
		} //linhas

	}

}
