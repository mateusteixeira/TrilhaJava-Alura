package br.com.alura.openclosedependencyinversion;

public class CalculadoraPrecos {

	private TabelaPreco tabelaPreco;
	private Frete frete;

	public CalculadoraPrecos(TabelaPreco tabelaPreco, Frete frete) {
		this.tabelaPreco = tabelaPreco;
		this.frete = frete;
	}

	
	public double calcula(double valorProduto){
		double descontoPara = tabelaPreco.descontoPara(valorProduto);
		double calculaFretePara = frete.calculaFretePara("Cascavel");
		
		return valorProduto + descontoPara + calculaFretePara;
	}
}
