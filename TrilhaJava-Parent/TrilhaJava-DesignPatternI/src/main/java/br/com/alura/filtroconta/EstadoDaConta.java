package br.com.alura.filtroconta;

import br.com.alura.banco.modelo.Conta;

public interface EstadoDaConta {
	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);

}
