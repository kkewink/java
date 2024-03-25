package Atividades;

public class programVeiculo {
	
	public static void main(String[] args) {
	
	Veiculo veiculo01 = new Veiculo ("ABC-ASDA-676", 2012);
	
	Onibus veiculo02 = new Onibus ("BVM-GFH-3546", 2014, 24);
	
	Caminhao veiculo03 = new Caminhao ("POY-RUTY-9873", 1987, 8);
	
	System.out.println("PLACA DO CARRO: " + veiculo01.placa + " ANO " +veiculo01.ano);
	
	
	System.out.println("PLACA DO ONIBUS: " +veiculo02.placa + " ANO " + veiculo02.ano + " TEM " +veiculo02.assentos + " DE ASSENTOS");
	
	System.out.println("PLACA DO CAMINHÂO: " + veiculo03.placa + " ANO "+ veiculo03.ano + " TEM " + veiculo03.eixos + " DE EIXOS");
	
	}

}
