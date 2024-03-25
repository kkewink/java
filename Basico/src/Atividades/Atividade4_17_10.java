package Atividades;

import java.util.Scanner;

public class Atividade4_17_10 {

	public static void main(String[] args) {
		//4.     Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres
		// existente entre eles, caso usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir mensagem de erro. 	
	    //Exemplo:  
		//Digite 2 caracteres: j t O número de caracteres entre eles é: 9 
		//Digite 2 caracteres: Erro na sequência alfabética.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra de (A-Z)");
		char char1 = teclado.next().charAt(0);
		System.out.println("Digite uma letra de (A-Z)");
		char char2 = teclado.next().charAt(0);
		
		if(char1 < 'A' || char1 > 'Z' || char2 < 'A' || char2 > 'Z') {
			System.out.println("Não esta entre A e Z");
		} else if (char1 >= char2 ) {
			System.out.println("Não esta na sequência alfabetica");
		} else {
			int numLetra = char2 - char1 - 1;
			System.out.println("Não esta na sequência alfabetica");
		}

	}

}
