package models;

public class Moto extends Veiculo{

	private boolean possuiPartidaEletrica;
	
	public Moto(String modelo, String marca,boolean possuiPartidaEletrica) {
		super(modelo, marca);
		this.possuiPartidaEletrica = possuiPartidaEletrica;
	}

	
	
	public boolean isPossuiPartidaEletrica() {
		return possuiPartidaEletrica;
	}



	public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
		this.possuiPartidaEletrica = possuiPartidaEletrica;
	}


	@Override
	public  void exibirInfo () {
		super.exibirInfo();
		System.out.println("Possui Partida Eletrica :" + this.isPossuiPartidaEletrica());
	}
	


	

}
