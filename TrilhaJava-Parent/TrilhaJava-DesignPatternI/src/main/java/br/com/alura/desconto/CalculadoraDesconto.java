package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public class CalculadoraDesconto {

	public double calculaDescontos(Orcamento orcamento){
		Desconto descontoPrimario = new DescontoMaisCincoItens();
		Desconto descontoSecundario = new DescontoValorMaiorQuinhentosReais();
		Desconto descontoTerciario = new DescontoVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		descontoPrimario.setProximoDesconto(descontoSecundario);
		descontoSecundario.setProximoDesconto(descontoTerciario);
		descontoTerciario.setProximoDesconto(semDesconto);
		
		return descontoPrimario.calculaDesconto(orcamento);
	}
}
