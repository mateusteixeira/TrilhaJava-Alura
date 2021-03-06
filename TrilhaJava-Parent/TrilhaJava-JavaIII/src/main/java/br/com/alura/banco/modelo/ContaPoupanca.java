package br.com.alura.banco.modelo;


public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void atualiza(double taxa){
		setSaldo(getSaldo() + getSaldo() * taxa * 3);
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor-0.1);
	}

	public int compareTo(ContaPoupanca outraConta) {
//		if(this.getNumeroConta() == outraConta.getNumeroConta()) return 0;
//		if(this.getNumeroConta() > outraConta.getNumeroConta()) return 1;
//		return -1;
		
		return this.getTitular().compareTo(outraConta.getTitular());
	}
	
}
