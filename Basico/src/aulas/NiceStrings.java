package aulas;

public class NiceStrings {

	public static void main(String[] args) {
		//Aula sobre funções interessantes para String	
		
		String meuNome ="Eduardo Bispo";
		String nomeColega ="Renato Nascimento";
		String meuEndereco = "Moro na puta que pariu";
		String meuTelefone = "11-9Digo-nada-0707-123-789-123457-23425";
		
		//Pega a string e transforma em uma lista
		String[] lista = meuTelefone.split("-");
		
		
		for(int index = 0; index < lista.length;index++ ) {
			System.out.println(lista[index]);
		}
		
		
		
		
		//System.out.println(meuNome.substring(1, 3));
		System.out.println(meuNome.indexOf("rdo"));
		
		System.out.println(meuNome.replace("E"," "));
		//System.out.println(nomeColega.toLowerCase());
		//System.out.println(meuNome.toUpperCase());
		//System.out.println(meuNome.trim());
		
		

	}	

}
