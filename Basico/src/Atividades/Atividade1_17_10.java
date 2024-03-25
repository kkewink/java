package Atividades;

import java.util.Scanner;

public class Atividade1_17_10 {

	public static void main(String[] args) {
		//1.     Escreva um programa que, com base em uma temperatura em graus celsius
		//a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:  
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quantos graus esta fazendo agora?: ");
		double Graus = teclado.nextDouble();
		
	    double K = Graus + 273.15;
		System.out.println("Vendo pelo lado de Kelvin(K) esta fazendo " + K);
		
		double Re = Graus * 0.8;
		System.out.println("Vendo pelo lado de Réuamur(Re) esta fazendo " + Re);
		
		double Ra = Graus * 1.8 + 32 + 459.67;
		System.out.println("Vendo pelo lado de  Ra(Rankine) esta fazendo " + Ra);
		
		double F = Graus * 1.8 + 32;
		System.out.println("Vendo pelo lado de Fahrenheit(F) esta fazendo " + F);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
