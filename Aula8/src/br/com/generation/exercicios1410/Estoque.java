package br.com.generation.exercicios1410;

public class Estoque {
	
	private String produto;
	private String validade;
		

			public Estoque(String produto, String validade) {
				super();
				this.produto = produto;
				this.validade = validade;
			}


			public String getProduto() {
				return produto;
			}


			public void setProduto(String produto) {
				this.produto = produto;
			}


			public String getValidade() {
				return validade;
			}


			public void setValidade(String validade) {
				this.validade = validade;
			}
			public String toString() {
				return "Produto: " + this.produto + " Validade: " + this.validade;
			}
			

		
	

}
