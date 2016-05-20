package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ICCC implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		double valor = orcamento.getValor();
		
		if(valor < 1000){
			return valor * 0.05;
		}else if(valor <= 3000){
			return valor * 0.07;
		}else{
			return valor * 0.08 + 30;
		}
	}

	
}
