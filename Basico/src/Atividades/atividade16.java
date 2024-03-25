package Atividades;

import java.util.Scanner;

public class atividade16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu numero de usario ? ");
		var num = sc.nextInt();
		if ( num % 2 == 0) {
		 System.out.print( num + " é um numero par");
		} else {
		System.out.print(num + "é um numero impar");
		}
		sc.close();
		
		
		
		

	}

}
