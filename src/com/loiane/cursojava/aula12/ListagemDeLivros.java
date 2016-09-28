package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class ListagemDeLivros {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome de 3 livros para os respectivos Gêneros.");

		System.out.println ("Suspense: ");
		String livroS1 = sc.nextLine();
		String livroS2 = sc.nextLine();
		String livroS3 = sc.nextLine();
		
		
		System.out.println("Policial: ");
		String livroP1 = sc.nextLine();
		String livroP2 = sc.nextLine();
		String livroP3 = sc.nextLine();
	
		
		System.out.println("AutoAjuda: ");
		String livroA1 = sc.nextLine(); 
		String livroA2 = sc.nextLine();
		String livroA3 = sc.nextLine();
	
		System.out.println("Mangás");
		String livroM1 = sc.nextLine();
		String livroM2 = sc.nextLine();
		String livroM3 = sc.nextLine();
		
		
		System.out.println("Seus livros listados foram: ");
		
		
		System.out.println(" Suspense: " + livroS1 + livroS2 + livroS3);
		System.out.println(" Policial: " + livroP1 + livroP2 + livroP3);
		System.out.println(" Auto Ajuda: " + livroA1 + livroA2 + livroA3);
		System.out.println(" Mangás: " + livroM1 + livroM2 + livroM3);
		

		System.out.println(" Maravilha!!!");
	
	
	
	
	}

}
