package aulas;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Uma escola solicitou que voce crie um programa para calcular as médias.
		 * O usario deve digitar 3 notas. OBS: Esses notas tem que ser menor ou igual a 10!
		 * Ao final, mostrar a media do e o seguinte texto:
		 * 
		 * < 5 -> REPORVADO
		 * >=5 -> APROVADO
		 * >=8 -> PARABENS 
		 * */
						
		

		int media1;
		int media2;
		int media3;
		int nota1;

		int boletim;
		
		// media = 5 / 3 
		
		System.out.println("Qual o seu nome?");
		String name = sc.next();
		System.out.println("Qual foi sua nota na Prova ?");
		media1 = sc.nextInt();
		if (media1 >10 ) {
			System.out.println("Você errou ao digitar a nota");
			System.exit(media1);
		}
		System.out.println("Qual foi sua nota no Trabalho ?");
		media2 = sc.nextInt();
		if (media2 >10 ) {
			System.out.println("Você errou ao digitar a nota");
			System.exit(media2);
		}
		System.out.println("Qual foi sua nota na Atividade ?");
		media3 = sc.nextInt();
		if (media3 >10 ) {
			System.out.println("Você errou ao digitar a nota");
			System.exit(media3);
		}
		
		nota1 = media1 + media2 + media3;
		boletim = nota1 / 3;
		
		System.out.print("Esse e o total somando as notas ");
		System.out.println(nota1);
		
		if(boletim >= 10) {				
			   System.out.println("PARABENS");
			} else if (boletim < 5) {
				System.out.println("REPROVADO");
			} else if (boletim >= 5) {
				System.out.println("APROVADO");
			}else if (boletim >= 8) {
				System.out.println("PARABENS");
			}
			
			System.out.print("Esse é seu boletim ");
		    System.out.println(boletim);
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
