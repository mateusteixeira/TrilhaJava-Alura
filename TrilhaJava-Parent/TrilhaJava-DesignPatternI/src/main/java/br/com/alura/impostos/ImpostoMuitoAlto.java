package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ImpostoMuitoAlto extends Imposto {
	
	 public ImpostoMuitoAlto(Imposto imposto) {
         super(imposto);
     }

     public ImpostoMuitoAlto() {
         super();
     }

     public double calculaImposto(Orcamento orcamento) {
         return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento); 
     }


}
