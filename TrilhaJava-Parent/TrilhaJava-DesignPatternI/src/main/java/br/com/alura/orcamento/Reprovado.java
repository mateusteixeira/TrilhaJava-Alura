package br.com.alura.orcamento;

public class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("J� estou reprovado!");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());
	}
}