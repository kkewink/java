package cadastrados;

import java.util.ArrayList;
import java.util.Scanner;

import models.Produto;

public class CadastrarProduto {

	static ArrayList<Produto> produtos = new ArrayList<Produto>();

	static Scanner teclado = new Scanner(System.in);

	public static void newCadastrarProduto() {

		String nome = "";
		String descricao = "";
		int codigo = 0;
		int quantidade = 0;
		double preco = 0;

		System.out.println("-----------------------------------------------");
		System.out.println("Cadastro do Produto");

		boolean nomeErro = false;
		while (nomeErro == false) {
			System.out.println("Digite o Nome do Produto: ");
			try {
				nome = teclado.nextLine();
				if (nome.length() == 0) {
					System.out.println("------NÂO DEIXEI EM BRANCO------");
				} else {

					nomeErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean descricaoErro = false;
		while (descricaoErro == false) {
			System.out.println("Digite a Descrição do Produto: ");
			try {
				descricao = teclado.nextLine();
				if (descricao.length() == 0) {
					System.out.println("------NÂO DEIXEI EM BRANCO------");
				} else {

					descricaoErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean codigoErro = false;
		while (codigoErro == false) {
			System.out.println("Digite o codigo de barra do Produto: ");

			try {
				codigo = teclado.nextInt();
				if (codigo < 0) {
					System.out.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					codigoErro = true;
				}
			} catch (Exception e) {
				System.out.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		boolean quantidadeErro = false;
		while (quantidadeErro == false) {
			System.out.println("Digite quantos Produtos ira comprar: ");

			try {
				quantidade = teclado.nextInt();
				if (quantidade < 0) {
					System.out.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					quantidadeErro = true;
				}
			} catch (Exception e) {
				System.out.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		boolean precoErro = false;
		while (precoErro == false) {
			System.out.println("Digite o valor deste Produto: ");

			try {
				preco = teclado.nextDouble();
				if (preco < 0) {
					System.out.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					precoErro = true;
				}
			} catch (Exception e) {
				System.out.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		Produto p = new Produto(nome, descricao, codigo, quantidade, preco);
		produtos.add(p);

		System.out.println(" NOVO PRODUTO CADASTRADO COM SUCESSO!!!!");
		System.out.println("-----------------------------------------------");

	}

	public void exibirProduto() {
		produtos.forEach(produtoCadastrado -> {
			produtoCadastrado.exibirInfo();
		});
	}

}
