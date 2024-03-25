package sistema;

import models.Cliente;
import models.Usuario;

public class ExemploHeranca {

	public static void main(String[] args) {
		Usuario u = new Usuario("Ernesto","" ,18, "123-214-543-67");

		Cliente cliente = new Cliente("Ernesto","" ,18, "123-214-543-67", 01);

		u.Login();

		cliente.Login();
	}

}
