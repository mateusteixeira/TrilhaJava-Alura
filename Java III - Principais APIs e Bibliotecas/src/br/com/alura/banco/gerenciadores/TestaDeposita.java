package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.exceptions.ValorInvalidoException;
import br.com.alura.banco.modelo.Conta;
import br.com.alura.banco.modelo.ContaCorrente;

public class TestaDeposita {
	  public static void main(String[] args) {
	        Conta cp = new ContaCorrente();
	        try {
	        	cp.deposita(-100);
			} catch (ValorInvalidoException valorInvalidoException) {
				System.out.println(valorInvalidoException.getMessage());
			}
	    }
}
