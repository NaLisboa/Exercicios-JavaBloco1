package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio04_aula3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pessoas = 0, idade, sexo = 0, calma = 0;
		int mulheresNer = 0, homensAgr = 0, outrosCalm = 0, temperamento = 0, idade40 = 0, idade18 = 0;
		
		while (pessoas < 5) {
			
				
				System.out.println("Qual � a sua idade? ");
				idade = leia.nextInt();
				
				System.out.println("Qual � o seu sexo?\n[1] F\n[2] M\n[3] Outros");
				sexo = leia.nextInt();
				
				System.out.println("Voc� se considera:\n[1]Calmo(a) \n[2]Nervoso(a)\n[3]Agressivo(a)");
				temperamento = leia.nextInt();
		
		if(sexo == 1 && temperamento == 2) {
			mulheresNer++;
		}
		if(sexo == 2 && temperamento == 3) {
			homensAgr++;
		}
		if(sexo == 3 && temperamento == 1){
			outrosCalm++;
		}
		
		if(temperamento == 1) {
			calma++;
		}
		
		if(idade > 40 && temperamento == 2) {
			idade40++;
		}
		
		if(idade < 18 && temperamento == 1) {
			idade18++;
		}
			pessoas++;
				}

		System.out.println("O total de pessoas calmas foi de: " + calma);
		System.out.println("O total de mulheres nervosas foi de: " + mulheresNer);
		System.out.println("O total de homens agressivos foi de: " + homensAgr);
		System.out.println("O total de outros calmos foi de: " + outrosCalm);
		System.out.println("O total de pessoas nervosas com mais de 40 anos foi de: " + idade40);
		System.out.println("O total de pessoas calmas com menos de 18 anos foi de: " + idade18);
		

		}
}