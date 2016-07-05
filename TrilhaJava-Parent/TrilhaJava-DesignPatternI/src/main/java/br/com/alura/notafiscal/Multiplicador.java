package br.com.alura.notafiscal;

public class Multiplicador implements AcaoAposGerarNota {

	private double fatorMultiplicacao;

	public Multiplicador(double fatorMultiplicacao) {
		this.fatorMultiplicacao = fatorMultiplicacao;
	}

	public void executaAcao(NotaFiscal notaFiscal) {
		// TODO Auto-generated method stub
	}

	public double getFatorMultiplicacao() {
		return fatorMultiplicacao;
	}

	public void setFatorMultiplicacao(double fatorMultiplicacao) {
		this.fatorMultiplicacao = fatorMultiplicacao;
	}
	
	

}
