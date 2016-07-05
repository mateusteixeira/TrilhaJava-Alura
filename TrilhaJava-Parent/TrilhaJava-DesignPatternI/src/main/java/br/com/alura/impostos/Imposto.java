package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public abstract class Imposto {

	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}

	protected double calculaOutroImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.calculaImposto(orcamento));
	}

	public abstract double calculaImposto(Orcamento orcamento);

}
