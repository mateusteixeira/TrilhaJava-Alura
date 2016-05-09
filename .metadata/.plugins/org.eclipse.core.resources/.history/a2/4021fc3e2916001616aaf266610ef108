package br.com.alura.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(double saldo) {
		this.setSaldo(saldo);
	}
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa){
		setSaldo(getSaldo() + getSaldo() * taxa * 2);
	}

	@Override
	public double calculaTributos() {
		return getSaldo()*0.01;
	}
	
}
