package Atividades;

import java.util.Scanner;

public class Atividade3_17_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int multiplo = 0;
		int par = 0;
		
		
		System.out.println("Por favor digite um numero: ");
		 valor = teclado.nextInt();
			
		 int limite = valor + 60;
		 
			for(int i = valor ; i < limite; i++ ) {
				if (i % 2 == 0) {
					par ++;
				} if (i % 4 == 0) {
					 multiplo ++;
				}
				System.out.println("Os números pares de 4 são " + i);
				System.out.println("Os números multiplos de 4 " + i);			 
			}
					
			
	}

}
