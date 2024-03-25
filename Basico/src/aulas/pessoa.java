package aulas;

public class pessoa {
	
	String nome;
	String cpf;
	String rg;
	String email;
	public pessoa(String nome, String cpf, String rg, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
