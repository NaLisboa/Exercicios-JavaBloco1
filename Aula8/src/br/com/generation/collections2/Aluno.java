package br.com.generation.collections2;

public class Aluno {

	private String nome;
	private int idade;
	
	
	public Aluno(String nome, int idade) { //construtor de objeto
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "Idade" + this.idade + "Nome" + this.nome;
	}
}

