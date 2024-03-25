package models;

public class Funcionario extends User implements AcessoAoAdministrativo {
	
	@Override
	public String acessar (String acesso) {
		return null;
	}
	
	@Override
	public void acessar () {
		
	}
}
