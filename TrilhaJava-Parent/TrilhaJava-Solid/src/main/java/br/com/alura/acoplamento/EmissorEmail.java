package br.com.alura.acoplamento;

public class EmissorEmail implements AcaoPosGerarNota {

	public void executaAcaoAposGerarNotaFiscal(NotaFiscal notaFiscal) {
		System.out.println("Gerei nota fiscal número: "+notaFiscal.getNumero());
	}

}
