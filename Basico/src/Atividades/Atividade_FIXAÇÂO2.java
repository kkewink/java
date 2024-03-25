package Atividades;

import java.util.Scanner;

public class Atividade_FIXAÇÂO2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual o produto sera transportado: ");// nome do produto que sera transportado
		String produto = teclado.next();
		
		//Dados do veiculo
		System.out.print("Qual a tara do equipamento: ");
		double TaraEquip = teclado.nextDouble();//10ton
		
		System.out.print("Qual a Capacidade bruta do equipamento: ");
		double PBT = teclado.nextDouble();//35ton
		
		System.out.print("Qual foi sua velocidade na ida: ");
		int velocidadeIda= teclado.nextInt(); // 60km/h ida
		System.out.print("Qual foi sua velocidade na volta: ");
		int velocidadeVolta = teclado.nextInt(); // 75km/h volta
		
		//Dados operacionais
		System.out.print("Quanto tempo denomorou pra a carga e descarga : ");
		double tempoCeD = teclado.nextDouble(); //  4h a 5h
		
		System.out.print("Distância percorrida na ida: ");
		double ida = teclado.nextDouble(); // 1.300 quanto foi a distancia
		
		System.out.print("Distância percorrida na volta: ");
		double volta = teclado.nextDouble(); //1.090
		
		System.out.print("Qual foi o tempo de jornada útil: ");
		int TempoDajornada = teclado.nextInt();//12 horas
		
		System.out.print("Número de dias úteis por mes: ");
		int diasDetrabalho = teclado.nextInt(); //quantos dias do mes que foram trabahados	24
		
		System.out.print("Quantos dias de manutenção: ");
		int Manutemção = teclado.nextInt();//Quantas vezes arrumaram equipamentos 2
		
		System.out.print("Quantos turnos: ");
		int qtdTurno = teclado.nextInt();// 1 turno
		
		//Dados da carga
		System.out.print("Quantidade de toneladas: ");
		double toneladasDoveiculo = teclado.nextDouble(); //4.600ton

		
		System.out.println("Qual produto sera transportado? : ");
		produto = teclado.next();
		
		//A) Peso Total do veiculo:
		double PesoTotal = TaraEquip;
		System.out.println("A) Peso Total do veiculo: " + PesoTotal + "ton");
	
	//B) Carga util do veiculo:		
		double CargaUtil = PBT - PesoTotal;
		System.out.println("B) Carga util do veiculo: " + CargaUtil + "ton");
	
		
		String numeroString = String.valueOf(CargaUtil);

		numeroString = numeroString.replace(".", "");

		String doisPrimeirosDigitos = numeroString.substring(0, 2);

		double resultado = Double.parseDouble(doisPrimeirosDigitos);
			
		
	//C) Numero de viagens mensais:
		double NumeroVM = toneladasDoveiculo / CargaUtil;

	
	//D) Tempo total de viagem :
		
		double TempoDida = (ida / velocidadeIda) * 60 ;
		double TempoDvolta = (volta / velocidadeVolta) * 60 ;
		double TempoTotalViagem = TempoDida + TempoDvolta + tempoCeD;
	
		//E) Tempo diario de operação:
		
		double TempoDiario = (qtdTurno * TempoDajornada) * 60 ;
		
		//F) Numero de viagens de um veiculo por dia:
		
		double NumeroViagens = TempoDiario / TempoTotalViagem ;

		
		//G) calculo de numero total de dias disponiveis por mes:
		
		double totalDiasDis = diasDetrabalho - Manutemção;
		
		
		//H) Numero de viagens mensais de um veiculo:
		
		double NdvMensais = NumeroViagens * totalDiasDis ;
		
		
		//I) Calculo de frota necesaria:
		
		double frotaTotal = NumeroVM / NdvMensais  ;
		
		System.out.print("Sera necessario ");

		System.out.print(Math.round(frotaTotal));

		System.out.print(" Veiculos");
		
		
	
		
		

	}

}
