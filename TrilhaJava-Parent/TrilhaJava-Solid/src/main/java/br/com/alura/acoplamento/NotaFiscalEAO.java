package br.com.alura.acoplamento;

public class NotaFiscalEAO implements AcaoPosGerarNota {

	public void executaAcaoAposGerarNotaFiscal(NotaFiscal notaFiscal) {
		System.out.println("Gravei no banco nota fiscal "+notaFiscal.getNumero());
	}

}
