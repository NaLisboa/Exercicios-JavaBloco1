package br.com.generation.atividadesaula5;

public class ClienteInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Nathalia Lisboa");
		cliente.setDataNascimento("16/02/1995");
		cliente.setIdade(26);
		cliente.setEndereco("R: Luiz Otávio, nº 46. Bairro: Jardim Leonor. Campinas-SP");
		cliente.setContato("00-0000-0000");
		cliente.setIdentidade("000.000.000-00");
		cliente.setGenero("Feminino");
		cliente.setEmail("nathalialisboa01@gmail.com");
		
		
		System.out.println("Nome do(a) cliente: " + cliente.getNome());
		System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Número de Contato: " + cliente.getContato());
		System.out.println("Genêro: " + cliente.getGenero());
		System.out.println("Email: " + cliente.getEmail());
	}

}

