package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		Professor prof1 = new Professor();
		FuncAdm fadm1 = new FuncAdm();
		
		System.out.println("Digite o nome do Funcion�rio: ");
		//String nome = leia.nextLine();
		
		
		fadm1.setNome(leia.nextLine());
		fadm1.setFuncao("Gerente");
		fadm1.setSalario(25000.00);
		
		prof1.setNome("Jeff");
		prof1.setIdade(21);
		prof1.setEndere�o("Rua: Da Hist�ria, 200");
		prof1.setSalario(10000.00);
		prof1.setDisciplina("Hist�ria e Ingl�s");
		
		
		System.out.println("Nome: " + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Endere�o: " + prof1.getEndere�o());
		System.out.println("Sal�rio: " + prof1.getSalario());
		System.out.println("Disciplina: " + prof1.getDisciplina());
		
		System.out.println("Nome:" + fadm1.getNome());
		System.out.println("Fun��o:" + fadm1.getFuncao());
		System.out.println("Sal�rio:" + fadm1.getSalario());
	}

}
