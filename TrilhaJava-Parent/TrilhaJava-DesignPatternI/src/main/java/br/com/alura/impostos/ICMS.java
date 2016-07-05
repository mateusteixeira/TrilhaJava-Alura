package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ICMS extends Imposto {

	  public ICMS(Imposto imposto) {
          super(imposto);
      }
	  public ICMS() {
		// TODO Auto-generated constructor stub
	}
	  
	
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
