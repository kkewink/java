package Atividades;

public class Funcionario {
	
	String name;
	double salarioBruto;
	double taxa;
	
	public Funcionario(String name, int salarioBruto, int taxa) {
		super();
		this.name = name;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}
	
	public double salarioLiquido(){
		return salarioBruto - taxa;
	
	}
	
	public void aumento(double porcentagemAumento) {
      this.salarioBruto += salarioBruto * porcentagemAumento / 100;
	}

}
