package com.loiane.cursojava.aula11;

public class curiosidadeint {

	public static void main(String[] args) {
	
		/** Ao somarmos o limite de valores de duas variáveis, como o int, ao invés de dar
		 * erro, pois exederia o valor maximo da variável, ele recomeça pelo seu valor negativo
		 */
		int ex1 = 2147483647;
		int ex2 = 100;

		//valor limite do int fica entre -2147483648 e 2147483647
				
				System.out.println(" A soma do exemplo ex1 + ex2 é = " + ( ex1 + ex2));
	}

}
