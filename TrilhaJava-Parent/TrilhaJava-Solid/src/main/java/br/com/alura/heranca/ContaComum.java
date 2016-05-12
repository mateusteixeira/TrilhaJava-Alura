package br.com.alura.heranca;

public class ContaComum {

	private ManipuladorSaldo manipuladorSaldo;

	public ContaComum() {
		manipuladorSaldo = new ManipuladorSaldo();
	}

	public void deposita(double valor) {
		manipuladorSaldo.deposita(valor);
	}

	public void saca(double valor) {
		manipuladorSaldo.saca(valor);
	}

	public void rende() {
		manipuladorSaldo.rende(1.1);
	}

	public double getSaldo() {
		return manipuladorSaldo.getSaldo();
	}
}