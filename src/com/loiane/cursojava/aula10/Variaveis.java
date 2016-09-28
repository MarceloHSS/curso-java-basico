package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		int idade = 20;
		String donoDoCachorro = "Marcelo";
		String nomeDoMeuCachorro = "totó";
		String nomeDoMeuGato = "capiroto";
		
		//Aceito, mas não é normalmente ultilizado.
		int _idade;
		int $idade;
		
		/*não é convenção Java (Uso de underline;Começar com letra Maiúscula;
		Começo de palavra com letra minúscula.) */ 
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		
		System.out.println("A idade dele é " + idade);
		System.out.println("Tem um cachorro chamado " + nomeDoMeuCachorro);
		System.out.println("Cujo nome do dono do cachorro é " + donoDoCachorro);
		

	}

}
