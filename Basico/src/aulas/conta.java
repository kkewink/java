package aulas;

/*
 * Tipo pode ser 0 =>
 * 
 * 27/11/2023 - Encapsulamento
/ * */


public class conta {

	private int tipo;
	 double saldo;
	private double limite;
	Cliente cliente;
	
	


	public conta(int tipo, double saldo, double limite, Cliente cliente) {
		super();
		this.tipo = tipo;
		this.saldo = saldo;
		this.cliente = cliente;
		this.limite = limite;
	}
	
	
	public void setSaldo(double valor) {
		this.saldo = this.saldo + valor;
	}
	public int getTipo() {
		return tipo;
	}

	
	


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public void saque (double valorSaque) {
		
		if( saldo > valorSaque) {
			this.saldo = this.saldo - valorSaque;
			}else {
				System.out.println("SEM SALDO");
			}
		
				
		if( saldo + limite >= valorSaque) {
		this.saldo = this.saldo - valorSaque;
		}else {
			System.out.println("LMITE NÂO PERMITIDE");
		}
		
		
	}
	public void deposito (double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	
}
