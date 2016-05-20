package br.com.alura.orcamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<ItemOrcamento> itensOrcamento;

	public Orcamento(double valor) {
		this.valor = valor;
		itensOrcamento = new ArrayList<ItemOrcamento>();
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void addItensAoOrcamento(ItemOrcamento itemOrcamento){
		itensOrcamento.add(itemOrcamento);
	}
	
	public List<ItemOrcamento> getItensOrcamento() {
		return itensOrcamento;
	}
	
	public int getQtdItens(){
		return itensOrcamento.size();
	}

}
