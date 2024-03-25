package Atividades;

public class Onibus extends Veiculo {
	
	int assentos;
	
	public Onibus(String placa, int ano,int assentos) {
		super();
		this.assentos = assentos;
		this.placa = placa;
		this.ano = ano;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
    public void exibirDados() {
		
	}

}
