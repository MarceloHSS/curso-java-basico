package com.loiane.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		//O "&" (AND) analizada todas as expreções.
		boolean resultado1 = falso &
				verdadeiro ;
		
		//o "&&" (AND curto circuito) agiliza a execução. 
		boolean resultado2 = verdadeiro && 
				falso;
		
		
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1+1-1+1*1/1;
		System.out.println(resultado);
		
	}

}
