package Atividades;

public class programRetangulo {
	
	public static void main(String[] args) {
	
	/*Atividade 01*/
	 Retangulo  retangulo01 = new Retangulo (3, 4);	
		
		System.out.println("Height do retangulo é " + retangulo01.height);
		System.out.println("Widht do retangulo é " + retangulo01.width);
	
	System.out.println("Area do retangulo");
	System.out.println(retangulo01.area());
	
	System.out.println("Perimetro do retangulo");
	System.out.println(retangulo01.perimeter());
	
	System.out.println("Diagonal do retangulo");
	System.out.println(retangulo01.diagonal());

	
		/*ATIVIDADE 02*/
		  Funcionario funcionario01 = new Funcionario("Ernesto", 6000, 1000);
		
	 System.out.println("Nome Do Funcionario: " + funcionario01.name);
	 System.out.println("Salario: " + funcionario01.salarioBruto);
	 System.out.println("Taxa impostos: " + funcionario01.taxa);

	 System.out.println("Salario Liquido do Funcionario é " + funcionario01.salarioLiquido());
	 
	 System.out.println("A porcentagem do aumento foi de 10%");
	 funcionario01.aumento(10);
	 
	 System.out.println("Dados do funcionario atualizado "+ funcionario01.name +" " + funcionario01.salarioLiquido());
	 
		/*ATIVIDADE 03*/
	 Boletim estudante01 = new Boletim("Roberto", 27, 31, 32);
	 Boletim burro = new Boletim ("JOjo", 17,20,15);
	 
	 System.out.println(estudante01.nome);
	 System.out.println("As notas do estudante: " + estudante01.nota1 + estudante01.nota2 +estudante01.nota3);
	 System.out.println("Notas da saida: " + estudante01.finalGrade());
	 estudante01.calcularNota();
	 
	 
	 System.out.println(burro.nome);
	 System.out.println("As notas do estudante: " + burro.nota1 + burro.nota2 + burro.nota3);
	 System.out.println("Notas da saida: " + burro.finalGrade());
	 burro.calcularNota();
	 
	}
	
}
