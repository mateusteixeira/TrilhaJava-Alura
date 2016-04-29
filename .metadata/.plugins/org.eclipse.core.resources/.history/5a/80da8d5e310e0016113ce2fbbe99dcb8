package br.com.alura.banco.modelo;

import br.com.alura.banco.exceptions.ValorInvalidoException;

public abstract class Conta {
	
	private double saldo;
	private int numeroConta;
	private String titular;
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor){
		if(valor < 0){
			throw new ValorInvalidoException("Valor negativo: "+valor);
		}
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Conta com Saldo: "+saldo;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)){
			return false;
		}
		
		Conta conta = (Conta)obj;
		return this.numeroConta == conta.getNumeroConta() && this.getTitular().equals(conta.getTitular());
	}
	
	
	
	public abstract void atualiza(double taxa);
}
