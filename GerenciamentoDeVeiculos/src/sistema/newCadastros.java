package sistema;

import java.util.Scanner;

import cadastrar.CadastrarCarro;
import cadastrar.CadastrarMoto;

public class newCadastros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastrarCarro cadastrarCarro = new CadastrarCarro();
		CadastrarMoto cadastrarMoto = new CadastrarMoto();

		do {
			menu();
			int escolha = 0;

			switch (escolha) {

			case 1: {

				cadastrarCarro.newCadastrarCarro();
				continue;
			}
			case 2: {

				cadastrarMoto.newCadastrarMoto();
				continue;
			}

			case 3: {

				System.out.println("-----------------------------------------------");
				System.out.println("Lista dos Veiculos Cadastrados");

				cadastrarCarro.exibirCarro();
				cadastrarMoto.exibirMoto();

				System.out.println("-----------------------------------------------");
				continue;

			}

			case 9: {
				System.exit(0);
			}

			}

		} while (true);

	}

	static public void menu() {
		System.out.println(" ");
		System.out.println(" Bem vindo ao Sistema de Cadastro de Veiculos ");
		System.out.println(" ");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar um Carro");
		System.out.println("2 - Cadastrar uma Moto");
		System.out.println("3 - Listar os Veiculos");
		System.out.println("9 - Sair do Sistema");
		System.out.println("------------------------------------");
		System.out.println(" ");
	}

}
