package Atividades;

public class Conta {
	
	int main;
	double salario;
	double saldo;
	double limite;
	double aumento;
	double anual;
	Cliente cliente;
	
	public Conta(int main, double salario, double saldo,double limite, Cliente cliente) {
		super();
		this.main = main;
		this.salario = salario;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	public void recebeAumento(double quantoAumento) {
		aumento = this.salario + quantoAumento;
	}
	public void ganhoAnual (int salarioAnual) {
		anual = this.salario * salarioAnual;
	}

}
