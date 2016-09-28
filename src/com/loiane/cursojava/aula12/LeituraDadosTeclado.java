package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo, é " + nomeCompleto);
		
		System.out.println("Digite seu nome de guerra:");
		String nomeDeGuerra = scan.next();
		System.out.println("Seu nome de guerra é : " + nomeDeGuerra);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idada é: " + idade);
		
		System.out.println("Digite o seu peso: ");
		int peso = scan.nextInt();
		System.out.println("Seu peso é = " + peso);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua é altura é: " + altura);*/
		
		System.out.print("Por gentileza, digite seu nome, idade,altura, numero do seu cpf "
				+ "para que possamos realizar o cadastro e se voce possui cartão de crédito.");
				
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		long cpf = scan.nextLong();
		boolean cCredito = scan.nextBoolean();
			
	System.out.println("Você digitou os seguintes valores: ");
	System.out.println("Nome: " + nome);
	System.out.println("Idade " + idade);
	System.out.println("Altura: " + altura);
	System.out.println("cpf: " + cpf);
	System.out.println("Cartão de Crédito: " + cCredito);
	

 }
}
	