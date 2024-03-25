package aulas;

public class FunctionsNaAulas {
	
	static void menu(int idade1) {
		switch(idade1) {
		case 18:
			System.out.println("Let´s party!!!");
			break;
		case 15:
			System.out.println("Vá para igreja!!!");
			break;
		case 11:
			System.out.println("Vá brincar!!!");
			break;
		case 10:
			System.out.println("Brincar é melhor para voce!!!");
			break;
		default:
			System.out.println("não sei o que fazer com vc ....");
			break;
		}
	}
	//outras funções
	static int square(int x) {
		return x * x;
	}
	
	static String sumName(String name1, String name2) {
		return name1 + " " + name2;
	}
	
	static void mensagem(String msg) {
		System.out.println(msg);
  }

}




