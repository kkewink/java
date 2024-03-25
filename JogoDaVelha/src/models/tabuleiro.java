package models;

import java.util.Scanner;

public class tabuleiro {

	private String tabuleiro[][] = new String[3][3];

	Scanner teclado = new Scanner(System.in);

	public void montarTabuleiro() {
		System.out.println("-------------------------------");
		System.out.println(" BEM-VINDO AO JOGO DA VELHA");
		System.out.println("          EM JAVA          ");

		System.out.println("       " + "   0  1  2");
		for (int l = 0; l < this.tabuleiro.length; l++) {
			System.out.print("       " + l + " ");
			for (int c = 0; c < this.tabuleiro[l].length; c++) {
				this.tabuleiro[l][c] = "|_|";
				System.out.print(this.tabuleiro[l][c]);
			}
			System.out.println("");

		}
		System.out.println("-------------------------------");
	}

	public void mostrarTabuleiro() {
		System.out.println("       " + "   0  1  2");
		for (int l = 0; l < this.tabuleiro.length; l++) {
			System.out.print("       " + l + " ");
			for (int c = 0; c < this.tabuleiro[l].length; c++) {
				System.out.print(this.tabuleiro[l][c]);
			}
			System.out.println("");
		}
	}
	
	public void limpeza() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public void verificarJogada() {
			 
			// LINHA
	 
			if (this.tabuleiro[0][0] == "|X|" && this.tabuleiro[0][1] == "|X|" && this.tabuleiro[0][2] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
			if (this.tabuleiro[1][0] == "|X|" && this.tabuleiro[1][1] == "|X|" && this.tabuleiro[1][2] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
			if (this.tabuleiro[2][0] == "|X|" && this.tabuleiro[2][1] == "|X|" && this.tabuleiro[2][2] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			// COLUNA
	 
			if (this.tabuleiro[0][0] == "|X|" && this.tabuleiro[1][0] == "|X|" && this.tabuleiro[2][0] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][1] == "|X|" && this.tabuleiro[1][1] == "|X|" && this.tabuleiro[2][1] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][2] == "|X|" && this.tabuleiro[1][2] == "|X|]" && this.tabuleiro[2][2] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			// DIAGONAL
	 
			if (this.tabuleiro[0][0] == "|X|" && this.tabuleiro[1][1] == "|X|" && this.tabuleiro[2][2] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][2] == "|X|" && this.tabuleiro[1][1] == "|X|" && this.tabuleiro[2][0] == "|X|") {
				System.out.println("X GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			// LINHA
	 
			if (this.tabuleiro[0][0] == "|O|" && this.tabuleiro[0][1] == "|O|" && this.tabuleiro[0][2] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
			if (this.tabuleiro[1][0] == "|O|" && this.tabuleiro[1][1] == "|O|" && this.tabuleiro[1][2] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
			if (this.tabuleiro[2][0] == "|O|" && this.tabuleiro[2][1] == "|O|" && this.tabuleiro[2][2] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			// COLUNA
	 
			if (this.tabuleiro[0][0] == "|O|" && this.tabuleiro[1][0] == "|O|" && this.tabuleiro[2][0] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][1] == "|O|" && this.tabuleiro[1][1] == "|O|" && this.tabuleiro[2][1] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][2] == "|O|" && this.tabuleiro[1][2] == "|O|" && this.tabuleiro[2][2] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			// DIAGONAL
	 
			if (this.tabuleiro[0][0] == "|O|" && this.tabuleiro[1][1] == "|O|" && this.tabuleiro[2][2] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
			if (this.tabuleiro[0][2] == "|O|" && this.tabuleiro[1][1] == "|O|" && this.tabuleiro[2][0] == "|O|") {
				System.out.println("BOLINHA GANHOU");
				System.out.println("");
				montarTabuleiro();
				teclado.nextLine();
				limpeza();
			}
	 
		
		

	}

	public void jogada1() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|X|";
				mostrarTabuleiro();
				verificarJogada(); 

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}

	public void jogada2() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|O|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada3() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|X|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada4() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|O|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada5() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|X|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada6() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|O|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}

	public void jogada7() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|X|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada8() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|O|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}
	
	public void jogada9() {
		boolean verificar = false;

		while (verificar == false) {
			
			boolean verificarLinha = false;
			boolean verificarColuna = false;
			int linha = 0;
			int coluna = 0;
			while (verificarLinha == false) {
				System.out.println("escolha uma linha entre 0 e 2");
				try {
					linha = teclado.nextInt();
					if (linha > 2 || linha < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarLinha = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			while (verificarColuna == false) {
				System.out.println("escolha uma coluna entre 0 e 2");
				try {
					coluna = teclado.nextInt();
					if (coluna > 2 || coluna < 0) {
						System.err.println("ERRO DIGITE NOVAMENTE");
					} else {
						verificarColuna = true;
					}
				} catch (Exception e) {
					System.out.println("DIGITE APENAS VALOR NUMERICO");
					teclado.nextLine();
				}

			}

			if (this.tabuleiro[linha][coluna] == null || this.tabuleiro[linha][coluna].equals("|_|")) {
				this.tabuleiro[linha][coluna] = "|X|";
				mostrarTabuleiro();
				verificarJogada(); // MONTAR DEPOIS

				verificar = true;
			} else {
				System.out.println("ESPAÇO JA OCUPADO");
				
				teclado.nextLine();
			}

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
