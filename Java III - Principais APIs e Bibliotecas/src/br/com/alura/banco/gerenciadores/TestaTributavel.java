package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.modelo.ContaCorrente;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		
		System.out.println(contaCorrente.calculaTributos());
		
	}

}
