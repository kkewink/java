package aulas;

import java.util.Scanner;

public class funçoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Mensagem.........");

		int result = square(11);
		
		System.out.println(result);
		
		System.out.println(sumName("Samuel","Santos"));
		
		mensagem("Let´s party!!!");
		
		
		int resultado = maluca(5,6);
		
		int resulta = maluca(10,87);
		
		
		
		
	}
	
	static int square(int x) {
		return x * x;
	}
	
	static String sumName(String name1, String name2) {
		return name1 + " " + name2;
	}
	
	static void mensagem(String msg) {
		System.out.println(msg);
	}
//return a minha RETORNA um valor ... que eu - todo poderoso progamer decido!!!
	static int maluca(int num1, int num2) {
		int num3 = 123;
		int num = 345;
		return num1 + num2 + num + num3;
	}
}
