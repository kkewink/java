package Atividades;

public class programC {

	public static void main(String[] args) {
		
Cliente funcionario01 = new Cliente("Roberto", "Contabilidade", 1500.00 , "15/10/2022", "1234567890-29");
		
		Conta contaFuncionario = new Conta( 1, 1500.00, 500, 20000,funcionario01);
		
		System.out.println(contaFuncionario.cliente.nome);
		
		System.out.println(contaFuncionario.salario);
		
		System.out.println("Quanto o funcionario recebeu de aumento ");
		
		contaFuncionario.recebeAumento(3500);
		System.out.println(contaFuncionario.aumento);
		
		
		System.out.println("Quanto o funcionario recebe anualmente ");
		contaFuncionario.ganhoAnual(12);
		System.out.println(contaFuncionario.anual);
		
		System.out.println("Quando abriu sua conta "+contaFuncionario.cliente.dataBanco);
	}

}
