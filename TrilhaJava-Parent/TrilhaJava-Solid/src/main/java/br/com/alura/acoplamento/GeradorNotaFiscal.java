package br.com.alura.acoplamento;

import java.util.ArrayList;
import java.util.List;

public class GeradorNotaFiscal {
	
	private List<AcaoPosGerarNota> acoesPosGerarNota = new ArrayList<AcaoPosGerarNota>();
	
	public GeradorNotaFiscal(List<AcaoPosGerarNota> acaoPosGerarNotas) {
		this.acoesPosGerarNota = acaoPosGerarNotas;
	}
	
	public NotaFiscal gerarNotaFiscal(Faturamento faturamento){
		double valorMensal = faturamento.getValorMensal();
		
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setValor(valorMensal);
		notaFiscal.setNumero(1L);
		
		for (AcaoPosGerarNota acaoPosGerarNota : acoesPosGerarNota) {
			acaoPosGerarNota.executaAcaoAposGerarNotaFiscal(notaFiscal);
		}
		
		return notaFiscal;
	}

}
