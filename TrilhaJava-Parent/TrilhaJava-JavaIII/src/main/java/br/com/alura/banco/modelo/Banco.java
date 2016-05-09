package br.com.alura.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas = new ArrayList<Conta>();
	
	public void adiciona(Conta conta){
		contas.add(conta);
	}
	
	public Conta getContaPosicao(int posicao){
		return contas.get(posicao);
	}
	
	public int getQuantidadeDeContas(){
		return contas.size();
	}
	
	public Conta getContaByName(Conta c){
		for (Conta conta : contas) {
			if(conta.equals(c)){
				return conta;
			}
		}
		return null;
	}

}
