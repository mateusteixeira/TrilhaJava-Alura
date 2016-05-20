package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public class DescontoMaisCincoItens implements Desconto {

	private Desconto desconto;

	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getQtdItens() > 5){
			return orcamento.getValor() * 0.1;
		}
		return desconto.calculaDesconto(orcamento);
	}

	public void setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
		
	}

}
