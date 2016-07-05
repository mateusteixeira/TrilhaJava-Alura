package br.com.alura.calculadorimpostos;

import br.com.alura.impostos.ICMS;
import br.com.alura.impostos.ISS;
import br.com.alura.impostos.Imposto;
import br.com.alura.orcamento.Orcamento;

public class TesteDeImpostos {
	
	 public static void main(String[] args) {
         Imposto impostos = new ISS(new ICMS());

         Orcamento orcamento = new Orcamento(500.0);

         System.out.println(impostos.calculaImposto(orcamento));
     }

}
