package sistema;

import java.util.Scanner;

import models.Usuario;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Usuario[] usuarios = new Usuario[5];

		for (int i = 0; i < usuarios.length; i++) {
			Usuario u = new Usuario("","" ,0, "");
			usuarios[i] = u;
		}

		do {
			int escolha = 0;

			menu();
			escolha = sc.nextInt();

			switch (escolha) {
			case 1: {
				// criar o usario
				System.out.println("Qual o nome?");
				String nome = sc.next();
				System.out.println("Crie uma senha: ");
				String senha = sc.next();
				System.out.println("Qual a idade?");
				int idade = sc.nextInt();
				System.out.println("Qual o CPF?");
				String CPF = sc.next();
				System.out.println("Qual lugar da array você quer?");
				int array = sc.nextInt();

				Usuario u = new Usuario(nome,senha ,idade, CPF);
				usuarios[array] = u;

				continue;
			}
			case 2: {
				// listar os usarios
				for (int i = 0; i < usuarios.length; i++) {
					System.out.println("Nome: " + usuarios[i].getNome());
					System.out.println("Idade: " + usuarios[i].getIdade());
					System.out.println("CPF: " + usuarios[i].getCPF());
					System.out.println(" ");
				}
				continue;
			}
			case 3: {
				// deletar usaurio
				System.out.println("Escolha o número do Usuario que voce quer deletar!");
				System.out.println("##############################################");
				for (int i = 0; i < usuarios.length; i++) {

					if (!(usuarios[i].getNome().equals(""))) {
						System.out.println(i + "Nome: " + usuarios[i].getNome());
						System.out.println(i + "Idade: " + usuarios[i].getIdade());
						System.out.println(i + "CPF: " + usuarios[i].getCPF());
						System.out.println(" ");
					}

					int escolha1 = sc.nextInt();

					usuarios[escolha1].setNome("");
					usuarios[escolha1].setIdade(0);
					usuarios[escolha1].setCPF("");

					System.out.println("############################");
					System.out.println("Usuário deletado com sucesso");
					System.out.println("############################");
				}
				continue;
			}
			case 4: {
				// atualizar
				System.out.println("##############################################");
				System.out.println("Escolha um dos Usuarios para atualizar os dados");
				System.out.println("##############################################");
				System.out.println("Qual usuario voce quer atualziar ?");
				int posicao = sc.nextInt();

				System.out.println("O antigo nome é : " + usuarios[posicao].getNome());
				System.out.println("Qual o novo nome ?: ");
				String nome = sc.next();

				System.out.println(" ");

				System.out.println("A antiga idade é : " + usuarios[posicao].getIdade());
				System.out.println("Qual a nova idade ?: ");
				int idade = sc.nextInt();
				usuarios[posicao].setIdade(idade);

				System.out.println("");

				System.out.println("O antigo CPF é : " + usuarios[posicao].getCPF());
				System.out.println("Qual o novo CPF ?: ");
				String cpf = sc.next();
				usuarios[posicao].setCPF(cpf);

				System.out.println("");
				continue;

			}
			case 5: {
				boolean acesso = false;
				boolean acessoSenha = false;
				do {
					String nomes = ("");
					String senha = ("");

					System.out.println("login: ");
					String DigitaLogin = sc.next();
					System.out.println("Senha: ");
					String DigitaSenha = sc.next();


					for (int i = 0; i < usuarios.length; i++) {
						DigitaLogin = usuarios[i].getNome();
						senha = usuarios[i].getSenha("");
						System.out.println(usuarios[i].getCPF());
						
					}

					if (nomes.equalsIgnoreCase(DigitaLogin) || DigitaSenha.equalsIgnoreCase(senha)) {
						// System.out.println("Login feito com sucesso " + Login);
						acesso = true;
						acessoSenha = true;
					} else {
						System.out.println("Seu login deu errado");
					}
					

				} while (acesso == false);

				System.out.println("Acesso Liberado");

				continue;

			}
			case 9: {
				// sair do sistema
				System.exit(0);
			}
			default:
			}

		} while (true);
	}

	static public void menu() {
		System.out.println(" ");
		System.out.println("Bem Vindo ao Sistema - Gerenciamento de Usuários ");
		System.out.println(" ");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Usuário");
		System.out.println("2 - Lista de Usuários");
		System.out.println("3 - Deletar Usuários");
		System.out.println("4 - Atualizar Usuários");
		System.out.println("5 - Login");
		System.out.println("9 - Sair do Sistema");
		System.out.println("------------------------------------");
		System.out.println(" ");
	}

}
