package br.com.alura.banco.modelo;

import br.com.alura.banco.exceptions.ValorInvalidoException;

public abstract class Conta {
	
	private double saldo;
	
	
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
	
	public abstract void atualiza(double taxa);
}
