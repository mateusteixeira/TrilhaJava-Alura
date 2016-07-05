package br.com.alura.orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			double valor = orcamento.getValor();
			valor -= valor * 0.05;
			orcamento.setValor(valor);
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.setEstadoAtual(new Aprovado());
	}

	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.setEstadoAtual(new Reprovado());
	}

	public void finaliza(Orcamento orcamento) {
		// daqui n�o posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
	}
}
