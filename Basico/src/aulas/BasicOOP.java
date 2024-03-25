package aulas;

public class BasicOOP {

	public static void main(String[] args) {
		//Como usar uma classe
		carro carroUm = new carro("Volkswagen","Modelo de 1980","Preto","Segmento",185 ,1999 ); 
		
		carroUm.cor = "Black";
		carroUm.anoFab = 1999;
		carroUm.categoria = "Segmento";
		carroUm.marca = "Volkswagen";
		carroUm.modelo = "Modelo de 1980";
		carroUm.velocidade = 185;
	}

}		