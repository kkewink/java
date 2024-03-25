package aulas;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Média aritmética");
		
		int num1, num2, num3;
		num1 = 7;
		num2 = 8;
	    num3 = 9;		
	    int media = num2 + num3 +num1;
	    int valores	= 3;
	    		
	    System.out.println(media);		
		
		int resultado = (media / valores);
		System.out.print("Resultado da Média = ");
		System.out.println(resultado);
		
		
		
				
		System.out.println("Segunda Média");
		
		int num4, num5, num6;
		num4 = 4;
		num5 = 5;
		num6 = 6;
		int mediana = num4 + num5 + num6;
		int val = 3;
		
		System.out.println(mediana);
		
		int total = (mediana / val);
		System.out.print("Resultado da Média = ");
		System.out.println(total);
		
		

		System.out.println("Digite o valor das Médianas");		
		Scanner teclado = new Scanner(System.in);
		int Médianas = teclado.nextInt();
		
		System.out.println("Digite os Valores da conta"); 
		int Valores= teclado.nextInt();
		
		
		int tudo = Médianas / Valores;
		
		System.out.println("Divisão das Médias= ");
		System.out.println(tudo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
