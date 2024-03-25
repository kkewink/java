package sistema;

import java.util.ArrayList;
import java.util.Scanner;

import models.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Pessoa[] pessoas = new Pessoa[5];

		for (int i = 0; i < pessoas.length; i++) {
			Pessoa p = new Pessoa("", 0.0, 0, true & false, true & false, true & false, "");
			pessoas[i] = p;
		}

		ArrayList<Pessoa> funcionario = new ArrayList<Pessoa>();

		String nome = "";
		double salarioBruto = 0;
		int numeroDependentes = 0;
		boolean vr = false;
		boolean va = false;
		boolean vt = false;
		String planoDeSaude = "";

		do {
			int escolha = 0;
			menu();
			escolha = teclado.nextInt();

			switch (escolha) {
			case 1: {

				teclado.nextLine();

				// CRIAÇÂO DO NOVO FUNCIONARIO
				boolean nomeErro = false;
				while (nomeErro == false) {
					System.out.println("##########################################");
					// Criar a nova pessoa e adicionar na lista
					System.out.println("Digite seu nome: ");
					nome = teclado.nextLine();
					if (nome.length() == 0) {
						System.out.println("------NÂO DEIXE ESPAÇOS VAZIOS!!!!!------");
					} else {
						nomeErro = true;
					}
				}

				boolean salarioErro = false;
				while (salarioErro == false) {
					System.out.println("Digite seu Salario Bruto: ");
					try {
						salarioBruto = teclado.nextDouble();
						if (salarioBruto < 0) {
							System.out.println("------DIGITE UM VALOR POSITIVO!!!!------");
						} else {
							salarioErro = true;
						}
					} catch (Exception e) {
						System.out.println("-------DIGITE APENAS NUMEROS!!!!------");
					}
					teclado.nextLine();
				}

				boolean depenteErro = false;
				while (depenteErro == false) {
					System.out.println("Digite quantas pessoas depente de você: ");
					try {
						numeroDependentes = teclado.nextInt();
						if (numeroDependentes < 0) {
							System.out.println("------TA DE BRINCADEIRA!!!? DIGITE UM VALOR POSITIVO------");
						} else {
							depenteErro = true;
						}
					} catch (Exception e) {
						System.out.println("------DIGITE APENAS NUMEROS!!!!------");
					}
					teclado.nextLine();
				}

				boolean vrErro = false;
				while (vrErro == false) {
					System.out.println("Possui Vale Refeição?: ");
					System.out.println("-- TRUE = SIM | FALSE = NÂO --");
					try {
						vr = teclado.nextBoolean();
						vrErro = true;
					} catch (Exception e) {
						System.out.println("------DIGITE TRUE OU FALSE------");
						teclado.nextLine();
					}
				}

				boolean vaErro = false;
				while (vaErro == false) {
					System.out.println("Possui Vale Alimentação?: ");
					System.out.println("-- TRUE = SIM | FALSE = NÂO --");
					try {
						va = teclado.nextBoolean();
						vaErro = true;
					} catch (Exception e) {
						System.out.println("------DIGITE TRUE OU FALSE------");
						teclado.nextLine();
					}
				}

				boolean vtErro = false;
				while (vtErro == false) {
					System.out.println("Possui Vale Transporte?: ");
					System.out.println("-- TRUE = SIM | FALSE = NÂO --");
					try {
						vt = teclado.nextBoolean();
						vtErro = true;
					} catch (Exception e) {
						System.out.println("------DIGITE TRUE OU FALSE------");
						teclado.nextLine();
					}
				}

				boolean saudeErro = false;
				while (saudeErro == false) {
					System.out.println("Qual seu tipo de plano de saúde?:");
					System.out.println("-- 1.Basico | 2.Premium | 3.Platinum Premium Plus --");
					planoDeSaude = teclado.next();
					if (planoDeSaude.length() == 0) {
						System.out.println("------NÂO DEIXE EM BRANCO------");
					} else {
						if (planoDeSaude.equalsIgnoreCase("1") || planoDeSaude.equalsIgnoreCase("2")
								|| planoDeSaude.equalsIgnoreCase("3")) {
							saudeErro = true;
						} else {
							System.out.println("------PLANO DE SAUDE NÂO ENCONTRADO------");
						}
					}
				}

				System.out.println("NOVO FUNCIONARIO CRIADO COM SUCESSO");

				System.out.println("##########################################");

				Pessoa p = new Pessoa(nome, salarioBruto, numeroDependentes, vr, va, vt, planoDeSaude);

				funcionario.add(p);

				continue;

			}
			// LISTA DE TODOS OS FUNCIONARIOS JA CRIADOS E REGISTRADOS
			case 2: {
				System.out.println("##########################################");
				funcionario.forEach(pessoasCadastradas -> {
					System.out.println("Funcionario N°: " + funcionario.indexOf(pessoasCadastradas));
					System.out.println("Nome: " + pessoasCadastradas.getNome());
					System.out.println("Salario Bruto: " + pessoasCadastradas.getSalarioBruto());
					System.out.println("Seus Dependentes: " + pessoasCadastradas.getNumeroDependentes());
					System.out.println("Seu VR è de: " + pessoasCadastradas.isVr());
					System.out.println("Seu VA è de: " + pessoasCadastradas.isVa());
					System.out.println("Seu VT è de: " + pessoasCadastradas.isVt());
					System.out.println("Seu plano de Saúde: " + pessoasCadastradas.getPlanoDeSaude());
				});
				System.out.println("##########################################");
				continue;

			}

			// METODO DE EDITAR UM FUNCIONARIO ESPECIFICO
			case 3: {
				int funcionarioModificar = 0;

				System.out.println("##########################################");

				boolean alterarErro = false;
				while (alterarErro == false) {
					System.out.println("Qual Funcionario você deseja modficiar: ");
					try {

						funcionarioModificar = teclado.nextInt();
						try {

							if (funcionarioModificar < 0) {
								System.out.println("------NÂO EXISTE ALGUEM ANTES DO ZERO!!!------");
								continue;
							}

							funcionario.get(funcionarioModificar);

						} catch (Exception e) {
							System.out.println("------FUNCIONARIO NÂO ENCONTRADO------");
							break;
						}
						if (funcionarioModificar < 0) {

							System.out.println("------DIGITE UM VALOR POSITIVO------");
						} else {

							System.out.println("O que voce deseja modficiar ?");
							System.out.println("");
							System.out.println("1 - Nome");
							System.out.println("2 - SalarioBruto");
							System.out.println("3 - Dependentes");
							System.out.println("4 - VR");
							System.out.println("5 - VA");
							System.out.println("6 - VT");
							System.out.println("7 - Plano De Saude");
							System.out.println("8 - Alterar tudo");
							System.out.println("");
							int modificar = teclado.nextInt();

							System.out.println("##########################################");

							switch (modificar) {

							case 1: {
								System.out.println("##########################################");
								teclado.nextLine();

								boolean nomeErroM = false;
								while (nomeErroM == false) {
									System.out.println("Altere o Nome do funcionario: ");
									String modiNome = teclado.nextLine();
									if (modiNome.length() == 0) {
										System.out.println("------NÂO DEIXE ESPAÇOS VAZIOS!!!!!------");
									} else {
										funcionario.get(funcionarioModificar).setNome(modiNome);
										nomeErroM = true;
										alterarErro = true;
									}
								}
								System.out.println("NOME ALTERADO COM SUCESSO!!!");
								System.out.println("##########################################");
								continue;
							}
							case 2: {
								System.out.println("##########################################");
								boolean salarioErroM = false;
								while (salarioErroM == false) {
									System.out.println("Altere o  Salario Bruto do Funcionario: ");
									try {
										double modiSalarioBruto = teclado.nextDouble();
										if (modiSalarioBruto < 0) {
											System.out.println("------DIGITE UM VALOR POSITIVO!!!!------");
										} else {
											funcionario.get(funcionarioModificar).setSalarioBruto(modiSalarioBruto);
											salarioErroM = true;
											alterarErro = true;
										}
									} catch (Exception e) {
										System.out.println("-------DIGITE APENAS NUMEROS!!!!------");
									}
									teclado.nextLine();

								}
								System.out.println("SALARIO ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 3: {
								System.out.println("##########################################");
								boolean dependeErroM = false;
								while (dependeErroM == false) {
									System.out.println("Altere o numero de depedentes do Funcionario");
									try {
										int modiNumeroD = teclado.nextInt();
										if (modiNumeroD < 0) {
											System.out.println(
													"------TA DE BRINCADEIRA!!!? DIGITE UM VALOR POSITIVO------");
										} else {
											funcionario.get(funcionarioModificar).setNumeroDependentes(modiNumeroD);
											dependeErroM = true;
											alterarErro = true;
										}
									} catch (Exception e) {
										System.out.println("------DIGITE APENAS NUMEROS!!!!------");
									}
									teclado.nextLine();

								}
								System.out.println("DEPEDENTES ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 4: {
								System.out.println("##########################################");
								boolean vrErroM = false;
								while (vrErroM == false) {
									System.out.println("Altere o Vale Refeição do Funcionario: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modiVr = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVr(modiVr);
										modiVr = true;
										vrErroM = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								System.out.println("VALE REFEIÇÃO ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 5: {
								System.out.println("##########################################");
								boolean vaErroM = false;
								while (vaErroM == false) {
									System.out.println("Altere o Vale Alimentação do Funcionario: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modiVa = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVa(modiVa);
										modiVa = true;
										vaErroM = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								System.out.println("VALE ALIMENTAÇÃO ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 6: {
								System.out.println("##########################################");
								boolean vtErroM = false;
								while (vtErroM == false) {
									System.out.println("Altere o Vale Transporte do Funcionario: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modiVt = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVt(modiVt);
										modiVt = true;
										vtErroM = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								teclado.nextLine();
								System.out.println("VALE TRANSPORTE ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 7: {
								System.out.println("##########################################");
								boolean saudeErroM = false;
								while (saudeErroM == false) {
									System.out.println("Altere o plano de saúde do Funcionario:");
									System.out.println("-- 1.Basico | 2.Premium | 3.Platinum Premium Plus --");
									String modiPlanoDeSaude = teclado.next();
									if (planoDeSaude.length() == 0) {
										System.out.println("------NÂO DEIXE EM BRANCO------");
									} else {
										if (planoDeSaude.equalsIgnoreCase("1") || planoDeSaude.equalsIgnoreCase("2")
												|| planoDeSaude.equalsIgnoreCase("3")) {
											saudeErroM = true;
											modiPlanoDeSaude = "";
										} else {
											System.out.println("------PLANO DE SAUDE NÂO ENCONTRADO------");
										}
									}
								}
								System.out.println("PLANO DE SAUDE ALTERADO COM SUCESSO");
								System.out.println("##########################################");
							}
								continue;

							case 8:
								System.out.println("##########################################");

								teclado.nextLine();
								// NOME
								boolean nomeErroModi = false;
								while (nomeErroModi == false) {
									System.out.println("Altere o Nome: ");
									String modificarFsnome = teclado.nextLine();
									if (modificarFsnome.length() == 0) {
										System.out.println("------NÂO DEIXE ESPAÇOS VAZIOS!!!!!------");
									} else {
										funcionario.get(funcionarioModificar).setNome(modificarFsnome);
										nomeErroModi = true;
										alterarErro = true;
									}
								}

								// SALARIO
								boolean salarioErroModi = false;
								while (salarioErroModi == false) {
									System.out.println("Altere o Salário:");
									try {
										Double modificarFsSalario = teclado.nextDouble();
										if (modificarFsSalario < 0) {
											System.out.println("------DIGITE UM VALOR POSITIVO!!!!------");
										} else {
											funcionario.get(funcionarioModificar).setSalarioBruto(modificarFsSalario);
											salarioErroModi = true;
											alterarErro = true;

										}
									} catch (Exception e) {
										System.out.println("-------DIGITE APENAS NUMEROS!!!!------");
									}
									teclado.nextLine();

								}
								// DEPENDENTES
								boolean dependeErroModi = false;
								while (dependeErroModi == false) {
									System.out.println("Altere o numero de Dependentes: ");
									try {
										int modificarFden = teclado.nextInt();
										if (modificarFden < 0) {
											System.out.println(
													"------TA DE BRINCADEIRA!!!? DIGITE UM VALOR POSITIVO------");
										} else {
											funcionario.get(funcionarioModificar).setNumeroDependentes(modificarFden);
											dependeErroModi = true;
											alterarErro = true;
										}
									} catch (Exception e) {
										System.out.println("------DIGITE APENAS NUMEROS!!!!------");
									}
									teclado.nextLine();

								}
								// VALE REFEIÇÂO
								boolean vrErroModi = false;
								while (vrErroModi == false) {
									System.out.println("Altere o VR: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modificarFVR = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVr(modificarFVR);
										modificarFVR = true;
										vrErroModi = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								// VALE ALIMENTAÇÂO
								boolean vaErroModi = false;
								while (vaErroModi == false) {
									System.out.println("Altere o VA: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modificarFVA = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVr(modificarFVA);
										modificarFVA = true;
										vaErroModi = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								// VALE TRANSPORTE
								boolean vtErroModi = false;
								while (vtErroModi == false) {
									System.out.println("Altere o VT: ");
									System.out.println("-- TRUE = SIM | FALSE = NÂO --");
									try {
										boolean modificarFVT = teclado.nextBoolean();
										funcionario.get(funcionarioModificar).setVr(modificarFVT);
										modificarFVT = true;
										vtErroModi = true;
									} catch (Exception e) {
										System.out.println("------DIGITE TRUE OU FALSE------");
										teclado.nextLine();
									}
								}
								// PLANO DE SAUDE
								boolean saudeErroModi = false;
								while (saudeErroModi == false) {
									System.out.println("Qual seu tipo de plano de saúde?:");
									System.out.println("-- 1.Basico | 2.Premium | 3.Platinum Premium Plus --");
									
									String modificarPlanoDeSaude = teclado.next();
									if (modificarPlanoDeSaude.length() == 0) {
										System.out.println("------NÂO DEIXE EM BRANCO------");
									} else {										
											funcionario.get(funcionarioModificar).setPlanoDeSaude(modificarPlanoDeSaude);
											saudeErroModi = true;
											alterarErro = true;
										
										}
									}
								System.out.println("DADOS ALTERADOS COM SUCESSO!!!!");
								continue;
								}
								}						
						}

					 catch (Exception e) {
						System.out.println("------DIGITE O N° DO FUNCIONARIO!!!------");
						teclado.nextLine();
					}
				}
			continue;

			}
			// METODO DE DELETAR UM FUNCIONARIO
			case 4: {
				System.out.println("##########################################");

				boolean funcDel = false;
				int funcionarioDeletar = 0;

				while (funcDel == false) {
					System.out.println("Digite qual Funcionario você deseja apagar: ");
				}
				try {
					funcionarioDeletar = teclado.nextInt();
					if (funcionarioDeletar < 0) {
						System.out.println("------DIGITE UM NUMERO POSITIVO!!!!------");
						continue;
					}
					try {
						funcionario.get(funcionarioDeletar);
					} catch (Exception e) {
						System.out.println("------FUNCIONARIO NÂO ENCONTRADO!!!!------");
						break;
					}
					funcionario.remove(funcionarioDeletar);
					System.out.println("FUNCIONARIO DELETADO COM SUCESSO !!!");
					funcDel = true;
				} catch (Exception e) {
					System.out.println("");
					System.out.println("------DIGITE NOVAMENTE !!!------");
					System.out.println("");
					System.out.println("------NÂO E PERMITIDO LETRAS------");
					teclado.nextLine();
				}
				System.out.println("##########################################");
				continue;
			}
			// METODO PARA VISUALIZAR APENAS UM FUNCIONARIO
			case 5: {
				System.out.println("##########################################");

				boolean visuFuncionario = false;
				int posicao = 0;

				while (visuFuncionario == false) {
					System.out.println("Qual Funcionario você deseja Visualizar: ");

					try {
						posicao = teclado.nextInt();
						if (posicao < 0) {
							System.out.println("------DIGITE UM VALOR MAIOR QUE 0------");
						} else {
							if (funcionario.size() < posicao) {
								System.out.println("------FUNCIONARIO NÂO ENCONTRADO------");
							} else {
								System.out.println("Aqui todas as informações desses Funcionario");
								funcionario.forEach(tudo -> {
									System.out.println("N° do Funcionario: " + funcionario.indexOf(tudo));
									System.out.println("Nome do Funcionario: " + tudo.getNome());
									System.out.println("Salario do Funcionario: " + tudo.getNome());
									System.out.println(
											"Este Funcionario tem " + tudo.getNumeroDependentes() + " Dependentes");
									System.out.println("Aqui Seus Beneficios");
									System.out.println("Este funcionario " + tudo.isVr() + " o Vale Refeição");
									System.out.println("Este funcionario " + tudo.isVa() + " o Vale Alimentação");
									System.out.println("Este funcionario " + tudo.isVt() + " o Vale Transporte");
									System.out
											.println("Este Funcionario tem o Plano de Saúde " + tudo.getPlanoDeSaude());

								});
								visuFuncionario = true;
							}
						}
					} catch (Exception e) {
						System.out.println("------DIGITE UM VALOR NUMERICO------");
						teclado.nextLine();
					}
					System.out.println("##########################################");
					continue;

				}
			}
			// CALCULAR O SALARIO DO FUNCIONARIO
			case 6: {
				System.out.println("##########################################");

				boolean liquidoErro = false;

				int funcLiquido = 0;

				while (liquidoErro == false) {
					System.out.println("Qual funcionario você desejar ver o custo: ");
					try {
						funcLiquido = teclado.nextInt();
						if (funcLiquido < 0) {
							System.out.println("------DIGITE UM VALOR POSITIVO------");
							continue;
						}
						try {
							funcionario.get(funcLiquido);
						} catch (Exception e) {
							System.out.println("------FUNCIONARIO NÂO ENCONTRADO------");
							break;
						}
					} catch (Exception e) {
						System.out.println("------DIGITE UM VALOR NUMERICO------");
						teclado.nextLine();
						continue;
					}

					double salarioL = funcionario.get(funcLiquido).getSalarioBruto();

					if (funcionario.get(funcLiquido).isVr() == true) {
						salarioL -= salarioL * 3 / 100;

					}
					if (funcionario.get(funcLiquido).isVa() == true) {
						salarioL -= salarioL * 5 / 100;

					}
					if (funcionario.get(funcLiquido).isVt() == true) {
						salarioL -= salarioL * 6 / 100;
					}

					if (funcionario.get(funcLiquido).getPlanoDeSaude().equalsIgnoreCase("basico")) {
						salarioL -= 100;

					} else if (funcionario.get(funcLiquido).getPlanoDeSaude().equalsIgnoreCase("premium")) {
						salarioL -= 250;

					} else if (funcionario.get(funcLiquido).getPlanoDeSaude()
							.equalsIgnoreCase("platinum premium plus")) {
						salarioL -= 500;
					}

					salarioL -= (salarioL * 26 / 100);
					salarioL = salarioL - funcionario.get(funcLiquido).getNumeroDependentes() * 50;

					System.out.printf("O Salario Liquido Deste Funcionario é: %f", salarioL);
					liquidoErro = true;

				}				
				continue;

			}
			//SAIR DO SISTEMA
			case 9: {
				System.exit(0);
			}

			}

		} while (true);
	}

	static public void menu() {
		System.out.println(" ");
		System.out.println("Bem Vindo ao Sistema - Gerenciamento de Funcionarios");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1 - Criar um novo Funcionario e adicioná-lo á lista");
		System.out.println("2 - Lista de todos os Funcinarios");
		System.out.println("3 - Editar informações de um Funcionario");
		System.out.println("4 - Deletar um Funcionario");
		System.out.println("5 - Visualizar detalhades de um Funcionario");
		System.out.println("6 - Calcular o salário do Funcionario");
		System.out.println("9 - Fechar o Sistema");
		System.out.println("------------------------------------------------------------------------");
	}
}
