package br.com.alura.banco.gerenciadores;

import br.com.alura.banco.modelo.Conta;

public class GuardadorDeObjetos {

	private Conta[] contas;
	private int posicaoLivre = 0;
	
	public GuardadorDeObjetos() {
		contas = new Conta[100];
		posicaoLivre = 0;
	}
	
	public void adiciona(Conta nova){
		contas[posicaoLivre] = nova;
		posicaoLivre++;
	}
	
	public Conta getConta(int posicao){
		return contas[posicao];
	}
	
	
	
}
