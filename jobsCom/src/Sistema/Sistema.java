package Sistema;

import java.util.ArrayList;

import java.util.Scanner;

import Models.Vaga;
public class Sistema {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		// Instanciando o ArrayList
		ArrayList<String> palavras = new ArrayList<String>();

		// .add adiciona mais valores
		
		palavras.add("Palavra");
		palavras.add("Ernesto");
		palavras.add("Lá ele");
		palavras.add("Palavra4");
		palavras.add("Palavra5");
		
		// ele vai percorrer objeto por objeto da array buscando objeto q eu pedi
		// (palavra)
		palavras.forEach(palavra -> {
			// Escrevendo o Objeto que está passando
			System.out.println(palavra);
		});
		// Contains => verificar se existe
		boolean existe = palavras.contains("Palavra");
		if(existe) {
			//buscar a posição da palavra/varíavel
			int posição = palavras.indexOf("Palavra");
			//get => trazer a variavel de acordo com posição
			System.out.println(palavras.get(posição));
					
		}
		//verifica se tem na array
		System.out.println(palavras.contains("Palavras"));
		//busca e fala a sua posição
		System.out.println(palavras.indexOf("Palavras"));
		// vai puxa o numero da variavel q eu escolher
		System.out.println(palavras.get(0));
		//altera o nome da variavel da posição q eu escolher
		palavras.set(2, "RECEBA");
		// vai puxa o numero da variavel q eu escolher
		System.out.println(palavras.get(3));
		
		
		ArrayList<Vaga> vagas = new ArrayList<Vaga>();
		
				
		do {
			int escolha = 0;

			menu();
			escolha = teclado.nextInt();

			switch (escolha) {
			case 1: 
				
				System.out.println("Digite o numero de vagas: ");
				int numVagas = teclado.nextInt();
				
				
				
				System.out.println("Digite para qual vaga sera: ");
				String vagaDes = teclado.next();
				
				
				
				System.out.println("Digite quais serão os requisitos: ");
				String requisito = teclado.next();
				
				
				System.out.println("Digite como é o Horario: ");
				String hora = teclado.next();
				
				
				System.out.println("Digite qual sera o Modelo: ");
				String tipo = teclado.next();
				
				
				System.out.println("Digite como será o saláio: ");
				Double salario = teclado.nextDouble();
				
				
				Vaga vaga = new Vaga (numVagas, vagaDes, requisito, hora, tipo, salario);
				
				vagas.add(vaga);
				
			
			case 2:
				vagas.forEach(vagasCadastradas -> {
					System.out.println("Vaga:" + vagas.indexOf(vagasCadastradas));
					System.out.println("Vaga: " + vagasCadastradas.getCandidatos());
					System.out.println("Descrição" + vagasCadastradas.getDescricao());
					System.out.println("Requisitos:" + vagasCadastradas.getRequisitos());
					System.out.println("Horario:" + vagasCadastradas.getHorario());
					System.out.println("Modelo:" + vagasCadastradas.getModelo());
					System.out.println("Salario:" + vagasCadastradas.getSalario());
				});
				continue;
				
			case 3:
				System.out.println("Digite qual vaga voce deseja apagar");
				int vagaDeletar = teclado.nextInt();
				
				vagas.remove(vagaDeletar);
				
				
			case 4:
				System.out.println("Qual vaga voce deseja modficiar");
				int vagaModificar = teclado.nextInt();
				
				System.out.println("O que voce deseja modficiar?");
				System.out.println("");
				System.out.println("1 - Candidatos");
				System.out.println("2 - Descrição");
				System.out.println("3 - Requisitos");
				System.out.println("4 - Horario");
				System.out.println("5 - Modelo");
				System.out.println("6 - Salario");
				System.out.println("9 - Modificar todos");
				int modificar = teclado.nextInt();
				
				switch (modificar) {
				
				
				case 1:
					System.out.println("Escreva abaixo os candidatos");
					int modificarCandidatos = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarCandidatos);
					continue;
				case 2:
					
					System.out.println("Escreva abaixo a descrição");
					int modificarDescricao = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarDescricao);
					continue;
				case 3:
					
					System.out.println("Escreva abaixo os Requisitos");
					int modificarRequisitos = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarRequisitos);
					continue;
				case 4:
					
					System.out.println("Escreva abaixo o Horario");
					int modificarHorario = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarHorario);
					continue;
				case 5:
					System.out.println("Escreva abaixo o Modelo");
					int modificarModelo = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarModelo);
					continue;
				case 6:
					
					System.out.println("Escreva abaixo os Salário");
					int modificarSalario = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarSalario);
					continue;
				case 9:
					System.out.println("Escreva abaixo os candidatos");
					int modificarCandidatosAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarCandidatosAll);
					
					System.out.println("Escreva abaixo a descrição");
					int modificarDescricaoAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarDescricaoAll);
					
					System.out.println("Escreva abaixo os Requisitos");
					int modificarRequisitosAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarRequisitosAll);
					
					System.out.println("Escreva abaixo o Horario");
					int modificarHorarioAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarHorarioAll);
					
					System.out.println("Escreva abaixo o Modelo");
					int modificarModeloAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarModeloAll);
					
					System.out.println("Escreva abaixo os Salário");
					int modificarSalarioAll = teclado.nextInt();
					vagas.get(vagaModificar).setCandidatos(modificarSalarioAll);
				}
			}
			
	
		}while (true);	
		
	}
		
	


static public void menu() {
	System.out.println(" ");
	System.out.println("Bem Vindo a Criação de Vaga ");
	System.out.println(" ");
	System.out.println("------------------------------------");
	System.out.println("1 - Criar o cadastro da Vaga");
	System.out.println("2 - Lista de Vaga");
	System.out.println("3 - Deletar a Vaga");
	System.out.println("4 - Atualizar Canditados");
	System.out.println("9 - Sair do Sistema");
	System.out.println("------------------------------------");
	System.out.println(" ");
}

}
