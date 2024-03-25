package aulas;

import java.util.Scanner;

public class ComandosDecisão {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Atividade 13
		
		
		int num1;
					
		System.out.println("Digite o primeiro numero");
		num1 = sc.nextInt();
	
		
		
		if (num1 >0) {
		} else if (num1 >0) {
			System.out.println("È um numero positivo");
		} else if (num1 < 0) {
			System.out.println("È um numero negativo");
		}

			sc.close();
			
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

			
			//Atividade 15
			

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
			
			
			//Atvidade 16		
			
			System.out.println("Qual seu numero de usario ? ");
			var num = sc.nextInt();
			if ( num % 2 == 0) {
			 System.out.print( num + " é um numero par");
			} else {
			System.out.print(num + "é um numero impar");
			}
			sc.close();
			
			
			
			//Atividade 17
			
			System.out.println("Digite a letra de seu gênero (M masculino F feminino)");
			char sexo = sc.next().charAt(0);
			
			if (sexo == 'M' || sexo == 'm' ) {
				System.out.println("Seja bem-vindo, Senhor");
			} else if (sexo == 'F' || sexo =='f' ) {
				System.out.println("Seja bem-vindo, Senhora");
			} else {
				System.out.println("Seja bem-vindo, Amigue");
			}
			
			sc.close();
			
			
			//Atvidade 18
			
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
			
			
			//Atividade 19
			
			System.out.println("Digite um numero");
			int nume = sc.nextInt();

			if (nume % 5 == 0) {
			System.out.println(nume + " é  de 5");
			} else {
			 System.out.println(nume + "não é multiplo de 5"); 
			}
			sc.close();
			
			
			//Atividade 20
			
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
			
			//Ativade 21
			
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
					
		//Atividade 22	
		
			System.out.println("Digite um numero de 1 a 7");
			int dia = sc.nextInt();
				
			String nomeDoDia;
			
			switch (dia) {
			case 1:
				nomeDoDia = "Domingo";
				break;
			}
			switch (dia) {
			case 2:
				nomeDoDia = "Segunda-feira";
				break;
			}
			switch (dia) {
			case 3:
				nomeDoDia = "Terça-feira";
				break;
			}
			switch (dia) {
			case 4:
				nomeDoDia = "Quarta-feira";
				break;
			}
			switch (dia) {
			case 5:
				nomeDoDia = "Quinta-feira";
				break;
			}
			switch (dia) {
			case 6:
				nomeDoDia = "Sexta-feira";
				break;
			}
			switch (dia) {
			case 7:
				nomeDoDia = "Sabado";
				break;
				default:
				nomeDoDia="numero invalido por favor digite um numero entre 1 a 7";
			}
			 System.out.println("O dia corresponde ao número" + dia + "é" + nomeDoDia );
			

			sc.close();
			
		
		
		//Atividade 23
		
		System.out.println("Digite o primeiro número: ");
		double numero1= sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2= sc.nextDouble();
		
		System.out.println("Escolha uma opção");
		System.out.println("1)Somar os números");
		System.out.println("2)Subtrair os números");
		System.out.println("3)Multiplicar os números");
		System.out.println("4)Dividir os números");
		
		int opcao = sc.nextInt();
		double resultado = 0;
		
		switch(opcao) {
		case 1:
			resultado = numero1 + numero2;
		}
		switch(opcao) {
		case 2:
			resultado = numero1 - numero2;
		}
		switch(opcao) {
		case 3:
			resultado = numero1 * numero2;
		}
		switch(opcao) {
		case 4:
			resultado = numero1 / numero2;
			if (numero2 !=0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Erro: Divisão por zero.");
				System.exit(0);
			}
			break;
			default:
				System.out.println("Opção inválida");
				System.exit(0);
		}
		
		System.out.println("O resultado da operação é:" + resultado);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
