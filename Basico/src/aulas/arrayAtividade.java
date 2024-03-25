package aulas;

import java.util.Scanner;

public class arrayAtividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		//Atividade teste ==>
				//Crie um array com 10 nomes de pessoas.
				//peça para pessoa digitar um nome, e se o nome estiver na lista,
				//imprima: parabens!! Voce acertou!!
		        //Quantas chances? 3 chances!
		
								
		
		String[]lista = {"alexande", "jonas", "pedro", "gustavo","vinicius", "francisco", "andre", "renato","felipe","kauan"};
		String nomeDigitado;
		int tenta = 3;
		
		
		
		    boolean venceu = false;
			
			
		    while(tenta > 0 && venceu == false) {
		    	System.out.println("Digite um nome: ");
		    	nomeDigitado = teclado.next();
		    	
		    for (int index = 0; index <= lista.length; index++) {
		    	try { 
		    		System.out.println(lista[index]);
		    	}catch(ArrayIndexOutOfBoundsException e){
		    		System.out.println("EI DOIDÂO VAI VER SEU FOR...");
					System.out.println(e);
		    	}
		    	if (nomeDigitado.equals(lista[index]) ) {
		    		System.out.println("PARABENS!!! Você acertou!!");
		    		venceu = true;
		    	}
		     }
		    tenta--;
		    }
		   
		    if (!venceu) {
		    	System.out.println("VOCE È BURRO CARA");
		    }
		    teclado.close();
		
			
			
			
		}

	}


