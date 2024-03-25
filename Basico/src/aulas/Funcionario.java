package aulas;

public class Funcionario extends pessoa {
	
	private String name;
	private String rg;
	private String cpf;
	private String email;
	private boolean podePegarEmprest;
	private double salario;
	
	
	public Funcionario(String name, String rg, String cpf) {
		super(cpf, cpf, cpf, cpf);
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPodePegarEmprest() {
		return podePegarEmprest;
	}

	public void setPodePegarEmprest(boolean podePegarEmprest) {
		this.podePegarEmprest = podePegarEmprest;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	

}