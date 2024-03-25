package models;

public class Cliente extends Usuario {
	private int numeroCadastro;

	@Override
	public void Login() {
		System.out.println("Login com o Cliente");
	}

	public Cliente(String nome,String senha ,int idade, String CPF, int num) {
		super(nome, senha ,idade, CPF);

		this.numeroCadastro = numeroCadastro;
	}

	public int getNUmeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(int numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}
}
