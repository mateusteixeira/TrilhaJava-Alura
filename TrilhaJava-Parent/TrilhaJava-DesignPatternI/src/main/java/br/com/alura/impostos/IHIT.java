package br.com.alura.impostos;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

public class IHIT extends TemplateTaxacaoImposto {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return possuiItensIguais(orcamento.getItensOrcamento());
	}

	private boolean possuiItensIguais(List<ItemOrcamento> itensOrcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		for (ItemOrcamento item : itensOrcamento) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getQtdItens());
	}

}
