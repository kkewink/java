package Atividades;

import java.util.Scanner;

public class ativadade22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero de 1 a 7");
		int dia = sc.nextInt();
			
		String nomeDoDia;
		
		switch (dia) {
		case 1:
			nomeDoDia = "Domingo";
			break;
		}
		switch (dia) {
		case 2:
			nomeDoDia = "Segunda-feira";
			break;
		}
		switch (dia) {
		case 3:
			nomeDoDia = "Terça-feira";
			break;
		}
		switch (dia) {
		case 4:
			nomeDoDia = "Quarta-feira";
			break;
		}
		switch (dia) {
		case 5:
			nomeDoDia = "Quinta-feira";
			break;
		}
		switch (dia) {
		case 6:
			nomeDoDia = "Sexta-feira";
			break;
		}
		switch (dia) {
		case 7:
			nomeDoDia = "Sabado";
			break;
			default:
			nomeDoDia="numero invalido por favor digite um numero entre 1 a 7";
		}
		 System.out.println("O dia corresponde ao número" + dia + "é" + nomeDoDia );
		

		sc.close();
		
		
		
	}

}
