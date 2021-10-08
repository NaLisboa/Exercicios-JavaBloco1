package construtores;

import java.util.Scanner; //ctrl shift O

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		Pessoa p1 = new Pessoa("Karina, 22");
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
	}

}
