package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

import cadastrados.CadastrarAlimento;
import cadastrados.CadastrarEletronico;
import cadastrados.CadastrarProduto;

public class Sistema {

	public static void main(String[] args) {

		
		/*FALTA CRIAR A PARTE NA QUAL CRIA UM ARQUIVO DE TEXTO COM ESSAS INFORMAÇÔES e LocalDate NA DATA DE VALIDADE DA CLASS PRODUTO
		 * ps: FAZER ESTA PARTE COM O JOÂO
		 * */
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);

		CadastrarProduto cadastrarProduto = new CadastrarProduto();
		CadastrarAlimento cadastrarAlimento = new CadastrarAlimento();
		CadastrarEletronico cadastrarEletronico = new CadastrarEletronico();

		do {
			menu();
			int escolha = teclado.nextInt();

			switch (escolha) {

			case 1: {
				CadastrarProduto.newCadastrarProduto();
				continue;
			}
			case 2: {

				CadastrarAlimento.newCadastrarAlimento();
				continue;

			}

			case 3: {
				CadastrarEletronico.newCadastrarEletronico();
				continue;

			}

			case 4: {

				System.out.println("-----------------------------------------------");
				System.out.println("Lista dos Produtos Cadastrados");

				System.out.println("------Produtos Cadastrados------");
				cadastrarProduto.exibirProduto();
				System.out.println("");
				System.out.println("------Alimentos Cadastrados------");
				cadastrarAlimento.exibirAlimento();
				System.out.println("");
				System.out.println("------Eletronicos Cadastrados------");
				cadastrarEletronico.exibirEletronico();

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
		System.out.println(" Bem vindo ao Sistema de Cadastro de Produto ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------");
		System.out.println("1 -     Cadastrar um Novo Produto");
		System.out.println("2 -     Cadastrar um Novo Alimento");
		System.out.println("3 -	Cadastrar um Novo Eletronico");
		System.out.println("4 -     Exibir informações Dos Itens Cadastrados");
		System.out.println("9 -     Sair do Sistema");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
	}

}
