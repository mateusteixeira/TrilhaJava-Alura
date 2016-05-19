package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ISS implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
