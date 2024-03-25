package Atividades;

import java.util.Scanner;

public class atividade20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura de hoje ?");
		Double temperatura = sc.nextDouble ();
		
		if (temperatura <=18) {
			System.out.println("Até que hoje esta frio");
		} else if (temperatura >= 19 &&temperatura <=23){
			System.out.println("Hoje esta até que um clima agradável");
		} else if (temperatura >= 24 &&temperatura <=35) {
			System.out.println("Puta doido hoje ta calor em");
		} else {
			System.out.println("EITA COMO TA QUENTE DOIDO");
		}
		
		sc.close();

	}

}
