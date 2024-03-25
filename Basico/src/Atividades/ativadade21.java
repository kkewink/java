package Atividades;

import java.util.Scanner;

public class ativadade21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o salário: R$ ");
		double salario = sc.nextDouble();

		double salarioMinimo = 645.00; 

		if(salario <= salarioMinimo){
			System.out.println("Até 1 salário mínimo.");
		} else if (salario > salarioMinimo && salario <= 3 * salarioMinimo) {
			System.out.println("Até 3 salários mínimos.");
		} else if (salario > 3 * salarioMinimo && salario <= 5 * salarioMinimo) {
			 System.out.println("Até 5 salários mínimos.");
		 } else {
			 System.out.println("Acima de 5 salários mínimos.");
		 }
		
		sc.close(); 
		
	}

}
