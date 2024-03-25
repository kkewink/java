package Atividades;

import java.util.Scanner;

public class ativadade14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Atividade 14						

		System.out.println("Por favor digite um valor para X");
		int x = sc.nextInt();

		System.out.println("Por favor digite um valor para Y");
		int y = sc.nextInt();

		if (x == y){
		 System.out.print("x e y são iguais");
		} else {
		       System.out.print("x e y não são iguais"); 
		}
		
		sc.close();


	}

}
