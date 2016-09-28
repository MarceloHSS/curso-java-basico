package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		//Exercício 1
	System.out.println(" Ola Mundo!");
		
		//Exercicio 2
		
	System.out.println(" Favor, digite um numero: ");
		int numero = sc.nextInt();
	System.out.println("O valor digitado foi: " + numero);
		
		
		//Exercício 3 
	System.out.println("Digite dois numeros para serem somados: ");		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int resultado = (num1 + num2) ;
	System.out.println( "A soma dos números digitados é: " + resultado);
	
		
		//Exercício 4
	System.out.println ("Digite as notas dos 4 bimestres, "
			+ "para que possa ser exibida a sua média.");
	System.out.println("1º Bimestre: ");
			double primeiroBimestre = sc.nextDouble();
	System.out.println ("2º Bimestre: ");
			double segundoBimestre = sc.nextDouble();
	System.out.println("3º Bimestre: ");
			double terceiroBimestre = sc.nextDouble();
	System.out.println ("4º Bimestre: ");
			double quartoBimestre = sc.nextDouble();
	
			
			double resultadoMedia = ((primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre)  / 4);
	System.out.println("Sua média é: " + resultadoMedia);?
		
		//Exercício 5
	
		System.out.println(" Digite o valor em metros para ser convertido em centimetros: ") ;
		double valorMetro = sc.nextDouble();
		double valorCentimetro = (valorMetro * 100);
		System.out.println(" O valor em cm é: " + valorCentimetro + "cm");
	
		//Exercicio 6
		System.out.println("Calculando á Área de um circulo.");
		System.out.println("Insira o valor do raio de um círculo: ");
			double valorRaio = sc.nextDouble();
			double resultadoArea = 3.14 * Math.pow(valorRaio, 2);
			System.out.println(" A Área do circulo é : " + resultadoArea);
		
		//Exercício 7
		
		System.out.println("Calculando a área de um quadrado e dando o resultado em dobro.");
		System.out.println("Digire o valor de um dos lados do quadrado: ");
			double ladoQuadrado = sc.nextDouble();
			double valorArea = ((ladoQuadrado * ladoQuadrado) * 2);
		System.out.println(" O resultado da área é: " + valorArea); 
		
		
		//Exercicio 8
		
		System.out.println("Programa de calculo de salário apartir do valor de horas trabalhadas.");
		System.out.println("Digite quanto você ganha por hora: ");
			double valorHora = sc.nextDouble();
		System.out.println("Digite o total de horas trabalhadas no referido mês: ");
			double horasTrabalhadas = sc.nextDouble();
			double remuneracao = valorHora * horasTrabalhadas;
			//double valorMes = valorHora * 220;
			//Considerando o artigo 58 da CLT (Consolidação das Leis Trabalhistas)
		System.out.println("A sua remuneração mensal é de: " + remuneracao);
	
			
			
		//Exercício 9
					
		System.out.println ("Digite o valor da temperatura em Farenheit (F) para que possa ser convertido em Celsius (C): ");
		double temperaturaF = sc.nextDouble();
		double temperaturaC = (5* (temperaturaF - 32) / 9);
		System.out.println(" A temperatura em Celsus (C) é: " + temperaturaC) ; 
		
		
		
		//Exericício 10
		
		System.out.println ("Digite o valor da temperatura em Celsius (C) para que possa ser convertido em Farenheit: ");
		double temperaturaC = sc.nextDouble();
		double temperaturaF = (temperaturaC * 1.8 + 32);
		System.out.println(" A temperatura em Celsus (C) é: " + temperaturaF) ;
		
		
	  //Exercício 11
		
		System.out.println("Digite dois numeros inteiros e um real: ");
		int inteiro1 = sc.nextInt();
		int inteiro2 = sc.nextInt();
		double real = sc.nextDouble();
		
		double resultadoA = ( (inteiro1 * 2 ) * (inteiro2 / 2));
		double resultadoB = ( (inteiro1 * 3) + real);
		double resultadoC = Math.pow(real, 3);
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB);
		System.out.println("O terceiro elevado ao cubo: " + resultadoC); 
		
		
		
		//Exercício 12
		
		
			System.out.println ("Digite sua altura para que possa ser exibido o seu peso ideal: ");
			
			double altura = sc.nextDouble();
			double pesoIdeal = ((72.7 * altura) - 58);
			
			System.out.println("Seu peso ideal é: " + pesoIdeal) ; 
		
		//Exercício 13
		
	
		System.out.println("Programa de calculo de salário liquido apartir de horas trabalhadas no mês.");
		System.out.println("Digite quanto você ganha por hora: ");
			double valorHora = sc.nextDouble();
		System.out.println("Digite o total de horas trabalhadas no referido mês: ");
			
			double horasTrabalhadas = sc.nextDouble();
			double remuneracao = valorHora * horasTrabalhadas;
			double iR = (remuneracao * 0.11); //11%
			double inss = (remuneracao * 0.08); //8%
			double sindicato = (remuneracao * 0.05); //5%
			double salarioLiquido = (remuneracao - iR - inss - sindicato);
			
		System.out.println("Salario Bruto: " + remuneracao);	
		System.out.println("Foi descontado do INSS (8%): " + inss);
		System.out.println("Foi pago ao Sindicato (5%): " + sindicato);
		System.out.println("Foi descontado do IR (11%): " +iR);
		System.out.println("Seu salario liquido é de: " + salarioLiquido); */
		
		
		//Exercicio 14
		
		System.out.println("Calculando tempo de Download: ");
		System.out.println(" Digite o tamanho do Arquivo(MB): ");
			double tamanhoArquivoMB = sc.nextDouble();
			
		System.out.println("Digite a velocidade da Internet (Mbps: ");
			double velocidadeInternet= sc.nextDouble();
			double tamanhoArquivoMb = (tamanhoArquivoMB / 8);
			double tempoDownloadSegundos = (velocidadeInternet * tamanhoArquivoMb);
			double tempoDownloadMinutos = (tempoDownloadSegundos / 60 );
			
			System.out.println(" Seu arquivo em " + tempoDownloadMinutos);

			
			
			
			
	}
		
		
}
