package cadastrar;

import java.util.ArrayList;
import java.util.Scanner;

import models.Carro;

public class CadastrarCarro {

	ArrayList<Carro> veiculos = new ArrayList<Carro>();

	Scanner teclado = new Scanner(System.in);

	public void newCadastrarCarro() {

		String modelo = "";
		String marca = "";
		int portas = 0;
		String tipoCom = "";

		System.out.println("-----------------------------------------------");
		System.out.println("Cadastro do Carro");

		boolean modeloErro = false;
		while (modeloErro == false) {
			System.out.println("Digite o Modelo do Carro: ");
			try {
				modelo = teclado.nextLine();
				if (modelo.length() == 0) {
					System.out.println("------NÂO DEIXEI EM BRANCO------");
				} else {

					modeloErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean marcaErro = false;
		while (marcaErro == false) {
			System.out.println("Digite a Marca do Carro: ");

			try {
				marca = teclado.nextLine();
				if (marca.length() == 0) {
					System.out.println("------NÂO DEIXEI EM BRANCO------");
				} else {

					marcaErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean portasErro = false;
		while (portasErro == false) {
			System.out.println("Digite o Numero de Portas: ");

			try {
				portas = teclado.nextInt();
				if (portas < 0) {
					System.out.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					portasErro = true;
				}
			} catch (Exception e) {
				System.out.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		boolean tipoErro = false;
		while (tipoErro == false) {
			System.out.println("Digite o Tipo do Combustivel: ");

			try {
				tipoCom = teclado.next();
				if (tipoCom.length() == 0) {
					System.out.println("------NÂO DEIXEI EM BRANCO------");
				} else {

					tipoErro = true;
				}

			} catch (Exception e) {

			}

		}

		Carro carro = new Carro(modelo, marca, portas, tipoCom);
		veiculos.add(carro);

		System.out.println(" NOVO CARRO CADASTRADO COM SUCESSO!!!!");
		System.out.println("-----------------------------------------------");
		
	}
	public void exibirCarro () {
		veiculos.forEach(carroCadastrado -> {
			carroCadastrado.exibirInfo();
			
		});
	}
}


