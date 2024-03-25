package models;

public class Carro extends Veiculo {
	
	private String tipoCombustivel;
	private int numPortas;
	
	
	public Carro(String modelo, String marca, int numPortas, String tipoCombustivel) {
		super(modelo, marca);
		this.numPortas = numPortas;
		this.tipoCombustivel = tipoCombustivel;
	}


	public String getTipoCombustivel() {
		return tipoCombustivel;
	}


	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public int getNumPortas() {
		return numPortas;
	}


	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	@Override
	public void exibirInfo () {
		super.exibirInfo();
		System.out.println("Tipo do Combustivel :" + this.getTipoCombustivel());
		System.out.println("Numeros de Portas:" + this.getNumPortas());
	}
	


}
