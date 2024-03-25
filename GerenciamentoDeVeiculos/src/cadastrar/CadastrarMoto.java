package cadastrar;

import java.util.ArrayList;
import java.util.Scanner;

import models.Moto;

public class CadastrarMoto {
	
	ArrayList<Moto> veiculos = new ArrayList<Moto>();

	Scanner teclado = new Scanner(System.in);

	public void newCadastrarMoto() {
		

		String modelo = "";
		String marca = "";
		boolean bateria = false;
		
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
		
	}
	public void exibirMoto () {
		veiculos.forEach(motoCadastrado -> {
			motoCadastrado.exibirInfo();
			
		});
	}
}
