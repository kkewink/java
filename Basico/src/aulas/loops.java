package aulas;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CRIANDO COMANDOS QUE FAZEM LOOPS 
		//while  - for
		
		System.out.println("Resultado while");
		
		
		int i2 = 0;
		while(i2 < 10) {
			System.out.println(i2);
			i2++; // igual i= i + 1; -- é igual a i= i - 1
		}
		System.out.println("Resultado for");
		
		
		for(int index = 0; index < 10; index++ ) {
			System.out.println(index);
		}
		
		int x = 50;
		int y = 60;
		
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um numero diisil por 19 entre x e y");
				System.out.println(i);
				//break;
			}
		}
		
		int z = 0;
		while(z < 15) {
			
			int j1 = 1;
			z ++;
						
		}
		
		
		/* Quantos funcarios?
		 * nome e trempo de cada 1
		 * SE == 12 => tem ferias
		 * final > contar qtos tem ferias
		 */
		
		int i, tempoSer, qtsFuncionarios, ferias = 0, noFerias = 0;
		 
		 
		System.out.println("Digite quantos funcionarios: ");
		qtsFuncionarios = sc.nextInt();
		
		for (i = 0; i < qtsFuncionarios; i++ );
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = sc.next();
		
		System.out.println("Digite o tempo de serviço: ");
		tempoSer = sc.nextInt();
		
		if (tempoSer >= 12) {
			System.out.println(nome +"tem direito a ferias");
			ferias++;						
		} else {
			System.out.println(nome + "não tem direito a ferias." );
			noFerias++;
		}
		
        System.out.println();
		
		System.out.println(ferias + "tem direito a ferias");
		
		System.out.println(noFerias + "não tem direito a ferias.");
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
