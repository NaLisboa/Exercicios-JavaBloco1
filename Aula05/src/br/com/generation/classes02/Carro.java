package br.com.generation.classes02;

public class Carro {
	
	//Atributos --> caracter�sticas
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	//m�todos --> fun��es(as a��es do carro, verbos)
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
}
