package Atividades;

import java.util.Scanner;

public class atividade23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Atividade 23
		
		System.out.println("Digite o primeiro número: ");
		double numero1= sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2= sc.nextDouble();
		
		System.out.println("Escolha uma opção");
		System.out.println("1)Somar os números");
		System.out.println("2)Subtrair os números");
		System.out.println("3)Multiplicar os números");
		System.out.println("4)Dividir os números");
		
		int opcao = sc.nextInt();
		double resultado = 0;
		
		switch(opcao) {
		case 1:
			resultado = numero1 + numero2;
		}
		switch(opcao) {
		case 2:
			resultado = numero1 - numero2;
		}
		switch(opcao) {
		case 3:
			resultado = numero1 * numero2;
		}
		switch(opcao) {
		case 4:
			resultado = numero1 / numero2;
			if (numero2 !=0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Erro: Divisão por zero.");
				System.exit(0);
			}
			break;
			default:
				System.out.println("Opção inválida");
				System.exit(0);
		}
		
		System.out.println("O resultado da operação é:" + resultado);
		
		sc.close();

	}

}
