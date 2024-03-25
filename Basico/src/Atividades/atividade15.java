package Atividades;

import java.util.Scanner;

public class atividade15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite um valor para X");
		int X = sc.nextInt();

		System.out.println("Por favor digite um valor para Y");
		int Y = sc.nextInt();

		if  (X > Y){
		 System.out.print("X é maior que y");
		} else if (Y > X) {
		          System.out.print("Y é maior que x");
		} else {
		System.out.print("Pelo jeito X e Y são iguais"); 
		}

		sc.close();

	}

}
