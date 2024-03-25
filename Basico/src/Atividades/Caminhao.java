package Atividades;

public class Caminhao extends Veiculo {
	
	int eixos;
	
	public Caminhao (String placa, int ano,int eixos) {
		super();
		this.eixos = eixos;
		this.placa = placa;
		this.ano = ano;
	}
	
	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
    public void exibirDados() {
		
	}
	
}
