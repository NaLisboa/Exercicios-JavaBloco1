package br.com.generation.classes02;

public class TestaCarro {

	public static void main(String[] args) {
		
		//Instancia de Objeto
		Carro c1 = new Carro();
	//carro é classe  //c1 é objeto
		c1.marca = "Fiat";
		c1.modelo = "Uno";
		c1.ano = 2010;
		c1.velocidade = 0;
		
		c1.acelerar(120);
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.ano);
		System.out.println("Velocidade Atual: " + c1.velocidade);
		
		c1.freiar(30);
		System.out.println("Velocidade Atual: " + c1.velocidade);
	}

}
