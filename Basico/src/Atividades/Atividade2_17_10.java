package Atividades;

import java.util.Scanner;

public class Atividade2_17_10 {

	public static void main(String[] args) {
		//2.     Faça um programa que dada a idade de um jogador
		//classifique-o em uma das seguintes categorias: 
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		System.out.println("Por favor digite sua idade antes que possa jogar: ");
		 idade = teclado.nextInt();
		 
		 String categoria;
		 
	if(idade >= 5 && idade <= 7) {				
	   categoria = "Infantil A";
	} else if (idade >= 8 && idade <= 11) {
		categoria = "Infantil B";
	} else if (idade >= 12 && idade <= 13) {
		categoria = "Juvenil A";
	}else if (idade >= 14 && idade <= 17) {
		categoria = "Juvenil B";
	}else{
		categoria = "Adultos";
	}
	
	System.out.print("O jogador esta na categoria: " + categoria);
	
	}

}
