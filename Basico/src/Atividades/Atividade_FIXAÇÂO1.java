package Atividades;

import java.util.Scanner;


public class Atividade_FIXAÇÂO1 {

	public static void main(String[] args) {
	

		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual o produto que sera transportado: ");// nome do produto que sera transportado
		String produto = teclado.next();
		
		//Dados do veiculo
		System.out.print("Qual seu chassi: ");
		double chassi = teclado.nextDouble(); //8.000
		
		System.out.print("Qual é seu PBT: ");
		double PBT = teclado.nextDouble();//30.000
		
		System.out.print("Qual foi sua velocidade na ida: ");
		int velocidadeIda= teclado.nextInt(); //80 - 80km/h ida
		
		System.out.print("Qual foi sua velocidade na volta: ");
		int velocidadeVolta = teclado.nextInt();// 85km/h volta
		
		//Dados operacionais
		System.out.print("Quanto tempo denomorou pra a carga e descarga : ");
		double tempoCeD = teclado.nextDouble();// 380minutos 6h33min
		
		System.out.print("Distância percorrida na ida: ");
		double ida = teclado.nextDouble();// 1.000 quanto foi a distancia
		
		System.out.print("Distância percorrida na volta: ");
		double volta = teclado.nextDouble();//850.000;
		
		System.out.print("Qual foi o tempo de jornada útil: ");
		int TempoDajornada = teclado.nextInt(); //8horas
		
		System.out.print("Número de dias úteis por mes: ");
		int diasDetrabalho = teclado.nextInt(); //quantos dias do mes que foram trabahados	30
		
		System.out.print("Quantos dias de manutenção: ");
		int Manutemção = teclado.nextInt();//tempo de manutenção 1
		
		System.out.print("Quantos turnos: ");
		int qtdTurno = teclado.nextInt(); //Quantos turnos 2
		
		//Dados da carga
		System.out.print("Quantidade de toneladas: ");
		double toneladasDoveiculo = teclado.nextDouble(); //2.900

		//CONTAS
		
		
		//A) Peso Total do veiculo:
		double PesoTotal = chassi;
	
	//B) Carga util do veiculo:		
		double CargaUtil = PBT - PesoTotal;
		
		
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
		
		double frotaTotal = NumeroVM / NdvMensais ;
		

	}

	
}
