package br.com.alura.orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
	}
}