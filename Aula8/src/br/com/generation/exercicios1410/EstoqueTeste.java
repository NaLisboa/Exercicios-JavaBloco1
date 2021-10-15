package br.com.generation.exercicios1410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EstoqueTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		Estoque est1 = new Estoque ("Arroz ", " 11/12/2022");
		Estoque est2 = new Estoque ("Feijão ", " 03/09/2022");
		Estoque est3 = new Estoque ("Açúcar ", " 20/10/2023");
		Estoque est4 = new Estoque ("Café ", " 30/03/2024");

		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		estoque.add(est1);
		estoque.add(est2);
		estoque.add(est3);
		estoque.add(est4);
		
		estoque.remove(2);
		
		for(Estoque i : estoque) {
			System.out.println(i);
		}
		
		
		
		
		
	
		
		

	}

}
