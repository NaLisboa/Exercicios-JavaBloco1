package br.com.generation.classes;

public class TestaAlunos {

	public static void main(String[] args) {
		
		//Instancia de objeto --> criar o objeto
		Aluno aluno1 = new Aluno();   //aluno é o objeto
		Aluno aluno2 = new Aluno();
				//new cria o objeto
		
		aluno2.nome = "Malcolm";
		aluno2.idade = 20;
		aluno2.curso = "Bloco II - Spring boot";
		
		aluno1.nome = "Nathalia";
		aluno1.idade = 19;
		aluno1.curso = "Bloco I - Java Puro";
		
		System.out.println("Nome da Aluna: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println();
		
		aluno1.assistirAula();
		aluno1.estuda();
		aluno1.fazerProva();
		System.out.println();
		
		System.out.println("Nome do Aluno: " + aluno2.nome);
		System.out.println("Idade: " + aluno2.idade);
		System.out.println("Curso: " + aluno2.curso);
		
	}

}
