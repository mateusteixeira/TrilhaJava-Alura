package br.com.alura.calculadorimpostos;

import br.com.alura.impostos.Imposto;
import br.com.alura.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public double realizaCalculo(Orcamento orcamento, Imposto imposto){
		return imposto.calculaImposto(orcamento);
	}

}
