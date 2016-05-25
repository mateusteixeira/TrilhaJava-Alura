package br.com.alura.impostos;

import java.util.List;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

public class IKCV extends TemplateTaxacaoImposto {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemComValorSuperiorACem(orcamento.getItensOrcamento());
	}

	private boolean temItemComValorSuperiorACem(List<ItemOrcamento> itensOrcamento) {
		for (ItemOrcamento itemOrcamento : itensOrcamento) {
			if(itemOrcamento.getValor() > 100){
				return true;
			}
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
