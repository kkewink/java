package aulas;

public class carro {
		
		//Atributos
		String marca;
		String modelo;
		String cor;
		String categoria;
		int velocidade;
		int anoFab;
		
		//metodos (Ações)
		
		public carro(String marca ,String modelo, String cor, String categoria, int velocidade, int anoFab) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.cor = cor;
			this.categoria = categoria;
			this.velocidade = velocidade;
			this.anoFab = anoFab;
		}
		
	
		
		public int acelerar() {
			System.out.println("Estou acelerando...");
			return 1;
		}
		public void frear() {
			System.out.println("Pronto, pare!!");
		}
		public void marchaRe() {
			System.out.println("Re em ação...");
		}
		public void buzina() {
			System.out.println("OI be be...");
		}
		
		
			
			
			
		{	
			
	}

}
