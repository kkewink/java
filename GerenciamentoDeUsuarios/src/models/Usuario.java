package models;

public class Usuario extends User {
	private String nome;
	private String senha;
	private int idade;
	private String CPF;
	
	
	@Override
	public void acessar() {
		// TODO Auto-generated method stub
		
	}
	
	public void Login() {
		System.out.println("Estou realizando login!!");
	}

	// retorna uma string => nome
	public String getNome() {
		return this.nome;
	}

	// atualizando variavel encapsulada
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha(String senha) {
		return this.senha;
	}

	// atualizando variavel encapsulada
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public Usuario(String nome, String senha ,int idade, String CPF) {
		this.nome = nome;
		this.senha = senha;
		this.idade = idade;
		this.CPF = CPF;
	}

}
