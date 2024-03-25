package array;

public class SistemaArray {

	public static void main(String[] args) {
		// DIA 26/01
		int[][] coluna = new int[3][3];

		coluna[0][0] = 1;
		coluna[1][1] = 2;
		coluna[2][2] = 3;

		for (int i = 0; i < coluna.length; i++) {
			for (int j = 0; j < coluna.length; j++) {
				System.out.println("Eu sou o J " + j);
				System.out.println("Eu sou o I e J" + i + " " + j);
			}
			System.out.println(" ");
		}

	}

}
