package aulas;

/*CRIAR A CONTA PRO CLIENTE*/

public class Cliente extends pessoa {

	String name;
	private boolean podePegarEmprest;
	
	public Cliente(String name, String rg, String cpf, String email) {
		super(email, email, email, email);
		this.name = name;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
	}
	
	 {
		System.out.println("crie um cliente sem nada!!");
		
		this.setPodePegarEmprest(false);
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
	public boolean getPodePegarEmprest() {
		return podePegarEmprest;
	}

	public void setPodePegarEmprest(boolean b) {
		this.podePegarEmprest = b;
	}

}
