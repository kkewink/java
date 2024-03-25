package Atividades;

import java.util.Scanner;

public class atividade19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int nume = sc.nextInt();

		if (nume % 5 == 0) {
		System.out.println(nume + " é  de 5");
		} else {
		 System.out.println(nume + "não é multiplo de 5"); 
		}
		sc.close();

	}

}
