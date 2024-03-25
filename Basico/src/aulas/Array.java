package aulas;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//declarando array em Java (lista) - 1 Passo: criar a array
		
		
		String[] nomes;
		
		System.out.println("Digite um nome: ");
		String nome = teclado.next();
		
		// 2 - Passo: informar o tamanho
		
		nomes = new String[100];
		
		//Outra forma de declarar ja inserindo dados
		
		String[]nomeReal = {"Alexande", "Jonas", "Pedro", "Gustavo","Vinicius", "Francisco", "Andre", "Renato","Felipe","Kauan"};
		
		//Atividade teste ==>
		//Crie um array com 1o nomes de pessoas.
		//peça para pessoa digitar um nome, e se o nome estiver na lista,
		//imprima: parabens!! Voce acertou!!
		
		
		for(int index = 0; index < nomeReal.length; index++) {			
			System.out.println(nomeReal[index]);
		}
		

	}

}
