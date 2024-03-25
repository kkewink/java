package Atividades;

public class Boletim {
	
	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public Boletim(String nome, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public void calcularNota() {
	
		double notaFinal = nota1 + nota2 + nota3; 
		if (notaFinal >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			notaFinal = 60 - notaFinal;
			System.out.println("MISSNG " + notaFinal);
		}
	}public double finalGrade() {
		return nota1 + nota2+ nota3;
	}
	
}
