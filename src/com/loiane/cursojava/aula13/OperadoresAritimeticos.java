package com.loiane.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		int resultado = 8 + 5;
		System.out.println(resultado);
		
		resultado = resultado - 5;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println (resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 7;
		System.out.println (resultado);
		
		resultado++;
		System.out.println (resultado);
		
		
		//Incremento é ultilizado antes da execução da variável
		System.out.println (++resultado);
		//Incremento é ultilizado depois da execução da variável
		System.out.println (resultado++);
		
		//mesma coisa:
		//System.out.println (resultado++);
		//resultado = resultado + 1;
		//resultado += 1;
		
		//mesma coisa:
		//System.out.println (++resultado);
		//resultado += 1;
		//System.out.println(resultado)
		
		
		
		resultado--;
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		

	}

}
