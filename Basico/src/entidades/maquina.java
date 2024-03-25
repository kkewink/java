package entidades;

public class maquina {
	
	String cor;
	String marca;
	String tamanho;
	String modelo;
	String volts;
	String volume;
	
	
	public void ligar() {
		System.out.println("ligar");
	}
	public void desligar() {
		System.out.println("Desligar");
	}
	public void agua() {
		System.out.println("coloar e retirar agua na maquina");
	}
	public void centrifugar() {
		System.out.println("Misturar os produtos com a roupa");
	}
	public void enxaguar() {
		System.out.println("Retirar o esseso de produto");
	}
}
