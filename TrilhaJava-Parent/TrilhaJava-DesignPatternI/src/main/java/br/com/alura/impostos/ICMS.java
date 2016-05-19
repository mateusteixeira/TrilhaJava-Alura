package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ICMS implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
