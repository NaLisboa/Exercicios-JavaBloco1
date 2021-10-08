package br.com.generation.atividadesaula5;

import java.util.Scanner;

public class ContaBancObjetos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		int saldo = 0;
		
		
		conta.setNome("Antonella");
		conta.setIdade(55);
		conta.setDataNascimento("00/00/0000");
		conta.setContato("19-00000-0000");
		conta.setIdentidade("000.000.000-00");
		conta.setEmail("antonellalisboa@gmail.com");
		conta.setBanco("Caixa Econômica Federal");
		
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Idade: " + conta.getIdade());
		System.out.println("Data Nascimento: " + conta.getDataNascimento());
		System.out.println("Contato: " + conta.getContato());
		System.out.println("Identidade: " + conta.getIdentidade());
		System.out.println("Email: " + conta.getEmail());
		System.out.println("Banco: " + conta.getBanco());
		
		System.out.println("\nDigite uma opção: \n[1] Sacar \n[2] Depositar\n");
		saldo = leia.nextInt();
		
		if(saldo == 1) {
			System.out.println("Digite o valor que deseja sacar: ");
			double i = leia.nextDouble();
			
			if(i > conta.getConta()) {
				System.out.println("Saldo insuficiente.");
			}
			else {
				conta.sacar(i);
				
			}
				System.out.println("O seu saldo atual é: " + conta.getConta());
		}
		else if(saldo == 2) {
			System.out.println("Digite o valor que deseja depositar: ");
			conta.depositar(leia.nextDouble());
			System.out.println("Seu saldo é de: " + conta.getConta() + " reais");
		}
		
		else {
			System.out.println("Inválido!");
		}
		
		leia.close();
	}

}
