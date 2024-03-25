package aulas;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
		 * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
		 * 
		 */
		
		System.out.println("Digite o valor do Salario minimo");
		Scanner teclado = new Scanner(System.in); 
		int  SalarioMinimo = teclado.nextInt();
		
		System.out.println("Digite o Seu Salario"); 
		int SalarioUser= teclado.nextInt();
				
		int resultado = SalarioUser / SalarioMinimo;
		
		System.out.print("Voce ganha --> ");
		System.out.print(resultado);
		System.out.print(" Salarios... ");
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
