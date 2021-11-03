package br.com.generation.atividadesaula5;

public class ContaBancaria {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String endereco;
	private String contato;
	private String genero;
	private String identidade;
	private String email;
	private String banco;
	private double cont = 0.0;
	private String sacar;
	
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getConta() {
		return cont;
	}
	public void setConta(double conta) {
		this.cont = conta;
	}
	public Double sacar(double dinheiro) {
		cont -= dinheiro;
		return cont;
	}
	public Double depositar(double dinheiro) {
		cont += dinheiro;
		return cont;
	}
	
	

}
