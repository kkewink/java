package models;

public class Carro {
	
	public String cor;
	public String marca;
	public String modelo;
	
	public Carro(String cor, String marca, String modelo) {
		this.cor = cor;
		this.marca = modelo;
		this.modelo = modelo;
	}
	
	
	public void acelerar () {
		System.out.println("Acelerandoooooooooo!!!! ");
	}
	
	public void acelerar (String estouro) {
		System.out.println("Acelerandooo!! " + estouro);
	}


	public void freirar() {
		System.out.println("Freiando!!! Puxando o freio de mão!!!!!");
	}
	
}
