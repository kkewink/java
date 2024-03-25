package Atividades;

import java.util.Scanner;

public class atividade18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor para X");
		double X2 = sc.nextDouble();
		System.out.println("Digite um valor para Y");
		double Y2 = sc.nextDouble();
		System.out.println("Digite um valor para Z");
		double Z = sc.nextDouble();
		
		if (Z >= X2 && Z<=Y2) {
			System.out.println("Z pertece ao intervalo do X e Y");
		} else  {
			System.out.println("Z não pertece ao intervalo do X e Y");
		}
		
		sc.close();

	}

}
