package br.com.generation.encapsulamento;

public class Carro02 {
	
	
	//Atributos privados
	private String marca;
	private String cor;
	private String modelo;
	private int ano;
	
	//getters e setters para acessar os privados
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		//atributo lá em cima
		this.marca = marca; // --> recebimento do parametro
		
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}

