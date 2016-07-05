package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public abstract class TemplateTaxacaoImposto extends Imposto {

	 public TemplateTaxacaoImposto(Imposto outroImposto) {
         super(outroImposto);
     }

     public TemplateTaxacaoImposto() {
     }
	
	public final double calculaImposto(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
