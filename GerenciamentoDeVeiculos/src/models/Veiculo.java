package models;

public class Veiculo {
	
	private String modelo;
	private String marca;
	public String exibirInfo;
	
	public Veiculo(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void exibirInfo () {
		System.out.println("Modelo :" + getModelo());
		System.out.println("Marca :" + getMarca());
	}
	

	
}
