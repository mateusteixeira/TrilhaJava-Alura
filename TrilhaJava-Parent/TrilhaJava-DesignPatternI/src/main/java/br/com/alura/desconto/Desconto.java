package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public interface Desconto {

	public double calculaDesconto(Orcamento orcamento);
	
	public void setProximoDesconto(Desconto desconto);
}
