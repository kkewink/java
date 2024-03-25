package Atividades;

import java.util.Scanner;

public class FunçoesNaAtividade {

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

static void infos() {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Qual o produto sera transportado: ");// nome do produto que sera transportado
	String produto = teclado.next();
	
	
}
static double somar3(double num1, double num2, double num3) {
	return num1 + num2 + num3;
}
static double menos2(double num1, double num2) {
return num1 - num2;
}
static double dividir2(double num1,double num2){
  return num1 / num2;
}
static double multi2(double num1, double num2) {
 return num1 * num2;
}
}

