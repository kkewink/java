package sistema;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class ManipuletionFile {

	public static void main(String[] args) {
		
		
		//escrevendo em um arquivo de texto
		writeToFile("fileData.txt","");
		
		//lendo de um arquivo de texto
		String content = readFromFile("filedata.txt");
		System.out.println("Conteudo lido do arquivo: " + content);

	}

	public static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			//Escrevendo o ocnteudo no arquivo
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
			/*Executar o loop de repetição enquanto a variavel lida
			 * no aruivo for diferente de nulo
			 */
			while((line = reader.readLine()) != null) {
				//escrevendo conteudo na variavel
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo:" + e.getMessage());
		}
		return content.toString();
	}


	}


