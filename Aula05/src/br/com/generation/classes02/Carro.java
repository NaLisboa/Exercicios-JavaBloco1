package br.com.generation.classes02;

public class Carro {
	
	//Atributos --> características
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	//métodos --> funções(as ações do carro, verbos)
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
}
