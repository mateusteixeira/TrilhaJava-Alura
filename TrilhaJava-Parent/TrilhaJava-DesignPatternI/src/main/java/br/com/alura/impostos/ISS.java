package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

public class ISS extends Imposto {
	
    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }
    
    public ISS() {
		// TODO Auto-generated constructor stub
	}

	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
