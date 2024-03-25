package sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("------------------------------------------");
		System.out.println("          TABUADA MANEIRA ");
		System.out.println("------------------------------------------");

		System.out.println("Digite o numero para a tabuada: ");
		int tabuada = teclado.nextInt();

		System.out.println("Agora digite ate que numero você quer: ");
		int numero = teclado.nextInt();

		System.out.println("Aqui esta sua tabuada como pediu: ");

		for (int i = 1; i <= numero; i++) {
			System.out.println(tabuada + "x" + i + " = " + (tabuada * i));
			String resultado = tabuada + "x" + i + " = " + (tabuada * i);
			
			writeToFile("taboada.txt", resultado);
			writeToFile("taboada.txt", "");
		}
		readFromFile("taboada.txt");

		teclado.close();
		System.out.println("------------------------------------------");

	}

	public static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			// Escrevendo o ocnteudo no arquivo
			writer.write(content);
			System.out.println("Conteúdo escrito no arquivo com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}

	public static String readFromFile(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			/*
			 * Executar o loop de repetição enquanto a variavel lida no aruivo for diferente
			 * de nulo
			 */
			while ((line = reader.readLine()) != null) {
				// escrevendo conteudo na variavel
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo:" + e.getMessage());
		}
		return content.toString();
	}
}