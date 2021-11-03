package br.com.generation.OperacaoMat;

public class TestaOperacao {

	
	public static void calculaOperacao(OperacaoMat op, double x, double y) {
		System.out.println(op.calcular(x,y));
	}
	public static void main(String[] args) {
		calculaOperacao(new Soma(), 200, 300);
		calculaOperacao(new Multiplicacao(), 5, 6);

	}

}
