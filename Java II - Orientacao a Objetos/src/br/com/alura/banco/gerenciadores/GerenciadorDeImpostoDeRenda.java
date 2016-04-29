package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.modelo.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	void adiciona(Tributavel tributavel){
		System.out.println("Adicionando tributavel: "+tributavel);
		
		this.total += tributavel.calculaTributos();
	}
	
	public double getTotal() {
		return total;
	}
}
