package br.com.alura.investimentos;

public class InvestimentoArrojado  implements Investimento{

	public boolean escolhidoInvestimento() {
		return  new java.util.Random().nextDouble() > 0.75;
	}

	public double calculaValorInvestimento(double valor) {
		return escolhidoInvestimento() ? (valor*0.55+valor) : valor;
		
	}

}