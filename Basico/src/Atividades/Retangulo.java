package Atividades;

public class Retangulo {
	
	int width;
	int height;
	
	public Retangulo(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	public double area() {
	   return width * height;
	}
	
	public double perimeter() {
		return (width * width) + (height * height);
	}
	
	
	public double diagonal() {
        double quadradoCateto1 = (width * 2);
        double quadradoCateto2 = (height * 2);

        double somaQuadradosCatetos = quadradoCateto1 + quadradoCateto2;

        double hipotenusa = Math.sqrt(somaQuadradosCatetos);

        return hipotenusa;
	}
}
