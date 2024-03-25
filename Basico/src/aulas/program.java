package aulas;


/*CLIENTE DE UM BANCO*/

public class program {
	
	public static void main(String[] args) {
	
	Cliente cliente01 = new Cliente("Gustavo Ribeiro", "123456","123.456.789-69", "@emaillegau");
	
	
	
	
	
	conta minhaConta = new conta(1, 1500,  20000, cliente01);
	
	System.out.println(minhaConta.cliente.getName());
	
	System.out.println(minhaConta.getTipo());
	
	minhaConta.setSaldo(2500);
	
	
	}

}
