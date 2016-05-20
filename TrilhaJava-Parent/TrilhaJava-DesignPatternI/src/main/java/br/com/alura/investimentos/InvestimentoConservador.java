package br.com.alura.investimentos;

public class InvestimentoConservador implements Investimento{

	public boolean escolhidoInvestimento(){
		return true;
	}
	
	public double calculaValorInvestimento(double valor) {
		return valor * 0.08 + valor;
	}

}
