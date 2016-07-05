package br.com.alura.banco.modelo;

import java.util.Calendar;

import br.com.alura.banco.exceptions.ValorInvalidoException;
import br.com.alura.filtroconta.EstadoDaConta;

public abstract class Conta {

	private double saldo;
	private Calendar dataAbertura;
	protected EstadoDaConta estado;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Valor negativo: " + valor);
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public EstadoDaConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoDaConta estado) {
		this.estado = estado;
	}

}
