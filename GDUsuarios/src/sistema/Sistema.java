package sistema;

import java.util.Scanner;
import service.HandleMenu;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();
		int opcao = 0;
		do {
			// \n
			System.out.println("1 - Criar \n2 - Editar \n3 - Deletar \n4 - Listar \n5 - Listar Especifico \n9 - Sair\n");
			
			// 5 - listar Especifico
			// Qual id voce seja vizualizar?
			// 4
			// Objeto N4
			
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: {
				hm.criar();
				break;
			}
			case 2:{
				hm.editar();
			}
			case 3:{
				hm.deletar();
			}
			case 4:{
				hm.listar();
			}
			case 5:{
				hm.listaEspecifico();
			}
			default:
				System.out.println("");
				break;
			}
		} while (opcao != 9);
		sc.close();

	}

}
