package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class ImprimiDadosPessoais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Favor, digite seus dados pessoais como nome, idade, altura"
				+ "telefone e se possui filhos.");
		
		String nome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		int telefone = scan.nextInt();
		boolean filhos = scan.nextBoolean();
		
		System.out.println("Favor, verifique se as informações digitadas estão corretas.");
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Sua altura: " + altura);
		System.out.println("Seu telefone: " + telefone);
		System.out.println("Você tem filhos? " + filhos);
		
		
	}

}
