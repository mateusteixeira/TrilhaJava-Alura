package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public class DescontoValorMaiorQuinhentosReais implements Desconto{

	private Desconto desconto;

	public double calculaDesconto(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if(valor > 500){
			return valor * 0.07;
		}
		return desconto.calculaDesconto(orcamento);
	}

	public void setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
		
	}
	
	

}
