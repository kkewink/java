package aulas;

import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {		
		//habilidar a leitura de dados do teclado
		Scanner sc = new Scanner(System.in);
		
		//declarar um inteiro
		int idade;
		int anoNascimento;	
		//Declarar um String		 
		 String nomeCliente;
		//Declarar um double
		double salarioMensal;
		double salarioAnual;
		
		
		/*Criar um programa que solicita o nome , ano de nascimento e salario de uma pessoa e mostra a iadade o salario atual.
		 * 
		 * 
		 * Eu calculo a idade subtranido o ano atual pelo ano de nascimento 
		 * e o salario anual é o mensal vezes 12
		 */
		System.out.println("Qual o seu nome?");
		nomeCliente = sc.next();//ler string
		System.out.println("Em que ano você nasceu?");
		anoNascimento = sc.nextInt();//ler numeros
		System.out.println("Qual o seu salário mensal?");
		salarioMensal = sc.nextDouble();// ler numeros quebrados
		//Faço os calculos
		idade = 2023 - anoNascimento;
		salarioAnual = salarioMensal * 12;		
		//Mostre o resultado
		System.out.print("Ola ");
		System.out.println(nomeCliente);		
		System.out.print("Seu salário anual é: R$");		
		System.out.println(salarioAnual);
		System.out.print("Muito bom pra quem tem ");
		System.out.println(idade);
		System.out.print("anos!");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
