package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public class SemDesconto implements Desconto {

	public double calculaDesconto(Orcamento orcamento) {
		return 0;
	}

	public void setProximoDesconto(Desconto desconto) {
	}

}
