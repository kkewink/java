package Atividades;

public class Veiculo {
	
	String placa;
	int ano;
	
	public Veiculo() {}
	
	public Veiculo (String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}
	
	public int getAno() {
		return ano;
	}

	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	
	public void exibirDados() {
		
	}
}
