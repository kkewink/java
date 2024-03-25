package SEMESTRE2;

import java.util.Scanner;

public class Revisão_25_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		//Crie um algoritmo que receba temperatura em graus Celsius, converta para Fahrenheit e Kelvin.
	/*	
		
		System.out.println("Quantos graus está fazendo agora? ");
		double Graus = teclado.nextDouble();
		
		System.out.println("Então está " + Graus + "Celsius(C)");
		
		double F = Graus * 1.8 + 32;
		System.out.println("Em Fahrenheit(F) está: " + F);
		
		
		double K = Graus + 273.15;
		System.out.println("Em Kelvin(K) está: " + K);
	*/	
		
		
		//Crie um algoritmo que conversor de moedas que receba em Real, converta para Dolar e Euro
	
		/*
		System.out.println("Digite um valor em Reais");
		double Reais = teclado.nextDouble();
		
		double Dolar = Reais * 4.93;
		System.out.printf("Valor em Dolar: %.2f %n" , Dolar);
		
		
		double Euro = Reais * 5.34;
		System.out.println("Valor em Euros: " + Euro);
		
		*/
		
		//Crie um algoritmo que verifica se um bumero é primo ou não
		
		/*
		System.out.println("Digite um numero: ");
	
		*/
		
		//Crie um algoritmo que calcula o IMC
		
		System.out.println("Digite seu peso: ");
		double peso = teclado.nextDouble();
		
		System.out.println("Digite sua altura");
		double altura = teclado.nextDouble();
		
		double imc = IMC(peso, altura);
		
		System.out.println("Seu Resultado do IMC " + Classificação(imc));
		
	}
	
	public static double IMC(double peso, double altura) {
		return peso / (altura * altura);
	}
	public static String Classificação(double imc) {
		if (imc < 18.5) {
			return ("abaixo do peso");
		}else if(imc < 24.9 ) {
			return ("Peso ideal (parabéns)");
		}else if (imc < 29.9) {
			return ("Levemente acima do peso");
		}else if (imc < 34.9) {
			return ("Obesidade grau I");
		}else if (imc < 39.9) {
			return ("Obesidade grau II (severa)");
		}else if (imc < 40) {
			return ("Obesidade III (mórbida)");
		}
		return null;
	}
}
