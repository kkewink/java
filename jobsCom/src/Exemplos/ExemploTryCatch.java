package Exemplos;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Vaga;

public class ExemploTryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Vaga> vagas = new ArrayList<Vaga>();

		do {

			System.out.println("######################");
			System.out.println("1 - Criar Vaga");
			System.out.println("9 - Sair do SIstema");
			System.out.println("######################");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				Vaga vaga = new Vaga(opcao, null, null, null, null, opcao);
				System.out.println("Candidatos ?");
				vaga.setCandidatos(sc.nextInt());

				System.out.println("Descricao ?");
				vaga.setDescricao(sc.next());

				System.out.println("Requisitos ?");
				vaga.setRequisitos(sc.next());

				System.out.println("Horario ?");
				vaga.setHorario(sc.next());

				System.out.println("Modelo ?");
				vaga.setModelo(sc.next());

				System.out.println("Salario ?");
				vaga.setSalario(sc.nextDouble());

				vagas.add(vaga);
				System.out.println("Vaga croada com sucesso!");
			}
			case 2 : {
				System.out.println("Iniciando Lista");
				vagas.forEach(vaga -> {
					System.out.println("#####################");
					System.out.println(vaga.getCandidatos());
					System.out.println(vaga.getDescricao());
					System.out.println(vaga.getHorario());
					System.out.println(vaga.getModelo());
					System.out.println(vaga.getRequisitos());
					System.out.println(vaga.getSalario());
					System.out.println("#####################");
				});
			}
			case 9: {
				System.exit(0);
			}
			}
		} while (true);

	}
}