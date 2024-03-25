package Atividades;

import java.util.Scanner;

public class Dimensionamento_FROTA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual o produto que sera transportado: ");// nome do produto que sera transportado
		String produto = teclado.next();
		
		//Dados do veiculo
		System.out.print("Qual seu chassi: ");
		double chassi = teclado.nextDouble(); //8.000
		
		System.out.print("Qual seu chassi: ");
		double PSR = teclado.nextDouble(); //8.000
		
		System.out.print("Qual o peso dos Outros equipamentos: ");
		double OE = teclado.nextDouble(); //1.000
		
		//A) Peso Total do veiculo:
				double PesoTotal = FunçoesNaAtividade.somar3(chassi, PSR, OE);
				
		System.out.print("Qual é seu PBT: ");
		double PBT = teclado.nextDouble();//30.000
		
		System.out.print("Qual foi sua velocidade na ida: ");
		int velocidadeIda= teclado.nextInt(); //55 - 55km/h ida
		
		System.out.print("Qual foi sua velocidade na volta: ");
		int velocidadeVolta = teclado.nextInt();// 65km/h volta
		
		//Dados operacionais
		System.out.print("Quanto tempo denomorou pra a carga e descarga : ");
		double tempoCeD = teclado.nextDouble();// 120minutos 1h40min
		
		System.out.print("Distância percorrida na ida: ");
		double ida = teclado.nextDouble();// 590km na ida
		
		System.out.print("Distância percorrida na volta: ");
		double volta = teclado.nextDouble();//630km na volta;
		
		System.out.print("Qual foi o tempo de jornada útil: ");
		int TempoDajornada = teclado.nextInt(); //9horas
		
		System.out.print("Número de dias úteis por mes: ");
		int diasDetrabalho = teclado.nextInt(); //quantos dias do mes que foram trabahados 25
		
		System.out.print("Quantos dias de manutenção: ");
		int Manutemção = teclado.nextInt();//tempo de manutenção 3
		
		System.out.print("Quantos turnos: ");
		int qtdTurno = teclado.nextInt(); //Quantos turnos 1
		
		//Dados da carga
		System.out.print("Quantidade de toneladas: ");
		double toneladasDoveiculo = teclado.nextDouble(); //5.300

		//CONTAS

		double CargaUtil = FunçoesNaAtividade.menos2(PBT,PesoTotal);
						
        double NumeroVM  = FunçoesNaAtividade.dividir2(toneladasDoveiculo,CargaUtil);

		double TempoDida = FunçoesNaAtividade.dividir2(ida,velocidadeIda) * 60 ;
		double TempoDvolta = FunçoesNaAtividade.dividir2(volta,velocidadeVolta) * 60 ;
		double TempoTotalViagem = FunçoesNaAtividade.somar3 (TempoDida,TempoDvolta,tempoCeD);
			

		double TempoDiario = FunçoesNaAtividade.multi2(qtdTurno,TempoDajornada) * 60 ;

	    double NumeroViagens = FunçoesNaAtividade.dividir2(TempoDiario,TempoTotalViagem);

				
		double totalDiasDis = FunçoesNaAtividade.menos2(diasDetrabalho,Manutemção);
				
		double NdvMensais = FunçoesNaAtividade.multi2(NumeroViagens,totalDiasDis);
		
	    double frotaTotal = FunçoesNaAtividade.dividir2(NumeroVM,NdvMensais);
	
	}
	
	static double dividir2(double num1,double num2){
		  return num1 / num2;

 }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

