package br.com.generation.atividadesaula5;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("João Da Silva");
		func.setIdade(30);
		func.setDataNascimento("00/00/0000");
		func.setEndereco("R: __________, nº 30. Bairro: ________ Cidade: Campinas/SP ");
		func.setContato("19-99826-9997");
		func.setGenero("Masculino");
		func.setIdentidade("000.000.000-00");
		func.setEmail("joaodasilva@gmail.com");
		func.setEmpresa("Generation Brasil");
		func.setFuncao("Desenvolvedor JR.");
		func.setHoraTrab(44);
		func.setSalario(3.555);
		
		
		System.out.println("Nome do funcionário: " + func.getNome());
		System.out.println("Idade: " + func.getIdade());
		System.out.println("Data de Nascimento: " + func.getDataNascimento());
		System.out.println("Endereço: " + func.getEndereco());
		System.out.println("Contato: " + func.getContato());
		System.out.println("Gênero: " + func.getGenero());
		System.out.println("Identidade: " + func.getIdentidade());
		System.out.println("Email: " + func.getEmail());
		System.out.println("Empresa: " + func.getEmpresa());
		System.out.println("Função: " + func.getFuncao());
		System.out.println("Horas Semanais: " + func.getHoraTrab() + " horas trabalhadas");
		System.out.println("Salário: " + "R$ " + func.getSalario());
	}

}
