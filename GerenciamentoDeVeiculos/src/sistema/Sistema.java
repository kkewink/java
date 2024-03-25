package sistema;

import models.Moto;

import java.util.ArrayList;
import java.util.Scanner;

import models.Carro;
import models.Veiculo;

public class Sistema {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Carro carroT = new Carro("toyo", "Volkswagen", 4, "Comun");

		Moto motoT = new Moto("2847", "Volkswagen", true);

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		Veiculo[] veiculo = new Veiculo[5];
		for (int i = 0; i < veiculo.length; i++) {
			Veiculo v = new Veiculo("", "");
			veiculo[i] = v;
		}
		
		String modelo = "";
		String marca = "";
		int portas = 0;
		String tipoCom = "";
		boolean bateria = false;

		do {

			menu();
			int escolha = teclado.nextInt();

			switch (escolha) {
			case 1: {
				System.out.println("-----------------------------------------------");
				System.out.println("Cadastro do Carro");
				
				boolean modeloErro = false;
				while(modeloErro == false) {
					System.out.println("Digite o Modelo do Carro: ");
					try {
						 modelo = teclado.nextLine();
						 if(modelo.length() == 0) {
							 System.out.println("------NÂO DEIXEI EM BRANCO------");
						 }else {
						 
						 	modeloErro = true;
						 }
					} catch (Exception e) {
												
					}
					
				}
	
				boolean marcaErro = false;
				while(marcaErro == false) {
					System.out.println("Digite a Marca do Carro: ");
					
					try {
						 marca = teclado.nextLine();
						 if(marca.length() == 0) {
							 System.out.println("------NÂO DEIXEI EM BRANCO------");
						 }else {
						 
						 	marcaErro = true;
						 }
					} catch (Exception e) {
						
					}
					
				}
				
				boolean portasErro = false;
				while(portasErro == false) {
					System.out.println("Digite o Numero de Portas: ");
					
					try {
						portas = teclado.nextInt();
						if (portas < 0) {
							System.out.println("-------DIGITE UM VALOR POSITIVO-----");
						}else {
							portasErro = true;
						}
					} catch (Exception e) {
						System.out.println("-------DIGITE APENAS NUMEROS------");
					}
					teclado.nextLine();
				}
				
				 boolean tipoErro = false;
				 while(tipoErro == false) {
					 System.out.println("Digite o Tipo do Combustivel: ");
					 
					 try {
						 tipoCom = teclado.next();
						 if(tipoCom.length() == 0) {
							 System.out.println("------NÂO DEIXEI EM BRANCO------");
						 }else {
						 
						 	tipoErro = true;
						 }
 
					} catch (Exception e) {
					
					}
					 
				 }
				
				

				Carro carro = new Carro(modelo, marca, portas, tipoCom);
				veiculos.add(carro);

				System.out.println(" NOVO CARRO CADASTRADO COM SUCESSO!!!!");
				System.out.println("-----------------------------------------------");
				continue;
			}
			case 2: {
				System.out.println("-----------------------------------------------");
				System.out.println("Cadastro da Moto");
				
				boolean modeloErro = false;
				while(modeloErro == false) {
					System.out.println("Digite o Modelo da Moto: ");
					try {
						 modelo = teclado.nextLine();
						 if(modelo.length() == 0) {
							 System.out.println("------NÂO DEIXEI EM BRANCO------");
						 }else {
						 
						 	modeloErro = true;
						 }
					} catch (Exception e) {
												
					}
					
				}
	
				boolean marcaErro = false;
				while(marcaErro == false) {
					System.out.println("Digite a Marca da Moto: ");
					
					try {
						 marca = teclado.nextLine();
						 if(marca.length() == 0) {
							 System.out.println("------NÂO DEIXEI EM BRANCO------");
						 }else {
						 
						 	marcaErro = true;
						 }
					} catch (Exception e) {
						
					}
					
				}
				
				boolean bateriaErro = false;
				while(bateriaErro == false) {
					System.out.println("Digite se a moto possui bateria eletrica ou não:");
					System.out.println("----- True = Sim ------ False = Não ------");
					
					try {
						bateria = teclado.nextBoolean();
						bateriaErro = true;
					} catch (Exception e) {
						System.out.println("------DIGITE TRUE OU FALSE------");
						teclado.nextLine();
					}
				}
				
				 

				Moto moto = new Moto(modelo, marca, bateria);
				veiculos.add(moto);

				System.out.println(" NOVA MOTO CADASTRADA COM SUCESSO!!!!");
				System.out.println("-----------------------------------------------");
				continue;
			}

			case 3: {
				System.out.println("-----------------------------------------------");
				System.out.println("Lista dos Veiculos Cadastrados");

				veiculos.forEach(veiculosCadastrados -> {
					veiculosCadastrados.exibirInfo();

				});
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
