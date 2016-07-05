package br.com.alura.orcamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<ItemOrcamento> itensOrcamento;
	private EstadoDeUmOrcamento estadoAtual;

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

	public void addItensAoOrcamento(ItemOrcamento itemOrcamento) {
		itensOrcamento.add(itemOrcamento);
	}

	public List<ItemOrcamento> getItensOrcamento() {
		return itensOrcamento;
	}

	public int getQtdItens() {
		return itensOrcamento.size();
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

}
