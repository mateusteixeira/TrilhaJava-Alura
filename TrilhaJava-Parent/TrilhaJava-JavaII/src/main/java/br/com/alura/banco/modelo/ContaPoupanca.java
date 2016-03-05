package br.com.alura.banco.modelo;


public class ContaPoupanca extends Conta {

	public void atualiza(double taxa){
		setSaldo(getSaldo() + getSaldo() * taxa * 3);
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor-0.1);
	}
	
}
