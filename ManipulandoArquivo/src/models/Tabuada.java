package models;

import java.util.Scanner;

public class Tabuada {
	
	public static void calcularTabuada() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite ate o fato da tabuada");
		int fator = sc.nextInt();
		System.out.println("Digite ate a quatidade de itens a ser calculado");
		int qtd = sc.nextInt();
		
		StringBuilder content = new StringBuilder();
		
		for(int i = 0; i <= qtd; i++) {
			int resultadoFinal = i* fator;
			
			
			
		}
		
	}

}
