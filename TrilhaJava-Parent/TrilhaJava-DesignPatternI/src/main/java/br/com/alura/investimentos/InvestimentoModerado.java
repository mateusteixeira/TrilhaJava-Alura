package br.com.alura.investimentos;

public class InvestimentoModerado  implements Investimento{

	public double calculaValorInvestimento(double valor) {
		return escolhidoInvestimento() ? (valor*0.25+valor) : valor;
		
	}

	public boolean escolhidoInvestimento() {
		return  new java.util.Random().nextDouble() > 0.5;
	}

}