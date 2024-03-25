package Sistema;

import models.tabuleiro;

public class sistemaDoJogo {

	public static void main(String[] args) {
		
		
		tabuleiro tabuleiro0 = new tabuleiro();
		
		do {
			tabuleiro0.montarTabuleiro();
			tabuleiro0.jogada1();
			tabuleiro0.jogada2();
			tabuleiro0.jogada3();
			tabuleiro0.jogada4();
			tabuleiro0.jogada5();
			tabuleiro0.jogada6();
			tabuleiro0.jogada7();
			tabuleiro0.jogada8();
			tabuleiro0.jogada9();
			System.out.println("O JOGO ACABOU DEU VELHA");
			
		}while(true);
	}

}
