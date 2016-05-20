package br.com.alura.investimentos;

public enum EnumTipoInvestimentos {
	CONSERVADOR(new InvestimentoConservador()),
	MODERADO(new InvestimentoModerado()),
	ARROJADO(new InvestimentoArrojado());
	
	private Investimento investimento;

	private EnumTipoInvestimentos(Investimento investimento) {
		this.investimento = investimento;
	}
	
	public Investimento getInvestimento() {
		return investimento;
	}
	
}
