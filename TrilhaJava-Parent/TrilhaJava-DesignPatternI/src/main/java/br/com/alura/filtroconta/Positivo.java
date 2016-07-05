package br.com.alura.filtroconta;

import br.com.alura.banco.modelo.Conta;

public class Positivo implements EstadoDaConta {
	public void saca(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo -= valor;
		conta.setSaldo(saldo);

		if (conta.getSaldo() < 0)
			conta.setEstado(new Negativo());

	}

	public void deposita(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.98;
		conta.setSaldo(saldo);
	}

}
