package br.com.alura.programa;

import java.util.HashSet;

import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

public class TesteContaHashCode {
	
	
	public static void main(String args[]){
		HashSet<Conta> contas = new HashSet<Conta>();
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setNumeroConta(0001);
		contas.add(conta1);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.setNumeroConta(0002);
		contas.add(conta2);
		
		ContaCorrente conta3 = new ContaCorrente();
		conta3.setNumeroConta(0003);
		contas.add(conta3);
		
		ContaCorrente conta4 = new ContaCorrente();
		conta4.setNumeroConta(0001);
		contas.add(conta4);
		
		System.out.println(contas.size());
		
	}

}
