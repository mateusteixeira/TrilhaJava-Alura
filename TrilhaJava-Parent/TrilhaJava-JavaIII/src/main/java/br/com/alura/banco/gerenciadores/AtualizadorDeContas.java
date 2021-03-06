package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.modelo.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		
		System.out.println("Saldo anterior: "+c.getSaldo()+"\n");
		c.atualiza(selic);
		atualizaSaldoContas(c.getSaldo());
		System.out.println("Saldo atual: "+c.getSaldo()+"\n");
	}

	private void atualizaSaldoContas(double saldo) {
		this.saldoTotal += saldo;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}
