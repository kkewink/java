package aulas;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual produto você era transportar ?: ");
		String produto = teclado.next();
		
		//Dados do veiculo
		
		System.out.print("Qual seu chassi: ");
		double chassi = teclado.nextDouble();//8.000
				
		System.out.print("Qual é seu PSR : ");
		double PSR = teclado.nextDouble();//8.000

		
		System.out.print("Qual seu OE: ");
		double OE = teclado.nextDouble();//1.000
		
		//A) Peso Total do veiculo:
		double PesoTotal = chassi + PSR + OE;
		
		
		System.out.print("Qual é seu Peso Bruto: ");
		double PBT = teclado.nextDouble();//47.000
		
	//B) Carga util do veiculo:
		
		double CargaUtil = PBT - PesoTotal;

		
		
		String numeroString = String.valueOf(CargaUtil);

		numeroString = numeroString.replace(".", "");

		String doisPrimeirosDigitos = numeroString.substring(0, 2);

		double resultado = Double.parseDouble(doisPrimeirosDigitos);
			
		
		System.out.print("Quanto pesa a carga em toneladas: ");
		double toneladasDoveiculo = teclado.nextDouble(); //5.300
		
		//C) Numero de viagens mensais:
		
				double NumeroVM = toneladasDoveiculo / CargaUtil;
		
		
		
		System.out.print("Qual foi sua velocidade na ida: ");
		int velocidadeIda = teclado.nextInt(); // 55km/h ida
		
		System.out.print("Qual foi sua velocidade na volta: ");
		int velocidadeVolta = teclado.nextInt(); // 65km/h volta
		
		//Dados operacionais
		System.out.print("Quanto tempo denomorou pra a carga e descarga : ");
		double tempoCeD = teclado.nextDouble();//80 // 1h20min
		
		System.out.print("Distância percorrida na ida: ");
		double ida = teclado.nextDouble();//590.000// quanto foi a distancia
		
		System.out.print("Distância percorrida na volta: ");
		double volta = teclado.nextDouble(); //630.000
		
		//D) Tempo total de viagem :
		
		double TempoDida = (ida / velocidadeIda) * 60 ;
		
		double TempoDvolta = (volta / velocidadeVolta) * 60 ;
		
		double TempoTotalViagem = TempoDida + TempoDvolta + tempoCeD;
		
		
		
		System.out.print("Quantas horas de jornada útil: ");
		int TempoDajornada = teclado.nextInt(); //9horas
		
		System.out.print("Quantos turnos: ");
		int qtdTurno = teclado.nextInt(); // 1
		
		
		

		//E) Tempo diario de operação:
		
		double TempoDiario = (qtdTurno * TempoDajornada) * 60 ;
		
	

		
		//F) Numero de viagens de um veiculo por dia:
		
		double NumeroViagens = TempoDiario / TempoTotalViagem ;
		
		
		System.out.print("Número de dias úteis no mes: ");
		int diasDetrabalho = teclado.nextInt(); //25 quantos dias do mes que foram trabahados
		
		System.out.print("Quantos dias de manutenção: ");
		int Manutemção = teclado.nextInt(); //3 tempo da carraga e descarga do produto
		
		//G) calculo de numero total de dias disponiveis por mes:
		
		double totalDiasDis = diasDetrabalho - Manutemção;
		
		
		//H) Numero de viagens mensais de um veiculo:
		
		double NdvMensais = NumeroViagens * totalDiasDis ;
		
		
		//I) Calculo de frota necesaria:
		
		double frotaTotal = NumeroVM / NdvMensais ;
		
		System.out.print("Sera necessario ");

		System.out.print(Math.round(frotaTotal));

		System.out.print(" Veiculos");		
	
	}

}
