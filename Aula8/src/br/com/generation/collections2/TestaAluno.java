package br.com.generation.collections2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você deseja add");
		int numeroAluno = sc.nextInt();		
		sc.nextLine();
		
		for(int i = 0; i < numeroAluno; i++) {
			
			System.out.println("Idade do aluno:");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("nome do aluno");
			String nome = sc.nextLine();
			
			alunos.add(new Aluno(nome, idade)); //cria o objeto
		}

		for(Aluno i : alunos) {
			System.out.println(i);
		}
	}

}
