package br.com.alura.calculadorimpostos;

import br.com.alura.impostos.ICCC;
import br.com.alura.orcamento.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(5000);
		
		CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
		double realizaCalculo = calculadoraImpostos.realizaCalculo(orcamento, new ICCC());
		
		System.out.println(realizaCalculo);
		
		
	}
}
