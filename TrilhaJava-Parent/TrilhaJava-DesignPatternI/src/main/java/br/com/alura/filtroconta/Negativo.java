package br.com.alura.filtroconta;

import br.com.alura.banco.modelo.Conta;

public class Negativo implements EstadoDaConta {
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	public void deposita(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.95;
		conta.setSaldo(saldo);
		if (conta.getSaldo() > 0)
			conta.setEstado(new Positivo());
	}

}
