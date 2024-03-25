package aulas;

import java.util.Scanner;

/*
 * 
 * int --> tipo inteiro
 * 
 *//*double -> numero quebrado (com ponto)
 * string -> teia de  caracteres
 */ 



public class Principal {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Teste do Meu Primeiro projeto");


        //Criar variavel num inteiro
        int anoAtual = 2023;
        int anoNascimento= 2005;
       int idade = anoAtual - anoNascimento;



        System.out.println(anoNascimento);
        System.out.println("...");
        System.out.println(idade);
        
        anoAtual = 2027;
        
        idade = anoAtual - anoNascimento;
        
        System.out.println(anoNascimento);
        System.out.println("...");
        System.out.println(idade);
        
        /*
         * Criar uma aplicação que mostre o resto de uma 
         * divisão
         * 
         * 
         * */
        
        //1.Passo? Criar var
        int num1, num2;
        num1 = 7;
        num2 = 2;
       
        try (//2.Inializar Scanner
		Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite o primeiro num: ");
			num1 =teclado.nextInt();
			
			System.out.print("Digite o primeiro num: ");
			num2 =teclado.nextInt();
			
	        //3. Passo/ fazer a operação
            
	        int resultado = num1 % num2;
	        //4. Mostrar na tela
	        
	        System.out.print("O resto -->");
	        System.out.println(resultado);
	        
	        System.out.println(num1 == num2);
	        System.out.println(num1 > num2);
	        System.out.println(num1 < num2);
	        System.out.println(num1 != num2);
	        System.out.println(num1 >= num2);
	        System.out.println(num1 <= num2);
	        
	        if(num1 > num2) {
	        	System.out.println("O número é maior!");
	        } else {
	        	System.out.println("O número 1 é menor...!");
	        }
	        
	        teclado.close();
	        
	        
	        
        }
	        
		
        
        
       
        
        
        
        
                    
        
        
        
        
        
        
        
        
        
        
        
        

        }
        
}

