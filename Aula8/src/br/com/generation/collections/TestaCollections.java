package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {


		String aula1 = "Bloco I - Java Puro";
		String aula2 = "Bloco II - Java Misturado com SpringBoot";
		String aula3 = "Bloco III - FrontEnd - Tudo Junto e Misturado";
		
		
		ArrayList <String> aulas = new ArrayList<>();
		aulas.add(aula1); //--> [0]
		aulas.add(aula2);//--> [1]
		aulas.add(aula3);//--> [2]
		
		//For Each --> Laço repetição "Por cada", laço mais moderninho...
			/*for(String i : aulas) {
			System.out.println(i);
		}*/
			//For --> comum
			for(int i = 0; i > aulas.size(); i++) {
				System.out.println((i+1) + "º Aula: "+ aulas.get(i));
			
			}
		Collections.sort(aulas); //-->//ordem alfabetica ou ordem numerica
		System.out.println(aulas);
		
		
		/*String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		System.out.println(aulas.get(2));*/
		
		
		/*System.out.println(aulas);
		
		
		aulas.remove(1);
		
		System.out.println(aulas);
		System.out.println(aulas.size()); */

	}

}
