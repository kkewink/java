package Atividades;

import java.util.Scanner;

public class desafio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Não entedi muito bom como fazer isso mais tentei mesmo assim
		
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
	}

}
