package br.com.alura.desconto;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

public class DescontoVendaCasada implements Desconto{

	private Desconto desconto;

	public double calculaDesconto(Orcamento orcamento) {
		boolean existeCaneta = existeItem("CANETA", orcamento);
		boolean existeLapis = existeItem("LAPIS", orcamento);
		
		if(existeCaneta && existeLapis){
			return orcamento.getValor() * 0.05;
		}
		return desconto.calculaDesconto(orcamento);
	}

	public void setProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
		
	}
	
	  private boolean existeItem(String nomeDoItem, Orcamento orcamento) {
          for (ItemOrcamento item : orcamento.getItensOrcamento()) {
              if(item.getNome().equals(nomeDoItem)) return true;
          }
          return false;
      }
	
	

}
