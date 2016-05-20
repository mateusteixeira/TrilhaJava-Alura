package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

public class TesteCalculadoraDesconto {

	public static void main(String[] args){
		CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
		
		Orcamento orcamento = new Orcamento(600);
		System.out.println(calculadoraDesconto.calculaDescontos(orcamento));
	}
}
