package aulas;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Como calcucular Salario Proporcional
		
		int salarioAtual;
		int diasMês;
		String nomeCliente;
		int diasTrabalhados;
		int quantoGanhou;
		double salarioProporcional;
		
		System.out.println("Qual o seu nome?");
		nomeCliente = sc.next();
		System.out.println("Qual é seu salario ?");
		salarioAtual = sc.nextInt();
		System.out.println("Quantos dias tem o mês ?");
		diasMês = sc.nextInt();
		System.out.println("Quantos dias você trabalhou ?");
		diasTrabalhados = sc.nextInt();
		
		 quantoGanhou = salarioAtual / diasMês;
		 
		 salarioProporcional = quantoGanhou * diasTrabalhados;
		 System.out.print("Ola ");
			System.out.println(nomeCliente);
		System.out.print("A cada dia você ganhara R$");
		System.out.println(quantoGanhou);
		System.out.print("Seu Salario Proporcional sera de R$");
		System.out.println(salarioProporcional);
						
		
		
		//Como Calcular as ferias
		
		 // seu salrio do trabalho
		 //dias trabalhados
		
		 // quantos ganhour por dias
		int ferias; //quantos dias de ferias
		int salarioFerias; //quanto ganha durante as ferias
		int férias;
		double total;
		
		System.out.println("Agora sobre suas ferias quantos dias são ?");
		ferias = sc.nextInt();
		
		quantoGanhou = salarioAtual / diasMês;

		salarioFerias = quantoGanhou / ferias;
		
		férias = salarioFerias / 3;
		
		total = salarioFerias + férias;
		
		System.out.print("Seu salario durante as ferias sera de ");
		System.out.println(salarioFerias);
		System.out.print("Quanto ganha do 1/3 de férias ");
		System.out.println(férias);
		System.out.print("O total a ganhar durante as ferias R$");
		System.out.println(total);
		
		sc.close();
	}

}
