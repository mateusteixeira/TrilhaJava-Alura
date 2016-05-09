package Aula2;

public class BalancoTrimestral {

	
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosFevereiro+gastosJaneiro+gastosMarco;
		
		System.out.println("Gastos do trimestre: "+gastosTrimestre);
	
		int mediaMensal = gastosTrimestre/3;
		
		String msg = "Valor da média mensal = "+mediaMensal;
		
		System.out.println(msg);
	}
}
